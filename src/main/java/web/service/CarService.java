package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getSpecifiedCars(int countOfCars);
    public int getNumberOfCars();
}
