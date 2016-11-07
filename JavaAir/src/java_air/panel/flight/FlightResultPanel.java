/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.panel.flight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java_air.main.Flight;

/**
 *
 * @author Georege
 */
public class FlightResultPanel extends javax.swing.JPanel {
    
    private BookTravelPanel panelSearchInput;
    private FlightResultPanel gui = (FlightResultPanel)this;
    
    /**
     * Creates new form FlightResultPanel
     */
    public FlightResultPanel() {
        initComponents();
        panelSearchInput = new BookTravelPanel();
        searchPanel.add(panelSearchInput, BorderLayout.CENTER);
        //flightLabelSet();
    }

    public BookTravelPanel getSearchInputPanel() {
        return panelSearchInput;
    }

    public void setSearchInputPanel(BookTravelPanel newSearchInput) {
        this.panelSearchInput = newSearchInput;
    }
    
    public void flightLabelSet(){
        for(int i = 0; i < flightNumber; i++){
            FlightInfoPanel flightInfoPanel
                    = new FlightInfoPanel();
            scrollContentPanel.add(flightInfoPanel);
        }
        gui.validate();
    }
    
    public void flightLabelSet(ArrayList<Flight> flightList){
        for(Flight flight : flightList){
            FlightInfoPanel flightInfoPanel = new FlightInfoPanel(flight);
                //flightInfoPanel.setFlightDate();
            scrollContentPanel.add(flightInfoPanel);
        }
        gui.validate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        insideSrollPanel = new javax.swing.JPanel();
        scrollContentPanel = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new Color(250,250,250,150));

        jPanel3.setLayout(new java.awt.BorderLayout());

        insideSrollPanel.setLayout(new java.awt.BorderLayout());

        scrollContentPanel.setLayout(new java.awt.GridLayout(flightNumber, 1));
        insideSrollPanel.add(scrollContentPanel, java.awt.BorderLayout.LINE_END);

        jScrollPane1.setViewportView(insideSrollPanel);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        searchPanel.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Outbound: Chicago ---> NewYork ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addGap(180, 180, 180))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private int flightNumber = 4;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel insideSrollPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel scrollContentPanel;
    private javax.swing.JPanel searchPanel;
    // End of variables declaration//GEN-END:variables
}
