/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.main;

import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JTextField;
import org.jdatepicker.impl.JDatePickerImpl;
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
public class PasswordResetPanelTest {
    
    public PasswordResetPanelTest() {
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
     * Test of getEmailField method, of class PasswordResetPanel.
     */
    @Test
    public void testGetEmailField() {
        System.out.println("getEmailField");
        PasswordResetPanel instance = new PasswordResetPanel();
        JTextField expResult = null;
        JTextField result = instance.getEmailField();
        assertEquals(expResult, result);
        fail("No DB connection created.");
    }

    /**
     * Test of getCustomerIDField method, of class PasswordResetPanel.
     */
    @Test
    public void testGetCustomerIDField() {
        System.out.println("getCustomerIDField");
        PasswordResetPanel instance = new PasswordResetPanel();
        JTextField expResult = null;
        JTextField result = instance.getCustomerIDField();
        assertEquals(expResult, result);
        fail("No DB connection created.");
    }

    /**
     * Test of getPasswordField method, of class PasswordResetPanel.
     */
    @Test
    public void testGetPasswordField() {
        System.out.println("getPasswordField");
        PasswordResetPanel instance = new PasswordResetPanel();
        JTextField expResult = null;
        JTextField result = instance.getPasswordField();
        assertEquals(expResult, result);
        fail("No DB connection created.");
    }

    /**
     * Test of getCPasswordField method, of class PasswordResetPanel.
     */
    @Test
    public void testGetCPasswordField() {
        System.out.println("getCPasswordField");
        PasswordResetPanel instance = new PasswordResetPanel();
        JTextField expResult = null;
        JTextField result = instance.getCPasswordField();
        assertEquals(expResult, result);
        fail("No DB connection created.");
    }

    /**
     * Test of getBirthdayPicker method, of class PasswordResetPanel.
     */
    @Test
    public void testGetBirthdayPicker() {
        System.out.println("getBirthdayPicker");
        PasswordResetPanel instance = new PasswordResetPanel();
        JDatePickerImpl expResult = null;
        JDatePickerImpl result = instance.getBirthdayPicker();
        assertEquals(expResult, result);
        fail("No DB connection created.");
    }

    /**
     * Test of getResetButton method, of class PasswordResetPanel.
     */
    @Test
    public void testGetResetButton() {
        System.out.println("getResetButton");
        PasswordResetPanel instance = new PasswordResetPanel();
        JButton expResult = null;
        JButton result = instance.getResetButton();
        assertEquals(expResult, result);
        fail("No DB connection created.");
    }

    
    
}
