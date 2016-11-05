/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.panel.flight;

import java.awt.Color;
import java.text.ParseException;
import java_air.main.Global;
import java_air.panel.reservation.TextPrompt;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author Georege
 */
public class BookTravelPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookTravelPanel
     */
    public BookTravelPanel() {
        
        initComponents();
        //jComboBox1.setEditable(true);
    
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

        roundTripButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        roundTripButton.setText("Roundtrip");
        roundTripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundTripButtonActionPerformed(evt);
            }
        });

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
        // TODO add your handling code here:
    }//GEN-LAST:event_roundTripButtonActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void comboBoxDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDestinationActionPerformed

    private void oneWayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneWayButtonActionPerformed
        // TODO add your handling code here:
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