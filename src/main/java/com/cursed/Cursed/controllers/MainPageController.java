package com.cursed.Cursed.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/ZashitaOtDibila")
public class MainPageController {
    @GetMapping("/index")
    public String MainPage(Model model) {
//        model.addAttribute("title", "Главная Страница");
        return "index";
    }
}