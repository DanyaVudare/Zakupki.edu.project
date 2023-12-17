package zakupki.database;

import org.springframework.stereotype.Component;
import zakupki.database.contract.ContractRepository;
import zakupki.database.contract_performance.ContractPerformanceProxy;
import zakupki.database.purchase_contract.PurchaseContractRepository;
import zakupki.database.purchase_notice.PurchaseNoticeProxy;
import zakupki.database.purchase_plan.PurchasePlanRepository;
import zakupki.database.purchase_protocol.PurchaseProtocolProxy;
import zakupki.models.FileType;
import zakupki.models.ParseFile;
import zakupki.models._223fz.contract.Contract;
import zakupki.models._223fz.purchase.PurchaseContract;
import zakupki.models._223fz.purchaseplan.PurchasePlan;
import zakupki.utils.CommonUtils;

@Component
public class RepositoryRouter {
    private final PurchasePlanRepository purchasePlanRepository;
    private final ContractRepository contractRepository;
    private final PurchaseNoticeProxy purchaseNoticeProxy;
    private final PurchaseContractRepository purchaseContractRepository;
    private final PurchaseProtocolProxy purchaseProtocolProxy;
    private final ContractPerformanceProxy contractPerformanceProxy;

    public RepositoryRouter(
        PurchasePlanRepository purchasePlanRepository,
        ContractRepository contractRepository,
        PurchaseNoticeProxy purchaseNoticeProxy,
        PurchaseContractRepository purchaseContractRepository,
        PurchaseProtocolProxy purchaseProtocolProxy,
        ContractPerformanceProxy contractPerformanceProxy
    ) {
        this.purchasePlanRepository = purchasePlanRepository;
        this.contractRepository = contractRepository;
        this.purchaseNoticeProxy = purchaseNoticeProxy;
        this.purchaseContractRepository = purchaseContractRepository;
        this.purchaseProtocolProxy = purchaseProtocolProxy;
        this.contractPerformanceProxy = contractPerformanceProxy;
    }

    public void route(Object parsedObject, ParseFile file) {
        var region = CommonUtils.extractRegionFromFilePath(file.filepath());
        if (parsedObject instanceof Contract contract) {
            contractRepository.insert(contract, region);
        } else if (parsedObject instanceof PurchaseContract purchaseContract) {
            purchaseContractRepository.insert(purchaseContract, region);
        } else if (parsedObject instanceof PurchasePlan purchasePlan) {
            purchasePlanRepository.insert(purchasePlan);
        }

        var fileType = FileType
            .fromFolder(file.folder())
            .orElseThrow(() -> new IllegalStateException("Unknown file type"));

        switch (fileType) {
            case PURCHASE_NOTICE -> purchaseNoticeProxy.insert(parsedObject, file.folder(), region);
            case PURCHASE_PROTOCOL -> purchaseProtocolProxy.insert(parsedObject, file.folder(), region);
            case CONTRACT_PERFORMANCE -> contractPerformanceProxy.insert(parsedObject);
            case CONTRACT, PURCHASE_CONTRACT, PURCHASE_PLAN -> { }
        }
    }
}
