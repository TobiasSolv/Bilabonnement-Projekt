package com.example.bilabonnementprojekt.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    private static String hostname;
    private static String username;
    private static String password;
    private static Connection conn;

    // Use to connect to our database
    public static Connection getConnection(){
        if(conn != null){
            return conn;
        }

        hostname="jdbc:mysql://tobiasogjessica.mysql.database.azure.com/carsubdata";
        username="tobiasS";
        password="Corona19";

        try{
            conn = DriverManager.getConnection(hostname,username,password);
        }  catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;

    }

}
