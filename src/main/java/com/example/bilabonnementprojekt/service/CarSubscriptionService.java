package com.example.bilabonnementprojekt.service;

import com.example.bilabonnementprojekt.model.CarSubscription;
import com.example.bilabonnementprojekt.repository.CarSubscriptionRepository;
import org.springframework.stereotype.Service;

@Service
public class CarSubscriptionService {

    CarSubscriptionRepository carSubscriptionRepository;

    public CarSubscriptionService(CarSubscriptionRepository carSubscriptionRepository){
        this.carSubscriptionRepository = carSubscriptionRepository;
    }



    public CarSubscription getAll(){
        return (CarSubscription) carSubscriptionRepository.getAllCarSubscription();
    }


}
