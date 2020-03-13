import com.napier.sem.data.City;
import com.napier.sem.util.NumberSingleton;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.napier.sem.data.Country;

public class Country_Tests {
    String name = "Test City";
    String code = "TCi";
    String continent = "Test Continent";
    String region = "Test Region";
    double surfaceArea = 12.34;
    int population = 1234;
    int independence = 0;
    double lifeExpectancy = 34.12;
    double grossNationalProduct = 10203040.25;
    double oldGrossNationalProduct = 10203040.00;
    String localName = "Mother Testland";
    String government = "Chancellor Putin";
    String stateHead = "Mr. Vlad";
    int capital = 0;
    String code2 = "iCT";

    @Test
    void toStringProper()
    {
        /*
        Tests that toString returns a string containing the correct data, properly formatted.

        Tested by creating an expected string with set values, creating a Country with the same values,
        and comparing the result of toString against the expected value.
         */

        String expected = "[" +
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

        String actual = new Country(code,
                name,
                continent,
                region,
                surfaceArea,
                independence,
                population,
                lifeExpectancy,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                capital,
                code2).toString();

        Assertions.assertEquals(expected, actual);
    }

    /*
    Get Tests

    All of these test that the get methods of Country return the correct value.
    Tests involve creating a Country with the relevant attribute set to a fixed value and then
    comparing that value with the result of the corresponding get method.
    */

    @Test
    void getCode()
    {
        String expected = code;

        Country testCountry = new Country(expected,
                name,
                continent,
                region,
                surfaceArea,
                independence,
                population,
                lifeExpectancy,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                capital,
                code2);

        Assertions.assertEquals(expected, testCountry.getCode());
    }

    @Test
    void getName()
    {
        String expected = name;

        Country testCountry = new Country(code,
                expected,
                continent,
                region,
                surfaceArea,
                independence,
                population,
                lifeExpectancy,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                capital,
                code2);

        Assertions.assertEquals(expected, testCountry.getName());
    }

    @Test
    void getContinent()
    {
        String expected = continent;

        Country testCountry = new Country(code,
                name,
                expected,
                region,
                surfaceArea,
                independence,
                population,
                lifeExpectancy,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                capital,
                code2);

        Assertions.assertEquals(expected, testCountry.getContinent());
    }

    @Test
    void getRegion()
    {
        String expected = region;

        Country testCountry = new Country(code,
                name,
                continent,
                expected,
                surfaceArea,
                independence,
                population,
                lifeExpectancy,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                capital,
                code2);

        Assertions.assertEquals(expected, testCountry.getRegion());
    }

    @Test
    void getSurfaceArea()
    {
        double expected = surfaceArea;

        Country testCountry = new Country(code,
                name,
                continent,
                region,
                expected,
                independence,
                population,
                lifeExpectancy,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                capital,
                code2);

        Assertions.assertEquals(expected, testCountry.getSurfaceArea());
    }

    @Test
    void getIndependence()
    {
        int expected = independence;

        Country testCountry = new Country(code,
                name,
                continent,
                region,
                surfaceArea,
                expected,
                population,
                lifeExpectancy,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                capital,
                code2);

        Assertions.assertEquals(expected, testCountry.getIndependence());
    }

    @Test
    void getPopulation()
    {
        int expected = population;

        Country testCountry = new Country(code,
                name,
                continent,
                region,
                surfaceArea,
                independence,
                expected,
                lifeExpectancy,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                capital,
                code2);

        Assertions.assertEquals(expected, testCountry.getPopulation());
    }

    @Test
    void getLifeExpectancy()
    {
        double expected = lifeExpectancy;

        Country testCountry = new Country(code,
                name,
                continent,
                region,
                surfaceArea,
                independence,
                population,
                expected,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                capital,
                code2);

        Assertions.assertEquals(expected, testCountry.getLifeExpectancy());
    }

    @Test
    void getGrossNationalProduct()
    {
        double expected = grossNationalProduct;

        Country testCountry = new Country(code,
                name,
                continent,
                region,
                surfaceArea,
                independence,
                population,
                lifeExpectancy,
                expected,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                capital,
                code2);

        Assertions.assertEquals(expected, testCountry.getGrossNationalProduct());
    }

    @Test
    void getOldGrossNationalProduct()
    {
        double expected = oldGrossNationalProduct;

        Country testCountry = new Country(code,
                name,
                continent,
                region,
                surfaceArea,
                independence,
                population,
                lifeExpectancy,
                grossNationalProduct,
                expected,
                localName,
                government,
                stateHead,
                capital,
                code2);

        Assertions.assertEquals(expected, testCountry.getOldGrossNationalProduct());
    }

    @Test
    void getLocalName()
    {
        String expected = localName;

        Country testCountry = new Country(code,
                name,
                continent,
                region,
                surfaceArea,
                independence,
                population,
                lifeExpectancy,
                grossNationalProduct,
                oldGrossNationalProduct,
                expected,
                government,
                stateHead,
                capital,
                code2);

        Assertions.assertEquals(expected, testCountry.getLocalName());
    }

    @Test
    void getGovernment()
    {
        String expected = government;

        Country testCountry = new Country(code,
                name,
                continent,
                region,
                surfaceArea,
                independence,
                population,
                lifeExpectancy,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                expected,
                stateHead,
                capital,
                code2);

        Assertions.assertEquals(expected, testCountry.getGovernment());
    }

    @Test
    void getStateHead()
    {
        String expected = stateHead;

        Country testCountry = new Country(code,
                name,
                continent,
                region,
                surfaceArea,
                independence,
                population,
                lifeExpectancy,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                government,
                expected,
                capital,
                code2);

        Assertions.assertEquals(expected, testCountry.getStateHead());
    }

    @Test
    void getCapital()
    {
        int expected = capital;

        Country testCountry = new Country(code,
                name,
                continent,
                region,
                surfaceArea,
                independence,
                population,
                lifeExpectancy,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                expected,
                code2);

        Assertions.assertEquals(expected, testCountry.getCapital());
    }

    @Test
    void getCode2()
    {
        String expected = code2;

        Country testCountry = new Country(code,
                name,
                continent,
                region,
                surfaceArea,
                independence,
                population,
                lifeExpectancy,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                capital,
                expected);

        Assertions.assertEquals(expected, testCountry.getCode2());
    }

    /*
    Set Tests

    Tests that set methods store data correctly and also validate the value being passed before storage.

    2 types of test for each field:
        1: Valid input
        2: Valid input
    The value stored after the method is called will then be tested against the correct value
    */
}
