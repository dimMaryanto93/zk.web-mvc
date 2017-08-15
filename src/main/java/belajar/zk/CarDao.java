package belajar.zk;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarDao {

    private DataSource dataSource;

    CarDao(DataSource ds) {
        this.dataSource = ds;
    }

    public List<Car> findAll(String keyword) throws SQLException {
        List<Car> cars = new ArrayList<>();
        StringBuilder sb = new StringBuilder("select * from m_cars");

        boolean punyaParamenter = keyword != null && !keyword.isEmpty();
        if (punyaParamenter) sb.append(" where lower(model) like ?");

        Connection connection = dataSource.getConnection();
        PreparedStatement ps = connection.prepareStatement(sb.toString());
        if (punyaParamenter) ps.setString(1,
                new StringBuilder("%")
                        .append(keyword.toLowerCase())
                        .append("%").toString());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Car aCar = new Car(
                    rs.getInt("id"),
                    rs.getString("model"),
                    rs.getString("make"),
                    rs.getString("preview"),
                    rs.getString("description"),
                    rs.getBigDecimal("price")
            );
            cars.add(aCar);
        }

        rs.close();
        ps.close();
        connection.close();
        return cars;
    }
}
