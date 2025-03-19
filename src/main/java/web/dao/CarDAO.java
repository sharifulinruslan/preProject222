package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(001, "Car1", 12));
        cars.add(new Car(002, "Car2", 900));
        cars.add(new Car(003, "Car3", 1));
        cars.add(new Car(004, "Car4", 45600));
        cars.add(new Car(005, "Car5", 330));
    }

    public List<Car> getSpecifiedCars(int countOfCars) {
        return cars.stream().limit(countOfCars).collect(Collectors.toList());
    }
}
