package test.unit;

import com.napier.sem.data.Country;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
class CountryTest {

    String name = "Test City";
    String code = "TCi";
    String continent = "Africa";
    String region = "Test Region";
    double surfaceArea = 12.34;
    int population = 1234;
    int independence = 2000;
    double lifeExpectancy = 34.1;
    double grossNationalProduct = 10203040.25;
    double oldGrossNationalProduct = 10203040.00;
    String localName = "Mother Testland";
    String government = "Chancellor Putin";
    String stateHead = "Mr. Vlad";
    int capital = 0;
    String code2 = "TC";

    @Test
    void toStringProper() {
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
    void getCode() {
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
    void getName() {
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
    void getContinent() {
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
    void getRegion() {
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
    void getSurfaceArea() {
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
    void getIndependence() {
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
    void getPopulation() {
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
    void getLifeExpectancy() {
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
    void getGrossNationalProduct() {
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
    void getOldGrossNationalProduct() {
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
    void getLocalName() {
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
    void getGovernment() {
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
    void getStateHead() {
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
    void getCapital() {
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
    void getCode2() {
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

    @Test
    void getCountries() {
        int key = 0;
        Country country = new Country(code,
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

        Country.getCountries().put(key, country);
        Assertions.assertEquals(country, Country.getCountries().get(key));
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
    void setCodeValid() {
        String expected = code;

        Country testCountry = new Country("",
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

        testCountry.setCode(expected);
        Assertions.assertEquals(expected, testCountry.getCode());
    }

    @Test
    void setCodeInvalid() {
        String expected = "";

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
                code2);

        //Code is invalid if its length is not exactly 3
        testCountry.setCode("T");
        Assertions.assertEquals(expected, testCountry.getCode());
    }

    @Test
    void setNameValid() {
        String expected = name;

        Country testCountry = new Country(code,
                "",
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

        testCountry.setName(expected);
        Assertions.assertEquals(expected, testCountry.getName());
    }

    @Test
    void setNameInvalid() {
        String expected = "";

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
                code2);

        //Name is invalid if its length is greater than 52
        testCountry.setCode("AAAAABBBBBCCCCCDDDDDEEEEEFFFFFGGGGGHHHHHIIIIIJJJJJKKKKK");
        Assertions.assertEquals(expected, testCountry.getCode());
    }

    @Test
    void setContinentValid() {
        String expected = continent;

        Country testCountry = new Country(code,
                name,
                "",
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

        testCountry.setContinent(expected);
        Assertions.assertEquals(expected, testCountry.getContinent());
    }

    @Test
    void setContinentInvalid() {
        String expected = "Asia";

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
                code2);

        //Name is invalid if it is not one of the 7 continents
        testCountry.setContinent("Neverland");
        Assertions.assertEquals(expected, testCountry.getContinent());
    }

    @Test
    void setRegionValid() {
        String expected = region;

        Country testCountry = new Country(code,
                name,
                continent,
                "",
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

        testCountry.setRegion(expected);
        Assertions.assertEquals(expected, testCountry.getRegion());
    }

    @Test
    void setRegionInvalid() {
        String expected = "";

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
                code2);

        //Name is invalid if its length is greater than 26
        testCountry.setRegion("AAAAABBBBBCCCCCDDDDDEEEEEFFFFF");
        Assertions.assertEquals(expected, testCountry.getRegion());
    }

    @Test
    void setSurfaceArea() //Any double passed into setSurfaceArea is accepted, so not test needed for invalid values
    {
        double expected = surfaceArea;

        Country testCountry = new Country(code,
                name,
                continent,
                region,
                0,
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

        testCountry.setSurfaceArea(expected);
        Assertions.assertEquals(expected, testCountry.getSurfaceArea());
    }

    @Test
    void setIndependence() {
        int expected = independence;

        Country testCountry = new Country(code,
                name,
                continent,
                region,
                surfaceArea,
                0,
                population,
                lifeExpectancy,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                capital,
                code2);

        testCountry.setIndependence(expected);
        Assertions.assertEquals(expected, testCountry.getIndependence());
    }

    @Test
    void setIndependenceInvalid() {
        int expected = 0;

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

        /*
        Independence is invalid if its is a year beyond the current year
         - this will always fail if the computer year is set to sometime beyond 3000
         */
        testCountry.setIndependence(3000);
        Assertions.assertEquals(expected, testCountry.getIndependence());
    }

    @Test
    void setPopulation() //Any integer passed into setPopulation is accepted, so not test needed for invalid values
    {
        int expected = population;

        Country testCountry = new Country(code,
                name,
                continent,
                region,
                surfaceArea,
                independence,
                0,
                lifeExpectancy,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                capital,
                code2);

        testCountry.setPopulation(expected);
        Assertions.assertEquals(expected, testCountry.getPopulation());
    }

    @Test
    void setLifeExpectancy() //Any double passed into setLifeExpectancy is accepted, so not test needed for invalid values
    {
        double expected = lifeExpectancy;

        Country testCountry = new Country(code,
                name,
                continent,
                region,
                surfaceArea,
                independence,
                population,
                0,
                grossNationalProduct,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                capital,
                code2);

        testCountry.setLifeExpectancy(expected);
        Assertions.assertEquals(expected, testCountry.getLifeExpectancy());
    }

    @Test
    void setGrossNationalProduct() //Any double passed into setGrossNationalProduct is accepted, so not test needed for invalid values
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
                0,
                oldGrossNationalProduct,
                localName,
                government,
                stateHead,
                capital,
                code2);

        testCountry.setGrossNationalProduct(expected);
        Assertions.assertEquals(expected, testCountry.getGrossNationalProduct());
    }

    @Test
    void setOldGrossNationalProduct() //Any double passed into setOldGrossNationalProduct is accepted, so not test needed for invalid values
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
                0,
                localName,
                government,
                stateHead,
                capital,
                code2);

        testCountry.setOldGrossNationalProduct(expected);
        Assertions.assertEquals(expected, testCountry.getOldGrossNationalProduct());
    }

    @Test
    void setLocalNameValid() {
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
                "",
                government,
                stateHead,
                capital,
                code2);

        testCountry.setLocalName(expected);
        Assertions.assertEquals(expected, testCountry.getLocalName());
    }

    @Test
    void setLocalNameInvalid() {
        String expected = "";

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
                code2);

        //Local name is invalid if its length is greater than 45
        testCountry.setLocalName("AAAAABBBBBCCCCCDDDDDEEEEEFFFFFGGGGGHHHHHIIIIIJJJJJ");
        Assertions.assertEquals(expected, testCountry.getLocalName());
    }

    @Test
    void setGovernmentValid() {
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
                "",
                stateHead,
                capital,
                code2);

        testCountry.setGovernment(expected);
        Assertions.assertEquals(expected, testCountry.getGovernment());
    }

    @Test
    void setGovernmentInvalid() {
        String expected = "";

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
                code2);

        //Government is invalid if its length is greater than 45
        testCountry.setGovernment("AAAAABBBBBCCCCCDDDDDEEEEEFFFFFGGGGGHHHHHIIIIIJJJJJ");
        Assertions.assertEquals(expected, testCountry.getGovernment());
    }

    @Test
    void setStateHeadValid() {
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
                "",
                capital,
                code2);

        testCountry.setStateHead(expected);
        Assertions.assertEquals(expected, testCountry.getStateHead());
    }

    @Test
    void setStateHeadInvalid() {
        String expected = "";

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
                code2);

        //State head is invalid if its length is greater than 60
        testCountry.setStateHead("AAAAABBBBBCCCCCDDDDDEEEEEFFFFFGGGGGHHHHHIIIIIJJJJJKKKKKLLLLLMMMMMNNNNNOOOOO");
        Assertions.assertEquals(expected, testCountry.getStateHead());
    }

    @Test
    void setCapital() //Any int passed into setCapital is accepted, so no test is required for invalid values
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
                0,
                code2);

        testCountry.setCapital(expected);
        Assertions.assertEquals(expected, testCountry.getCapital());
    }

    @Test
    void setCode2Valid() {
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
                "");

        testCountry.setCode2(expected);
        Assertions.assertEquals(expected, testCountry.getCode2());
    }

    @Test
    void setCode2Invalid() {
        String expected = "";

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
                code2);

        //Code2 is invalid if its length is not exactly 2
        testCountry.setCode2("T");
        Assertions.assertEquals(expected, testCountry.getCode2());
    }
}