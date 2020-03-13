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
}
