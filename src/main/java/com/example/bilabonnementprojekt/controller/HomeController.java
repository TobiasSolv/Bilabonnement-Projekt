package com.example.bilabonnementprojekt.controller;

import com.example.bilabonnementprojekt.model.CarSubscription;
import com.example.bilabonnementprojekt.repository.CarSubscriptionRepository;
import com.example.bilabonnementprojekt.service.CarSubscriptionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {

    CarSubscriptionService carSubscriptionService;
    CarSubscriptionRepository carSubscriptionRepository;



    public HomeController(CarSubscriptionService carSubscriptionService, CarSubscriptionRepository carSubscriptionRepository){
        this.carSubscriptionService = carSubscriptionService;
        this.carSubscriptionRepository = carSubscriptionRepository;
    }

    @GetMapping("/homepage")
    public String homepage(){
        return "homepage";
    }

    @PostMapping("/create")
    public String create(CarSubscription carSubscription){
        carSubscriptionRepository.create(carSubscription);
        return "redirect:/homepage";
    }

    @GetMapping("/getAllCarSubscription")
    public String getAllCarSubscription(Model model){
        model.addAttribute("carList",carSubscriptionService.getAll());
        return "getAllCarSubscription";
    }


}
