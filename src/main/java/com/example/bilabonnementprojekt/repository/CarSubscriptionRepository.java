package com.example.bilabonnementprojekt.repository;

import com.example.bilabonnementprojekt.model.CarSubscription;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarSubscriptionRepository {

    private Connection conn = DatabaseConnectionManager.getConnection();

    public List<CarSubscription> getCarSubscription() {

        List<CarSubscription> carSubscriptionLists = new ArrayList<>();

        try{
            PreparedStatement psts = conn.prepareStatement("SELECT * FROM ønskeliste");
            ResultSet resultSet = psts.executeQuery();

            while (resultSet.next()) {
                carSubscriptionLists.add(new CarSubscription(
                        resultSet.getString("carSubscription")
                ));
            }

        }catch(SQLException e){
            throw new RuntimeException(e);
        }

        return carSubscriptionLists;
    }

    public void create(CarSubscription carSubscriptionList)  {

        try {
            PreparedStatement psts = conn.prepareStatement("INSERT INTO øskeliste (wish) values (?)");
            psts.setString(1,carSubscriptionList.getCarSubscription());
            psts.executeUpdate();


        } catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
}
