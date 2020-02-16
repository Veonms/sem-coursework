package com.napier.sem.util;

import com.napier.sem.data.City;

import java.sql.*;

/**
 * Class responsible for managing the connections to the SQL database.
 * This class makes use of the Singleton design pattern.
 *
 * @author Group 16
 * @version 0.1.0.2
 * @since 2020/10/02
 */
public class DatabaseManager {

    private static DatabaseManager instance = null;
    private Connection conn;

    private DatabaseManager() {}

    /**
     * Get an instance of the class, and if it doesn't exist the method will create one.
     * @return An instance of this class.
     */
    public static DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }

    /**
     * This method will connect to the MySQL database after waiting 15 seconds.
     * It will retry until it succeeds, or runs out of attempts.
     * @param attempts The amount of attempts the application has at connecting to the database.
     * @param port The port the database runs on.
     * @param database The database to run off.
     * @param user The specified username.
     * @param pass A specified password.
     * @param useSSL Whether or not you wish to use SSL to connect.
     */
    public void connect(int attempts, int port, String database, String user, String pass, boolean useSSL) {
        try {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        for (int i = 0; i < attempts; ++i) {
            System.out.println("Connecting to database...");
            try {
                // Wait a bit for db to start
                Thread.sleep(10000);
                // Connect to database
                conn = DriverManager.getConnection("jdbc:mysql://db:" + port + "/" + database + "?useSSL=" + useSSL, user, pass);
                System.out.println("Successfully connected");
                break;
            } catch (SQLException sqle) {
                System.out.println("Failed to connect to database attempt " + i);
                System.out.println(sqle.getMessage());
            } catch (InterruptedException ie) {
                System.out.println("Thread interrupted? Should not happen.");
            }
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

    public void createCities() {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM city ORDER BY population DESC");

            NumberSingleton ns = NumberSingleton.getInstance();
            while (rs.next()) {

                City c = new City(rs.getString("name"),
                        rs.getString("countrycode"),
                        rs.getString("district"),
                        rs.getInt("population"));

                City.getCities().put(ns.getCity(), c);
            }

            System.out.println("Added cities to map, proof?\n");
            City.getCities().forEach((k, v) -> System.out.println(k + ": " + v));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
