package com.example.bilabonnementprojekt.controller;

import com.example.bilabonnementprojekt.model.CarSubscription;
import com.example.bilabonnementprojekt.service.CarSubscriptionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarSubscriptionController {

    CarSubscriptionService carSubscriptionService;

    public CarSubscriptionController(CarSubscriptionService carSubscriptionService){
        this.carSubscriptionService = carSubscriptionService;
    }



    @GetMapping("/homepage")
    public String homepage(){
        return "homepage";
    }

    @GetMapping("/homapage")
    public CarSubscription getAllCarSubscription(){
        return carSubscriptionService.getAll();
    }

}
