package web.service.impl;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getSpecifiedCars(int countOfCars) {
        return carDAO.getSpecifiedCars(countOfCars);
    }

    @Override
    public int getNumberOfCars() {
        return carDAO.getNumberOfCars();
    }
}
