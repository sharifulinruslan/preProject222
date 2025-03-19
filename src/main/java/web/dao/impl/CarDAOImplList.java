package web.dao.impl;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAOImplList implements CarDAO {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1, "Car1", 12));
        cars.add(new Car(2, "Car2", 900));
        cars.add(new Car(3, "Car3", 1));
        cars.add(new Car(4, "Car4", 45600));
        cars.add(new Car(5, "Car5", 330));
        cars.add(new Car(6, "Car6", 250000));
        cars.add(new Car(7, "Car7", 14));
        cars.add(new Car(8, "Car8", 2));
    }

    @Override
    public List<Car> getSpecifiedCars(int countOfCars) {
        return cars.stream().limit(countOfCars).collect(Collectors.toList());
    }

    @Override
    public int getNumberOfCars() {
        return cars != null ? cars.size() : 0;
    }

    @Override
    public Car getCarByVIN(int VIN) {
        return null;
    }
}
