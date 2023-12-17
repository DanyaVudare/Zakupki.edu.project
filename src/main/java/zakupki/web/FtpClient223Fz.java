package zakupki.web;

import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import zakupki.config.FtpConfiguration;
import zakupki.models.Folder;
import zakupki.service.FileSystemService;
import zakupki.utils.CommonUtils;

@Component
public class FtpClient223Fz implements FtpClientFz {
    private final static Logger logger = LoggerFactory.getLogger(FtpClient223Fz.class);
    private final static String basicWorkspace = "/out/published";
    private final static String downloadPath = Paths.get(".").toAbsolutePath().normalize().toString() + "/zakupki_download";
    private final static FTPClient ftp = new FTPClient();
    private final FileSystemService fileSystemService;
    private final FtpConfiguration ftpConfiguration;
    private final CommonUtils commonUtils;

    public FtpClient223Fz(
        FileSystemService fileSystemService,
        FtpConfiguration ftpConfiguration,
        CommonUtils commonUtils
    ) {
        this.fileSystemService = fileSystemService;
        this.ftpConfiguration = ftpConfiguration;
        this.commonUtils = commonUtils;
    }
    
    public List<String> getAllRegions() {
        var list = new ArrayList<String>();
        try {
            var namesDirectories = ftp.listDirectories(basicWorkspace);
            for (var directory : namesDirectories) {
                if (
                    !directory.getName().equals("archive") &&
                        !directory.getName().equals("ast") &&
                        !directory.getName().equals("undefined")
                ) {
                    list.add(directory.getName());
                }
            }
        } catch (IOException e) {
            logger.error("Something went wrong wile listing {}", basicWorkspace, e);
        }
        return list;
    }

    @Override
    public void connect() {
        try {
            ftp.connect(ftpConfiguration.getUrl());
        } catch (IOException e) {
            logger.info("Server reply:{}", Arrays.toString(ftp.getReplyStrings()));
            connect();
        }
        logger.info("Server reply:{}", Arrays.toString(ftp.getReplyStrings()));
    }

    @Override
    public void login() {
        try {
            if (ftp.login(ftpConfiguration.getLogin(), ftpConfiguration.getPassword())) {
                ftp.enterLocalPassiveMode();
                ftp.setFileType(FTP.BINARY_FILE_TYPE);
                logger.info("Successful login to the ftp server");
            } else {
                logger.error("Unable to login to the ftp server");
                login();
            }
        } catch (IOException e) {
            logger.error("Server error", e);
            throw new IllegalStateException("Unable to connect to server: " + ftpConfiguration.getUrl());
        }
    }

    public List<FTPFile> getFilesInRegionFolder(String region, Folder folder, LocalDate startDate, LocalDate endDate) {
        var workspace = String.format("%s/%s/%s/daily", basicWorkspace, region, folder.getName());
        var fileList = new ArrayList<FTPFile>();
        boolean isListed = false;
        for (int retryCount = 1; !isListed; ++retryCount) {
            try {
                var files = ftp.listFiles(workspace);
                for (var remoteFile : files) {
                    LocalDate date = commonUtils.convertCalendarToLocalDate(remoteFile.getTimestamp());
                    if (remoteFile.isFile() && CommonUtils.isDateInInterval(startDate, endDate, date)) {
                        fileList.add(remoteFile);
                    }
                }
                isListed = true;
            }  catch (NoRouteToHostException | ConnectException | MalformedServerReplyException e) {
                if (retryCount % 10 == 0) {
                    logger.warn("{} on listing {}, try waiting and retry {}", e.getClass().getSimpleName(), workspace, retryCount);
                }
            } catch (IOException e) {
                logger.error("Something went wrong wile listing {}", workspace, e);
                break;
            }
            if (isListed && retryCount >= 10) {
                logger.info("Success retry on listing {}; count {}", workspace, retryCount);
            }
        }
        return fileList;
    }

    public Optional<Path> downloadFile(FTPFile ftpFile, String region, Folder folder) {
        var localPath = String.format("%s/%s/%s/%s", downloadPath, region, folder.getName(), ftpFile.getName());
        var remotePath = String.format("%s/%s/%s/daily/%s", basicWorkspace, region, folder.getName(), ftpFile.getName());
        Path localFile = fileSystemService.makeFile(localPath);
        boolean isDownload = false;
        for (int retryCount = 1; !isDownload; ++retryCount) {
            try(var stream = Files.newOutputStream(localFile)) {
                isDownload = ftp.retrieveFile(remotePath, stream);
            }  catch (NoRouteToHostException | ConnectException | MalformedServerReplyException e) {
                if (retryCount % 10 == 0) {
                    logger.warn("{} on {}, try waiting and retry {}", e.getClass().getSimpleName(), remotePath, retryCount);
                }
            } catch (IOException e) {
                logger.error("Something went wrong wile downloading {}", remotePath, e);
                break;
            }
            if (isDownload && retryCount >= 10) {
                logger.info("Success retry on {}; count {}", remotePath, retryCount);
            }
        }
        if (!isDownload) {
            return Optional.empty();
        }
        return Optional.of(localFile);
    }
}
