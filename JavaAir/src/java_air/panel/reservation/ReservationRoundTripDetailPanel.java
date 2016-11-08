/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.panel.reservation;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java_air.main.Global;

/**
 *
 * @author Rui Zhang
 */
public class ReservationRoundTripDetailPanel extends javax.swing.JPanel {

 
    /**
     * Creates new form ReservationRoundTripDetailPanel
     */
    public ReservationRoundTripDetailPanel() {
        initComponents();
        travelTypeLabel.setText("RoundTrip"+ " ("+Global.currentReservation.getNumberOfPassenger()+ " traveler)");
        setAmoutPaid();
        setFlightDate();
        setFlightInformation();
        this.revalidate();
        
    }
    private PriceCalculator priceCalculator;
    private void setAmoutPaid(){    
        priceCalculator = new PriceCalculator();
        fareFeeLabel.setText(priceCalculator.getFare());
        taxFeeLabel.setText(priceCalculator.getTaxFee());
        totalPriceLabel.setText(priceCalculator.getTotalFee());
        Global.currentReservation.setPriceCalulator(priceCalculator);
        
    }

    private void setFlightDate(){
        flightOriginDateLabel.setText(Global.currentReservation.getflightOriginDatePrint());
        flightOriginTimeLabel.setText(Global.currentReservation.getOriginFlight().getScheduledDeparture()
                                + " - "+ Global.currentReservation.getOriginFlight().getScheduledArrival());
        flightReturnDateLabel.setText(Global.currentReservation.getflightReturnDatePrint());
        flightReturnTimeLabel.setText(Global.currentReservation.getReturnFlight().getScheduledDeparture()
                                + " - "+ Global.currentReservation.getReturnFlight().getScheduledArrival());
    }
    public void setFlightInformation(){
        flightOriginAirportLabel.setText(Global.currentReservation.getOriginFlight().getOriginAirport() + " - " + 
                                Global.currentReservation.getOriginFlight().getDestinationAirport());
        flightReturnAirportLabel.setText(Global.currentReservation.getReturnFlight().getOriginAirport() + " - " + 
                                Global.currentReservation.getReturnFlight().getDestinationAirport());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        travelTypeLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        title = new java.awt.Label();
        flightReturnDateLabel = new javax.swing.JLabel();
        flightReturnAirportLabel = new javax.swing.JLabel();
        flightOriginTimeLabel = new javax.swing.JLabel();
        fareLabel = new javax.swing.JLabel();
        taxLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        fareFeeLabel = new javax.swing.JLabel();
        taxFeeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        flightOriginDateLabel = new javax.swing.JLabel();
        flightOriginAirportLabel = new javax.swing.JLabel();
        flightReturnTimeLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        travelTypeLabel.setFont(generalFont);
        travelTypeLabel.setText("RoundTrip(4 traveler)");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        title.setAlignment(java.awt.Label.CENTER);
        title.setBackground(new java.awt.Color(204, 153, 0));
        title.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        title.setText("Flight");

        flightReturnDateLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        flightReturnDateLabel.setText("Tue, Nov 23, 2016");

        flightReturnAirportLabel.setFont(generalFont);
        flightReturnAirportLabel.setForeground(generalColor);
        flightReturnAirportLabel.setText("NewYork - Chicago");

        flightOriginTimeLabel.setFont(generalFont);
        flightOriginTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        flightOriginTimeLabel.setText("6:00 am - 9:07 am");

        fareLabel.setFont(generalFont);
        fareLabel.setForeground(generalColor);
        fareLabel.setText("Fare");

        taxLabel.setFont(generalFont);
        taxLabel.setForeground(generalColor);
        taxLabel.setText("Taxes and fees");

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));

        fareFeeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fareFeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fareFeeLabel.setText("$500,00");

        taxFeeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taxFeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        taxFeeLabel.setText("$28.33");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setText("TOTAL");

        totalPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        totalPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalPriceLabel.setText("$528.33");

        flightOriginDateLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        flightOriginDateLabel.setText("Tue, Nov 23, 2016");

        flightOriginAirportLabel.setFont(generalFont);
        flightOriginAirportLabel.setForeground(generalColor);
        flightOriginAirportLabel.setText("Chicago - NewYork");

        flightReturnTimeLabel.setFont(generalFont);
        flightReturnTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        flightReturnTimeLabel.setText("6:00 am - 9:07 am");

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(flightOriginDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(flightOriginAirportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(flightOriginTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(taxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fareLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fareFeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(taxFeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(flightReturnAirportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(flightReturnTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(flightReturnDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(travelTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(travelTypeLabel)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(flightOriginDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(flightReturnDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(flightOriginTimeLabel)
                            .addComponent(flightOriginAirportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightReturnAirportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flightReturnTimeLabel))
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fareLabel)
                    .addComponent(fareFeeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxLabel)
                    .addComponent(taxFeeLabel))
                .addGap(10, 10, 10)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

   private Font generalFont = new java.awt.Font("Times", 0, 18);
    private Color generalColor = new java.awt.Color(0, 102, 255);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fareFeeLabel;
    private javax.swing.JLabel fareLabel;
    private javax.swing.JLabel flightOriginAirportLabel;
    private javax.swing.JLabel flightOriginDateLabel;
    private javax.swing.JLabel flightOriginTimeLabel;
    private javax.swing.JLabel flightReturnAirportLabel;
    private javax.swing.JLabel flightReturnDateLabel;
    private javax.swing.JLabel flightReturnTimeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel taxFeeLabel;
    private javax.swing.JLabel taxLabel;
    private java.awt.Label title;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JLabel travelTypeLabel;
    // End of variables declaration//GEN-END:variables
}