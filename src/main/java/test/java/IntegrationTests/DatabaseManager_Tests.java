package java.IntegrationTests;

import com.napier.sem.data.City;
import com.napier.sem.data.Country;
import com.napier.sem.data.CountryLanguage;
import com.napier.sem.util.NumberSingleton;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.napier.sem.util.DatabaseManager;

import javax.xml.crypto.Data;

public class DatabaseManager_Tests {
    @Test
    void onlyOneInstance()
    {
        /*
        Tests that the DatabaseManager class maintains only one instance.
        Tested by creating two new DatabaseManagers and comparing them.
         */
        DatabaseManager dbm = DatabaseManager.getInstance();
        DatabaseManager newDbm = DatabaseManager.getInstance();
        Assertions.assertEquals(dbm, newDbm);
    }

    @Test
    void connects()
    {
        /*
        Tests that connect() will connect when a valid mySQL server is running.
        Will always fail if the mySQL server is not already running.
         */
        DatabaseManager dbm = DatabaseManager.getInstance();
        Assertions.assertTrue(dbm.connect(10, 3306, "world", "root", "example", false));
    }

    @Test
    void disconnects()
    {
        /*
        Tests that disconnect() will disconnect the DatabaseManager from the currently connected database.
        Will always fail if the mySQL server is not already running.
         */
        DatabaseManager dbm = DatabaseManager.getInstance();
        dbm.connect(10, 3306, "world", "root", "example", false);
        Assertions.assertTrue(dbm.disconnect());
    }

    @Test
    void populates()
    {
        /*
        Tests that the populate() method actually gathers data from the connected database.
        Tested by: connecting to the database, calling populate(),
        and then checking that the length of the stored data is greater than 0.
         */
        DatabaseManager dbm = DatabaseManager.getInstance();
        dbm.connect(10, 3306, "world", "root", "example", false);
        dbm.populate();
        dbm.disconnect();

        boolean populated = City.getCities().size() > 0 &&
                Country.getCountries().size() > 0 &&
                CountryLanguage.getLanguages().size() > 0;

        Assertions.assertTrue(populated);
    }
}
