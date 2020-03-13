import com.napier.sem.data.City;
import com.napier.sem.util.NumberSingleton;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.napier.sem.data.Country;

public class Country_Tests {
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

    All of these test that the get methods of City return the correct value.
    Tests involve creating a City with the relevant attribute set to a fixed value and then
    comparing that value with the result of the corresponding get method.
    */

    /*
    Set Tests

    Tests that set methods store data correctly and also validate the value being passed before storage.

    2 types of test for each field:
        1: Valid input
        2: Valid input
    The value stored after the method is called will then be tested against the correct value
    */
}
