/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.panel.flight;

import java_air.main.*;
import java.awt.Color;
import static java.lang.String.format;
import static java.lang.String.format;
import static java.lang.String.format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java_air.database.DataClient;
import java_air.main.Global;
import java_air.panel.reservation.Reservation;
import java_air.panel.reservation.TextPrompt;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import org.jdesktop.swingx.JXDatePicker;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename:
 * Author: Steve, Rui
 * Creation:
 * 
 * Changelog:
 * 1. change showFlight() to setFlight(), showOriginFlight() and showReturnFlight();
 * 2. create boolean variable originFlightOn for checking whether resultPanel is 
 *    showing the originFlights. 
 */
public class BookTravelPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookTravelPanel
     */
    public BookTravelPanel() {
        
        initComponents();
        //jComboBox1.setEditable(true);
        this.roundTripButton.setSelected(true);
        this.oneWayButton.setSelected(false);
        this.comboBoxDestination.setSelectedItem(Global.airportList[1]);
        setComponentOpaque();
        this.validate();
    }
    private void setComponentOpaque(){
        this.oneWayButton.setOpaque(false);
        this.roundTripButton.setOpaque(false);
    }
    
    public String getDestination(){
        return this.comboBoxDestination.getSelectedItem().toString();
    }

    public JButton getButtonSearch() {
        return buttonSearch;
    }

    public String getNumOfPassengers() {
        return comboBoxNumOfPassengers.getSelectedItem().toString();
    }

    public String getOrigin() {
        return comboBoxOrigin.getSelectedItem().toString();
    }

    public String getDepartDate() {
        return Global.dateFormat.format(datePickerDepart.getDate());
    }

    public String getReturnDate() {
        return Global.dateFormat.format(datePickerReturn.getDate());
    }

    public JRadioButton getOneWayButton() {
        return oneWayButton;
    }

    public JRadioButton getRoundTripButton() {
        return roundTripButton;
    }
    
    public boolean isRoundTrip(){
        return (roundTripButton.isSelected() && !oneWayButton.isSelected());
    }

    public void setDestination(String newDestination) {
        this.comboBoxDestination.setSelectedItem(newDestination);
    }

    public void setNumOfPassengers(String NumOfPassengers) {
        this.comboBoxNumOfPassengers.setSelectedItem(NumOfPassengers);
    }

    public void setOrigin(String newOrigin) {
        this.comboBoxOrigin.setSelectedItem(newOrigin);
    }

    public void setDepartDate(String newDate) {
        try{
            this.datePickerDepart.setDate(Global.dateFormat.parse(newDate));
        }
        catch(ParseException x){
            
        }
        
    }

    public void setReturnDate(String newDate) {
        try{
            this.datePickerReturn.setDate(Global.dateFormat.parse(newDate));
        }
        catch(ParseException x){
            
        }
    }

    public void setTripButtons(boolean isRoundTrip){
        this.roundTripButton.setSelected(isRoundTrip);
        this.oneWayButton.setSelected(!isRoundTrip);
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        roundTripButton = new javax.swing.JRadioButton();
        oneWayButton = new javax.swing.JRadioButton();
        datePickerDepart = new org.jdesktop.swingx.JXDatePicker();
        datePickerReturn = new org.jdesktop.swingx.JXDatePicker();
        comboBoxOrigin = new javax.swing.JComboBox<>();
        comboBoxDestination = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboBoxNumOfPassengers = new javax.swing.JComboBox<>();
        buttonSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Book travel");

        roundTripButton.setBackground(Global.transparentColor);
        roundTripButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        roundTripButton.setText("Roundtrip");
        roundTripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundTripButtonActionPerformed(evt);
            }
        });

        oneWayButton.setBackground(Global.transparentColor);
        oneWayButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        oneWayButton.setText("One-way");
        oneWayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneWayButtonActionPerformed(evt);
            }
        });

        comboBoxOrigin.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        comboBoxOrigin.setModel(new DefaultComboBoxModel(Global.airportList));

        comboBoxDestination.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        comboBoxDestination.setModel(new DefaultComboBoxModel(Global.airportList));
        comboBoxDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDestinationActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Passenger");

        comboBoxNumOfPassengers.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        comboBoxNumOfPassengers.setModel(passengerModel);

        buttonSearch.setBackground(new java.awt.Color(204, 153, 0));
        buttonSearch.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        buttonSearch.setText("Flind Flights");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("To");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("From");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Departure");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Return");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(datePickerDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(datePickerReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roundTripButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oneWayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxNumOfPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePickerDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePickerReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxNumOfPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roundTripButton)
                            .addComponent(oneWayButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void roundTripButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundTripButtonActionPerformed
        this.roundTripButton.setSelected(true);
        this.oneWayButton.setSelected(false);
        this.datePickerReturn.setVisible(true);
        
    }//GEN-LAST:event_roundTripButtonActionPerformed
    
    private boolean originFlightOn = true;
    public boolean getOriginFlightOn(){
        return originFlightOn;
    }
    public void setOriginFlightOn(Boolean originFlightOn){
        this.originFlightOn = originFlightOn;
    }
    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        //check inputs and display a list of results
        
        //validate user inputs
        String origin = this.comboBoxOrigin.getSelectedItem().toString();
        String destination = this.comboBoxDestination.getSelectedItem().toString();

        //origin vs destination
        if(origin.equals(destination)){
            JOptionPane.showMessageDialog(null
                    , "Origin and Destination Cannot Be The Same!"
                    , "Location Conflict"
                    , JOptionPane.ERROR_MESSAGE);
            return;
        }

        //departure date vs return date
        //String departDateStr = this.departDatePicker.getJFormattedTextField().getText();
        String departDateStr = Global.dateFormat.format(this.datePickerDepart.getDate());
        //String returnDateStr = this.returnDatePicker.getJFormattedTextField().getText();
        String returnDateStr;
        
        if(this.roundTripButton.isSelected()){
            returnDateStr = Global.dateFormat.format(this.datePickerReturn.getDate());

            long dayDifference = 0;

            try{
                SimpleDateFormat formater = Global.dateFormat;

                Calendar departDate = Calendar.getInstance();
                departDate.setTime(formater.parse(departDateStr));

                Calendar returnDate = Calendar.getInstance();
                returnDate.setTime(formater.parse(returnDateStr));

                long msDiff = returnDate.getTimeInMillis() - departDate.getTimeInMillis();
                dayDifference = msDiff/(1000*60*60*24);
            }
            catch(Exception x){
                JOptionPane.showMessageDialog(null
                        , "Unable to Parse Picked Date or Failed To Calculate Day Difference; " + x.getMessage()
                        , "Date Picker Error"
                        , JOptionPane.ERROR_MESSAGE);
                return;
            }

            if(dayDifference <= 0){
                JOptionPane.showMessageDialog(null
                        , "Return Date Must Be At Least 1 Day Ahead of Departure Date"
                        , "Date Picker Error"
                        , JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        Global.currentReservation = new Reservation(this.isRoundTrip());
        
        Global.currentReservation.setFlightOriginDatePrint(getFlightPrintDate(this.datePickerDepart.getDate()));
        if(isRoundTrip()){
            Global.currentReservation.setFlightReturnDatePrint(getFlightPrintDate(this.datePickerReturn.getDate()));
        } 

        String numOfPassengers = this.comboBoxNumOfPassengers.getSelectedItem().toString();
        Global.currentReservation.setNumberOfPassenger(Integer.parseInt(numOfPassengers));
        //display flight search results
        setFlights(origin, destination, this.isRoundTrip());
        if(originFlightOn = true){
            showOriginFlights();
        }
        
    }//GEN-LAST:event_buttonSearchActionPerformed
    
    public String getFlightPrintDate(Date date){
        String flightDate = "";
        int dayOfWeek, day, month;
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.setTime(date); 
        dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] dayOfWeekName = {  "Sat","Sun","Mon", "Tue", "Wen", "Thu", "Fri" };
        flightDate += dayOfWeekName[dayOfWeek];
        flightDate +=",";
        month = calendar.get(Calendar.MONTH);
        String[] monthName = { "Jan", "Feb", "Mar", "Apr", "May", "June", "July",
        "Aug", "Sep", "Oct", "Nov", "Dec" };
        flightDate += monthName[month];
        flightDate +=" ";
        day = calendar.get(Calendar.DAY_OF_MONTH);
        flightDate += day;
        return flightDate;
    }
    
    public void showOriginFlights() {
        FlightResultPanel resultsPanel = 
            (FlightResultPanel)Global.jPanelMap.get(Global.textFlights);
       resultsPanel.flightLabelSet(departFlights);
    }
    
    public void showReturnFlights() {
        FlightResultPanel resultsPanel = 
            (FlightResultPanel)Global.jPanelMap.get(Global.textFlights);
       resultsPanel.flightLabelSet(returnFlights);
    }
    private ArrayList<Flight> departFlights;
    private ArrayList<Flight> returnFlights;
    public void setFlights(String origin
            , String destination
            , boolean isRoundTrip){
        departFlights = null;
        returnFlights = null;
        
        //pass inputs into DB; use two queries if roundtrip
        String queryDepart = "SELECT * FROM FLIGHTS " +
                "WHERE ORIGINAIRPORT = '" + origin + "' AND " +
                "DESTINATIONAIRPORT = '" + destination + "'";
        
        //DB return data table
        try{
            departFlights = new DataClient().getFlightData(queryDepart);
        }
        catch(Exception x){
            JOptionPane.showMessageDialog(null
                    ,x.getMessage()
                    ,"Depart Flights Select Error"
                    ,JOptionPane.ERROR_MESSAGE);
        }//end try-catch
        
        if(isRoundTrip){
            String queryReturn = "SELECT * FROM FLIGHTS " +
                "WHERE ORIGINAIRPORT = '" + destination + "' AND " +
                "DESTINATIONAIRPORT = '" + origin + "'";
            
            try{
                returnFlights = new DataClient().getFlightData(queryReturn);
            }
            catch(Exception x){
                JOptionPane.showMessageDialog(null
                    ,x.getMessage()
                    ,"Return Flights Select Error"
                    ,JOptionPane.ERROR_MESSAGE);
            }
        }//end if
        
       // FlightResultPanel resultsPanel = 
        //        (FlightResultPanel)Global.jPanelMap.get(Global.textFlights);
       // resultsPanel.flightLabelSet(departFlights);
        
    }
    
    private void comboBoxDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDestinationActionPerformed

    private void oneWayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneWayButtonActionPerformed
        this.roundTripButton.setSelected(false);
        this.oneWayButton.setSelected(true);
        this.datePickerReturn.setVisible(false);
        
    }//GEN-LAST:event_oneWayButtonActionPerformed

   // private DefaultComboBoxModel airportModel = new DefaultComboBoxModel(Global.airportList);
    private DefaultComboBoxModel passengerModel = new DefaultComboBoxModel(Global.numberList);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSearch;
    private javax.swing.JComboBox<String> comboBoxDestination;
    private javax.swing.JComboBox<String> comboBoxNumOfPassengers;
    private javax.swing.JComboBox<String> comboBoxOrigin;
    private org.jdesktop.swingx.JXDatePicker datePickerDepart;
    private org.jdesktop.swingx.JXDatePicker datePickerReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton oneWayButton;
    private javax.swing.JRadioButton roundTripButton;
    // End of variables declaration//GEN-END:variables


}
