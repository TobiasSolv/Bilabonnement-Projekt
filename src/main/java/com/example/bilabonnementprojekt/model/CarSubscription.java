package com.example.bilabonnementprojekt.model;

public class CarSubscription {

    private String carSubscription;



    public String getCarSubscription() {
        return carSubscription;
    }

    public void setCarSubscription(String carSubscription) {
        this.carSubscription = carSubscription;
    }

    public CarSubscription(String carSubscription) {
        this.carSubscription = carSubscription;
    }

    @Override
    public String toString() {
        return "CarSubscription{" +
                "carSubscription='" + carSubscription + '\'' +
                '}';
    }

}
