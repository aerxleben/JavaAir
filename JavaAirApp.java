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
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class JavaAirApp extends JFrame{
	private HomePanel aHomeView;
	
	public JavaAirApp(){
		this.setTitle("Welcome to Java Air!");
		
		/********************* The View ****************************/
		aHomeView = new HomePanel();
		add(aHomeView);
		

		//Set frame to close when exit is clicked and default frame size
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1300, 800);
	}
	
	//main method
	public static void main(String args[]){
		JFrame frame = new JavaAirApp();
		new JavaAirApp().setVisible(true);
	}
	
}