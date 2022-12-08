package com.example.bilabonnementprojekt.repository;

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

    public List<CarSubscription> getAllCarSubscription() {
        List<CarSubscription> carSubscriptions = new ArrayList<>();
        try{
            PreparedStatement psts = conn.prepareStatement("SELECT * FROM carsubscription");
            ResultSet resultSet = psts.executeQuery();

            while (resultSet.next()) {
                carSubscriptions.add(new CarSubscription(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("address"),
                        resultSet.getString("phoneNumber"),
                        resultSet.getString("email")
                ));
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return carSubscriptions;
    }

    public void create(CarSubscription carSubscription){

        try {
            PreparedStatement psts = conn.prepareStatement("INSERT INTO carsubscription (name, address, phoneNumber, email) VALUES (?,?,?,?)");
            psts.setString(1,carSubscription.getName());
            psts.setString(2,carSubscription.getAddress());
            psts.setString(3,carSubscription.getPhoneNumber());
            psts.setString(4,carSubscription.getEmail());
            psts.executeUpdate();


        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }


    }


}
