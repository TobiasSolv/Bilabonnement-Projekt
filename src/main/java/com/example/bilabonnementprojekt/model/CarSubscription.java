package com.example.bilabonnementprojekt.model;

import java.lang.ref.PhantomReference;

public class CarSubscription {

    private int id;
    private String name;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String car;
    private String subPrice;



    public CarSubscription(int id, String name, String lastName, String address, String phoneNumber, String email, String car, String subPrice) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.car = car;
        this.subPrice = subPrice;
    }

    public CarSubscription(String name, String lastName, String address, String phoneNumber, String email, String car, String subPrice){
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.car = car;
        this.subPrice = subPrice;
    }

    public CarSubscription(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getSubPrice() {
        return subPrice;
    }

    public void setSubPrice(String subPrice) {
        this.subPrice = subPrice;
    }
}
