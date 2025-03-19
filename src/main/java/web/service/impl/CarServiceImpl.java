package web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private CarDAO carDAO;

    @Autowired
    public CarServiceImpl(@Qualifier("carDAOImplMySQLDB") CarDAO carDAO) {
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

    @Override
    public Car getCarByVIN(int VIN) {
        return carDAO.getCarByVIN(VIN);
    }
}
