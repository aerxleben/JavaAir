/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.main;

import java.util.ArrayList;
import java_air.database.DataClient;
import java_air.panel.flight.BookTravelPanel;
import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import org.junit.Test;


/**
 *
 * @author Yuwei Cao
 */
public class FlightSearchTest {
    
        @Test
	public void searchFlights_testNormal1() throws Exception {
		BookTravelPanel panel = new BookTravelPanel();
		
                panel.setOrigin("Chicago");
                panel.setDestination("New York");
                panel.setDepartDate("2016-11-29");
                panel.setTripButtons(false);
                
                String origin = panel.getOrigin();
                String destination = panel.getDestination();
                //boolean isRoundTrip = panel.isRoundTrip();
                
                String query1 = "SELECT * FROM FLIGHTS " +
                "WHERE ORIGINAIRPORT = '" + origin + "' AND " +
                "DESTINATIONAIRPORT = '" + destination + "'";
                
                try{
                    ArrayList<Flight> departFlights = new DataClient().getFlightData(query1);
                    assertTrue(departFlights.size()> 0);
                    //assertTrue(Global.currentReservation.getNumberOfPassenger() == 1);
                }
                catch(Exception e){
                    fail();
                }
	}
      
        @Test
	public void searchFlights_testNormal2() {
		FlightSearchPanel panel = new FlightSearchPanel();
		panel.setOriginComboBox("Chicago");
                panel.setDestinationComboBox("New York");
                panel.setDepartDate("2016-11-29");
                panel.setPassengersNumber("1");
                panel.setTripType(false);
                
                BookTravelPanel panel2 = new  BookTravelPanel();
                panel2.setTripButtons(panel.getRoundTripButton().isSelected());
                panel2.setOrigin(panel.getOriginComboBox().getSelectedItem().toString());
                panel2.setDestination(panel.getDestinationComboBox().getSelectedItem().toString());
                panel2.setDepartDate(Global.dateFormat.format(panel.getDepartDatePicker().getDate()));
                panel2.setNumOfPassengers(panel.getNumPassengersComboBox().getSelectedItem().toString());
                
                String origin = panel2.getOrigin();
                String destination = panel2.getDestination();
                
                String query1 = "SELECT * FROM FLIGHTS " +
                "WHERE ORIGINAIRPORT = '" + origin + "' AND " +
                "DESTINATIONAIRPORT = '" + destination + "'";
                
                try{
                    ArrayList<Flight> departFlights = new DataClient().getFlightData(query1);
                    assertTrue(departFlights.size()> 0);
                }
                catch(Exception e){
                    fail();
                }
	}
        
        
        @Test
	public void searchFlights_testIdenticalOD() throws Exception {
		BookTravelPanel panel = new BookTravelPanel();
		
                panel.setOrigin("Chicago");
                panel.setDestination("Chicago");
                panel.setDepartDate("2016-11-29");
                panel.setTripButtons(false);
                
                String origin = panel.getOrigin();
                String destination = panel.getDestination();
                //boolean isRoundTrip = panel.isRoundTrip();
                
                String query1 = "SELECT * FROM FLIGHTS " +
                "WHERE ORIGINAIRPORT = '" + origin + "' AND " +
                "DESTINATIONAIRPORT = '" + destination + "'";
                
                try{
                    ArrayList<Flight> departFlights = new DataClient().getFlightData(query1);
                    assertTrue(departFlights.size() == 0);
                    //assertTrue(Global.currentReservation.getNumberOfPassenger() == 1);
                }
                catch(Exception e){
                    fail();
                }
	}
}
