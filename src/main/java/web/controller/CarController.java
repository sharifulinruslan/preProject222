package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(Model model, @RequestParam(name = "count", required = false) Integer count) {
        if (count == null || count >= 5) {
            model.addAttribute("cars", carService.getSpecifiedCars(carService.getNumberOfCars()));
        } else {
            model.addAttribute("cars", carService.getSpecifiedCars(count));
        }
        return "car";
    }

    @GetMapping("/cars/{VIN}")
    public String getCarByVIN(Model model, @PathVariable("VIN") int VIN) {
        model.addAttribute("car", carService.getCarByVIN(VIN));
        if (model.getAttribute("car") != null) {
            return "show";
        } else {
            model.addAttribute("vin", VIN);
            return "nothing_to_show";
        }
    }
}
