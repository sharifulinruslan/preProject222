package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    public List<Car> getSpecifiedCars(int countOfCars);

    public int getNumberOfCars();
}
