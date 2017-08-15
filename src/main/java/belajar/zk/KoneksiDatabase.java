package belajar.zk;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class KoneksiDatabase {
    private final static String username = "zk_web_mvc";
    private final static String password = "zk_web_mvc";
    private final static String url = "jdbc:postgresql://localhost:5432/zk_web_mvc";
    private final static String driverClass = "org.postgresql.Driver";

    public static void main(String[] args) {

    }

    public DataSource getDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setDriverClassName(driverClass);
        return ds;
    }
}
