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
                                rs.getTimestamp("time"));
                    }
                }
        );
    }

    public List<Atm> getAtms() {
        String sql = "SELECT id, balance, isAvailable FROM atm";

        return jdbcTemplate.query(sql, new RowMapper<Atm>() {
                    @Override
                    public Atm mapRow(ResultSet rs, int i) throws SQLException {
                        return new Atm(rs.getInt("id"), rs.getInt("balance"),
                                rs.getBoolean("isAvailable"));
                    }
                }
        );
    }

    public void updateBalance(){
        int id = 1 + (int) (Math.random() * 10);
        int newBalance;
        String sql = "SELECT * FROM atm WHERE id = ?";
        Atm atm = jdbcTemplate.queryForObject(sql, new RowMapper<Atm>() {
            @Override
            public Atm mapRow(ResultSet resultSet, int i) throws SQLException {
                return new Atm(resultSet.getInt("id"), resultSet.getInt("balance"),
                        resultSet.getBoolean("isAvailable"));
            }
        }, id);
        newBalance = (int) (atm.balance + (Math.random() * 100));
        sql = "UPDATE atm SET balance = "+ newBalance + " WHERE id = ?";
        jdbcTemplate.update(sql, id);
        sql = "INSERT INTO info (id, balance, time) VALUES (?, ?, CURRENT_TIMESTAMP )";
        jdbcTemplate.update(sql, id, newBalance);
    }
}
