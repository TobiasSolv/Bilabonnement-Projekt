package com.example.bilabonnementprojekt.service;

import com.example.bilabonnementprojekt.model.CarSubscription;
import com.example.bilabonnementprojekt.repository.CarSubscriptionRepository;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

public class CarSubscriptionService {

    CarSubscriptionRepository repo = new CarSubscriptionRepository();


    public List<CarSubscription> getCarSubscription(){

        return repo.getCarSubscription();
    }

    public void create(WebRequest req) {
        CarSubscription CarSubscriptionList = new CarSubscription(req.getParameter("CarSubscription"));

        repo.create(CarSubscriptionList);
    }

}
