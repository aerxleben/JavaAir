/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.main;

import java_air.database.DataClient;
import javax.swing.JOptionPane;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Yuwei Cao
 */
public class CheckInTest {
    @Test
    public void checkIn_testNormal1() {
        int testCustomerId = 0;
        int testReservationNum = 0;
        
        //make new test reservation
        try{
            new NewReservationTest().guestNewReservation_testNormal1();
            //get test reservation number
            String existCustomerQuery = "SELECT CustomerID FROM Customers WHERE FIRSTNAME = 'TestFirstName' AND LASTNAME = 'TestLastName' LIMIT 1";
            testCustomerId = new DataClient().getCount(existCustomerQuery);
            String testReservationQuery = "SELECT ReservationNumber FROM Reservations WHERE CustomerID = '"+ testCustomerId + "'";
            testReservationNum = new DataClient().getCount(testReservationQuery);
        }
        catch(Exception x){
            JOptionPane.showMessageDialog(null
                ,x.getMessage()
                ,"DB new reservation Error"
                ,JOptionPane.ERROR_MESSAGE);
        }
        //set CheckInPanel
        CheckInPanel panel = new CheckInPanel();
        panel.getFirstField().setText("TestFirstName");
        panel.getLastField().setText("TestLastName");
        panel.getReservationIDField().setText(Integer.toString(testReservationNum));
        //update check-in status to DB
        int reservNumberInput = 
                panel.getReservationIDField().getText().isEmpty() ? 
                    -99 : Integer.parseInt(panel.getReservationIDField().getText());
        
        String firstNameInput = panel.getFirstField().getText().isEmpty() ?
                " " : panel.getFirstField().getText();
        
        String lastNameInput = panel.getLastField().getText().isEmpty() ?
                " " : panel.getLastField().getText();
        
        String query = "UPDATE Reservations " + 
                "SET CheckedIn = 1 " +
                "WHERE ReservationNumber = " + reservNumberInput + " " +
                "AND CustomerID = (SELECT CustomerID FROM Customers C " +
                "WHERE C.FirstName = '" + firstNameInput + "' AND " +
                "C.LastName = '" + lastNameInput + "' LIMIT 1)";
        
        String checkStatusQuery = "SELECT CheckedIn FROM Reservations WHERE CustomerID = '"+ testCustomerId + "'";
        
        try{
            new DataClient().dbInsertOrUpdate(query);
            int result = new DataClient().getCount(checkStatusQuery);
            int expResult = 1;
            assertEquals(expResult, result);
        }
        catch(Exception x){
            fail("Check-in failed.");
        }
       
    }
}
