/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: CustomerServiceFrame.java
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
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.BoxLayout;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerServiceFrame extends JFrame {


    /**
     * Create the frame.
     */
    public CustomerServiceFrame() {
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setBounds(100, 100, 728, 561);
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{347, 347, 0};
            gridBagLayout.rowHeights = new int[]{79, 174, 174, 0};
            gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
            getContentPane().setLayout(gridBagLayout);
		
            JLabel lblCustomerServiceTitle = new JLabel("Java Air Customer Service");
            lblCustomerServiceTitle.setHorizontalAlignment(SwingConstants.CENTER);
            lblCustomerServiceTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
            GridBagConstraints gbc_lblCustomerServiceTitle = new GridBagConstraints();
            gbc_lblCustomerServiceTitle.fill = GridBagConstraints.BOTH;
            gbc_lblCustomerServiceTitle.insets = new Insets(0, 0, 5, 0);
            gbc_lblCustomerServiceTitle.gridwidth = 2;
            gbc_lblCustomerServiceTitle.gridx = 0;
            gbc_lblCustomerServiceTitle.gridy = 0;
            getContentPane().add(lblCustomerServiceTitle, gbc_lblCustomerServiceTitle);

            JLabel label = new JLabel("");
            GridBagConstraints gbc_label = new GridBagConstraints();
            gbc_label.fill = GridBagConstraints.BOTH;
            gbc_label.insets = new Insets(0, 0, 5, 0);
            gbc_label.gridx = 1;
            gbc_label.gridy = 0;
            getContentPane().add(label, gbc_label);

            JButton btnCSFlightReservation = new JButton("Flight Reservation");
            btnCSFlightReservation.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                    }
            });
            btnCSFlightReservation.setSize(new Dimension(100, 100));
            btnCSFlightReservation.setFont(new Font("Tahoma", Font.BOLD, 16));
            btnCSFlightReservation.setMargin(new Insets(12, 24, 12, 24));
            btnCSFlightReservation.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(0, 0, 255)));
            GridBagConstraints gbc_btnCSFlightReservation = new GridBagConstraints();
            gbc_btnCSFlightReservation.fill = GridBagConstraints.BOTH;
            gbc_btnCSFlightReservation.insets = new Insets(20, 20, 20, 20);
            gbc_btnCSFlightReservation.gridx = 0;
            gbc_btnCSFlightReservation.gridy = 1;
            getContentPane().add(btnCSFlightReservation, gbc_btnCSFlightReservation);

            JButton btnCSCheckIn = new JButton("Customer Check-In");
            btnCSCheckIn.setFont(new Font("Tahoma", Font.BOLD, 16));
            btnCSCheckIn.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, Color.BLUE));
            GridBagConstraints gbc_btnCSCheckIn = new GridBagConstraints();
            gbc_btnCSCheckIn.fill = GridBagConstraints.BOTH;
            gbc_btnCSCheckIn.insets = new Insets(20, 20, 20, 20);
            gbc_btnCSCheckIn.gridx = 1;
            gbc_btnCSCheckIn.gridy = 1;
            getContentPane().add(btnCSCheckIn, gbc_btnCSCheckIn);

            JButton btnCSFlightStatus = new JButton("Flight Status");
            btnCSFlightStatus.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, Color.BLUE));
            btnCSFlightStatus.setFont(new Font("Tahoma", Font.BOLD, 16));
            GridBagConstraints gbc_btnCSFlightStatus = new GridBagConstraints();
            gbc_btnCSFlightStatus.fill = GridBagConstraints.BOTH;
            gbc_btnCSFlightStatus.insets = new Insets(20, 20, 20, 20);
            gbc_btnCSFlightStatus.gridx = 0;
            gbc_btnCSFlightStatus.gridy = 2;
            getContentPane().add(btnCSFlightStatus, gbc_btnCSFlightStatus);

            JButton btnCSCustomerAccount = new JButton("Customer Account");
            btnCSCustomerAccount.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, Color.BLUE));
            btnCSCustomerAccount.setFont(new Font("Tahoma", Font.BOLD, 16));
            GridBagConstraints gbc_btnCSCustomerAccount = new GridBagConstraints();
            gbc_btnCSCustomerAccount.insets = new Insets(20, 20, 20, 20);
            gbc_btnCSCustomerAccount.fill = GridBagConstraints.BOTH;
            gbc_btnCSCustomerAccount.gridx = 1;
            gbc_btnCSCustomerAccount.gridy = 2;
            getContentPane().add(btnCSCustomerAccount, gbc_btnCSCustomerAccount);
    }//end constructor

}//end class
