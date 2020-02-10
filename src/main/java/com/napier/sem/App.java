package com.napier.sem;

import com.napier.sem.util.DatabaseManager;

/**
* <h1>SEM Coursework</h1>
* <p>Program to provide a simple source of population data.</p>
* 
* @author Group 16
* @version 0.1.0.2
* @since 2020/27/01
*/
public class App {

    public static void main(String[] args) {
        DatabaseManager dbm = DatabaseManager.getInstance();

        dbm.connect("localhost", 3306, "world", "root", "example");

        dbm.disconnect();
    }
}
