package com.cuisf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String toIndex(Model model){
        model.addAttribute("msg","<h1>springboot && thymeleaf</h1>");
        model.addAttribute("users", Arrays.asList("cuisf","csfei"));

        return "index";
    }
}
