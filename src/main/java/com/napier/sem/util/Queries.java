package com.napier.sem.util;

import com.napier.sem.data.Country;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Queries
 * The actual queries behind the application.
 * (we also hate SQL)
 *
 * @author Group 16
 * @version 0.1.0.3
 * @since 2020/03/01
 */
public class Queries {

    public void worldCountries() {
        System.out.println("All the countries of the world:\n");
        System.out.println("Code\t-\tName\t-\tContinent\t-\tRegion\t-\tPopulation\t-\tCapital");

        Country.getCountries().forEach((k, v) -> System.out.println(v.getCode() + "\t-\t"
                + v.getName() + "\t-\t" + v.getContinent() + "\t-\t" + v.getRegion() + "\t-\t"
                + v.getPopulation() + "\t-\t" + v.getCapital()));
    }

    public void countriesInContinent(String continent) {
        System.out.println("All the countries in continent " + continent + ":\n");
        System.out.println("Code\t-\tName\t-\tContinent\t-\tRegion\t-\tPopulation\t-\tCapital");

        Country.getCountries().forEach((k, v) -> {
            if (v.getContinent().equals(continent)) {
                System.out.println(v.getCode() + "\t-\t"
                        + v.getName() + "\t-\t" + v.getContinent() + "\t-\t" + v.getRegion() + "\t-\t"
                        + v.getPopulation() + "\t-\t" + v.getCapital());
            }
        });
    }

    public void countriesInRegion(String region) {
        System.out.println("All the countries in region " + region + ":\n");
        System.out.println("Code\t-\tName\t-\tContinent\t-\tRegion\t-\tPopulation\t-\tCapital");

        Country.getCountries().forEach((k, v) -> {
            if (v.getRegion().equals(region)) {
                System.out.println(v.getCode() + "\t-\t"
                        + v.getName() + "\t-\t" + v.getContinent() + "\t-\t" + v.getRegion() + "\t-\t"
                        + v.getPopulation() + "\t-\t" + v.getCapital());
            }
        });
    }

    public void topPopulatedCountries(int n) {
        System.out.println("Top " + n + " populated countries of the world:\n");
        System.out.println("Code\t-\tName\t-\tContinent\t-\tRegion\t-\tPopulation\t-\tCapital");
        AtomicInteger i = new AtomicInteger();

        Country.getCountries().forEach((k, v) -> {
            if (i.get() < n) {
                System.out.println(v.getCode() + "\t-\t"
                        + v.getName() + "\t-\t" + v.getContinent() + "\t-\t" + v.getRegion() + "\t-\t"
                        + v.getPopulation() + "\t-\t" + v.getCapital());
                i.getAndIncrement();
            }
        });
    }


}
