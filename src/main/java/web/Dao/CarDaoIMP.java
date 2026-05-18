package web.Dao;

import org.springframework.stereotype.Repository;
import web.Car.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoIMP implements CarDao {

    List<Car> carsList = new ArrayList<Car>();

    {
        carsList.add(new Car(1,"Toyta",5));
        carsList.add(new Car(2,"BMV",12));
        carsList.add(new Car(3,"Mers",23));
        carsList.add(new Car(4,"Volvo",11));
        carsList.add(new Car(5,"Lada",1));
    }


    @Override
    public List<Car> getCarsList() {
        return carsList;
    }
}
