package zakupki.models;

import zakupki.models._223fz.contract.Contract;
import zakupki.models._223fz.contract.ContractCancellationInformation;
import zakupki.models._223fz.contract.PerformanceContractInformation;
import zakupki.models._223fz.purchase.ProtocolCancellation;
import zakupki.models._223fz.purchase.PurchaseContract;
import zakupki.models._223fz.purchase.PurchaseNotice;
import zakupki.models._223fz.purchase.PurchaseNoticeAE;
import zakupki.models._223fz.purchase.PurchaseNoticeAE94FZ;
import zakupki.models._223fz.purchase.PurchaseNoticeAESMBO;
import zakupki.models._223fz.purchase.PurchaseNoticeEP;
import zakupki.models._223fz.purchase.PurchaseNoticeKESMBO;
import zakupki.models._223fz.purchase.PurchaseNoticeOA;
import zakupki.models._223fz.purchase.PurchaseNoticeOK;
import zakupki.models._223fz.purchase.PurchaseNoticeZK;
import zakupki.models._223fz.purchase.PurchaseNoticeZKESMBO;
import zakupki.models._223fz.purchase.PurchaseNoticeZPESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocol;
import zakupki.models._223fz.purchase.PurchaseProtocolCCAESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolCCKESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolCCZKESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolCCZPESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolCollationAESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolEvasionAESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolEvasionKESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolEvasionZKESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolEvasionZPESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolFCDKESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolFKVOKESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolOSZ;
import zakupki.models._223fz.purchase.PurchaseProtocolPAAE;
import zakupki.models._223fz.purchase.PurchaseProtocolPAAE94FZ;
import zakupki.models._223fz.purchase.PurchaseProtocolPAEP;
import zakupki.models._223fz.purchase.PurchaseProtocolPAOA;
import zakupki.models._223fz.purchase.PurchaseProtocolRZ1AE94FZ;
import zakupki.models._223fz.purchase.PurchaseProtocolRZ1AESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolRZ1KESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolRZ1ZPESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolRZ2AE94FZ;
import zakupki.models._223fz.purchase.PurchaseProtocolRZ2AESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolRZ2KESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolRZ2ZPESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolRZAE;
import zakupki.models._223fz.purchase.PurchaseProtocolRZOA;
import zakupki.models._223fz.purchase.PurchaseProtocolRZOK;
import zakupki.models._223fz.purchase.PurchaseProtocolRZZKESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolRejectionAESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolRejectionKESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolRejectionZKESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolRejectionZPESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolSummingupAESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolSummingupKESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolSummingupZKESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolSummingupZPESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolVK;
import zakupki.models._223fz.purchase.PurchaseProtocolZK;
import zakupki.models._223fz.purchase.PurchaseProtocolZRPZAESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolZRPZKESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolZRPZZKESMBO;
import zakupki.models._223fz.purchase.PurchaseProtocolZRPZZPESMBO;
import zakupki.models._223fz.purchaseplan.PurchasePlan;

public enum Folder {
    CONTRACT("contract", Contract.class),
    PURCHASE_CONTRACT("purchaseContract", PurchaseContract.class),
    PURCHASE_PLAN("purchasePlan", PurchasePlan.class),
    PURCHASE_NOTICE("purchaseNotice", PurchaseNotice.class),
    PURCHASE_NOTICE_AE("purchaseNoticeAE", PurchaseNoticeAE.class),
    PURCHASE_NOTICE_AE94("purchaseNoticeAE94", PurchaseNoticeAE94FZ.class),
    PURCHASE_NOTICE_AESMBO("purchaseNoticeAESMBO", PurchaseNoticeAESMBO.class),
    PURCHASE_NOTICE_EP("purchaseNoticeEP", PurchaseNoticeEP.class),
    PURCHASE_NOTICE_IS("purchaseNoticeIS", PurchaseNotice.class),
    PURCHASE_NOTICE_KESMBO("purchaseNoticeKESMBO", PurchaseNoticeKESMBO.class),
    PURCHASE_NOTICE_OA("purchaseNoticeOA", PurchaseNoticeOA.class),
    PURCHASE_NOTICE_OK("purchaseNoticeOK", PurchaseNoticeOK.class),
    PURCHASE_NOTICE_ZK("purchaseNoticeZK", PurchaseNoticeZK.class),
    PURCHASE_NOTICE_ZKESMBO("purchaseNoticeZKESMBO", PurchaseNoticeZKESMBO.class),
    PURCHASE_NOTICE_ZPESMBO("purchaseNoticeZPESMBO", PurchaseNoticeZPESMBO.class),
    PURCHASE_PROTOCOL("purchaseProtocol", PurchaseProtocol.class),
    PURCHASE_PROTOCOL_CCAESMBO("purchaseProtocolCCAESMBO", PurchaseProtocolCCAESMBO.class),
    PURCHASE_PROTOCOL_CCKESMBO("purchaseProtocolCCKESMBO", PurchaseProtocolCCKESMBO.class),
    PURCHASE_PROTOCOL_CCZKESMBO("purchaseProtocolCCZKESMBO", PurchaseProtocolCCZKESMBO.class),
    PURCHASE_PROTOCOL_CCZPESMBO("purchaseProtocolCCZPESMBO", PurchaseProtocolCCZPESMBO.class),
    // PURCHASE_PROTOCOL_CANCELLATION("purchaseProtocolCancellation", ProtocolCancellation.class), TODO проверить
    PURCHASE_PROTOCOL_COLLACATION_AESMBO("purchaseProtocolCollationAESMBO", PurchaseProtocolCollationAESMBO.class),
    PURCHASE_PROTOCOL_EVASION_AESMBO("purchaseProtocolEvasionAESMBO", PurchaseProtocolEvasionAESMBO.class),
    PURCHASE_PROTOCOL_EVASION_KESMBO("purchaseProtocolEvasionKESMBO", PurchaseProtocolEvasionKESMBO.class),
    PURCHASE_PROTOCOL_EVASION_ZKESMBO("purchaseProtocolEvasionZKESMBO", PurchaseProtocolEvasionZKESMBO.class),
    PURCHASE_PROTOCOL_EVASION_ZPESMBO("purchaseProtocolEvasionZPESMBO", PurchaseProtocolEvasionZPESMBO.class),
    PURCHASE_PROTOCOL_FCDKESMBO("purchaseProtocolFCDKESMBO", PurchaseProtocolFCDKESMBO.class),
    PURCHASE_PROTOCOL_FKVOKESMBO("purchaseProtocolFKVOKESMBO", PurchaseProtocolFKVOKESMBO.class),
    PURCHASE_PROTOCOL_IP("purchaseProtocolIP", PurchaseProtocol.class), // не используется с 2012
    PURCHASE_PROTOCOL_OSZ("purchaseProtocolOSZ", PurchaseProtocolOSZ.class),
    PURCHASE_PROTOCOL_PAAE("purchaseProtocolPAAE", PurchaseProtocolPAAE.class),
    PURCHASE_PROTOCOL_PAAE94("purchaseProtocolPAAE94", PurchaseProtocolPAAE94FZ.class),
    PURCHASE_PROTOCOL_PAEP("purchaseProtocolPAEP", PurchaseProtocolPAEP.class),
    PURCHASE_PROTOCOL_PAOA("purchaseProtocolPAOA", PurchaseProtocolPAOA.class),
    PURCHASE_PROTOCOL_PA_AE("purchaseProtocolPA_AE", PurchaseProtocolPAAE.class), // не используется с 2012
    PURCHASE_PROTOCOL_PA_OA("purchaseProtocolPA_OA", PurchaseProtocolPAOA.class), // не используется с 2012
    PURCHASE_PROTOCOL_RKZ("purchaseProtocolRKZ", PurchaseProtocolZK.class), // не используется с 2012
    PURCHASE_PROTOCOL_RZ1AE("purchaseProtocolRZ1AE", PurchaseProtocolRZ1AE94FZ.class),
    PURCHASE_PROTOCOL_RZ1AE94FZ("purchaseProtocolRZ1AE94FZ", PurchaseProtocolRZ1AE94FZ.class),
    PURCHASE_PROTOCOL_RZ1AESMBO("purchaseProtocolRZ1AESMBO", PurchaseProtocolRZ1AESMBO.class),
    PURCHASE_PROTOCOL_RZ1KESMBO("purchaseProtocolRZ1KESMBO", PurchaseProtocolRZ1KESMBO.class),
    PURCHASE_PROTOCOL_RZ1ZPESMBO("purchaseProtocolRZ1ZPESMBO", PurchaseProtocolRZ1ZPESMBO.class),
    PURCHASE_PROTOCOL_RZ2AE("purchaseProtocolRZ2AE", PurchaseProtocolRZ2AE94FZ.class),
    PURCHASE_PROTOCOL_RZ2AE94FZ("purchaseProtocolRZ2AE94FZ", PurchaseProtocolRZ2AE94FZ.class),
    PURCHASE_PROTOCOL_RZ2AESMBO("purchaseProtocolRZ2AESMBO", PurchaseProtocolRZ2AESMBO.class),
    PURCHASE_PROTOCOL_RZ2KESMBO("purchaseProtocolRZ2KESMBO", PurchaseProtocolRZ2KESMBO.class),
    PURCHASE_PROTOCOL_RZ2ZPESMBO("purchaseProtocolRZ2ZPESMBO", PurchaseProtocolRZ2ZPESMBO.class),
    PURCHASE_PROTOCOL_RZAE("purchaseProtocolRZAE", PurchaseProtocolRZAE.class),
    PURCHASE_PROTOCOL_RZOA("purchaseProtocolRZOA", PurchaseProtocolRZOA.class),
    PURCHASE_PROTOCOL_RZOK("purchaseProtocolRZOK", PurchaseProtocolRZOK.class),
    PURCHASE_PROTOCOL_RZZKESMBO("purchaseProtocolRZZKESMBO", PurchaseProtocolRZZKESMBO.class),
    PURCHASE_PROTOCOL_RZ_AE("purchaseProtocolRZ_AE", PurchaseProtocolRZAE.class),
    PURCHASE_PROTOCOL_RZ_OA("purchaseProtocolRZ_OA", PurchaseProtocolRZOA.class),
    PURCHASE_PROTOCOL_RZ_OK("purchaseProtocolRZ_OK", PurchaseProtocolRZOK.class),
    PURCHASE_PROTOCOL_REJECTION_AESMBO("purchaseProtocolRejectionAESMBO", PurchaseProtocolRejectionAESMBO.class),
    PURCHASE_PROTOCOL_REJECTION_KESMBO("purchaseProtocolRejectionKESMBO", PurchaseProtocolRejectionKESMBO.class),
    PURCHASE_PROTOCOL_REJECTION_ZKESMBO("purchaseProtocolRejectionZKESMBO", PurchaseProtocolRejectionZKESMBO.class),
    PURCHASE_PROTOCOL_REJECTION_ZPESMBO("purchaseProtocolRejectionZPESMBO", PurchaseProtocolRejectionZPESMBO.class),
    PURCHASE_PROTOCOL_SUMMINGUP_AESMBO("purchaseProtocolSummingupAESMBO", PurchaseProtocolSummingupAESMBO.class),
    PURCHASE_PROTOCOL_SUMMINGUP_KESMBO("purchaseProtocolSummingupKESMBO", PurchaseProtocolSummingupKESMBO.class),
    PURCHASE_PROTOCOL_SUMMINGUP_ZKESMBO("purchaseProtocolSummingupZKESMBO", PurchaseProtocolSummingupZKESMBO.class),
    PURCHASE_PROTOCOL_SUMMINGUP_ZPESMBO("purchaseProtocolSummingupZPESMBO", PurchaseProtocolSummingupZPESMBO.class),
    PURCHASE_PROTOCOL_VK("purchaseProtocolVK", PurchaseProtocolVK.class),
    PURCHASE_PROTOCOL_ZK("purchaseProtocolZK", PurchaseProtocolVK.class),
    PURCHASE_PROTOCOL_ZRPZAESMBO("purchaseProtocolZRPZAESMBO", PurchaseProtocolZRPZAESMBO.class),
    PURCHASE_PROTOCOL_ZRPZKESMBO("purchaseProtocolZRPZKESMBO", PurchaseProtocolZRPZKESMBO.class),
    PURCHASE_PROTOCOL_ZRPZZKESMBO("purchaseProtocolZRPZZKESMBO", PurchaseProtocolZRPZZKESMBO.class),
    PURCHASE_PROTOCOL_ZRPZZPESMBO("purchaseProtocolZRPZZPESMBO", PurchaseProtocolZRPZZPESMBO.class),
    CONTRACT_CANCELLATION_INFORMATION("contractCancellationInformation", ContractCancellationInformation.class),
    PERFORMANCE_CONTRACT_INFORMATION("performanceContractInformation", PerformanceContractInformation.class),
    ;
    private final String name;
    private final Class<?> modelClass;

    Folder(String name, Class<?> modelClass) {
        this.name = name;
        this.modelClass = modelClass;
    }

    public Class<?> getModelClass() {
        return modelClass;
    }

    public String getName() {
        return name;
    }
}
