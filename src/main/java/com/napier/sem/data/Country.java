package com.napier.sem.data;

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
    private String surfaceArea;
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
     * @param code The code to be set (must be 3 characters).
     */
    public void setCode(String code) {
        if (code.length() == 3) {
            this.code = code;
        } else {
            System.out.println("Couldn't set country code: " + code + ", Code set to: ' '");
            this.code = " ";
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
     * @param name The country name to be set (no more than 52 characters).
     */
    public void setName(String name) {
        if (name.length() > 52) {
            System.out.println("Couldn't set country name: " + name);
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
     * @param continent The continent name to be set (must match one of the 7 continents).
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
                System.out.println("Couldn't set continent: " + continent);
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
     * @param region The region to be set.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    public String getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(String surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public int getIndependence() {
        return independence;
    }

    public void setIndependence(int independence) {
        this.independence = independence;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(double lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public double getGrossNationalProduct() {
        return grossNationalProduct;
    }

    public void setGrossNationalProduct(double grossNationalProduct) {
        this.grossNationalProduct = grossNationalProduct;
    }

    public double getOldGrossNationalProduct() {
        return oldGrossNationalProduct;
    }

    public void setOldGrossNationalProduct(double oldGrossNationalProduct) {
        this.oldGrossNationalProduct = oldGrossNationalProduct;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
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
