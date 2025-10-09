// ПОЯСНЕНИЕ НИЖЕ
// ПОЯСНЕНИЯ И КОМЫ ДЛЯ СЕБЯ НА БУДУЮЩЕЕ






//package web.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import web.service.CarService;
//
//@Controller
//public class CarController {
//
//    @Autowired
//    private CarService carService;
//
//    //  без параметра count
//    @GetMapping("/cars")
//    public String showCarsDefault(Model model) {
//        model.addAttribute("cars", carService.processCarRequest(1));
//        return "cars";
//    }
//
//    // Для адреса  с параметром count
//    @GetMapping(value = "/cars", params = "count")
//    public String showCarsWithCount(@RequestParam("count") int count, Model model) {
//        model.addAttribute("cars", carService.processCarRequest(count));
//        return "cars";
//    }
//}
//
package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    // один метод в котором не обязательный параметр count
    @GetMapping("/cars")
    public String showCars(
            @RequestParam(value = "count", required = false) Integer count,
            Model model) {



        if (count == null) {
            //если параметр count нет то передавем 1 машину
            model.addAttribute("cars", carService.processCarRequest(1));
        } else {
            //а если есть то его количество
            model.addAttribute("cars", carService.processCarRequest(count));
        }

        return "cars";
    }
}


//  2Е РАЗНЫХ РЕАЛИЗАЦИИ контроллера  ЛИЧНО МНЕ БОЛЬШЕ НРАВИТСЯ 1Я. НО 2Й ВАРИАНТ БОЛЕЕ ГИБКИЙ

// Я УСТАЛ ИСКАТЬ И МУЧАТЬ ИИ С ЭТИМИ HTML 😆









