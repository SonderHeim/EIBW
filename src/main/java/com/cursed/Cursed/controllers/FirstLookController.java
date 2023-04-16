package com.cursed.Cursed.controllers;

import com.cursed.Cursed.models.FirstLook;
import com.cursed.Cursed.models.Patient;
import com.cursed.Cursed.repositories.FirstLookReposytory;
import com.cursed.Cursed.services.FirstLookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/firstlook")
@Controller
public class FirstLookController {

    private final FirstLookService firstLookService;

    @Autowired
    public FirstLookController(FirstLookService firstLookService) {
        this.firstLookService = firstLookService;
    }

    @GetMapping("")
    public String showForm(Model model) {
        List<FirstLook> firstLooks = firstLookService.findAll();
        model.addAttribute("firstLooks", firstLooks);
        return "firstlook/fisrtlookform";
    }

    @GetMapping("/add")
    public String addForm(){
        return "firstlook/save";
    }

    @PostMapping("/add")
    public String submitForm(@ModelAttribute("firstLook") FirstLook firstLook) {
        firstLookService.save(firstLook);
        return "redirect:/firstlook";
    }

    @GetMapping("/{fl_id}")
    public String showFirstLook(@PathVariable("fl_id") int fl_id, Model model){
        model.addAttribute("firstLook", firstLookService.findOne(fl_id));
        return "/firstlook/idFirstLook";
    }


    @GetMapping("/{fl_id}/edit")
    public String editPatient(@PathVariable("fl_id") int fl_id, Model model){
        model.addAttribute("firstLook", firstLookService.findOne(fl_id));
        return "firstlook/edit";
    }

    @PostMapping("/{fl_id}")
    public String update(@ModelAttribute("firstLook") FirstLook firstLook,
                         @PathVariable("fl_id") int fl_id) {

        firstLookService.update(fl_id, firstLook);
        return "redirect:/";
    }

    @PostMapping("/delete/{fl_id}")
    public String deleteFirstLook(@PathVariable("fl_id") int fl_id){
        firstLookService.delete(fl_id);
        return "redirect:/";
    }
}

