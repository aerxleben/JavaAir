/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: MaintenanceFrame.java
 * Author: Steve Jia
 * Creation: 2016/10/21
 * 
 * Changelog:
 * 
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MaintenanceFrame extends JFrame {

    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public MaintenanceFrame(int employeeId) {
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setBounds(100, 100, 400, 635);
            contentPane = new JPanel();
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            GridBagLayout gbl_contentPane = new GridBagLayout();
            gbl_contentPane.columnWidths = new int[]{100, 50, 0};
            gbl_contentPane.rowHeights = new int[]{51, 36, 43, 0, 0, 0};
            gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
            gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
            contentPane.setLayout(gbl_contentPane);
		
            JLabel lblJavaAirFlight = new JLabel("Java Air Flight Maintenance");
            lblJavaAirFlight.setHorizontalAlignment(SwingConstants.CENTER);
            lblJavaAirFlight.setFont(new Font("Tahoma", Font.BOLD, 18));
            GridBagConstraints gbc_lblJavaAirFlight = new GridBagConstraints();
            gbc_lblJavaAirFlight.gridwidth = 2;
            gbc_lblJavaAirFlight.insets = new Insets(0, 0, 5, 0);
            gbc_lblJavaAirFlight.gridx = 0;
            gbc_lblJavaAirFlight.gridy = 0;
            contentPane.add(lblJavaAirFlight, gbc_lblJavaAirFlight);

            JLabel lblFlightNo = new JLabel("Flight No.");
            lblFlightNo.setFont(new Font("Tahoma", Font.BOLD, 16));
            GridBagConstraints gbc_lblFlightNo = new GridBagConstraints();
            gbc_lblFlightNo.insets = new Insets(0, 0, 5, 5);
            gbc_lblFlightNo.gridx = 0;
            gbc_lblFlightNo.gridy = 1;
            contentPane.add(lblFlightNo, gbc_lblFlightNo);

            JLabel lblEmployeeId = new JLabel("Employee ID: " + employeeId);
            lblEmployeeId.setFont(new Font("Tahoma", Font.BOLD, 16));
            GridBagConstraints gbc_lblEmployeeId = new GridBagConstraints();
            gbc_lblEmployeeId.insets = new Insets(0, 0, 5, 0);
            gbc_lblEmployeeId.gridx = 1;
            gbc_lblEmployeeId.gridy = 1;
            contentPane.add(lblEmployeeId, gbc_lblEmployeeId);

            JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Re-Fuel Plane");
            GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
            gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 5);
            gbc_chckbxNewCheckBox_1.gridx = 0;
            gbc_chckbxNewCheckBox_1.gridy = 2;
            contentPane.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);

            JCheckBox chckbxNewCheckBox = new JCheckBox("Unload Luggage");
            GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
            gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 0);
            gbc_chckbxNewCheckBox.gridx = 1;
            gbc_chckbxNewCheckBox.gridy = 2;
            contentPane.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);

            JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Check Plane Status");
            GridBagConstraints gbc_chckbxNewCheckBox_2 = new GridBagConstraints();
            gbc_chckbxNewCheckBox_2.insets = new Insets(0, 0, 5, 5);
            gbc_chckbxNewCheckBox_2.gridx = 0;
            gbc_chckbxNewCheckBox_2.gridy = 3;
            contentPane.add(chckbxNewCheckBox_2, gbc_chckbxNewCheckBox_2);
		
            JButton btnComplete = new JButton("Complete");
            btnComplete.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
                    JOptionPane.showMessageDialog(null, "Tasks Complete", "Maintenance Tasks", JOptionPane.INFORMATION_MESSAGE);
                }
            });
            GridBagConstraints gbc_btnComplete = new GridBagConstraints();
            gbc_btnComplete.gridx = 1;
            gbc_btnComplete.gridy = 4;
            contentPane.add(btnComplete, gbc_btnComplete);
	}//end constructor

}//end class
