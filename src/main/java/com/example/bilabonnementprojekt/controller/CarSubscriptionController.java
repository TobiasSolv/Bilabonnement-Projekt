package com.example.bilabonnementprojekt.controller;

import com.example.bilabonnementprojekt.model.CarSubscription;
import com.example.bilabonnementprojekt.service.CarSubscriptionService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarSubscriptionController {

    CarSubscriptionService carSubscriptionService;

    public CarSubscriptionController(CarSubscriptionService carSubscriptionService){
        this.carSubscriptionService = carSubscriptionService;
    }



    @GetMapping("/homepage")
    public String homepage(){
        return "homepage";
    }

    /*
    @GetMapping("/getAllCarSubscription")
    public List<CarSubscription> getAllCarSubscription(){
        return carSubscriptionService.getAll();
    }

     */

    @GetMapping("/getAllCarSubscription")
    public String getAllCarSubscription(){
        return "getAllCarSubscription";
    }


}
