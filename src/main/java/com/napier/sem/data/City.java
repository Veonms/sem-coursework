package com.napier.sem.data;

/**
 * Stores all the data regarding cities.
 * ID field has been omitted from the class as it's a surrogate key for the database.
 * @author Group 16
 * @version 0.1.0.2
 * @since 2020/10/02
 */
public class City {

    private String name;
    private String countryCode;
    private String district;
    private int population;

    /**
     * Fetches the name of the city within a given country.
     * @return The name of the city.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the city within a given country.
     * There's a length constraint of 35 characters.
     * @param name The name to be set.
     */
    public void setName(String name) {
        if (name.length() > 35) {
            System.out.println("Can't set the name: " + name + ", value set to: ''");
        }
    }

    /**
     * Grabs the name of the country code for a given city.
     * @return The country code.
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the country code to a 3-character code.
     * The code must be 3 characters.
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        if (countryCode.length() != 3) {
            System.out.println("Can't set the code: " + countryCode + ", value set to: ''");
        } else {
            this.countryCode = countryCode;
        }
    }

    /**
     * Fetch the district of a given location within a city.
     * @return The district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Set the district of a given location within a city.
     * There is a length constraint of 20 characters.
     * @param district The district to be set.
     */
    public void setDistrict(String district) {
        if (district.length() > 20) {
            System.out.println("Can't set the district: " + district + ", value set to: ''");
        } else {
            this.district = district;
        }
    }

    /**
     * This method will show the population of a given city.
     * @return The population of a city.
     */
    public int getPopulation() {
        return population;
    }

    /**
     * This method sets the population value.
     * @param population
     */
    public void setPopulation(int population) {
        this.population = population;
    }
}
