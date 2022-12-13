package com.example.bilabonnementprojekt.controller;

import com.example.bilabonnementprojekt.model.Car;
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


    CarSubscriptionRepository carSubscriptionRepository;
    CarSubscriptionService carSubscriptionService;

    public HomeController( CarSubscriptionRepository carSubscriptionRepository, CarSubscriptionService carSubscriptionService){
        this.carSubscriptionRepository = carSubscriptionRepository;
        this.carSubscriptionService = carSubscriptionService;
    }

    // Use to go to homepage page.
    @GetMapping("/homepage")
    public String homepage(){
        return "homepage";
    }

    // Use to go to registerNewCarAgreement page.
    @GetMapping("/registerNewCarAgreement")
    public String registerNewCarAgreement(){
        return "registerNewCarAgreement";
    }

    // Use to create new car agreement.
    @PostMapping("/create")
    public String create(CarSubscription carSubscription, Car car){
        carSubscriptionRepository.create(carSubscription, car);
        return "redirect:/homepage";
    }

    // Use to go to getAllCarSubscription page and use create method.
    @GetMapping("/getAllCarSubscription")
    public String getAllCarSubscription(Model model){
        model.addAttribute("carList",carSubscriptionRepository.getAllCarSubscription());
        model.addAttribute("carList",carSubscriptionRepository.getCar());
        return "getAllCarSubscription";
    }

    // Use to calculate total price and post what you have wrote, the individual price and damage, on damage page.
    @PostMapping("/calculate")
    public String calculate(WebRequest webRequest, Model model){
        carSubscriptionService.calculate(webRequest,model);
        return "damageTotalPrice";
    }

    // Use to go to damage page.
    @GetMapping("/damage")
    public String damage(){
        return "damage";
    }

}
