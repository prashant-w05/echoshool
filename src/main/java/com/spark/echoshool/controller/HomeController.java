package com.spark.echoshool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = {"","/","/home"})
    public String displayHomePage(Model model) {
        model.addAttribute("username", "Ajay K");
        return "home.html";
    }
}
