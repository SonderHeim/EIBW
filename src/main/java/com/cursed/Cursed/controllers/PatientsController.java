package com.cursed.Cursed.controllers;

import com.cursed.Cursed.models.Patient;
import com.cursed.Cursed.services.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientsController {

    @Autowired
    private final PatientsService patientsService;

    @Autowired
    public PatientsController(PatientsService patientsService) {
        this.patientsService = patientsService;
    }

    @GetMapping()
    public String patientsShow(Model model){
        List<Patient> patient = patientsService.findAll();
//        model.addAttribute("patient", patient);
        return "patients/show";
    }

    @GetMapping("/{id}")
    public String showPatient(@PathVariable("id") int id, Model model){
        model.addAttribute("patient", patientsService.findOne(id));
        return "/patients/idPatient";
    }


    @GetMapping("/{id}/edit")
    public String editPatient(@PathVariable("id") int id, Model model){
        model.addAttribute("patient", patientsService.findOne(id));
        return "patients/edit";
    }

    @PostMapping("/{id}")
    public String update(@ModelAttribute("patient") Patient patient,
                         @PathVariable("id") int id) {

        patientsService.update(id, patient);
        return "redirect:/";
    }

    @GetMapping("/add")
    public String toSavePatient(){
        return "patients/save";
    }

    @PostMapping("/add")
    public String savePatient(@ModelAttribute("patient") Patient patient){
        patientsService.save(patient);
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String deletePatient(@PathVariable("id") int id){
        patientsService.delete(id);
        return "redirect:/";
    }
}
