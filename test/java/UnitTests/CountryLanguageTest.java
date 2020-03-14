package java.UnitTests;

import com.napier.sem.data.City;
import com.napier.sem.data.Country;
import com.napier.sem.util.NumberSingleton;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.napier.sem.data.CountryLanguage;

public class CountryLanguageTest {
    String countryCode = "TCO";
    String language = "Test Language";
    boolean official = false;
    double percentage = 50;

    @Test
    void toStringProper()
    {
        /*
        Tests that toString returns a string containing the correct data, properly formatted.

        Tested by creating an expected string with set values, creating a CountryLanguage with the same values,
        and comparing the result of toString against the expected value.
         */

        String expected = "CountryLanguage{" +
                "countryCode='" + countryCode + '\'' +
                ", language='" + language + '\'' +
                ", official=" + official +
                ", percentage=" + percentage +
                '}';

        String actual = new CountryLanguage(countryCode,
                language,
                official,
                percentage).toString();

        Assertions.assertEquals(expected, actual);
    }

    /*
    Get Tests

    All of these test that the get methods of CountryLanguage return the correct value.
    Tests involve creating a CountryLanguage with the relevant attribute set to a fixed value and then
    comparing that value with the result of the corresponding get method.
     */

    @Test
    void getCountryCode()
    {
        String expected = countryCode;
        CountryLanguage cl = new CountryLanguage(expected, "", false, 0);
        Assertions.assertEquals(expected, cl.getCountryCode());
    }

    @Test
    void getLanguage()
    {
        String expected = language;
        CountryLanguage cl = new CountryLanguage("", expected, false, 0);
        Assertions.assertEquals(expected, cl.getLanguage());
    }

    @Test
    void isOfficial()
    {
        boolean expected = true;
        CountryLanguage cl = new CountryLanguage("", "", expected, 0);
        Assertions.assertEquals(expected, cl.isOfficial());
    }

    @Test
    void getPercentage()
    {
        double expected = percentage;
        CountryLanguage cl = new CountryLanguage("", "", false, expected);
        Assertions.assertEquals(expected, cl.getPercentage());
    }

    @Test
    void getLanguages()
    {
        int key = 0;
        CountryLanguage cl = new CountryLanguage(countryCode,
            language,
            official,
            percentage);

        CountryLanguage.getLanguages().put(key, cl);
        Assertions.assertEquals(cl, CountryLanguage.getLanguages().get(key));
    }

    /*
    Set Tests

    Tests that set methods store data correctly and also validate the value being passed before storage.

    2 types of test for each field:
        1: Valid input
        2: Invalid input
    The value stored after the method is called will then be tested against the correct value
     */

    @Test
    void setCountryCodeValid()
    {
        String expected = countryCode;

        CountryLanguage cl = new CountryLanguage("",
                "",
                official,
                percentage);

        cl.setCountryCode(expected);
        Assertions.assertEquals(expected, cl.getCountryCode());
    }

    @Test
    void setCountryCodeInvalid()
    {
        //Country code only valid when length is exactly 3
        String invalid = "T";
        //When an invalid code is passed, no value should be stored
        String expected = "";

        CountryLanguage cl = new CountryLanguage(countryCode,
                "",
                official,
                percentage);

        cl.setCountryCode(invalid);

        Assertions.assertEquals(expected, cl.getCountryCode());
    }

    @Test
    void setLanguageValid()
    {
        String expected = countryCode;

        CountryLanguage cl = new CountryLanguage(countryCode,
                "",
                official,
                percentage);

        cl.setLanguage(expected);
        Assertions.assertEquals(expected, cl.getLanguage());
    }

    @Test
    void setLanguageInvalid()
    {
        //Language only valid when length is less than or equal to 30
        String invalid = "AAAAABBBBBCCCCCDDDDDEEEEEFFFFFGGGGG";
        //When an invalid code is passed, no value should be stored
        String expected = "";

        CountryLanguage cl = new CountryLanguage(countryCode,
                language,
                false,
                0);

        cl.setLanguage(invalid);

        Assertions.assertEquals(expected, cl.getLanguage());
    }

    @Test
    void setOfficial() //No input validation for setOfficial(), so only 1 test needed
    {
        boolean expected = true;

        CountryLanguage cl = new CountryLanguage(countryCode,
                language,
                false,
                percentage);

        cl.setOfficial(expected);
        Assertions.assertEquals(expected, cl.isOfficial());
    }

    @Test
    void setPercentageValid()
    {
        double expected = percentage;

        CountryLanguage cl = new CountryLanguage(countryCode,
                language,
                official,
                0);

        cl.setPercentage(expected);
        Assertions.assertEquals(expected, cl.getPercentage());
    }

    @Test
    void setPercentageInvalid()
    {
        //Percentages over 100 are invalid
        double invalid = 110;
        //When an invalid percentage is passed, 0 should be stored
        double expected = 0;

        CountryLanguage cl = new CountryLanguage(countryCode,
                language,
                official,
                100);

        cl.setPercentage(invalid);

        Assertions.assertEquals(expected, cl.getPercentage());
    }
}