package com.napier.sem.util;

import com.napier.sem.data.Country;

public class Queries {

    public static void worldCountries() {
        System.out.println("All the countries of the world:\n");
        System.out.println("Code\t-\tName\t-\tContinent\t-\tRegion\t-\tPopulation\t-\tCapital");

        Country.getCountries().forEach((k, v) -> System.out.println(v.getCode() + "\t-\t"
        + v.getName() + "\t-\t" + v.getContinent() + "\t-\t" + v.getRegion() + "\t-\t"
        + v.getPopulation() + "\t-\t" + v.getCapital()));
    }

    public void countriesInContinent(String continent) {

    }
}
