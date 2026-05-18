package web.Service;

import org.springframework.stereotype.Service;
import web.Car.Car;
import web.Dao.CarDao;

import java.util.List;
@Service
public class CarServiceIMP implements CarService {

    private final CarDao carDao;

    public CarServiceIMP(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        return (count>=0)?carDao.getCarsList().stream().limit(count).toList():carDao.getCarsList();
    }

}
