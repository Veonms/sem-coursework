package com.napier.sem.util;

/***
 * This will generate a number for each class individually (city, population, captial city and country)
 * it does this by having a private constructor that can only be called from within the class
 * and the only way it can be called is by using the instance variable
 *
 * @author Group 16
 * @version 0.1.0.2
 * @since 2020/14/02
 */
public class NumberSingleton {

    private static NumberSingleton instance;
    private int city = 0, country = 0, countryLanguage = 0; // private ints for each one

    private NumberSingleton() {
    }

    /**
     * the following if statement will check if the singleton exists and if it does another one can not be
     * generated
     */
    public static NumberSingleton getInstance() {
        if (instance == null) {
            instance = new NumberSingleton();
        }
        return instance;
    }

    public int getCity() { // gets called for cities
        return city += 1;
    }

    public int getCountry() { // gets called for countries
        return country += 1;
    }

    public int getCountryLanguage() {
        return countryLanguage += 1;
    }
}
