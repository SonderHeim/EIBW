package com.cursed.Cursed.controllers;

import com.cursed.Cursed.models.Patient;
import com.cursed.Cursed.services.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
//@RequestMapping("/ZashitaOtDibila")
public class MainPageController {

    private final PatientsService patientsService;

    @Autowired
    public MainPageController(PatientsService patientsService) {
        this.patientsService = patientsService;
    }

    @GetMapping("/")
    public String MainPage(Model model) {
        List<Patient> patients = patientsService.findAll();
        model.addAttribute("patients", patients);
        return "patients/index";
    }
//    @GetMapping("/")
//    public String SMainPage(@RequestParam(value = "a", required = false) String a,
//                            Model model){
//        if (a != null)
//            model.addAttribute("valueis", "Answer is, " + a);
//        return "index";
//    }
//    @GetMapping("/")
//    public String SMainPage(@RequestParam(value = "name", required = false) String name){
//        System.out.println(name);
//        return "index";
//    }
}