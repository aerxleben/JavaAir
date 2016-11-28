/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.main;

import java_air.database.DataClient;
import javax.swing.JOptionPane;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Yuwei Cao
 * @author Guoyu Qi
 */
public class RegistrationTest {
    
    @Test
    public void registration_TestNormal() throws Exception{
        
        //delete existing test customer and test reservation
        String existCustomerQuery = "SELECT CustomerID FROM Customers WHERE FIRSTNAME = 'TestRegistrationFN' AND LASTNAME = 'TestRegistrationLN' LIMIT 1";
        int existId = new DataClient().getCount(existCustomerQuery);
        if(existId > 0){
            JOptionPane.showMessageDialog(null, "There are existing test customer.");
            String deleteCustomerQuery = "DELETE FROM Customers WHERE CustomerID = '" + existId + "'";
            String existReservationQuery =  "SELECT ReservationNumber FROM Reservations WHERE CustomerID = '"+ existId + "'";
            String deleteReservationQuery = "DELETE FROM Reservations WHERE CustomerID = '"+ existId + "'";
            new DataClient().dbInsertOrUpdate(deleteCustomerQuery);
            JOptionPane.showMessageDialog(null, "Existing test customer deleted.");
       
            try{
                new DataClient().dbInsertOrUpdate(deleteReservationQuery);
                JOptionPane.showMessageDialog(null, "Existing test reservation deleted.");
            }catch(Exception ex){
               // JOptionPane.showMessageDialog(null
               //         , ex.getMessage()
               //         , "DB error."
               //        , JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No test customer existing.");
        }
        
        //register new test customer
        RegistrationPanel panel = new RegistrationPanel();
        panel.getFirstField().setText("TestRegistrationFN");
        panel.getLastField().setText("TestRegistrationLN");
        panel.getBirthdayPicker().setDate(Global.dateFormat.parse("1991-01-01"));
        panel.getGenderBox().setSelectedIndex(1);
        panel.getAddressField().setText("2330 173RD ST Griffin000");
        panel.getCityField().setText("Hammond");
        panel.getStateField().setText("IN");
        panel.getZipField().setText("46323");
        panel.getPhoneField().setText("(219) 111-1111");
        panel.getEmailField().setText("TestRegistration@pnw.edu");
        panel.getPasswordField().setText("11111111");
        panel.getCPasswordField().setText("11111111");
        
        try{
            panel.getSubmitButton().doClick();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null
                    , ex.getMessage()
                    , "Click submit button error."
                    , JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        assertTrue(new DataClient().getCount(existCustomerQuery) > 0);
        
    }
    
        @Test
    public void registration_TestNormal1() throws Exception{
        
        //delete existing test customer and test reservation
        String existCustomerQuery = "SELECT CustomerID FROM Customers WHERE FIRSTNAME = 'TestRegistrationFN' AND LASTNAME = 'TestRegistrationLN' LIMIT 1";
        int existId = new DataClient().getCount(existCustomerQuery);
        if(existId > 0){
            JOptionPane.showMessageDialog(null, "There are existing test customer.");
            String deleteCustomerQuery = "DELETE FROM Customers WHERE CustomerID = '" + existId + "'";
            String existReservationQuery =  "SELECT ReservationNumber FROM Reservations WHERE CustomerID = '"+ existId + "'";
            String deleteReservationQuery = "DELETE FROM Reservations WHERE CustomerID = '"+ existId + "'";
            new DataClient().dbInsertOrUpdate(deleteCustomerQuery);
            JOptionPane.showMessageDialog(null, "Existing test customer deleted.");
       
            try{
                new DataClient().dbInsertOrUpdate(deleteReservationQuery);
                JOptionPane.showMessageDialog(null, "Existing test reservation deleted.");
            }catch(Exception ex){
               // JOptionPane.showMessageDialog(null
               //         , ex.getMessage()
               //         , "DB error."
               //        , JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No test customer existing.");
        }
        
        //register new test customer
        RegistrationPanel panel = new RegistrationPanel();
        panel.getFirstField().setText("TestFristName");
        panel.getLastField().setText("TestLastName");
        panel.getBirthdayPicker().setDate(Global.dateFormat.parse("1996-12-12"));
        panel.getGenderBox().setSelectedIndex(1);
        panel.getAddressField().setText("2330 173RD ST Griffin000");
        panel.getCityField().setText("Hammond");
        panel.getStateField().setText("IN");
        panel.getZipField().setText("463233");
        panel.getPhoneField().setText("(321) 000-0000");
        panel.getEmailField().setText("logintest@gmail.com");
        panel.getPasswordField().setText("123456");
        panel.getCPasswordField().setText("123456");
        
        try{
            panel.getSubmitButton().doClick();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null
                    , ex.getMessage()
                    , "Click submit button error."
                    , JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        assertTrue(new DataClient().getCount(existCustomerQuery) > 0);
        
    }
    
}
