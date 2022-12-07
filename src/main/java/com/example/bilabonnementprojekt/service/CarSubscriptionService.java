package com.example.bilabonnementprojekt.service;

import com.example.bilabonnementprojekt.model.CarSubscription;
import com.example.bilabonnementprojekt.repository.CarSubscriptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarSubscriptionService {

    CarSubscriptionRepository carSubscriptionRepository;

    public CarSubscriptionService(CarSubscriptionRepository carSubscriptionRepository){
        this.carSubscriptionRepository = carSubscriptionRepository;
    }

    public List<CarSubscription> getAll(){
        return carSubscriptionRepository.getAllCarSubscription();
    }



}
