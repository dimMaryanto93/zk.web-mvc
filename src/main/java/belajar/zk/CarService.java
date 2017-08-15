package belajar.zk;

import java.util.List;

public interface CarService {

    public List<Car> findAll();

    public List<Car> findAll(String keyword);
}
