package com.napier.sem.data;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Stores the stuff related to countries
 *
 * @author Group 16
 * @version 0.1.0.2
 * @since 2020/10/02
 */

@SuppressWarnings({"deprecated","unused"})
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

    private static Map<Integer, Country> cont = new HashMap<>();

    /**
     * @param code
     * @param name
     * @param continent
     * @param region
     * @param surfaceArea
     * @param independence
     * @param population
     * @param lifeExpectancy
     * @param grossNationalProduct
     * @param oldGrossNationalProduct
     * @param localName
     * @param government
     * @param stateHead
     * @param capital
     * @param code2                   will add comment later
     */
    public Country(String code, String name, String continent, String region, double surfaceArea, int independence, int population, double lifeExpectancy, double grossNationalProduct, double oldGrossNationalProduct, String localName, String government, String stateHead, int capital, String code2) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.independence = independence;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.grossNationalProduct = grossNationalProduct;
        this.oldGrossNationalProduct = oldGrossNationalProduct;
        this.localName = localName;
        this.government = government;
        this.stateHead = stateHead;
        this.capital = capital;
        this.code2 = code2;
    }

    /**
     * This method returns the 3 character country code.
     *
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
            this.region = "";
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
     * <p>
     * This function will grab the GNP for the specified country.
     *
     * @return The current GNP for the specified country.
     */
    public double getGrossNationalProduct() {
        return grossNationalProduct;
    }

    /**
     * Gross National Product is a broad measure of a nation's total economic activity.
     * i.e. all finished goods and services provided in 1 year by the nationals.
     *
     * This function will set the GNP for the specified country.
     * @param grossNationalProduct The current GNP to be set.
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
     * @param oldGrossNationalProduct The prior GNP to be set.
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
            this.localName = "";
        } else {
            this.localName = localName;
        }
    }

    /**
     * This method will get the name of the government form.
     *
     * @return The name of government
     */
    public String getGovernment() {
        return government;
    }

    /**
     * Set the name of the government form for a given country.
     * There is a length constraint of 45 characters.
     *
     * @param government The name of the government to be set.
     */
    public void setGovernment(String government) {
        if (localName.length() > 45) {
            System.out.println("Couldn't set government name: " + government + ", name set to: ''");
            this.government = "";
        } else {
            this.government = government;
        }
    }

    /**
     * This method will fetch the head of state of a given country
     *
     * @return The head of state.
     */
    public String getStateHead() {
        return stateHead;
    }

    /**
     * This method can modify the value of the head of state for a given country.
     * There is a length constraint of 60 characters.
     *
     * @param stateHead The name of the new head of state.
     */
    public void setStateHead(String stateHead) {
        if (stateHead.length() > 60) {
            System.out.println("Can't set the head of state: " + stateHead + ", value set to: ''");
            this.stateHead = "";
        } else {
            this.stateHead = stateHead;
        }
    }

    /**
     * This method will return the capital of the country
     *
     * @return The capital
     */
    public int getCapital() {
        return capital;
    }

    /**
     * This method will set the capital of a given country
     *
     * @param capital The capital to be set
     */
    public void setCapital(int capital) {
        this.capital = capital;
    }

    /**
     * This method will set an alternate code for a country.
     *
     * @return Another country code.
     */
    public String getCode2() {
        return code2;
    }

    /**
     * This method will set/update a 2-character country code.
     * There is a length constraint of 2 characters.
     *
     * @param code2 An alternate country code.
     */
    public void setCode2(String code2) {
        if (code2.length() == 2) {
            this.code2 = code2;
        } else {
            System.out.println("Couldn't set country code: " + code2 + ", code set to: ''");
            this.code2 = "";
        }
    }

    public static Map<Integer, Country> getCountries() {
        return cont;
    }

    @Override
    public String toString() {
        return "[" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", independence=" + independence +
                ", population=" + population +
                ", lifeExpectancy=" + lifeExpectancy +
                ", grossNationalProduct=" + grossNationalProduct +
                ", oldGrossNationalProduct=" + oldGrossNationalProduct +
                ", localName='" + localName + '\'' +
                ", government='" + government + '\'' +
                ", stateHead='" + stateHead + '\'' +
                ", capital=" + capital +
                ", code2='" + code2 + '\'' +
                ']';
    }
}
