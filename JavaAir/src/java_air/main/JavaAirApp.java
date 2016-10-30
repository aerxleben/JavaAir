package java_air.main;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: JavaAirApp.java
 * Author: Steve Jia
 * Creation: 2016-10-25
 * 
 * Changelog:
 * 
 */
import java_air.Reservation.ReservationPanel;
import java.awt.*;
import java.awt.event.*;
import java_air.Reservation.ReservationBillInformationPanel;
import java_air.Reservation.ReservationConfirmationPanel;
import java_air.Reservation.ReservationPassengerPanel;
import javax.swing.*;

public class JavaAirApp implements ActionListener{
    private JPanel cards;
    private Customer currentCustomer;
    
    public void addComponentToPane(Container pane){
        
        //Menu Bar
        MenuBannerPanel panelMenu = new MenuBannerPanel();
        panelMenu.getHomeButton().addActionListener(this);
        panelMenu.getReservationButton().addActionListener(this);
        panelMenu.getAccountButton().addActionListener(this);
        panelMenu.getHelpButton().addActionListener(this);
        panelMenu.getLoginButton().addActionListener(this);
        
        panelMenu.getAboutButton().addActionListener(
                new PanelAboutAction()
        );
        
        //Home Panel
        HomePanel panelHome = new HomePanel();
        panelHome.getFlightSearchPanel().getSearchButton().addActionListener(this);
        panelHome.getFlightStatusButton().addActionListener(this);
        panelHome.getCheckInButton().addActionListener(this);
        Global.jPanelMap.put(Global.textHome, panelHome);
        
        //Login Landing Panel
        LoginLandingPanel panelLoginLanding = new LoginLandingPanel();
        panelLoginLanding.getRegisterButton().addActionListener(this);
        Global.jPanelMap.put(Global.textLogin, panelLoginLanding);
        
        //Registration Panel
        RegistrationPanel panelRegister = new RegistrationPanel();
        Global.jPanelMap.put(Global.textRegister, panelRegister);
        
        //Account Confirmation Panel
        AccountConfirmationPanel panelAcctConfirm = new AccountConfirmationPanel();
        Global.jPanelMap.put(Global.textRegConfirm, panelAcctConfirm);
        
        //Flight Search Result Panel
        FlightResultsPanel panelFlights = new FlightResultsPanel();
        Global.jPanelMap.put(Global.textFlights, panelFlights);
        
       //Account Welcome Panel
        AccountWelcomePanel anAccountWelcomePanel = new AccountWelcomePanel();
        Global.jPanelMap.put(Global.textAcct, anAccountWelcomePanel);
        
        /* Reservation Panels */
        // Reservation Confirmation Panel
        ReservationConfirmationPanel reservationConfirmPanel = new ReservationConfirmationPanel();
        Global.jPanelMap.put(Global.textReservationConfirmation,reservationConfirmPanel);
        // Reservation Confirmation Panel
        ReservationBillInformationPanel reservationBillPanel = new ReservationBillInformationPanel();
        Global.jPanelMap.put(Global.textReservationBillInformation,reservationBillPanel);
        // Reservation Confirmation Panel
        ReservationPassengerPanel reservationPassengerPanel = new ReservationPassengerPanel();
        Global.jPanelMap.put(Global.textReservationPassenger,reservationPassengerPanel);
        
        //Add panels to the CardLayout
        cards = new JPanel(new CardLayout());
        cards.add(panelHome, Global.textHome);
        cards.add(panelRegister, Global.textRegister);
        cards.add(panelLoginLanding, Global.textLogin);
        cards.add(panelFlights, Global.textFlights);
        cards.add(panelAcctConfirm, Global.textRegConfirm);
        cards.add(anAccountWelcomePanel, Global.textAcct);
        
        //Add reservation panels to the CardLayout.
        cards.add(reservationConfirmPanel, Global.textReservationConfirmation);
        cards.add(reservationBillPanel, Global.textReservationBillInformation);
        cards.add(reservationPassengerPanel, Global.textReservationPassenger);
        
        if(cards != null){ Global.cardsPanel = cards; }
        
        pane.add(panelMenu, BorderLayout.PAGE_START);
        //pane.add(menu, BorderLayout.PAGE_START);
        pane.add(cards, BorderLayout.CENTER);

        //test panel
       // new TestPanel();
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)event.getActionCommand());
    }//end actionPerformed
    
    private static void createAndShowGUI(){
        JFrame frame = new JFrame("Java Air");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Global.appDimension);
        
        JavaAirApp javaAirMain = new JavaAirApp();
        javaAirMain.addComponentToPane(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }//end createAndShowGUI
    
    /*private JButton createButton(String buttonText){
        JButton newButton = new JButton(buttonText);
        newButton.addActionListener(this);
        newButton.setFont(Global.titleFont);
        newButton.setBackground(new Color(0,0,75));
        newButton.setForeground(new Color(255,204,0));
        return newButton;
    }*/
    
    //open the about JPanel
    public class PanelAboutAction extends AbstractAction{
        //public PanelAboutAction(){}
        @Override
        public void actionPerformed(ActionEvent e){
            AboutPanel panelAbout = new AboutPanel();
            panelAbout.setVisible(true);
        }
    }//end class PanelAboutAction
    
    
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                createAndShowGUI();
            }
        });
    }//end main
}//end class JavaAirAppTest