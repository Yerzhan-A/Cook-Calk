package com.example.calorie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalorieController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
