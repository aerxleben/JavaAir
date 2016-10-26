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

    /**
     * Creates new form FlightInfoTestPanel
     */
    public FlightInfoPanel() {
        initComponents();
    }
    
    public String getFlightNo(){
        return this.labelFlightNo.getText();
    }
    
    public String getOrigin(){
        return this.labelOrigin.getText();
    }
    
    public String getDestination(){
        return this.labelDestination.getText();
    }
    
    public String getDepartureTime(){
        return this.labelDepartureTime.getText();
    }
    
    public String getArrivalTime(){
        return this.labelArrivalTime.getText();
    }
    
    public String getFlightPrice(){
        return this.buttonFlightPrice.getText();
    }

    public void setFlightNo(String flightNo){
        this.labelFlightNo.setText(flightNo);
    }
    
    public void setOrigin(String origin){
        this.labelOrigin.setText(origin);
    }
    
    public void setDestination(String destination){
        this.labelDestination.setText(destination);
    }
    
    public void setDepartureTime(String depart){
        this.labelDepartureTime.setText(depart);
    }
    
    public void setArrivalTime(String arrival){
        this.labelArrivalTime.setText(arrival);
    }
    
    public void setFlightPrice(String price){
        this.buttonFlightPrice.setText(price);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelFlightNo = new javax.swing.JLabel();
        buttonFlightPrice = new javax.swing.JButton();
        labelOrigin = new javax.swing.JLabel();
        labelDepartureTime = new javax.swing.JLabel();
        labelDestination = new javax.swing.JLabel();
        labelArrivalTime = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        labelFlightNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelFlightNo.setText("Flight No.");

        buttonFlightPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonFlightPrice.setText("Price");

        labelOrigin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelOrigin.setText("Origin");

        labelDepartureTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDepartureTime.setText("Departure Time: ");

        labelDestination.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDestination.setText("Destination");

        labelArrivalTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelArrivalTime.setText("Arrival Time:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("----->");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFlightNo)
                        .addGap(84, 84, 84)
                        .addComponent(labelOrigin)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(labelDepartureTime))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDestination)
                    .addComponent(labelArrivalTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(buttonFlightPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonFlightPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFlightNo)
                            .addComponent(labelOrigin)
                            .addComponent(labelDestination)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDepartureTime)
                            .addComponent(labelArrivalTime))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFlightPrice;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelArrivalTime;
    private javax.swing.JLabel labelDepartureTime;
    private javax.swing.JLabel labelDestination;
    private javax.swing.JLabel labelFlightNo;
    private javax.swing.JLabel labelOrigin;
    // End of variables declaration//GEN-END:variables
}
