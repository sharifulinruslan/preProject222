package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(001, "Car1", 12));
        cars.add(new Car(002, "Car2", 900));
        cars.add(new Car(003, "Car3", 1));
        cars.add(new Car(004, "Car4", 45600));
        cars.add(new Car(005, "Car5", 330));
    }

    @GetMapping("/cars")
    public String getCars(){
        return "car";
    }
}
