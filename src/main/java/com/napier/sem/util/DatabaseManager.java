package com.napier.sem.util;

import com.napier.sem.data.City;
import com.napier.sem.data.Country;
import com.napier.sem.data.CountryLanguage;

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

    private DatabaseManager() {
    }

    /**
     * Get an instance of the class, and if it doesn't exist the method will create one.
     *
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
     *
     * @param attempts The amount of attempts the application has at connecting to the database.
     * @param port     The port the database runs on.
     * @param database The database to run off.
     * @param user     The specified username.
     * @param pass     A specified password.
     * @param useSSL   Whether or not you wish to use SSL to connect.
     * @return True on connection, false if connection fails somehow.
     */
    public boolean connect(int attempts, int port, String database, String user, String pass, boolean useSSL) {
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
                return true;
            } catch (SQLException sqle) {
                System.out.println("Failed to connect to database attempt " + i);
                System.out.println(sqle.getMessage());
            } catch (InterruptedException ie) {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
        return false;
    }

    /**
     * Disconnect from the MySQL database.
     *
     * @return True on a successful disconnect, false otherwise.
     */
    public boolean disconnect() {
        if (conn != null) {
            try {
                // Close connection
                conn.close();
                return true;
            } catch (Exception e) {
                System.out.println("Error closing connection to database");
            }
        }
        return false;
    }

    public void populate() {
        Statement stmt;
        ResultSet rs;
        try {
<<<<<<< HEAD
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM city");
=======
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM city ORDER BY Population DESC;");
>>>>>>> develop

            NumberSingleton ns = NumberSingleton.getInstance();
            while (rs.next()) {

                City c = new City(rs.getString("name"),
                        rs.getString("countrycode"),
                        rs.getString("district"),
                        rs.getInt("population"));

                City.getCities().put(ns.getCity(), c);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
<<<<<<< HEAD
=======
        }

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM country ORDER BY population DESC;");

            NumberSingleton ns = NumberSingleton.getInstance();
            while (rs.next()) {
                Country c = new Country(rs.getString("code"),
                        rs.getString("name"),
                        rs.getString("continent"),
                        rs.getString("region"),
                        rs.getDouble("surfacearea"),
                        rs.getInt("indepyear"),
                        rs.getInt("population"),
                        rs.getDouble("lifeexpectancy"),
                        rs.getDouble("gnp"),
                        rs.getDouble("gnpold"),
                        rs.getString("localname"),
                        rs.getString("governmentform"),
                        rs.getString("headofstate"),
                        rs.getInt("capital"),
                        rs.getString("code2"));

                Country.getCountries().put(ns.getCountry(), c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM countrylanguage;");

            while (rs.next()) {

                boolean official = rs.getString("isofficial").equals("T");


                CountryLanguage cl = new CountryLanguage(rs.getString("countrycode"),
                        rs.getString("language"),
                        official,
                        rs.getDouble("percentage"));

                CountryLanguage.getLanguages().put(NumberSingleton.getInstance().getCountryLanguage(), cl);
            }
        } catch (SQLException e) {
            e.printStackTrace();
>>>>>>> develop
        }
    }
}
