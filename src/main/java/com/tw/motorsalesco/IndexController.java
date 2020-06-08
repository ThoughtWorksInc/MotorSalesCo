package com.tw.motorsalesco;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {
    private final CarRepository cars = new CarRepository();

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("cars", cars.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model){
        //FIXME testing security
        return index(model);
    }

}
