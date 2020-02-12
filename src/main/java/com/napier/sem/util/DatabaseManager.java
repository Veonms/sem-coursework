package com.napier.sem.util;

import java.sql.*;

/**
 * <h1>Database Manager</h1>
 * <p>Class responsible for managing the connections to the SQL database.</p>
 *
 * @author Group 16
 * @version 0.1.0.2
 * @since 2020/10/02
 */
public class DatabaseManager {

    private static DatabaseManager instance = null;
    private Connection conn;

    private DatabaseManager() {
    }

    public static DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }

    public void connect() {
        try {
            // Load Database driver
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = Integer.MAX_VALUE;
        for (int i = 0; i < retries; ++i) {
            System.out.println("Connecting to database...");
            try {
                // Wait a bit for db to start
                Thread.sleep(15000);
                // Connect to database
                conn = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            } catch (SQLException sqle) {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            } catch (InterruptedException ie) {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    public void sqlstatements(String s){

        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            System.out.println("hellow");
            ResultSet rs = stmt.executeQuery(s);
            while(rs.next()){
                String name = rs.getString("Name");
                String country = rs.getString("CountryCode");
                String District = rs.getString("District");
                int population = rs.getInt("Population");

                System.out.println(name + "\t" + country + "\t" + District + "\t" + population);
            }
            System.out.println("hellowworkie");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("hellowyesfail");
        }


    }




    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect() {
        if (conn != null) {
            try {
                // Close connection
                conn.close();
            } catch (Exception e) {
                System.out.println("Error closing connection to database");
            }
        }
    }
}
