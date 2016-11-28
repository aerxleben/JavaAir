/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.main;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Yuwei Cao
 * @author Guoyu Qi
 */
public class LoginTest {
    @Test
    public void login_TestNormal() throws Exception{
        //register new test customer
        new RegistrationTest().registration_TestNormal();
        //test customer login
        LoginLandingPanel panel = new LoginLandingPanel();
        panel.getEmailField().setText("TestRegistration@pnw.edu");
        panel.getPasswordField().setText("11111111");
        try{
            panel.loginButtonPressed();
        }
        catch(Exception e){
        }
        
        assertTrue(("TestRegistrationFN".equals(Global.currentCustomer.getFirstName())) && ("TestRegistrationLN".equals(Global.currentCustomer.getLastName())));    
   
    }
    
        public void login_TestNormal1() throws Exception{
        //register new test customer
        new RegistrationTest().registration_TestNormal();
        //test customer login
        LoginLandingPanel panel = new LoginLandingPanel();
        panel.getEmailField().setText("logintest@gmail.com");
        panel.getPasswordField().setText("123456");
        try{
            panel.loginButtonPressed();
        }
        catch(Exception e){
        }
        
        assertTrue(("TestRegistrationFN".equals(Global.currentCustomer.getFirstName())) && ("TestRegistrationLN".equals(Global.currentCustomer.getLastName())));    
   
    }
}
