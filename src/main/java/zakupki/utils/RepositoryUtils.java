package zakupki.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.xml.datatype.XMLGregorianCalendar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import zakupki.database.PurchaseCategoryRepository;
import zakupki.models._223fz.types.AcceptedType2;
import zakupki.models._223fz.types.CountryType;
import zakupki.models._223fz.types.CurrencyType;
import zakupki.models._223fz.types.SupplierType;

@Component
public class RepositoryUtils {
    private final static Logger logger = LoggerFactory.getLogger(RepositoryUtils.class);
    private final PurchaseCategoryRepository purchaseCategoryRepository;

    public RepositoryUtils(
        PurchaseCategoryRepository purchaseCategoryRepository
    ) {
        this.purchaseCategoryRepository = purchaseCategoryRepository;
    }

    public static Integer convertBoolean(Boolean statement) {
        if (statement == null) return null;
        else return statement ? 1 : 0;
    }

    public static String getCurrencyCode(CurrencyType currency) {
        if (currency == null) return null;
        if (currency.getCode() != null) return removeExtraSpaces(currency.getCode());
        else return removeExtraSpaces(currency.getLetterCode());
    }

    public static LocalDate convertFromXMLGregorianCalendarToLocalDate(XMLGregorianCalendar xmlTime) {
        if (xmlTime == null) return null;
        return LocalDate.of(
            xmlTime.getYear(),
            xmlTime.getMonth(),
            xmlTime.getDay()
        );
    }

    public static LocalDateTime convertFromXMLGregorianCalendarToLocalDateTime(XMLGregorianCalendar xmlTime) {
        if (xmlTime == null) return null;
        var hour = xmlTime.getHour() >= 0 && xmlTime.getHour() <= 23 ? xmlTime.getHour() : 0;
        var minute = xmlTime.getMinute() >= 0 && xmlTime.getMinute() <= 60 ? xmlTime.getMinute() : 0;
        var second = xmlTime.getSecond() >= 0 && xmlTime.getSecond() <= 60 ? xmlTime.getSecond() : 0;
        return LocalDateTime.of(
            xmlTime.getYear(),
            xmlTime.getMonth(),
            xmlTime.getDay(),
            hour,
            minute,
            second
        );
    }

    public static String validateOkpo(String okpo) {
        okpo = removeExtraSpaces(okpo);
        if (okpo == null) return null;
        if (okpo.length() > 8) {
            logger.warn("okpo: invalid length: {}", okpo);
            return null;
        }
        return okpo;
    }

    public static String removeExtraSpaces(String s) {
        if (s == null) return null;
        return s.trim().replaceAll(" +", " ");
    }

    public static String getCountryCode(CountryType country) {
        if (country == null) return null;
        else return country.getDigitalCode();
    }

    public Long getCategoryCode(Long purchaseCategory) {
        return purchaseCategoryRepository.getCategoryCode(purchaseCategory);
    }

    public String mapSupplierType(SupplierType type) {
        if (type == null) return null;
        return switch (type) {
            case L -> "Юридическое лицо";
            case P -> "Физическое лицо";
        };
    }

    public static String mapAcceptedToString(AcceptedType2 accepted) {
        if (accepted == null) return null;
        return switch (accepted) {
            case T -> "Допущен";
            case F -> "Не допущен";
            case N -> "Не указывается в данном протоколе";
        };
    }
}
