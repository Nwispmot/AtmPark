package atm.dao;

import atm.entity.Atm;
import atm.entity.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AtmDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Info> getInfo(int id) {
        String sql = "SELECT id, balance, time FROM info WHERE id = " + id + " ORDER BY time DESC ";

        return jdbcTemplate.query(sql, new RowMapper<Info>() {
                    @Override
                    public Info mapRow(ResultSet rs, int i) throws SQLException {
                        return new Info(rs.getInt("id"), rs.getInt("balance"),
                                rs.getTime("time"));
                    }
                }
        );
    }

    public List<Atm> getAtms() {
        String sql = "SELECT id, account, isAvailable FROM atm";

        return jdbcTemplate.query(sql, new RowMapper<Atm>() {
                    @Override
                    public Atm mapRow(ResultSet rs, int i) throws SQLException {
                        return new Atm(rs.getInt("id"), rs.getInt("account"),
                                rs.getBoolean("isAvailable"));
                    }
                }
        );
    }
}
