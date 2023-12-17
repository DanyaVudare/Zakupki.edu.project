package zakupki.database.contract;

import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import zakupki.exceptions.NoXmlnsException;
import zakupki.models._223fz.types.LotPlanPositionType;
import zakupki.models._223fz.types.PlanInfoType;
import zakupki.utils.RepositoryUtils;

@Component
public class PlanPositionRepository {
    private static final Logger logger = LoggerFactory.getLogger(PlanPositionRepository.class);
    private final JdbcTemplate jdbcTemplate;
    private final RepositoryUtils repositoryUtils;

    public PlanPositionRepository(DataSource dataSource, RepositoryUtils repositoryUtils) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        this.repositoryUtils = repositoryUtils;
    }

    public void insert(PlanInfoType position) {
        if (position == null) return;
        if (position.getPositionGuid() == null) throw new NoXmlnsException("No xmlns");
        String sql = "INSERT INTO zakupki.plan_position (guid, plan_guid, plan_registration_number," +
            "position_number, lot_plan_position, contract_subject)" +
            "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            jdbcTemplate.update(
                sql,
                position.getPositionGuid(),
                position.getPlanGuid(),
                position.getPlanRegistrationNumber(),
                position.getPositionNumber(),
                getLotPlanPosition(position.getLotPlanPosition()),
                repositoryUtils.removeExtraSpaces(position.getContractSubject())
            );
        } catch (DuplicateKeyException e) {

        } catch (RuntimeException e) {
            logger.error("Error during inserting into plan position", e);
        }
    }

    private String getLotPlanPosition(LotPlanPositionType lotPlanPosition) {
        if (lotPlanPosition == null) return null;
        else return lotPlanPosition.value();
    }
}
