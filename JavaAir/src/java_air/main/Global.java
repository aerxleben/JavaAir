package java_air.main;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: Global.java
 * Author: Steve Jia
 * Creation: 2016/10/22
 * 
 * Changelog:
 * 
 * 2016-10-31, Erxleben, added reference strings for CheckInPanel and PasswordResetPanel
 *
 *  2016-11-01, Erxleben, added constants for rewards program.
 */
import java.awt.*;
import java.text.*;
import java.util.HashMap;
import javax.swing.JPanel;
import java_air.panel.reservation.Reservation;
import javax.swing.text.MaskFormatter;

public class Global {
    public static String version = "1.31.0";
    
    public static String textMenu = "Menu"; //reference menu bar
    public static String textHome = "Home";//refrence home page
    public static String textFlights = "Flights"; //reference flight results panel
    public static String textAcct = "Account"; //reference welcome page
    public static String textRegister = "Register"; //refrence registration page
    public static String textRegConfirm = "Confirm"; // references account registration confirmation page
    public static String textLogin = "Login";  // refernces login landinng page
    public static String textHelp = "Help"; // references help page
    public static String textAbout = "About"; // references about page
    public static String textForgot = "Forgot"; // refrence password reset panel
    public static String textCheckIn = "CheckIn"; //refernce Check In Panel
    public static String textFlightStatus = "FlightStatus";
    
    /* Reservation panels references */
    // reference of Reservation Confirmation
    public static String textReservationConfirmation = "ReservationConfirmation";
    // reference of Reservation BillInformation
    public static String textReservationBillInformation = "ReservationBillInformation"; 
    // reference of Reservation Passenger
    public static String textReservationPassenger = "ReservationPassenger"; 
    
//    public static String textAccountWelcome = ""
    
    public static String[] airportList = {"Chicago", "New York", "Los Angeles", "St. Louis"};
    //2016-11-5 S. Jia: changed number list from 5 to 3; change back if something breaks
    public static String[] numberList = {"1", "2", "3"}; 
    public static String[] genderList = {"Female", "Male"};
    
    public static Font titleFont = new Font("Times", Font.BOLD, 24);
    public static Font boldFont = new Font("Times", Font.BOLD, 18);
    public static Font normalFont = new Font("Times", Font.PLAIN, 16);
    
    public static Color colorError = Color.RED;
    public static Color transparentColor = new Color(255,255,255,150);
    
    public static Dimension appDimension = new Dimension(1300,800);
    
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    public static HashMap<String, JPanel> jPanelMap = new HashMap<String, JPanel>();
    
    public static Customer currentCustomer; //currentCustomer will be null if not logged in
    
    public static Reservation currentReservation; //currentReservation will be null if not started
    
    //Temporary - For Testing Purposes
    public static JPanel cardsPanel;
    

    
    public static void switchCard(String cardName){
        CardLayout cl = (CardLayout)cardsPanel.getLayout();
        cl.show(cardsPanel, cardName);
    }

    public static void panelSwitch(String targetPanel){
            CardLayout cl = (CardLayout)(Global.cardsPanel.getLayout());
            cl.show(Global.cardsPanel, targetPanel); 
    }
    
    public static int maxRewards = 100000000;
    public static int bronzeRewards = 100000;
    public static int silverRewards = 600000;
    public static int goldRewards = 1800000;
    public static int platinumRewards = 5000000;

}
