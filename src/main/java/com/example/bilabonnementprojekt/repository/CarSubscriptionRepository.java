package com.example.bilabonnementprojekt.repository;

import com.example.bilabonnementprojekt.model.AllCarsAndSubs;
import com.example.bilabonnementprojekt.model.Car;
import com.example.bilabonnementprojekt.model.CarSubscription;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class CarSubscriptionRepository {


    private Connection conn = DatabaseConnectionManager.getConnection();

    // Use to get all columns in table carsubscrition and car to print out what is in them.
    public List<AllCarsAndSubs> getAllCarsAndSubs(){
        List<AllCarsAndSubs> allCarsAndSubsList = new ArrayList<>();
        try{
            PreparedStatement psts = conn.prepareStatement("SELECT * FROM car INNER JOIN carSubscription ON car.carId = carSubscription.carId");
            ResultSet resultSet = psts.executeQuery();
            while (resultSet.next()) {
                allCarsAndSubsList.add(new AllCarsAndSubs(
                        resultSet.getInt("carId"),
                        resultSet.getString("carName"),
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("lastName"),
                        resultSet.getString("address"),
                        resultSet.getString("phoneNumber"),
                        resultSet.getString("email")

                ));
            }

        }catch(SQLException e){
            throw new RuntimeException(e);
        }


        return allCarsAndSubsList;
    }

    // Use to create a new subscription and a new car.
    public void create(CarSubscription carSubscription, Car car){

        try {
            PreparedStatement psts = conn.prepareStatement("INSERT INTO carsubscription (name, lastName, address, phoneNumber, email, carID) VALUES (?,?,?,?,?,?)");
            psts.setString(1,carSubscription.getName());
            psts.setString(2,carSubscription.getLastName());
            psts.setString(3,carSubscription.getAddress());
            psts.setString(4,carSubscription.getPhoneNumber());
            psts.setString(5,carSubscription.getEmail());
            psts.setInt(6,carSubscription.getCarID());
            psts.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            PreparedStatement psts = conn.prepareStatement("INSERT INTO car (carName, carId) VALUES (?,?)");
            psts.setString(1,car.getCarName());
            psts.setInt(2,car.getCarId());
            psts.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }



}