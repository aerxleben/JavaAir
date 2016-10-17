/*
 *	This file "JavaAirApp" contains the main method for this entire project.
 *	It creates a JFrame in wich to view the user interface.
 *	This file will contain all of the event handlers for this application.	
 *  
 *	Author: Amy Erxleben
 *	
 *	Date created: 10/15/16
 *
 *	Updated 10/17/17, Erxleben, added comments
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
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1300, 600);
	}
	
	//main method
	public static void main(String args[]){
		JFrame frame = new JavaAirApp();
		new JavaAirApp().setVisible(true);
	}
	
}