package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> allCars = carService.getAllCars();

        List<Car> carsToShow;
        if (count != null && count > 0) {
            carsToShow = carService.getCars(allCars,count);
        } else {
            carsToShow = allCars;
        }
        model.addAttribute("cars", carsToShow);
        model.addAttribute("totalCars", allCars.size());
        model.addAttribute("showingCount", carsToShow.size());
        return "cars";
    }
    @GetMapping("/")
    public String home() {
        return "redirect:/cars";
    }

}















