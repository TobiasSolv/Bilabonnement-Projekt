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


    CarSubscriptionRepository carSubscriptionRepository;
    CarSubscriptionService carSubscriptionService;

    public HomeController( CarSubscriptionRepository carSubscriptionRepository, CarSubscriptionService carSubscriptionService){
        this.carSubscriptionRepository = carSubscriptionRepository;
        this.carSubscriptionService = carSubscriptionService;
    }

    @GetMapping("/homepage")
    public String homepage(Model model){
        return "homepage";
    }

    @GetMapping("/registerNewCarAgreement")
    public String registerNewCarAgreement(){
        return "registerNewCarAgreement";
    }

    @PostMapping("/create")
    public String create(CarSubscription carSubscription){
        carSubscriptionRepository.create(carSubscription);
        return "redirect:/homepage";
    }

    @GetMapping("/getAllCarSubscription")
    public String getAllCarSubscription(Model model){
        model.addAttribute("carList",carSubscriptionRepository.getAllCarSubscription());
        return "getAllCarSubscription";
    }

    @PostMapping("/calculate")
    public String calculate(WebRequest webRequest, Model model){
        System.out.println(webRequest.getParameter("price1"));
        System.out.println(webRequest.getParameter("price2"));
        System.out.println(webRequest.getParameter("price3"));
        System.out.println(webRequest.getParameter("price4"));
       int price1;
       int price2;
       int price3;
       int price4;
        if (webRequest.getParameter("price1").equals("")){
            price1 = 0;
        }else{
            price1 = Integer.parseInt( webRequest.getParameter("price1"));
        }
        if (webRequest.getParameter("price2").equals("")){
            price2 = 0;
        }else{
            price2 = Integer.parseInt( webRequest.getParameter("price2"));
        }
        if (webRequest.getParameter("price3").equals("")){
            price3 = 0;
        }else{
            price3 = Integer.parseInt( webRequest.getParameter("price3"));
        }
        if (webRequest.getParameter("price4").equals("")){
            price4 = 0;
        }else{
            price4 = Integer.parseInt( webRequest.getParameter("price4"));
        }

        model.addAttribute("total",price1 + price2 + price3 + price4);

        return "damageTotalPrice";


    }

    @GetMapping("/damage")
    public String damage(){
        return "damage";
    }

}
