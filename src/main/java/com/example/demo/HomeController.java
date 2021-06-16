package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String home(){
        return "index"; // return the html page in resources/templates/index.html
        // this works like that(finding index in templates) only because we included thymeleaf in our project
    }
}
