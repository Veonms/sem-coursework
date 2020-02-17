package com.napier.sem.data;

/**
 * Stores the data regarding the capital cities of each country.
 *
 * @author Group 16
 * @version 0.1.0.2
 * @since 2020/10/02
 */
public class Capital {

    private String name;
    private String country;
    private String population;

    /**
     * This method gets the name of the capital city.
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the name of a given capital city.
     * @param name The name to be set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method gets the name of the country the capital city belongs to.
     * @return The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method sets the country the capital city belongs to.
     * @param country The country to be set.
     */
    public void setCountry(String country) {
        if (country.length() > 52) {
            System.out.println("Couldn't set country name: " + country + ", name set to: ''");
            this.country = "";
        } else {
            this.country = country;
        }
    }

    /**
     * This method grabs the population of the capital city.
     * @return The population
     */
    public String getPopulation() {
        return population;
    }

    /**
     * This method sets the population of a given capital city.
     * @param population The population to be set.
     */
    public void setPopulation(String population) {
        this.population = population;
    }
}
