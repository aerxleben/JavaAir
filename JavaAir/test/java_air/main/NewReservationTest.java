/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.main;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java_air.database.DataClient;
import java_air.panel.reservation.Reservation;
import java_air.panel.flight.BookTravelPanel;
import java_air.panel.reservation.PriceCalculator;
import javax.swing.JOptionPane;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Yuwei Cao
 * @author Guoyu Qi
 */
public class NewReservationTest {
    
    @Test
    public void guestNewReservation_testNormal1() throws Exception {
       
        //delete existing test customer and test reservation
        String existCustomerQuery = "SELECT CustomerID FROM Customers WHERE FIRSTNAME = 'TestFirstName' AND LASTNAME = 'TestLastName' LIMIT 1";
        int existId = new DataClient().getCount(existCustomerQuery);
        if(existId > 0){
            JOptionPane.showMessageDialog(null, "There are existing test customer.");
            String deleteCustomerQuery = "DELETE FROM Customers WHERE CustomerID = '" + existId + "'";
            String deleteReservationQuery = "DELETE FROM Reservations WHERE CustomerID = '"+ existId + "'";
            new DataClient().dbInsertOrUpdate(deleteCustomerQuery);
            JOptionPane.showMessageDialog(null, "Existing test customer deleted.");
            new DataClient().dbInsertOrUpdate(deleteReservationQuery);
            JOptionPane.showMessageDialog(null, "Existing test reservation deleted.");   
        }
        else{
            JOptionPane.showMessageDialog(null, "No test customer existing.");
        }
        
        //make new test reservation
        BookTravelPanel panel1 = new BookTravelPanel();
        ArrayList<Flight> originFlights = new DataClient().getFlightData("SELECT * FROM FLIGHTS WHERE ORIGINAIRPORT = 'Chicago' AND DESTINATIONAIRPORT = 'New York'");
        ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
        try {
            Passenger p1= new Passenger("TestFirstName","TestLastName","04/11/1991","Male","G12345678","2190000000");
            passengerList.add(p1);
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null
                    , ex.getMessage()
                    , "Passenger Info Error"
                    , JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean result;
        
        
        Global.currentReservation = new Reservation(false);
        //Reservation res1 = new Reservation(false);
        Global.currentReservation.setPaymentFirstName("TestFirstName");
        Global.currentReservation.setPaymentLastName("TestLastName");
        Global.currentReservation.setPaymentCardNumber("5324888866669999");
        
        Global.currentReservation.setNumberOfPassenger(1);
        Global.currentReservation.setOriginFlight(originFlights.get(0));
        Global.currentReservation.setPassengerList(passengerList);
        Global.currentReservation.setFlightOriginDatePrint(panel1.getFlightPrintDate(new Date()));
        
        //Global.currentReservation.setNumberOfCheckedBags(1);
        Global.currentReservation.setPriceCalculator(new PriceCalculator());
        Global.currentReservation.setPointsRedeemed(0);
        Global.currentReservation.setAmountPaid((float)177.6);
        Global.currentReservation.setBillingAddress("2330 173RD ST Griffin000");
        Global.currentReservation.setBillingPhone("2190000000");
        Global.currentReservation.setBillingEmail("TestTest@pnw.edu");
        
        try{
            result = Global.currentReservation.saveReservationToDB();
            assertTrue(result);
        }
        catch(Exception e){
            fail();
        }
              
    }
    
    
    @Test
    public void RegistednewReservation_testNormal1() throws Exception {
       
        //delete existing test customer and test reservation
        String existCustomerQuery = "SELECT CustomerID FROM Customers WHERE FIRSTNAME = 'TestFirstName' AND LASTNAME = 'TestLastName' LIMIT 1";
        int existId = new DataClient().getCount(existCustomerQuery);
        if(existId > 0){
            JOptionPane.showMessageDialog(null, "There are existing test customer.");
            String deleteCustomerQuery = "DELETE FROM Customers WHERE CustomerID = '" + existId + "'";
            String deleteReservationQuery = "DELETE FROM Reservations WHERE CustomerID = '"+ existId + "'";
            new DataClient().dbInsertOrUpdate(deleteCustomerQuery);
            JOptionPane.showMessageDialog(null, "Existing test customer deleted.");
            new DataClient().dbInsertOrUpdate(deleteReservationQuery);
            JOptionPane.showMessageDialog(null, "Existing test reservation deleted.");   
        }
        else{
            JOptionPane.showMessageDialog(null, "No test customer existing.");
        }
        
        //make new test reservation
        BookTravelPanel panel1 = new BookTravelPanel();
        ArrayList<Flight> originFlights = new DataClient().getFlightData("SELECT * FROM FLIGHTS WHERE ORIGINAIRPORT = 'Chicago' AND DESTINATIONAIRPORT = 'New York'");
        ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
        try {
            Passenger p1= new Passenger("TestFirstName","TestLastName","04/11/1991","Male","G12345678","3330000000");
            passengerList.add(p1);
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null
                    , ex.getMessage()
                    , "Passenger Info Error"
                    , JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean result;
        
        
        Global.currentReservation = new Reservation(false);
        //Reservation res1 = new Reservation(false);
        Global.currentReservation.setPaymentFirstName("TestFirstName");
        Global.currentReservation.setPaymentLastName("TestLastName");
        Global.currentReservation.setPaymentCardNumber("1234888866669999");
        
        Global.currentReservation.setNumberOfPassenger(1);
        Global.currentReservation.setOriginFlight(originFlights.get(0));
        Global.currentReservation.setPassengerList(passengerList);
        Global.currentReservation.setFlightOriginDatePrint(panel1.getFlightPrintDate(new Date()));
        
        //Global.currentReservation.setNumberOfCheckedBags(1);
        Global.currentReservation.setPriceCalculator(new PriceCalculator());
        Global.currentReservation.setPointsRedeemed(0);
        Global.currentReservation.setAmountPaid((float)177.6);
        Global.currentReservation.setBillingAddress("2330 173RD ST Griffin000");
        Global.currentReservation.setBillingPhone("3210000000");
        Global.currentReservation.setBillingEmail("logintest@gmail.com");
        
        try{
            result = Global.currentReservation.saveReservationToDB();
            assertTrue(result);
        }
        catch(Exception e){
            fail();
        }
    }
 

    /**
    @Test
    public void registeredCustomerNewReservation_testNormal1() throws Exception {
       
        //delete existing test customer and test reservation
        String existCustomerQuery = "SELECT CustomerID FROM Customers WHERE FIRSTNAME = 'TestFirstName' AND LASTNAME = 'TestLastName' LIMIT 1";
        int existId = new DataClient().getCount(existCustomerQuery);
        if(existId > 0){
            JOptionPane.showMessageDialog(null, "There are existing test customer.");
            String deleteCustomerQuery = "DELETE FROM Customers WHERE CustomerID = '" + existId + "'";
            String deleteReservationQuery = "DELETE FROM Reservations WHERE CustomerID = '"+ existId + "'";
            new DataClient().dbInsertOrUpdate(deleteCustomerQuery);
            JOptionPane.showMessageDialog(null, "Existing test customer deleted.");
            new DataClient().dbInsertOrUpdate(deleteReservationQuery);
            JOptionPane.showMessageDialog(null, "Existing test reservation deleted.");   
        }
        else{
            JOptionPane.showMessageDialog(null, "No test customer existing.");
        }
        
        //make new test reservation
        BookTravelPanel panel1 = new BookTravelPanel();
        ArrayList<Flight> originFlights = new DataClient().getFlightData("SELECT * FROM FLIGHTS WHERE ORIGINAIRPORT = 'Chicago' AND DESTINATIONAIRPORT = 'New York'");
        ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
        try {
            Passenger p1= new Passenger("TestFirstName","TestLastName","04/11/1991","Male","G12345678","2190000000");
            passengerList.add(p1);
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null
                    , ex.getMessage()
                    , "Passenger Info Error"
                    , JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean result;
        
        
        Global.currentReservation = new Reservation(false);
        //Reservation res1 = new Reservation(false);
        Global.currentReservation.setPaymentFirstName("TestFirstName");
        Global.currentReservation.setPaymentLastName("TestLastName");
        Global.currentReservation.setPaymentCardNumber("5324888866669999");
        
        Global.currentReservation.setNumberOfPassenger(1);
        Global.currentReservation.setOriginFlight(originFlights.get(0));
        Global.currentReservation.setPassengerList(passengerList);
        Global.currentReservation.setFlightOriginDatePrint(panel1.getFlightPrintDate(new Date()));
        
        //Global.currentReservation.setNumberOfCheckedBags(1);
        Global.currentReservation.setPriceCalculator(new PriceCalculator());
        Global.currentReservation.setPointsRedeemed(0);
        Global.currentReservation.setAmountPaid((float)177.6);
        Global.currentReservation.setBillingAddress("2330 173RD ST Griffin000");
        Global.currentReservation.setBillingPhone("2190000000");
        Global.currentReservation.setBillingEmail("LiLei@pnw.edu");
        
        try{
            result = Global.currentReservation.saveReservationToDB();
            assertTrue(result);
        }
        catch(Exception e){
            fail();
        }
    }
    **/
}
