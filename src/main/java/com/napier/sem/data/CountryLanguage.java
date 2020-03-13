package com.napier.sem.data;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is responsible for storing all the information regarding the countries and their languages.
 */
public class CountryLanguage {

    private String countryCode;
    private String language;
    private boolean official;
    private double percentage;

    private static Map<Integer, CountryLanguage> languages = new HashMap<>();

    private CountryLanguage(){}

    /**
     * This is the default constructor for the class.
     * @param countryCode
     * @param language
     * @param official
     * @param percentage
     */
    public CountryLanguage(String countryCode, String language, boolean official, double percentage) {
        this.countryCode = countryCode;
        this.language = language;
        this.official = official;
        this.percentage = percentage;
    }

    /**
     * @return The 3-letter country code
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * This method is responsible for setting the country code.
     * NOTE: There is a constraint: code must be 3 letters
     * @param countryCode The code to be set.
     */
    public void setCountryCode(String countryCode) {
        if (countryCode.length() == 3) {
            this.countryCode = countryCode;
        } else {
            this.countryCode = "";
        }
    }

    /**
     * @return The languages spoke in a given country.
     */
    public String getLanguage() {
        return language;
    }

    /**
     * This method is responsible for setting the country language
     * NOTE: There is a constraint: Language must be less than 30 characters
     * @param language
     */
    public void setLanguage(String language) {
        if (language.length() <= 30) {
            this.language = language;
        } else {
            this.language = "";
        }
    }

    /**
     * @return Whether or not the language is the official language of a country.
     */
    public boolean isOfficial() {
        return official;
    }

    /**
     * This method is responsible for setting whether or not a language is official in a country.
     * @param official Whether or not the language is official
     */
    public void setOfficial(boolean official) {
        this.official = official;
    }

    /**
     * @return The percentage of population which speak that language.
     */
    public double getPercentage() {
        return percentage;
    }

    /**
     * This method is responsible for setting the language percentage of a country.
     * @param percentage The percentage of the language being spoken.
     */
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    /**
     * @return The languages map which contains all the information for all the countries in the world.
     */
    public static Map<Integer, CountryLanguage> getLanguages() {
        return languages;
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "countryCode='" + countryCode + '\'' +
                ", language='" + language + '\'' +
                ", official=" + official +
                ", percentage=" + percentage +
                '}';
    }
}
