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
import java_air.database.DataClient;
import java_air.panel.reservation.Reservation;
import java.awt.event.*;

public class ReservationInfoPanel extends JPanel{
    private Reservation thisReservation;
    
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
    
    public ReservationInfoPanel(Reservation r){
        if(r == null){ return; }
        
        thisReservation = r;
        
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(layout);
        

        //create "Coffee Brown" color for buttons and fonts.
        Color buttonColor = new Color(100,76,55);
        Color backgroundColor = new Color(255,255,255,150);
        this.setBackground(backgroundColor);
           
        reservationNumberLabel = 
                new JLabel("Reservation # JAR0" 
                        + r.getReservationNumber());
        reservationNumberLabel.setFont(Global.boldFont);
        reservationNumberLabel.setHorizontalAlignment(JLabel.LEFT);
        reservationNumberLabel.setForeground(buttonColor);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(reservationNumberLabel, constraints);
        add(reservationNumberLabel);
       
        departFlightNumberLabel = 
                new JLabel("Flight Number: " 
                        + r.getOriginFlight().getFlightNumber());
        departFlightNumberLabel.setFont(Global.boldFont);
        departFlightNumberLabel.setHorizontalAlignment(JLabel.LEFT);
        departFlightNumberLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.VERTICAL;
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(departFlightNumberLabel, constraints);
        add(departFlightNumberLabel);
               
        originLabel = 
                new JLabel(r.getOriginFlight().getOriginAirport());
        originLabel.setFont(Global.normalFont);
        originLabel.setHorizontalAlignment(JLabel.LEFT);
        originLabel.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
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
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(arrowLabel, constraints);
        add(arrowLabel); 
        
        destinationLabel = 
                new JLabel(r.getOriginFlight().getDestinationAirport());
        destinationLabel.setFont(Global.normalFont);
        destinationLabel.setHorizontalAlignment(JTextField.LEFT);
        destinationLabel.setForeground(buttonColor);
        constraints.gridx = 4;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(destinationLabel, constraints);
        add(destinationLabel);
        
        departureLabel = 
                new JLabel(r.getFlightOriginDatePrint() 
                        + " " + r.getOriginFlight().getScheduledDeparture());
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
        
        arrivalLabel = 
                new JLabel(r.getFlightOriginDatePrint() 
                        + " " + r.getOriginFlight().getScheduledArrival());
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
        
        durationLabel = 
                new JLabel(" Duration: " + r.getOriginFlight().getFlightDuration());
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
        
        if(!r.isCheckedIn()){
            checkInButton = new JButton("Check-In");
            checkInButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    checkIntoFlight();
                }
            });
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
        }
        
    }//end constructor
    
    private void checkIntoFlight(){
        if(thisReservation == null){ return; }
        
        //int checkIn_numeric = thisReservation.isCheckedIn() ? 1 : 0;
        
        String query = "UPDATE Reservations " +
                "SET CheckedIn = 1" +
                " WHERE ReservationNumber = " + thisReservation.getReservationNumber() +
                " AND FlightNumber = '" + thisReservation.getOriginFlight().getFlightNumber() + "'";
        
        String message;
        
        try{
            new DataClient().dbInsertOrUpdate(query);
            message = "Check In Successful";
            thisReservation.setCheckedIn(true);
            this.checkInButton.setVisible(false);
            this.validate();
        }
        catch(Exception x){
            message = x.getMessage();
        }
        
        JOptionPane.showMessageDialog(null
                    , message
                    , "Reservation"
                    , JOptionPane.INFORMATION_MESSAGE);
    }//end checkIntoFlight
    
}//end class ReservationInfoPanel