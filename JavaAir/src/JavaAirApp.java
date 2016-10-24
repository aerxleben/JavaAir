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
 *
 * 2016-10-22 Erxleben, added more action listeners
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JavaAirApp extends JFrame{
    private static boolean loggedIn = false;
    
    private MenuBannerPanel aMenuBannerPanel;
    private HomePanel aHomePanel;
    private RegistrationPanel aRegistrationPanel;
    private LoginLandingPanel aLoginPanel;
    private AccountConfirmationPanel anAccountConfirmationPanel;
    private FlightResultsPanel aResultsPanel;

    private ActionListener homeListener;
    private ActionListener accountListener;
    private ActionListener reservationListener;
    private ActionListener helpListener;
    private ActionListener aboutListener;
    private ActionListener loginListener;
    private ActionListener registerListener;
    private ActionListener submitListener;
    private ActionListener searchListener;
    
    //private Image background;

    public JavaAirApp(){
        this.setTitle("Welcome to Java Air!");
	
        /********************* The View ***********************************/
     /*  background = Toolkit.getDefaultToolkit().createImage("heart.jpg");
        
       BorderLayout layout = new BorderLayout(150,0);
       setLayout(layout);
       
       aMenuBannerPanel = new MenuBannerPanel();
       add(aMenuBannerPanel, BorderLayout.NORTH);
       
       add(new JLabel(), BorderLayout.LINE_START);
       */
        aHomePanel = new HomePanel();
        add(aHomePanel);
        //add(aHomePanel, BorderLayout.CENTER);

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
	
        aHomePanel.getFlightSearchPanel().getSearchButton().addActionListener(searchListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleSearchButtonPress();
            }
        });
        
        //Set frame to close when exit is clicked and default frame size
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1920, 1080);
        update();
    }
	
    public void handleHomeButtonPress(){
            //System.out.println("Home");
            this.getContentPane().removeAll();
            aHomePanel = new HomePanel();
            this.getContentPane().add(aHomePanel);
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
        
        aHomePanel.getFlightSearchPanel().getSearchButton().addActionListener(searchListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleSearchButtonPress();
            }
        });
        
        update();
    }
	
    public void handleAccountButtonPress(){
            //System.out.println("Account");
            /*this.getContentPane().removeAll();
            aRegistrationPanel = new RegistrationPanel();
            this.getContentPane().add(aRegistrationPanel);
            update();*/
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
            this.getContentPane().removeAll();
            aLoginPanel = new LoginLandingPanel();
            this.getContentPane().add(aLoginPanel);
            aLoginPanel.getRegisterButton().addActionListener(registerListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleRegisterButtonPress();
                }
            });
            
            aLoginPanel.getMenuBannerPanel().getHomeButton().addActionListener(homeListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleHomeButtonPress();
            }
        });
        
        update();
    }
    
      public void handleSearchButtonPress(){
            System.out.println("Login");
            this.getContentPane().removeAll();
            aResultsPanel = new FlightResultsPanel();
            this.getContentPane().add(aResultsPanel);
                        
            aResultsPanel.getMenuBannerPanel().getHomeButton().addActionListener(homeListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleHomeButtonPress();
                }
            });
            
            aResultsPanel.getMenuBannerPanel().getLoginButton().addActionListener(loginListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleLoginButtonPress();
                }
            });
            
            update();
    }
    
    public void handleRegisterButtonPress(){
        this.getContentPane().removeAll();
        aRegistrationPanel = new RegistrationPanel();
        this.getContentPane().add(aRegistrationPanel);
        
        aRegistrationPanel.getMenuBannerPanel().getHomeButton().addActionListener(homeListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleHomeButtonPress();
            }
        });
        
        aRegistrationPanel.getSubmitButton().addActionListener(submitListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSubmitButtonPress();
            }
        });
        
        update();
    }
    
    public void handleSubmitButtonPress(){
        System.out.println("Submit Registration");
        this.getContentPane().removeAll();
        anAccountConfirmationPanel = new AccountConfirmationPanel();
        this.getContentPane().add(anAccountConfirmationPanel);
        
        anAccountConfirmationPanel.getMenuBannerPanel().getHomeButton().addActionListener(homeListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleHomeButtonPress();
            }
        });
        update();
    }
	
    public void update(){
    	//disableListeners();
    	this.revalidate();
    	//enableListeners();
    }
    
    public void setLoggedInStatus(boolean newStatus){
        loggedIn = newStatus;
    }
    
   //method used to paint background with image
   /*public void paintComponent(Graphics g){
     // super.paintComponent(g);
     g.drawImage(background,0,0,null);
   }*/
	
	//main method
    public static void main(String args[]){
            JFrame frame = new JavaAirApp();
            new JavaAirApp().setVisible(true);
    }
	
}