package zakupki.database.purchase_plan;

import java.util.List;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import zakupki.models._223fz.types.ElectronicPlaceInfoType;

@Component
public class ElectronicPlaceRepository {
    private static final Logger logger = LoggerFactory.getLogger(ElectronicPlaceRepository.class);
    private final JdbcTemplate jdbcTemplate;

    public ElectronicPlaceRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void insert(ElectronicPlaceInfoType electronicPlace) {
        String sql = "INSERT INTO zakupki.electornic_place (electronic_place_id, name, url) VALUES (?, ?, ?)";
        if (electronicPlace == null) return;
        if (checkPlace(electronicPlace.getElectronicPlaceId())) return;
        try {
            jdbcTemplate.update(
                sql,
                electronicPlace.getElectronicPlaceId(),
                electronicPlace.getName(),
                electronicPlace.getUrl()
            );
        } catch (DuplicateKeyException ignored) {
        } catch (Exception e) {
            logger.error("Error during inserting electronic place", e);
        }

    }

    private boolean checkPlace(long id) {
        String sql = "SELECT electronic_place_id FROM electornic_place WHERE electronic_place_id = ?";
        List<Long> result = jdbcTemplate.query(sql, new Object[]{id}, (rs, rowNum) -> rs.getLong("electronic_place_id"));
        return result.size() != 0;
    }
}
