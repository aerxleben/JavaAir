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
	private HomePanel aHomeView;
	private RegistrationPanel aRegistrationPanel;
	
	private ActionListener homeListener;
	private ActionListener accountListener;
	private ActionListener reservationListener;
	private ActionListener helpListener;
	private ActionListener aboutListener;
	private ActionListener loginListener;
	
	public JavaAirApp(){
		this.setTitle("Welcome to Java Air!");
		
		/********************* The View ***********************************/
		aHomeView = new HomePanel();
		add(aHomeView);
		
		/********************************** Action Listeners **************/
		aHomeView.getMenuBannerPanel().getHomeButton().addActionListener(homeListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	handleHomeButtonPress();
            }
        });
        
        aHomeView.getMenuBannerPanel().getReservationButton().addActionListener(reservationListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	handleReservationButtonPress();
            }
        });
		
		aHomeView.getMenuBannerPanel().getAccountButton().addActionListener(accountListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	handleAccountButtonPress();
            }
        });
        
        aHomeView.getMenuBannerPanel().getHelpButton().addActionListener(helpListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	handleHelpButtonPress();
            }
        });
        
        aHomeView.getMenuBannerPanel().getAboutButton().addActionListener(aboutListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	handleAboutButtonPress();
            }
        });
        
        aHomeView.getMenuBannerPanel().getLoginButton().addActionListener(loginListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	handleLoginButtonPress();
            }
        });
		

		//Set frame to close when exit is clicked and default frame size
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1300, 800);
	}
	
	public void handleHomeButtonPress(){
		System.out.println("Home");
	}
	
	public void handleAccountButtonPress(){
		System.out.println("Account");
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
		System.out.println("Login");
	}
	
	 public void update(){
    	//disableListeners();
    	this.revalidate();
    	//enableListeners();
    }
	
	//main method
	public static void main(String args[]){
		JFrame frame = new JavaAirApp();
		new JavaAirApp().setVisible(true);
	}
	
}