package com.example.petclinicdemo.Controller;

import com.example.petclinicdemo.model.Owner;
import com.example.petclinicdemo.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/findowner")
    public String findOwner(){

        return "view/findowner";
    }

    @GetMapping("/addowner")
    public String addOwner(Model model){
        model.addAttribute("owner",new Owner());

        return "view/ownerform";
    }
    @PostMapping("addowner")
    public String processOwner(Owner owner, RedirectAttributes redirectAttributes, BindingResult result, Model model){
        if (result.hasErrors()){
            model.addAttribute("owner",owner);
            return  "view/ownerform";
        }
        ownerService.create(owner);
        redirectAttributes.addFlashAttribute("success",true);
        return "redirect:/view/owners";
    }
    @GetMapping("/view/owners")
    public String showAllOwners(Model model){
        model.addAttribute("owners",ownerService.findAll());
        model.addAttribute("createsuccess",model.containsAttribute("true"));
        return "view/owners";
    }
}
