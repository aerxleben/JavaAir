/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.panel.reservation;

import java.awt.Font;

/**
 *
 * @author Georege
 */
public class ResevationSinglePassengerConfirmPanel extends javax.swing.JPanel {

    /**
     * Creates new form ResevationSinglePassengerConfirmPanel
     */
    public ResevationSinglePassengerConfirmPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstNameInforLabel = new javax.swing.JLabel();
        lastNameInforLabel1 = new javax.swing.JLabel();
        dateBirthInforLabel = new javax.swing.JLabel();
        genderInforLabel = new javax.swing.JLabel();
        mobileNumberInforLabel = new javax.swing.JLabel();
        passIDInforLabel = new javax.swing.JLabel();
        passIDLabel1 = new javax.swing.JLabel();
        mobileNumberLabel = new javax.swing.JLabel();
        mobileNumberLabel1 = new javax.swing.JLabel();
        mobileNumberLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        genderInforLabel1 = new javax.swing.JLabel();
        genderInforLabel2 = new javax.swing.JLabel();

        firstNameInforLabel.setFont(generalFont);
        firstNameInforLabel.setText("First name,");

        lastNameInforLabel1.setFont(generalFont);
        lastNameInforLabel1.setText("Last name");

        dateBirthInforLabel.setFont(generalFont);
        dateBirthInforLabel.setText("09/08/1980");

        genderInforLabel.setFont(generalFont);
        genderInforLabel.setForeground(new java.awt.Color(102, 102, 102));
        genderInforLabel.setText("Gender:");

        mobileNumberInforLabel.setFont(generalFont);
        mobileNumberInforLabel.setText("219-548-6814");

        passIDInforLabel.setFont(generalFont);
        passIDInforLabel.setText("777700757");

        passIDLabel1.setFont(generalFont);
        passIDLabel1.setForeground(new java.awt.Color(102, 102, 102));
        passIDLabel1.setText("Pass ID:");

        mobileNumberLabel.setFont(generalFont);
        mobileNumberLabel.setForeground(new java.awt.Color(102, 102, 102));
        mobileNumberLabel.setText("Mobile number:");

        mobileNumberLabel1.setFont(generalFont);
        mobileNumberLabel1.setText("demo@gmail.com");

        mobileNumberLabel2.setFont(generalFont);
        mobileNumberLabel2.setForeground(new java.awt.Color(102, 102, 102));
        mobileNumberLabel2.setText("Email address:");

        genderInforLabel1.setFont(generalFont);
        genderInforLabel1.setText("Male");

        genderInforLabel2.setFont(generalFont);
        genderInforLabel2.setForeground(new java.awt.Color(102, 102, 102));
        genderInforLabel2.setText("Date birth:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mobileNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mobileNumberInforLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(genderInforLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(genderInforLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstNameInforLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastNameInforLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passIDLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passIDInforLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mobileNumberLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mobileNumberLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(genderInforLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dateBirthInforLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 104, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameInforLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameInforLabel1)
                    .addComponent(passIDLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passIDInforLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderInforLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderInforLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateBirthInforLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(genderInforLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobileNumberInforLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobileNumberLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobileNumberLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
private Font generalFont = new java.awt.Font("Times", 0, 18);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateBirthInforLabel;
    private javax.swing.JLabel firstNameInforLabel;
    private javax.swing.JLabel genderInforLabel;
    private javax.swing.JLabel genderInforLabel1;
    private javax.swing.JLabel genderInforLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lastNameInforLabel1;
    private javax.swing.JLabel mobileNumberInforLabel;
    private javax.swing.JLabel mobileNumberLabel;
    private javax.swing.JLabel mobileNumberLabel1;
    private javax.swing.JLabel mobileNumberLabel2;
    private javax.swing.JLabel passIDInforLabel;
    private javax.swing.JLabel passIDLabel1;
    // End of variables declaration//GEN-END:variables
}
