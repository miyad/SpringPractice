package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("name","Md. Shahibur Rahman");
        model.addAttribute("val",200);
        List<String> list = new ArrayList<>();
        list.add("Miyad");
        list.add("khalid");
        list.add("Dhaka");
        list.add("Khulna");
        model.addAttribute("list",list);
        return "index"; // return the html page in resources/templates/index.html
        // this works like that(finding index in templates) only because we included thymeleaf in our project
    }
    @GetMapping("/{id}")
    public String page(@PathVariable String id){
        return id;
    }
}
