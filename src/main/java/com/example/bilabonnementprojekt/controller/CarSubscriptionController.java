package com.example.bilabonnementprojekt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarSubscriptionController {

    @GetMapping("/homepage")
    public String homepage(){
        return "homepage";
    }

}
