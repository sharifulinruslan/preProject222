package web.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAOImplMySQLDB implements CarDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CarDAOImplMySQLDB(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Car> getSpecifiedCars(int countOfCars) {
        return jdbcTemplate.query("select * from cars", new BeanPropertyRowMapper<>(Car.class))
                .stream().limit(countOfCars).collect(Collectors.toList());
    }

    @Override
    public int getNumberOfCars() {
        return jdbcTemplate.queryForObject("select count(*) from cars", Integer.class);
    }
}
