/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class PassengerTest {
    
    public PassengerTest() {
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

    /**
     * Test of getFirstName method, of class Passenger.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Passenger instance = null;
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        fail("No DB connection created.");
    }

    /**
     * Test of getLastName method, of class Passenger.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Passenger instance = null;
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        fail("No DB connection created.");
    }

    /**
     * Test of getDateOfBirth method, of class Passenger.
     */
    @Test
    public void testGetDateOfBirth() {
        System.out.println("getDateOfBirth");
        Passenger instance = null;
        String expResult = "";
        String result = instance.getDateOfBirth();
        assertEquals(expResult, result);
        fail("No DB connection created.");
    }

    /**
     * Test of getGender method, of class Passenger.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Passenger instance = null;
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        fail("No DB connection created.");
    }

    /**
     * Test of getPhone method, of class Passenger.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Passenger instance = null;
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        fail("No DB connection created.");
    }

    /**
     * Test of getPrimaryStatus method, of class Passenger.
     */
    @Test
    public void testGetPrimaryStatus() {
        System.out.println("getPrimaryStatus");
        Passenger instance = null;
        boolean expResult = false;
        boolean result = instance.getPrimaryStatus();
        assertEquals(expResult, result);
        fail("No DB connection created.");
    }

    /**
     * Test of getPassID method, of class Passenger.
     */
    @Test
    public void testGetPassID() {
        System.out.println("getPassID");
        Passenger instance = null;
        String expResult = "";
        String result = instance.getPassID();
        assertEquals(expResult, result);
        fail("No DB connection created.");
    }

    /**
     * Test of setFirstName method, of class Passenger.
     */
    @Test
    public void testSetFirstName() throws Exception {
        System.out.println("setFirstName");
        String newFirst = "";
        Passenger instance = null;
        instance.setFirstName(newFirst);
        fail("No DB connection created.");
    }

    /**
     * Test of setLastName method, of class Passenger.
     */
    @Test
    public void testSetLastName() throws Exception {
        System.out.println("setLastName");
        String newLast = "";
        Passenger instance = null;
        instance.setLastName(newLast);
        fail("No DB connection created.");
    }

    /**
     * Test of setDateOfBirth method, of class Passenger.
     */
    @Test
    public void testSetDateOfBirth() throws Exception {
        System.out.println("setDateOfBirth");
        String newDate = "";
        Passenger instance = null;
        instance.setDateOfBirth(newDate);
        fail("No DB connection created.");
    }

    /**
     * Test of setGender method, of class Passenger.
     */
    @Test
    public void testSetGender() throws Exception {
        System.out.println("setGender");
        String newGender = "";
        Passenger instance = null;
        instance.setGender(newGender);
        fail("No DB connection created.");
    }

    /**
     * Test of setPhoneNumber method, of class Passenger.
     */
    @Test
    public void testSetPhoneNumber() throws Exception {
        System.out.println("setPhoneNumber");
        String newPhone = "";
        Passenger instance = null;
        instance.setPhoneNumber(newPhone);
        fail("No DB connection created.");
    }

    /**
     * Test of setPrimaryStatus method, of class Passenger.
     */
    @Test
    public void testSetPrimaryStatus() throws Exception {
        System.out.println("setPrimaryStatus");
        boolean newStatus = false;
        Passenger instance = null;
        instance.setPrimaryStatus(newStatus);
        fail("No DB connection created.");
    }

    /**
     * Test of setPassID method, of class Passenger.
     */
    @Test
    public void testSetPassID() {
        System.out.println("setPassID");
        String passID = "";
        Passenger instance = null;
        instance.setPassID(passID);
        fail("No DB connection created.");
    }
    
}
