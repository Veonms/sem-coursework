import com.napier.sem.util.NumberSingleton;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.napier.sem.*;

class NumberSingleton_Tests
{
    @Test
    void onlyOneInstance()
    {
        /*
        Tests that the NumberSingleton class maintains only one instance.
        Tested by creating a NumberSingleton and modifying it,
        then checking for that same modification in a 'new' NumberSingleton.
        Tested after the 'get' methods because they are used for this test.
         */
        NumberSingleton ns = NumberSingleton.getInstance();
        ns.getCity(); //Increments city value by 1

        NumberSingleton newNS = NumberSingleton.getInstance();

        Assertions.assertEquals(2, newNS.getCity()); //A fresh NumberSingleton will return 1 instead of 2
    }
}