package com.napier.sem.util;

public class NumberSingleton {

    private NumberSingleton() {}

    private static NumberSingleton instance;

    public static NumberSingleton getInstance() {
        if (instance == null) {
            instance = new NumberSingleton();
        }
        return instance;
    }

    private int city = 0, country = 0, population = 0, capital = 0;

    public int getCity() {
        return city += 1;
    }

    public int getCountry() {
        return country += 1;
    }

    public int getPopulation() {
        return population += 1;
    }

    public int getCapital() {
        return capital += 1;
    }
}
