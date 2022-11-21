package com.example.bilabonnementprojekt.controller;

import com.example.bilabonnementprojekt.service.CarSubscriptionService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;


public class HomeController {

    private CarSubscriptionService service = new CarSubscriptionService();

    @GetMapping("/homepage")
    public String getCarSubscription(Model model){
        model.addAttribute("carSubscription",service.getCarSubscription());
        return "carSubscription";
    }

    @GetMapping("") // mangler
    public String index(){
        return "index";
    }

    @GetMapping("") // mangler
    public String create(WebRequest payload){
        service.create(payload);
        return "redirect:/";
    }

}
