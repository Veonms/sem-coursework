package com.napier.sem.data;

/**
 * <h1>Capital</h1>
 * <p>Stores the shit related to capitals</p>
 *
 * @author Group 16
 * @version 0.1.0.2
 * @since 2020/10/02
 */
public class Capital {
    private String name;
    private String country;
    private String population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.length() > 52) {
            System.out.println("Couldn't set country name: " + country + ", name set to: ''");
            this.country = "";
        } else {
            this.country = country;
        }
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}
