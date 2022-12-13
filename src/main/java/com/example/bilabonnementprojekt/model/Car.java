package com.example.bilabonnementprojekt.model;

public class Car {

    private int carId;
    private String carName;




    public Car(int carId, String carName){
        this.carId = carId;
        this.carName = carName;

    }

    public Car(String carName){
        this.carName = carName;
    }

    public Car(){

    }


    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

}
