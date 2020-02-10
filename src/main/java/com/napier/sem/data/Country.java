package com.napier.sem.data;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Date;

/**
 * <h1>Country</h1>
 * <p>Stores the shit related to countries</p>
 *
 * @author Group 16
 * @version 0.1.0.2
 * @since 2020/10/02
 */
public class Country {

    private String code;
    private String name;
    private String continent;
    private String region;
    private double surfaceArea;
    private int independence;
    private int population;
    private double lifeExpectancy;
    private double grossNationalProduct;
    private double oldGrossNationalProduct;
    private String localName;
    private String government;
    private String stateHead;
    private int capital;
    private String code2;

    /**
     * This method returns the 3 character country code.
     * @return The country code.
     */
    public String getCode() {
        return code;
    }

    /**
     * This method sets the 3-character country code.
     * The code can't be anything other than 3 characters.
     * @param code The code to be set.
     */
    public void setCode(String code) {
        if (code.length() == 3) {
            this.code = code;
        } else {
            System.out.println("Couldn't set country code: " + code + ", code set to: ''");
            this.code = "";
        }
    }

    /**
     * This method will retrieve the name of the country.
     * @return The country name.
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the country name.
     * The name of a country can be no longer than 52 characters.
     * @param name The country name to be set.
     */
    public void setName(String name) {
        if (name.length() > 52) {
            System.out.println("Couldn't set country name: " + name + ", name set to: ''");
            this.name = "";
        } else {
            this.name = name;
        }
    }

    /**
     * This method will retrieve the continent the country is situated.
     * @return The continent name to be set.
     */
    public String getContinent() {
        return continent;
    }

    /**
     * This method sets the name of the continent where the country is located.
     * The continent must match one of the 7 continents.
     * @param continent The continent name to be set.
     */
    public void setContinent(String continent) {
        switch(continent) {
            case "Africa":
            case "Antarctica":
            case "Asia":
            case "Europe":
            case "North America":
            case "Oceania":
            case "South America":
                this.continent = continent;
                break;
            default:
                System.out.println("Couldn't set continent: " + continent + ", continent set to: 'Asia'");
                this.continent = "Asia";
                break;
        }
    }

    /**
     * This method will return the country's region.
     * @return The region of the country.
     */
    public String getRegion() {
        return region;
    }

    /**
     * This method sets the region of the country.
     * The region name can be no longer than 26 characters.
     * @param region The region to be set.
     */
    public void setRegion(String region) {
        if (name.length() > 26) {
            System.out.println("Couldn't set country region: " + region + ", region set to: ' '");
        } else {
            this.region = region;
        }
    }

    /**
     * This method will fetch the surface area of a given country.
     * @return The surface area
     */
    public double getSurfaceArea() {
        return surfaceArea;
    }

    /**
     * Set the surface area of a given country.
     * The data will be rounded to 2 decimal places.
     * @param surfaceArea The surface area to be set.
     */
    public void setSurfaceArea(double surfaceArea) {
        DecimalFormat df = new DecimalFormat("###.##");
        df.setRoundingMode(RoundingMode.HALF_EVEN); // Sets a rounding format for the data.
        this.surfaceArea = Double.parseDouble(df.format(surfaceArea));
    }

    /**
     * Fetches the year the country gained independence.
     * @return The year a given country went independent.
     */
    public int getIndependence() {
        return independence;
    }

    /**
     * This method sets the year of independence.
     * @param independence The year the country went independent.
     */
    public void setIndependence(int independence) {
        Date date = new Date();

        if(independence > date.getYear()) {
            System.out.println("Couldn't set the date of independence to a future year!");
        } else {
            this.independence = independence;
        }
    }

    /**
     * Get the population of a given country.
     * @return The population of a country.
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Set the population of a country.
     * @param population The population to be set.
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     * Get the life expectancy of a given country.
     * @return The life expectancy in years.
     */
    public double getLifeExpectancy() {
        return lifeExpectancy;
    }

    /**
     * Set the life expectancy for a country.
     * @param lifeExpectancy The life expectancy to get set.
     */
    public void setLifeExpectancy(double lifeExpectancy) {
        DecimalFormat df = new DecimalFormat("###.#");
        df.setRoundingMode(RoundingMode.HALF_EVEN); // Sets a rounding format for the data.
        this.lifeExpectancy = Double.parseDouble(df.format(lifeExpectancy));
    }

    /**
     * Gross National Product is a broad measure of a nation's total economic activity.
     * i.e. all finished goods and services provided in 1 year by the nationals.
     *
     * This function will grab the GNP for the specified country.
     * @return
     */
    public double getGrossNationalProduct() {
        return grossNationalProduct;
    }

    /**
     * Gross National Product is a broad measure of a nation's total economic activity.
     * i.e. all finished goods and services provided in 1 year by the nationals.
     *
     * This function will set the GNP for the specified country.
     * @param grossNationalProduct
     */
    public void setGrossNationalProduct(double grossNationalProduct) {
        DecimalFormat df = new DecimalFormat("###.##");
        df.setRoundingMode(RoundingMode.HALF_EVEN); // Sets a rounding format for the data.
        this.grossNationalProduct = Double.parseDouble(df.format(grossNationalProduct));
    }

    /**
     * Gross National Product is a broad measure of a nation's total economic activity.
     * i.e. all finished goods and services provided in 1 year by the nationals.
     *
     * This function will grab the old GNP for the specified country.
     * @return The previous/old GNP.
     */
    public double getOldGrossNationalProduct() {
        return oldGrossNationalProduct;
    }

    /**
     * Gross National Product is a broad measure of a nation's total economic activity.
     * i.e. all finished goods and services provided in 1 year by the nationals.
     *
     * This function will set the prior/old GNP for the specified country.
     * @param oldGrossNationalProduct
     */
    public void setOldGrossNationalProduct(double oldGrossNationalProduct) {
        DecimalFormat df = new DecimalFormat("###.##");
        df.setRoundingMode(RoundingMode.HALF_EVEN); // Sets a rounding format for the data.
        this.oldGrossNationalProduct = Double.parseDouble(df.format(oldGrossNationalProduct));
    }

    /**
     * This function will set the name the locals give to the country.
     * @return The local name of the country.
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * This method will set the name of the country the locals give it.
     * There is a length constraint of 45 characters.
     * @param localName The local name of the country.
     */
    public void setLocalName(String localName) {
        if (localName.length() > 45) {
            System.out.println("Couldn't set local country name: " + localName + ", name set to: ''");
        } else {
            this.localName = localName;
        }
    }

    public String getGovernment() {
        return government;
    }

    public void setGovernment(String government) {
        this.government = government;
    }

    public String getStateHead() {
        return stateHead;
    }

    public void setStateHead(String stateHead) {
        this.stateHead = stateHead;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }
}
