package belajar.zk;

import java.sql.SQLException;
import java.util.List;

public class CarServiceImpl implements CarService {

    private CarDao dao;
    private KoneksiDatabase koneksi;

    CarServiceImpl() {
        koneksi = new KoneksiDatabase();
        dao = new CarDao(koneksi.getDataSource());
    }

    public List<Car> findAll() {
        return null;
    }

    public List<Car> findAll(String keyword) {
        try {
            return dao.findAll(keyword);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
