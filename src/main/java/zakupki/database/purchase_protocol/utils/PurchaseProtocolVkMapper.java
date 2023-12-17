package zakupki.database.purchase_protocol.utils;

import zakupki.models._223fz.purchase.ProtocolApplicationType;
import zakupki.models._223fz.purchase.ProtocolLotApplicationListType;
import zakupki.models._223fz.purchase.ProtocolLotApplications;
import zakupki.models._223fz.purchase.ProtocolLotType;
import zakupki.models._223fz.purchase.ProtocolRZ2AEApplicationType;
import zakupki.models._223fz.purchase.ProtocolRZ2AELotApplicationListType;
import zakupki.models._223fz.purchase.ProtocolRZ2AELotApplications;
import zakupki.models._223fz.purchase.ProtocolVKApplicationType;
import zakupki.models._223fz.purchase.ProtocolVKLotApplicationListType;
import zakupki.models._223fz.purchase.ProtocolVKLotApplications;
import zakupki.models._223fz.purchase.PurchaseProtocolDataType;
import zakupki.models._223fz.purchase.PurchaseProtocolRZ2AE94FZDataType;
import zakupki.models._223fz.purchase.PurchaseProtocolVKDataType;

public class PurchaseProtocolVkMapper {
    public static PurchaseProtocolDataType mapToDataType(PurchaseProtocolVKDataType vkDataType) {
        var dataType = new PurchaseProtocolDataType();
        dataType.setGuid(vkDataType.getGuid());
        dataType.setCreateDateTime(vkDataType.getCreateDateTime());
        dataType.setUrlEIS(vkDataType.getUrlEIS());
        dataType.setUrlVSRZ(vkDataType.getUrlVSRZ());
        dataType.setUrlKisRmis(vkDataType.getUrlKisRmis());
        dataType.setPurchaseInfo(vkDataType.getPurchaseInfo());
        dataType.setRegistrationNumber(vkDataType.getRegistrationNumber());
        dataType.setPlacer(vkDataType.getPlacer());
        dataType.setCustomer(vkDataType.getCustomer());
        dataType.setAdditionalInfo(vkDataType.getAdditionalInfo());
        dataType.setMissedContest(vkDataType.isMissedContest());
        dataType.setMissedReason(vkDataType.getMissedReason());
        dataType.setPurchaseCancellationReason(vkDataType.getPurchaseCancellationReason());
        dataType.setPublicationDateTime(vkDataType.getPublicationDateTime());
        dataType.setStatus(vkDataType.getStatus());
        dataType.setVersion(vkDataType.getVersion());
        dataType.setModificationDescription(vkDataType.getModificationDescription());
        dataType.setType(0);
        dataType.setTypeName("Протокол вскрытия конвертов для открытого конкурса");
        dataType.setTargetPhaseCode(null);
        dataType.setProcedureDate(vkDataType.getProcedureDate());
        dataType.setProcedurePlace(vkDataType.getProcedurePlace());
        dataType.setProtocolSignDate(vkDataType.getProtocolSignDate());
        dataType.setIsLotOriented(null);
        dataType.setCommissionNumber(vkDataType.getCommissionNumber());
        dataType.setCommissionName(vkDataType.getCommissionName());
        dataType.setCommissionResult(vkDataType.getCommissionResult());
        dataType.setLotApplicationsList(mapApplicationList(vkDataType.getLotApplicationsList()));
        return dataType;
    }

    private static ProtocolLotApplicationListType mapApplicationList(ProtocolVKLotApplicationListType vkListType) {
        if (vkListType == null) return null;
        var listType = new ProtocolLotApplicationListType();
        if (vkListType.getProtocolVKLotApplications() != null) {
            listType.setProtocolLotApplications(
                vkListType.getProtocolVKLotApplications().stream()
                    .map(PurchaseProtocolVkMapper::mapLotApplications)
                    .toList()
            );
        }
        return listType;
    }

    private static ProtocolLotApplications mapLotApplications(ProtocolVKLotApplications vkLotApplications) {
        var lotApplications = new ProtocolLotApplications();
        lotApplications.setLot(vkLotApplications.getLot());
        if (vkLotApplications.getApplication() != null) {
            lotApplications.setApplication(
                vkLotApplications.getApplication().stream()
                    .map(PurchaseProtocolVkMapper::mapApplication)
                    .toList()
            );
        }
        return lotApplications;
    }

    private static ProtocolApplicationType mapApplication(ProtocolVKApplicationType vkApplicationType) {
        var application = new ProtocolApplicationType();
        application.setApplicationDate(vkApplicationType.getApplicationDate());
        application.setApplicationNumber(vkApplicationType.getApplicationNumber());
        application.setNotDishonest(vkApplicationType.isNotDishonest());
        application.setProvider(vkApplicationType.isProvider());
        application.setSupplierInfo(vkApplicationType.getSupplierInfo());
        application.setNonResidentInfo(vkApplicationType.getNonResidentInfo());
        application.setPrice(vkApplicationType.getPrice());
        application.setCurrency(vkApplicationType.getCurrency());
        application.setPriceInfo(vkApplicationType.getPriceInfo());
        application.setCommodityAmount(vkApplicationType.getCommodityAmount());
        application.setContractExecutionTerm(vkApplicationType.getContractExecutionTerm());
        application.setConditionProposals(vkApplicationType.getConditionProposals());
        return application;
    }
}
