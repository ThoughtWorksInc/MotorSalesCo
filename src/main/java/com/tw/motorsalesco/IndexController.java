package com.tw.motorsalesco;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class IndexController {
    private final CarRepository cars = new CarRepository();

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("cars", cars.findAll());
        return "index";
    }

    @GetMapping("/car/{id}")
    public String carDetails(@PathVariable("id") int id, Model model){
        List<Car> all = cars.findAll();
        Car selected = null;
        for (Car car : all) {
            if(car.getId() == id){
                selected = car;
                break;
            }
        }
        model.addAttribute("car", selected);
        return "car";
    }

    @GetMapping("/add")
    public String add(Model model){
        //FIXME testing security
        return index(model);
    }

}
