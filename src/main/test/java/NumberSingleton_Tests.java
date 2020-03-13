import com.napier.sem.util.NumberSingleton;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.napier.sem.util.NumberSingleton;

class NumberSingleton_Tests
{
    @Test
    void getCityReturnsProper()
    {
        /*
        Tests that getCity() returns the correct value.
        Tested by creating a new NumberSingleton and checking that the correct default value is returned by getCity()
         */
        NumberSingleton ns = NumberSingleton.getInstance();
        Assertions.assertEquals(1,ns.getCity());
    }

    @Test
    void getCountryReturnsProper()
    {
        /*
        Tests that getCountry() returns the correct value.
        Tested by creating a new NumberSingleton and checking that the correct default value is returned by getCountry()
         */
        NumberSingleton ns = NumberSingleton.getInstance();
        Assertions.assertEquals(1,ns.getCountry());
    }

    @Test
    void getPopulationReturnsProper()
    {
        /*
        Tests that getPopulation() returns the correct value.
        Tested by creating a new NumberSingleton and checking that the correct default value is returned by getPopulation()
         */
        NumberSingleton ns = NumberSingleton.getInstance();
        Assertions.assertEquals(1,ns.getCountryLanguage());
    }

    @Test
    void onlyOneInstance()
    {
        /*
        Tests that the NumberSingleton class maintains only one instance.
        Tested by creating two new NumberSingletons and comparing them.
         */
        NumberSingleton ns = NumberSingleton.getInstance();
        NumberSingleton newNS = NumberSingleton.getInstance();

        Assertions.assertEquals(ns, newNS); //Will pass if they are the same instance stored in different variables
    }
}