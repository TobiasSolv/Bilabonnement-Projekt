package com.example.bilabonnementprojekt.model;

public class AllCarsAndSubs {

    private int carId;
    private String carName;
    private int id;
    private String name;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;

    public AllCarsAndSubs(int carId, String carName, int id, String name, String lastName, String address, String phoneNumber, String email){
        this.carId = carId;
        this.carName = carName;
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    public AllCarsAndSubs(String carName, int id, String name, String lastName, String address, String phoneNumber, String email){
        this.carName = carName;
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

   public AllCarsAndSubs(){

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
}
