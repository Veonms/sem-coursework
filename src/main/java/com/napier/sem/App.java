package com.napier.sem;

import com.napier.sem.data.Capital;
import com.napier.sem.util.DatabaseManager;
<<<<<<< HEAD
import com.napier.sem.util.Queries;
=======

<<<<<<< HEAD
import java.sql.Statement;
=======
import static com.napier.sem.util.Queries.countriesInContinent;
import static com.napier.sem.util.Queries.worldCountries;
>>>>>>> develop
>>>>>>> 16e6aa4d6a8b7d34a3f392a28af4591266962716

/**
 * <h1>SEM Coursework</h1>
 * <p>Program to provide a simple source of population data.</p>
 *
 * @author Group 16
 * @version 0.1.0.2
 * @since 2020/27/01
 */
public class App {

    public static void main(String[] args) {
        DatabaseManager dbm = DatabaseManager.getInstance();
        Queries query = new Queries();

        dbm.connect(10, 3306, "world", "root", "example", false);
<<<<<<< HEAD

        dbm.createCities();

=======
        dbm.populate();
>>>>>>> develop
        dbm.disconnect();

        query.worldCountries();
        query.countriesInContinent("Asia");
        query.countriesInRegion("Southern Europe");
        query.topPopulatedCountries(5);
        query.topPopulatedCountriesInContinent(7, "Europe");
        query.topPopulatedCountriesInRegion(4, "Eastern Europe");
    }
}
