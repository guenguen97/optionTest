package com.sbs.optionTest.carOption;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequiredArgsConstructor
@Controller
public class CarController {

    private final CarRepository carRepository;
    private final CarService carService;


    @GetMapping("/")
    public String list(Model model) {
        List<CarOption> carOption =this.carService.getList();
        System.out.println(carOption.get(2));
        model.addAttribute("carOption", carOption);
        return "option";
    }

    @GetMapping("/test")
    public String slide(Model model) {
        List<CarOption> carOption =this.carService.getList();
        System.out.println(carOption.get(2));
        model.addAttribute("carOption", carOption);
        return "slideTest";
    }
}
