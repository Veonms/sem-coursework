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

    private NumberSingleton() {
    }

    private static NumberSingleton instance;

    private int city = 0, country = 0, population = 0, capital = 0; // private ints for each one

    /**
     * the following if statement will check if the singelton exists and if it does another one can not be
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

    public int getPopulation() { // gets called for population
        return population += 1;
    }

    public int getCapital() { // gets called for captial cities
        return capital += 1;
    }
}
