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
            PreparedStatement psts = conn.prepareStatement("SELECT * FROM carSubscriptions");
            ResultSet resultSet = psts.executeQuery();

            while (resultSet.next()) {
                carSubscriptions.add(new CarSubscription(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("address"),
                        resultSet.getInt("phoneNumber"),
                        resultSet.getString("email")
                ));
            }

        }catch(SQLException e){
            throw new RuntimeException(e);
        }

        return carSubscriptions;
    }


}
