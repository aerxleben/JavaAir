package java_air.main;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: ReservationInfoPanel.java
 * Author: Amy Erxleben
 * Creation: 2016-11-02
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;
/*import java.awt.event.*;
import java.util.Calendar;
import java.util.Properties;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
*/

public class ReservationInfoPanel extends JPanel{
    //private MenuBannerPanel aMenuBannerPanel;
    
    private JLabel reservationNumberLabel;
    private JLabel departFlightNumberLabel;
    private JLabel returnFlightNumberLabel;
    private JLabel originLabel;
    private JLabel destinationLabel;
    private JLabel returnOriginLabel;
    private JLabel returnDestinationLabel;
    private JLabel departureLabel;  // this has date and time info
    private JLabel arrivalLabel;// this has date and time info
    private JLabel returnDepartureLabel;  // this has date and time info
    private JLabel returnArrivalLabel;  // this has date and time info
    private JLabel durationLabel;
    private JLabel returnDurationLabel;
    private JLabel passengerLabel;  // list all customers here
    
    private JButton checkInButton;
    private JButton returnCheckInButton;
    
    public JLabel getReservationNumberLabel(){return reservationNumberLabel;}
    public JLabel getDepartFlightNumberLabel(){return departFlightNumberLabel;}
    public JLabel getReturnFlightNumberLabel(){return returnFlightNumberLabel;}
    public JLabel getOriginLabel(){return originLabel;}
    public JLabel getDestinationLabel(){return destinationLabel;}
    public JLabel getReturnOriginLabel(){return returnOriginLabel;}
    public JLabel getReturnDestinationLabel(){return returnDestinationLabel;}
    public JLabel getDepartureLabel(){return departureLabel;}
    public JLabel getArrivalLabel(){return arrivalLabel;}
    public JLabel getReturnDepartureLabel(){return returnDepartureLabel;}
    public JLabel getReturnArrivalLabel(){return returnArrivalLabel;}
    public JLabel getDurrationLabel(){return durationLabel;}
    public JLabel getReturnDurationLabel(){return returnDurationLabel;}
    public JLabel getPassengerLabel(){return passengerLabel;}
    
    public JButton getCheckInButton(){return checkInButton;}
    public JButton getReturnCheckInButton(){return returnCheckInButton;}
    
    public ReservationInfoPanel(){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(layout);
        

        //create "Coffee Brown" color for buttons and fonts.
        Color buttonColor = new Color(100,76,55);
        Color backgroundColor = new Color(255,255,255,150);
        this.setBackground(backgroundColor);

           
        reservationNumberLabel = new JLabel("Reservation # "); // append reservationInfo to this label
        reservationNumberLabel.setFont(Global.boldFont);
        reservationNumberLabel.setHorizontalAlignment(JLabel.LEFT);
        reservationNumberLabel.setForeground(buttonColor);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        //  constraints.insets = new Insets(0,200,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(reservationNumberLabel, constraints);
        add(reservationNumberLabel);
       
        departFlightNumberLabel = new JLabel("Flight Number: ");// Append Flight Info Here
        departFlightNumberLabel.setFont(Global.boldFont);
        departFlightNumberLabel.setHorizontalAlignment(JLabel.LEFT);
        departFlightNumberLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.VERTICAL;
        //  constraints.insets = new Insets(0,200,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(departFlightNumberLabel, constraints);
        add(departFlightNumberLabel);
               
        originLabel = new JLabel("Chicago(MDW) ");
        originLabel.setFont(Global.normalFont);
        originLabel.setHorizontalAlignment(JLabel.LEFT);
        originLabel.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
       //   constraints.insets = new Insets(0,200,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(originLabel, constraints);
        add(originLabel);
      
        JLabel arrowLabel = new JLabel(" ---> ");
        arrowLabel.setFont(Global.normalFont);
        arrowLabel.setHorizontalAlignment(JTextField.LEFT);
        arrowLabel.setForeground(buttonColor);
        constraints.gridx = 3;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        //constraints.insets = new Insets(0,0,0,50);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(arrowLabel, constraints);
        add(arrowLabel); 
        
        destinationLabel = new JLabel("New York(LGA)");
        destinationLabel.setFont(Global.normalFont);
        destinationLabel.setHorizontalAlignment(JTextField.LEFT);
        destinationLabel.setForeground(buttonColor);
        constraints.gridx = 4;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
       // constraints.insets = new Insets(0,0,0,50);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(destinationLabel, constraints);
        add(destinationLabel);
        
        departureLabel = new JLabel("6:50AM 12/15/16");
        departureLabel.setFont(Global.normalFont);
        departureLabel.setHorizontalAlignment(JLabel.LEFT);
        departureLabel.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
       //   constraints.insets = new Insets(0,200,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(departureLabel, constraints);
        add(departureLabel);
        
        arrivalLabel = new JLabel("11:00AM 12/15/16");
        arrivalLabel.setFont(Global.normalFont);
        arrivalLabel.setHorizontalAlignment(JTextField.LEFT);
        arrivalLabel.setForeground(buttonColor);
        constraints.gridx = 4;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        //constraints.insets = new Insets(0,0,0,50);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(arrivalLabel, constraints);
        add(arrivalLabel);
        
        durationLabel = new JLabel(" Duration: 3h10min ");
        durationLabel.setFont(Global.normalFont);
        durationLabel.setHorizontalAlignment(JTextField.LEFT);
        durationLabel.setForeground(buttonColor);
        constraints.gridx = 5;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        //constraints.insets = new Insets(0,0,0,50);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(durationLabel, constraints);
        add(durationLabel); 
        
        checkInButton = new JButton("CHECK IN");
        //cPasswordField.setFont(new Font("Times", Font.PLAIN, 30));
        checkInButton.setFont(Global.boldFont);
        checkInButton.setHorizontalAlignment(JLabel.LEFT);
        checkInButton.setBackground(buttonColor);
        checkInButton.setForeground(Color.WHITE);
        constraints.gridx = 5;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
        //constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(checkInButton, constraints);
        add(checkInButton);
        
        returnFlightNumberLabel = new JLabel("Flight Number: ");// Append Flight Info Here
        returnFlightNumberLabel.setFont(Global.boldFont);
        returnFlightNumberLabel.setHorizontalAlignment(JLabel.LEFT);
        returnFlightNumberLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.VERTICAL;
        //  constraints.insets = new Insets(0,200,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(returnFlightNumberLabel, constraints);
        add(returnFlightNumberLabel);
               
        returnOriginLabel = new JLabel("New York(LGA) ");
        returnOriginLabel.setFont(Global.normalFont);
        returnOriginLabel.setHorizontalAlignment(JLabel.LEFT);
        returnOriginLabel.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
       //   constraints.insets = new Insets(0,200,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(returnOriginLabel, constraints);
        add(returnOriginLabel);
      
        JLabel arrowLabel2 = new JLabel(" ---> ");
        arrowLabel2.setFont(Global.normalFont);
        arrowLabel2.setHorizontalAlignment(JTextField.LEFT);
        arrowLabel2.setForeground(buttonColor);
        constraints.gridx = 3;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        //constraints.insets = new Insets(0,0,0,50);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(arrowLabel2, constraints);
        add(arrowLabel2); 
        
        returnDestinationLabel = new JLabel("Chicago(MDW)");
        returnDestinationLabel.setFont(Global.normalFont);
        returnDestinationLabel.setHorizontalAlignment(JTextField.LEFT);
        returnDestinationLabel.setForeground(buttonColor);
        constraints.gridx = 4;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
       // constraints.insets = new Insets(0,0,0,50);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(returnDestinationLabel, constraints);
        add(returnDestinationLabel);
        
        returnDepartureLabel = new JLabel("7:30PM 12/20/16");
        returnDepartureLabel.setFont(Global.normalFont);
        returnDepartureLabel.setHorizontalAlignment(JLabel.LEFT);
        returnDepartureLabel.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
       //   constraints.insets = new Insets(0,200,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(returnDepartureLabel, constraints);
        add(returnDepartureLabel);
        
        returnArrivalLabel = new JLabel("10:30)M 12/25/16");
        returnArrivalLabel.setFont(Global.normalFont);
        returnArrivalLabel.setHorizontalAlignment(JTextField.LEFT);
        returnArrivalLabel.setForeground(buttonColor);
        constraints.gridx = 4;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        //constraints.insets = new Insets(0,0,0,50);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(returnArrivalLabel, constraints);
        add(returnArrivalLabel);
        
        returnDurationLabel = new JLabel(" Duration: 4h0min ");
        returnDurationLabel.setFont(Global.normalFont);
        returnDurationLabel.setHorizontalAlignment(JTextField.LEFT);
        returnDurationLabel.setForeground(buttonColor);
        constraints.gridx = 5;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        //constraints.insets = new Insets(0,0,0,50);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(returnDurationLabel, constraints);
        add(returnDurationLabel); 
        
        returnCheckInButton = new JButton("CHECK IN");
        //cPasswordField.setFont(new Font("Times", Font.PLAIN, 30));
        returnCheckInButton.setFont(Global.boldFont);
        returnCheckInButton.setHorizontalAlignment(JLabel.LEFT);
        returnCheckInButton.setBackground(buttonColor);
        returnCheckInButton.setForeground(Color.WHITE);
        constraints.gridx = 5;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
        //constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(returnCheckInButton, constraints);
        add(returnCheckInButton);
    }
    
}