/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.main;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Yuwei Cao
 */
public class MaintainListFrame extends javax.swing.JFrame{
     /**
     * Creates new form MaintainListFrame
     */
    public MaintainListFrame() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        employeeLabel = new javax.swing.JLabel();
        refuelCheckBox = new javax.swing.JCheckBox();
        flightNoLabel = new javax.swing.JLabel();
        unloadluggageCheckBox = new javax.swing.JCheckBox();
        planeStatusCheckBox = new javax.swing.JCheckBox();
        maintainCompleteButton = new javax.swing.JButton();
        employeeIDLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(15, 15));

        employeeLabel.setBackground(new java.awt.Color(255, 255, 255));
        employeeLabel.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        employeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        employeeLabel.setIcon(new javax.swing.ImageIcon("D:\\software engineering\\coding\\Java Air\\JavaAir\\JavaAir\\smallLogo.png")); // NOI18N
        employeeLabel.setText("  Java Air Service");
        employeeLabel.setToolTipText("");
        employeeLabel.setIconTextGap(8);
        employeeLabel.setOpaque(true);

        refuelCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        refuelCheckBox.setText("Re-Fuel Plane");

        flightNoLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        flightNoLabel.setText("Flight No.");

        unloadluggageCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        unloadluggageCheckBox.setText("Unload Luggage");

        planeStatusCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        planeStatusCheckBox.setText("Check Plane Status");

        maintainCompleteButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        maintainCompleteButton.setText("Complete");
        maintainCompleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintainCompleteButtonActionPerformed(evt);
            }
        });

        employeeIDLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        employeeIDLabel.setText("Employee ID: 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(employeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(planeStatusCheckBox)
                    .addComponent(unloadluggageCheckBox)
                    .addComponent(flightNoLabel)
                    .addComponent(refuelCheckBox))
                .addContainerGap(387, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maintainCompleteButton)
                    .addComponent(employeeIDLabel))
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(employeeLabel)
                .addGap(18, 18, 18)
                .addComponent(flightNoLabel)
                .addGap(26, 26, 26)
                .addComponent(refuelCheckBox)
                .addGap(10, 10, 10)
                .addComponent(unloadluggageCheckBox)
                .addGap(10, 10, 10)
                .addComponent(planeStatusCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(maintainCompleteButton)
                .addGap(18, 18, 18)
                .addComponent(employeeIDLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void maintainCompleteButtonActionPerformed(java.awt.event.ActionEvent evt){                                                       
        if(unloadluggageCheckBox.isSelected() && planeStatusCheckBox.isSelected() && refuelCheckBox.isSelected()){ 
            JOptionPane.showMessageDialog(null, "Cool! We are ready to go.", "Maintenance Tasks", JOptionPane.INFORMATION_MESSAGE);  
        }
        else{
            JOptionPane.showMessageDialog(null, "We can't take off with unfulfilled maintain tasks.", "Maintenance Tasks", JOptionPane.INFORMATION_MESSAGE);
        }
    }         
    
    
    public void setPlaneStatusCheckBox(){
        planeStatusCheckBox.setSelected(true);
    }
    
    public void setRefuelCheckBox(){
        refuelCheckBox.setSelected(true);
    }
     
    public void setuUnloadluggageCheckBox(){
        unloadluggageCheckBox.setSelected(true);
    }
    
    
    public void setMaintainCompleteButton(){
        maintainCompleteButton.doClick();
    }
    
     
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MaintainListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaintainListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaintainListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaintainListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaintainListFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel employeeIDLabel;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JLabel flightNoLabel;
    javax.swing.JButton maintainCompleteButton;
    private javax.swing.JCheckBox planeStatusCheckBox;
    private javax.swing.JCheckBox refuelCheckBox;
    private javax.swing.JCheckBox unloadluggageCheckBox;
    // End of variables declaration                   

}
