package zakupki.database.purchase_protocol.utils;

import zakupki.models._223fz.purchase.ProtocolApplicationType;
import zakupki.models._223fz.purchase.ProtocolLotApplicationListType;
import zakupki.models._223fz.purchase.ProtocolLotApplications;
import zakupki.models._223fz.purchase.ProtocolLotType;
import zakupki.models._223fz.purchase.ProtocolPAEPApplicationType;
import zakupki.models._223fz.purchase.ProtocolPAEPLotApplicationListType;
import zakupki.models._223fz.purchase.ProtocolPAEPLotApplications;
import zakupki.models._223fz.purchase.PurchaseProtocolDataType;
import zakupki.models._223fz.purchase.PurchaseProtocolPAEPDataType;

public class PurchaseProtocolPaepMapper {
    public static PurchaseProtocolDataType mapToDataType(PurchaseProtocolPAEPDataType paepDataType) {
        var dataType = new PurchaseProtocolDataType();
        dataType.setGuid(paepDataType.getGuid());
        dataType.setCreateDateTime(paepDataType.getCreateDateTime());
        dataType.setUrlEIS(paepDataType.getUrlEIS());
        dataType.setUrlVSRZ(paepDataType.getUrlVSRZ());
        dataType.setUrlKisRmis(paepDataType.getUrlKisRmis());
        dataType.setPurchaseInfo(paepDataType.getPurchaseInfo());
        dataType.setRegistrationNumber(paepDataType.getRegistrationNumber());
        dataType.setPlacer(paepDataType.getPlacer());
        dataType.setCustomer(paepDataType.getCustomer());
        dataType.setAdditionalInfo(paepDataType.getAdditionalInfo());
        dataType.setMissedContest(paepDataType.isMissedContest());
        dataType.setMissedReason(paepDataType.getMissedReason());
        dataType.setPurchaseCancellationReason(paepDataType.getPurchaseCancellationReason());
        dataType.setPublicationDateTime(paepDataType.getPublicationDateTime());
        dataType.setStatus(paepDataType.getStatus());
        dataType.setVersion(paepDataType.getVersion());
        dataType.setModificationDescription(paepDataType.getModificationDescription());
        dataType.setType(0);
        dataType.setTypeName("Протокол проведения закупки у единственного поставщика (подрядчика, исполнителя)");
        dataType.setProtocolSignDate(paepDataType.getProtocolSignDate());
        dataType.setIsLotOriented(null);
        dataType.setCommissionNumber(paepDataType.getCommissionNumber());
        dataType.setCommissionName(paepDataType.getCommissionName());
        dataType.setCommissionResult(paepDataType.getCommissionResult());
        dataType.setLotApplicationsList(mapApplicationList(paepDataType.getLotApplicationsList()));
        return dataType;
    }

    private static ProtocolLotApplicationListType mapApplicationList(ProtocolPAEPLotApplicationListType paepListType) {
        if (paepListType == null) return null;
        var listType = new ProtocolLotApplicationListType();
        if (paepListType.getProtocolLotApplications() != null) {
            listType.setProtocolLotApplications(
                paepListType.getProtocolLotApplications().stream()
                    .map(PurchaseProtocolPaepMapper::mapLotApplications)
                    .toList()
            );
        }
        return listType;
    }

    private static ProtocolLotApplications mapLotApplications(ProtocolPAEPLotApplications paepLotApplications) {
        var lotApplications = new ProtocolLotApplications();
        var lot = new ProtocolLotType();
        lot.setGuid(paepLotApplications.getGuid());
        lot.setOrdinalNumber(paepLotApplications.getOrdinalNumber());
        lot.setSubject(paepLotApplications.getSubject());
        lot.setInitialSum(paepLotApplications.getInitialSum());
        lot.setCurrency(paepLotApplications.getCurrency());
        lot.setPriceFormula(paepLotApplications.getPriceFormula());
        lot.setCommodityPrice(paepLotApplications.getCommodityPrice());
        lot.setPriceFormula(paepLotApplications.getPriceFormula());
        lot.setMaxContractPrice(paepLotApplications.getMaxContractPrice());
        lot.setInitialSumInfo(paepLotApplications.getInitialSumInfo());
        lotApplications.setLot(lot);
        if (paepLotApplications.getApplication() != null) {
            lotApplications.setApplication(
                paepLotApplications.getApplication().stream()
                    .map(PurchaseProtocolPaepMapper::mapApplication)
                    .toList()
            );
        }
        return lotApplications;
    }

    private static ProtocolApplicationType mapApplication(ProtocolPAEPApplicationType paepApplicationType) {
        var application = new ProtocolApplicationType();
        application.setApplicationDate(paepApplicationType.getApplicationDate());
        application.setApplicationNumber(paepApplicationType.getApplicationNumber());
        application.setNotDishonest(paepApplicationType.isNotDishonest());
        application.setProvider(paepApplicationType.isProvider());
        application.setSupplierInfo(paepApplicationType.getSupplierInfo());
        application.setNonResidentInfo(paepApplicationType.getNonResidentInfo());
        application.setPrice(paepApplicationType.getLastPrice());
        application.setCurrency(paepApplicationType.getCurrency());
        application.setPriceInfo(paepApplicationType.getLastPriceInfo());
        application.setContractSigned(paepApplicationType.isContractSigned());
        application.setCommodityAmount(paepApplicationType.getCommodityAmount());
        application.setContractExecutionTerm(paepApplicationType.getContractExecutionTerm());
        application.setConditionProposals(paepApplicationType.getConditionProposals());
        return application;
    }
}
