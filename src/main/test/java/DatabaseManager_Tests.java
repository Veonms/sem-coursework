import com.napier.sem.util.NumberSingleton;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.napier.sem.util.DatabaseManager;

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
}
