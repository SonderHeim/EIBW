package com.cursed.Cursed.controllers;

import com.cursed.Cursed.models.FirstLook;
import com.cursed.Cursed.models.PreEpecris;
import com.cursed.Cursed.services.PreEpecrisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/PreEpecris")
public class PreEpecrisController {
    private final PreEpecrisService preEpecrisService;

    @Autowired
    public PreEpecrisController(PreEpecrisService preEpecrisService) {
        this.preEpecrisService = preEpecrisService;
    }

    @GetMapping("")
    public String showForm(Model model) {
        List<PreEpecris> preEpecriseses = preEpecrisService.findAll();
        model.addAttribute("preEpecrises", preEpecriseses);
        return "preEpecris/preepecrisform";
    }

    @GetMapping("/add")
    public String addForm(){
        return "preEpecris/save";
    }

    @PostMapping("/add")
    public String submitForm(@ModelAttribute("preEpecris") PreEpecris preEpecris) {
        preEpecrisService.save(preEpecris);
        return "redirect:/PreEpecris";
    }

    @GetMapping("/{pe_id}")
    public String showFirstLook(@PathVariable("pe_id") int pe_id, Model model){
        model.addAttribute("preEpecris", preEpecrisService.findOne(pe_id));
        return "preEpecris/idPreEpecris";
    }


    @GetMapping("/{pe_id}/edit")
    public String editPreEpecris(@PathVariable("pe_id") int pe_id, Model model){
        model.addAttribute("preEpecris", preEpecrisService.findOne(pe_id));
        return "preEpecris/edit";
    }

    @PostMapping("/{pe_id}")
    public String update(@ModelAttribute("preEpecris") PreEpecris preEpecris,
                         @PathVariable("pe_id") int pe_id) {

        preEpecrisService.update(pe_id, preEpecris);
        return "redirect:/";
    }

    @PostMapping("/delete/{pe_id}")
    public String deleteFirstLook(@PathVariable("pe_id") int pe_id){
        preEpecrisService.delete(pe_id);
        return "redirect:/";
    }
}
