package java_air.panel.flight;

import java.util.logging.Level;
import java.util.logging.Logger;
import java_air.main.Flight;
import java_air.main.Global;
import java_air.panel.reservation.ReservationBillInformationPanel;
import java_air.panel.reservation.ReservationOneWayDetailPanel;
import java_air.panel.reservation.ReservationPassengerDetailPanel;
import java_air.panel.reservation.ReservationPassengerPanel;
import java_air.panel.reservation.ReservationRoundTripDetailPanel;
import javax.swing.JLabel;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: FlightInfoPanel.java
 * Author: Steve Jia
 * Creation: 2016-10-25
 * 
 * Changelog:
 * 
 */

public class FlightInfoPanel extends javax.swing.JPanel {
    
    private Flight currentFlight;
    
    /**
     * Creates new form FlightInfoTestPanel
     */
    public FlightInfoPanel() {
        initComponents();
    }
    
    public FlightInfoPanel(Flight flight){
        initComponents();
        
        this.currentFlight = flight;
        
        setFlightNo(flight.getFlightNumber());
        setOrigin(flight.getOriginAirport());
        setDestination(flight.getDestinationAirport());
        setDepartureTime(flight.getScheduledDeparture());
        setArrivalTime(flight.getScheduledArrival());
        setFlightPrice(Double.toString(flight.getTripMileage()*0.27)); //$0.27 per mile; change later
        setFlightDuration(Float.toString(flight.getFlightDuration()));
    }
    
    public String getFlightNo(){
        return this.flightNumLabel.getText();
    }
    
    public String getOrigin(){
        return this.departureAirportLabel.getText();
    }
    
    public String getDestination(){
        return this.arriveAirportLabel.getText();
    }
    
    public String getDepartureTime(){
        return this.departureAirportLabel.getText();
    }
    
    public String getArrivalTime(){
        return this.arriveTimeLabel.getText();
    }
    public String getDepartureDate(){
        return this.departureDateLabel.getText();
    }
    
    public String getArrivalDate(){
        return this.arriveDateLabel.getText();
    }    
    public String getFlightPrice(){
        return this.flightPriceLabel.getText();
    }

    public void setFlightNo(String flightNo){
        this.flightNumLabel.setText(flightNo);
    }
    
    public void setOrigin(String origin){
        this.departureAirportLabel.setText(origin);
    }
    
    public void setDestination(String destination){
        this.arriveAirportLabel.setText(destination);
    }
    
    public void setDepartureTime(String depart){
        this.departureTimeLabel.setText(depart);
    }
    
    public void setArrivalTime(String arrival){
        this.arriveTimeLabel.setText(arrival);
    }
      public void setDepartureDate(String depart){
        this.departureDateLabel.setText(depart);
    }
    
    public void setArrivalDate(String arrival){
        this.arriveDateLabel.setText(arrival);
    }  
    public void setFlightPrice(String price){
        this.flightPriceLabel.setText(price);
    }

    public String getFlightDuration() {
        return labelFlightDuration.getText();
    }

    public void setFlightDuration(String newDuration) {
        this.labelFlightDuration.setText(newDuration);
    }
    
    public void setCurrentFlight(Flight newflight){
        this.currentFlight = newflight;
    }
    
    public Flight getCurrentFlight(){
        return this.currentFlight;
    }
    
    public void setFlightDate(String newDate){
        this.departureDateLabel.setText(newDate);
        this.arriveDateLabel.setText(newDate);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        flightNumLabel = new javax.swing.JLabel();
        flightPriceLabel = new javax.swing.JButton();
        departureAirportLabel = new javax.swing.JLabel();
        directionLabel = new javax.swing.JLabel();
        departureDateLabel = new javax.swing.JLabel();
        arriveDateLabel = new javax.swing.JLabel();
        arriveTimeLabel = new javax.swing.JLabel();
        departureTimeLabel = new javax.swing.JLabel();
        arriveAirportLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelFlightDuration = new javax.swing.JLabel();
        arriveAirportLabel2 = new javax.swing.JLabel();

        flightNumLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        flightNumLabel.setText("JA 2045");

        flightPriceLabel.setBackground(new java.awt.Color(204, 153, 0));
        flightPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        flightPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        flightPriceLabel.setText("$560");
        flightPriceLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightPriceLabelActionPerformed(evt);
            }
        });

        departureAirportLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departureAirportLabel.setForeground(new java.awt.Color(0, 102, 204));
        departureAirportLabel.setText("Chicago");

        directionLabel.setFont(Global.titleFont);
        directionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        directionLabel.setText("--------->");

        departureDateLabel.setForeground(new java.awt.Color(0, 102, 0));
        departureDateLabel.setText("Tue, Nov 22");

        arriveDateLabel.setForeground(new java.awt.Color(0, 102, 0));
        arriveDateLabel.setText("Tue, Nov 22");

        arriveTimeLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        arriveTimeLabel.setText("12:00");

        departureTimeLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        departureTimeLabel.setText("9:00");

        arriveAirportLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        arriveAirportLabel.setForeground(new java.awt.Color(0, 102, 204));
        arriveAirportLabel.setText("NewYork");

        labelFlightDuration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelFlightDuration.setText("3h");

        arriveAirportLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        arriveAirportLabel2.setForeground(new java.awt.Color(0, 102, 204));
        arriveAirportLabel2.setText("nonstop");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flightNumLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(departureTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(directionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(departureAirportLabel)
                            .addComponent(departureDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arriveDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(arriveTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(arriveAirportLabel))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelFlightDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(arriveAirportLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))))
                        .addGap(10, 10, 10)
                        .addComponent(flightPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(flightNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departureAirportLabel)
                            .addComponent(arriveAirportLabel)
                            .addComponent(arriveAirportLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departureTimeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(arriveTimeLabel)
                                .addComponent(directionLabel)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departureDateLabel)
                            .addComponent(arriveDateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(flightPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFlightDuration))
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void flightPriceLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightPriceLabelActionPerformed
       //Global.panelSwitch(Global.textReservationPassenger);
       //new ReservationBuilder(currentFlight);
       FlightResultPanel resultsPanel = 
            (FlightResultPanel)Global.jPanelMap.get(Global.textFlights);
       //check roundTrip.
       BookTravelPanel bookTravelPanel =  resultsPanel.getSearchInputPanel();
       if(Global.currentReservation.getIsRoundTrip() 
               && bookTravelPanel.getOriginFlightOn()){
           Global.currentReservation.setOriginFlight(currentFlight);           
           bookTravelPanel.setOriginFlightOn(false);
           bookTravelPanel.showReturnFlights();
           
           
       }else{
           // get reference of ReservationPassengerDetailPanel.
           ReservationPassengerPanel reservationPassengerPanel = 
            (ReservationPassengerPanel)Global.jPanelMap.get(Global.textReservationPassenger);
           // get reference of ReservationBillInformationPanel.
           ReservationBillInformationPanel reservationBillInformationPanel =
            (ReservationBillInformationPanel)Global.jPanelMap.get(Global.textReservationBillInformation);
           // ger reference of ReservationPassengerDetailPanel.
           ReservationPassengerDetailPanel reservationPassengerDetailPanel =
           (ReservationPassengerDetailPanel) reservationPassengerPanel.getReservPassengerDetailPanel();
           // if reservation is roundTrip, set return flight,
           // if not, set originFlight. 
           if(Global.currentReservation.getIsRoundTrip()){
                //set Return flight
                Global.currentReservation.setReturnFlight(currentFlight);
                // create ReservationRoundTripDetailPanel
                ReservationRoundTripDetailPanel reservRoundTripDetailPanel
                        = new ReservationRoundTripDetailPanel();
                // set ReservationRoundTripDetailPanel to Passenger Panel
                reservationPassengerPanel.setReservationFlightDetail(reservRoundTripDetailPanel);
                // set ReservationRoundTripDetailPanel to BillInformation Panel
                ReservationRoundTripDetailPanel reservationRoundTripDetailPanelcopy
                       = new ReservationRoundTripDetailPanel();
                reservationBillInformationPanel.setReservationFlightDetail(reservationRoundTripDetailPanelcopy);
        //        Global.currentReservation.setAmountPaid((float) reservationRoundTripDetailPanelcopy.getAmoutPaid());
           }else{
               // get reference of ReservationPassengerPanel.
                Global.currentReservation.setOriginFlight(currentFlight);
                //create ReservationOneWayDetailPanel;
                ReservationOneWayDetailPanel reservOneWayDetailPanel
                       = new ReservationOneWayDetailPanel();
               // set ReservationOneWayDetailPanel to Passenger Panel
               reservationPassengerPanel.setReservationFlightDetail(reservOneWayDetailPanel);
               // set ReservationOneWayDetailPanel to BillInformation Panel
               ReservationOneWayDetailPanel reservOneWayDetailPanelcopy
                       = new ReservationOneWayDetailPanel();
               reservationBillInformationPanel.setReservationFlightDetail(reservOneWayDetailPanelcopy);
               // set Reservation amout paid.
          //     Global.currentReservation.setAmountPaid((float) reservOneWayDetailPanelcopy.getAmoutPaid());
              
           }
           // fill in Passenger panel.
           reservationPassengerDetailPanel.travelerLabelSet(); 
           // switch to Reservation Passenger Panel
           Global.panelSwitch(Global.textReservationPassenger); 
       }
    }//GEN-LAST:event_flightPriceLabelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arriveAirportLabel;
    private javax.swing.JLabel arriveAirportLabel2;
    private javax.swing.JLabel arriveDateLabel;
    private javax.swing.JLabel arriveTimeLabel;
    private javax.swing.JLabel departureAirportLabel;
    private javax.swing.JLabel departureDateLabel;
    private javax.swing.JLabel departureTimeLabel;
    private javax.swing.JLabel directionLabel;
    private javax.swing.JLabel flightNumLabel;
    private javax.swing.JButton flightPriceLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelFlightDuration;
    // End of variables declaration//GEN-END:variables
}
