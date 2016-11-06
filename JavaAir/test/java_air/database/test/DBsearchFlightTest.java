package java_air.database.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java_air.database.FlightDAO;
import java_air.main.Flight;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Georege
 */
public class DBsearchFlightTest {
    
    public DBsearchFlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void flightSearch() {
    Flight flight = new Flight();
    Flight result;
    flight.setOriginAirport("Chicago");
    flight.setDestinationAirport("NewYork");
    FlightDAO flightDAO = new FlightDAO();
    result = flightDAO.searchFlight(flight);
    System.out.println(result.getScheduledDeparture());
 //   System.out.println(result.getScheduledArrival());
    }
}
