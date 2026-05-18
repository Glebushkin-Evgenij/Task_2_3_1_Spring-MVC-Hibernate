package web.Service;

import org.springframework.stereotype.Service;
import web.Car.Car;

import java.util.List;


public interface CarService {

    List<Car> getCars(int count);
}
