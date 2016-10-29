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
 */
import java.awt.*;
import java.text.*;
import java.util.HashMap;
import javax.swing.JPanel;

public class Global {
    public static String version = "0.52.0";
    
    public static String textHome = "Home";
    public static String textFlights = "Flights";
    public static String textAcct = "Account";
    public static String textRegister = "Register";
    public static String textRegConfirm = "Confirm";
    public static String textLogin = "Login";
    public static String textHelp = "Help";
    public static String textAbout = "About";
    
    public static String[] airportList = {"Chicago", "New York", "Los Angeles"};
    public static String[] numberList = {"1", "2", "3", "4", "5"};
    public static String[] genderList = {"Female", "Male"};
    
    public static Font titleFont = new Font("Times", Font.BOLD, 24);
    public static Font boldFont = new Font("Times", Font.BOLD, 18);
    public static Font normalFont = new Font("Times", Font.PLAIN, 16);
    
    public static Color colorError = Color.RED;
    
    public static Dimension appDimension = new Dimension(800,600);
    
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    public static HashMap<String, JPanel> jPanelMap = new HashMap<String, JPanel>();
    
    public static Customer currentCustomer; //currentCustomer will be null if not logged in
    
    //public static Reservation currentReservation; //currentReservation will be null if not started
    
    //Temporary - For Testing Purposes
    public static JPanel cardsPanel;
}
