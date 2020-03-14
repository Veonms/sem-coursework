package UnitTests;

import com.napier.sem.util.NumberSingleton;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.napier.sem.data.City;

public class City_Tests {
    @Test
    void toStringProper()
    {
        /*
        Tests that toString returns a string containing the correct data, properly formatted.

        Tested by creating an expected string with set values, creating a city with the same values,
        and comparing the result of toString against the expected value.
         */

        String name = "Test City";
        String code = "TCi";
        String district = "Test District";
        int population = 1234;

        String expected = "City{" +
                "name='" + name + '\'' +
                ", countryCode='" + code + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                '}';

        String actual = new City(name,
                code,
                district,
                population).toString();

        Assertions.assertEquals(expected, actual);
    }

    /*
    Get Tests

    All of these test that the get methods of City return the correct value.
    Tests involve creating a City with the relevant attribute set to a fixed value and then
    comparing that value with the result of the corresponding get method.
     */

    @Test
    void getName()
    {
        String name = "Test City";
        City city = new City(name, "", "", 0);
        Assertions.assertEquals(name, city.getName());
    }

    @Test
    void getCountryCode()
    {
        String code = "TCi";
        City city = new City("", code, "", 0);
        Assertions.assertEquals(code, city.getCountryCode());
    }

    @Test
    void getDistrict()
    {
        String district = "Test District";
        City city = new City("", "", district, 0);
        Assertions.assertEquals(district, city.getDistrict());
    }

    @Test
    void getPopulation()
    {
        int population = 1234;
        City city = new City("", "", "", population);
        Assertions.assertEquals(population, city.getPopulation());
    }

    @Test
    void getCities()
    {
        int key = 0;
        City city = new City("Test City",
                "TC",
                "Test District",
                1234);
        City.getCities().put(key, city);
        Assertions.assertEquals(city, City.getCities().get(key));
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
    void setNameValid()
    {
        String expected = "Test City";
        City city = new City("","","",0);
        city.setName(expected);
        Assertions.assertEquals(expected, city.getName());
    }

    @Test
    void setNameInvalid()
    {
        //Name is invalid when length of name is greater than 35
        String invalid = "AAAAABBBBBCCCCCDDDDDEEEEEFFFFFGGGGGHHHHH";
        //When an invalid name is passed, no value should be stored
        String expected = "";

        City city = new City("","","",0);
        city.setName(invalid);

        Assertions.assertEquals(expected, city.getName());
    }

    @Test
    void setCodeValid()
    {
        String expected = "TCi";
        City city = new City("","","",0);
        city.setCountryCode(expected);

        Assertions.assertEquals(expected, city.getCountryCode());
    }

    @Test
    void setCodeInvalid()
    {
        //Code is invalid when length of code is not 3
        String invalid = "T";
        //Code an invalid code is passed, no value should be stored
        String expected = "";

        City city = new City("","","",0);
        city.setCountryCode(invalid);

        Assertions.assertEquals(expected, city.getCountryCode());
    }

    @Test
    void setDistrictValid()
    {
        String expected = "Test District";
        City city = new City("","","",0);
        city.setDistrict(expected);

        Assertions.assertEquals(expected, city.getDistrict());
    }

    @Test
    void setDistrictInvalid()
    {
        //District is invalid when length of district is greater than 20
        String invalid = "AAAAABBBBBCCCCCDDDDDEEEEE";
        //When an invalid district is passed, no value should be stored
        String expected = "";

        City city = new City("","","",0);
        city.setDistrict(invalid);

        Assertions.assertEquals(expected, city.getDistrict());
    }

    @Test
    void setPopulation() //No invalid test as all values stored by int will be accepted
    {
        int expected = 1234;
        City city = new City("","","",0);
        city.setPopulation(expected);

        Assertions.assertEquals(expected, city.getPopulation());
    }
}