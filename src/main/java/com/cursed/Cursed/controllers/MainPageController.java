package com.cursed.Cursed.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/ZashitaOtDibila")
public class MainPageController {
    @GetMapping("/index")
    public String MainPage(Model model) {
//        model.addAttribute("title", "Главная Страница");
        return "index";
    }
    @GetMapping("/")
    public String SMainPage(@RequestParam(value = "a", required = false) String a,
                            Model model){
        if (a != null)
            model.addAttribute("valueis", "Answer is, " + a);
        return "index";
    }
//    @GetMapping("/")
//    public String SMainPage(@RequestParam(value = "name", required = false) String name){
//        System.out.println(name);
//        return "index";
//    }
}