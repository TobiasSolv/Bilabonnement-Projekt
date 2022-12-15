package com.example.bilabonnementprojekt.service;

import com.example.bilabonnementprojekt.model.CarSubscription;
import com.example.bilabonnementprojekt.repository.CarSubscriptionRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Service
public class CarSubscriptionService {


    // Use to calculate the total price for damages and to post what damages and price per damage.
    public String calculate(WebRequest webRequest, Model model){
        int price1;
        int price2;
        int price3;
        int price4;

        String damage1;
        String damage2;
        String damage3;
        String damage4;

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
        model.addAttribute("price1",price1);
        model.addAttribute("price2",price2);
        model.addAttribute("price3",price3);
        model.addAttribute("price4",price4);


        if(webRequest.getParameter("damage1").equals("")){
            damage1 = "";
        }else {
            damage1 = webRequest.getParameter("damage1");
        }

        if(webRequest.getParameter("damage2").equals("")){
            damage2 = "";
        }else {
            damage2 = webRequest.getParameter("damage2");
        }

        if(webRequest.getParameter("damage3").equals("")){
            damage3 = "";
        }else {
            damage3 = webRequest.getParameter("damage3");
        }

        if(webRequest.getParameter("damage4").equals("")){
            damage4 = "";
        }else {
            damage4 = webRequest.getParameter("damage4");
        }

        model.addAttribute("damage1",damage1);
        model.addAttribute("damage2",damage2);
        model.addAttribute("damage3",damage3);
        model.addAttribute("damage4",damage4);


        return "damageTotalPrice";
    }




}
