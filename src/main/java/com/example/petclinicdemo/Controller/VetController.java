package com.example.petclinicdemo.Controller;

import com.example.petclinicdemo.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping("/home")
    public String home(){
        return "layout/viewlayout";
    }

    @GetMapping("/vets")
    public  String showAllVets(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "view/vets";
    }
}
