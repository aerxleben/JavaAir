/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import org.junit.Test;


/**
 *
 * @author Yuwei Cao
 */
public class FlightSearchTest {
    @Test
	public void searchFlights_testNormal() {
		FlightSearchPanel panel = new FlightSearchPanel();
		panel.setOriginComboBox("Chicago");
                panel.setDestinationComboBox("New York");
                panel.setDepartDate("2016-11-29");
                panel.setReturnDate("2016-11-30");
                panel.setPassengersNumber("1");
                panel.setTripType(false);
                
                panel.getSearchButton().doClick();
                
                
                try{
                    assertFalse(Global.currentReservation.getIsRoundTrip());
                    //assertTrue(Global.currentReservation.getNumberOfPassenger() == 1);
                }
                catch(Exception e){
                    fail();
                }
	}
}
