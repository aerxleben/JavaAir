/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.panel.reservation;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Georege
 */
public class ReservationBillInformationPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReservationBillInformationPanel
     */
    public ReservationBillInformationPanel() {
        initComponents();
         reservationPanel1.getContentPanel().add(new ReservationBillInformDetailPanel(),BorderLayout.CENTER);
    }

    public void setReservationFlightDetail(JPanel flightDetailPanel){
        JPanel reservDetialContainPanel = reservationPanel1.getReservationDetialContainPanel();
        reservDetialContainPanel.removeAll();
        reservDetialContainPanel.add(flightDetailPanel, BorderLayout.CENTER);
        reservDetialContainPanel.revalidate();  
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reservationPanel1 = new java_air.panel.reservation.ReservationPanel();

        setLayout(new java.awt.BorderLayout());
        add(reservationPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java_air.panel.reservation.ReservationPanel reservationPanel1;
    // End of variables declaration//GEN-END:variables
}
