/*
 *	This file "JavaAirApp" contains the main method for this entire project.
 *	It creates a JFrame in wich to view the user interface.
 *	This file will contain all of the event handlers for this application.	
 *  
 *	Author: Amy Erxleben
 *	
 *	Date created: 10/15/16
 * 
 * Changelog:
 *	2016-10-17  Erxleben added comments
 * 2016-10-18  Jia   changed default height to 800, changed default 
 *                   close operation to dispose    
 *
 * 2016-10-19  Erxleben, added actionListerns for menuBar and supporting handler methods
 *						handler methods only print out the name of the button pressed to the command screen
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class JavaAirApp extends JFrame{
    private static boolean loggedIn = false;
    
    private HomePanel aHomePanel;
    private RegistrationPanel aRegistrationPanel;
    //private LoginLandingPanel aLoginPanel;

    private ActionListener homeListener;
    private ActionListener accountListener;
    private ActionListener reservationListener;
    private ActionListener helpListener;
    private ActionListener aboutListener;
    private ActionListener loginListener;

    public JavaAirApp(){
        this.setTitle("Welcome to Java Air!");
		
        /********************* The View ***********************************/
        aHomePanel = new HomePanel();
        add(aHomePanel);

        /********************************** Action Listeners **************/
        aHomePanel.getMenuBannerPanel().getHomeButton().addActionListener(homeListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleHomeButtonPress();
            }
        });
        
        aHomePanel.getMenuBannerPanel().getReservationButton().addActionListener(reservationListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleReservationButtonPress();
            }
        });
		
        aHomePanel.getMenuBannerPanel().getAccountButton().addActionListener(accountListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleAccountButtonPress();
            }
        });
        
        aHomePanel.getMenuBannerPanel().getHelpButton().addActionListener(helpListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleHelpButtonPress();
            }
        });
        
        aHomePanel.getMenuBannerPanel().getAboutButton().addActionListener(aboutListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleAboutButtonPress();
            }
        });
        
        aHomePanel.getMenuBannerPanel().getLoginButton().addActionListener(loginListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleLoginButtonPress();
            }
        });
		

        //Set frame to close when exit is clicked and default frame size
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1300, 800);
    }
	
    public void handleHomeButtonPress(){
            //System.out.println("Home");
            this.getContentPane().removeAll();
            aHomePanel = new HomePanel();
            this.getContentPane().add(aHomePanel);
            update();
    }
	
    public void handleAccountButtonPress(){
            //System.out.println("Account");
            this.getContentPane().removeAll();
            aRegistrationPanel = new RegistrationPanel();
            this.getContentPane().add(aRegistrationPanel);
            update();
    }
	
    public void handleReservationButtonPress(){
            System.out.println("Reservation");
    }
	
    public void handleHelpButtonPress(){
            System.out.println("Help");
    }
	
    public void handleAboutButtonPress(){
            System.out.println("About");
    }
	
    public void handleLoginButtonPress(){
            //System.out.println("Login");
            /*this.getContentPane().removeAll();
            aLoginPanel = new LoginLandingPanel();
            this.getContentPane().add(aLoginPanel);
            update();*/
    }
	
    public void update(){
    	//disableListeners();
    	this.revalidate();
    	//enableListeners();
    }
    
    public void setLoggedInStatus(boolean newStatus){
        loggedIn = newStatus;
    }
	
	//main method
    public static void main(String args[]){
            JFrame frame = new JavaAirApp();
            new JavaAirApp().setVisible(true);
    }
	
}