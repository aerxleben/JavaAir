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
import java.util.HashMap;
import javax.swing.JPanel;

public class Global {
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
    public static Font normalFont = new Font("Times", Font.PLAIN, 16);
    
    public static Color colorError = Color.RED;
    
    public static Dimension appDimension = new Dimension(800,600);
    
    public static HashMap<String, JPanel> jPanelMap = new HashMap<String, JPanel>();
}
