/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: EmployeeLogin.java
 * Author: Steve Jia
 * Creation: 2016/10/18
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
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EmployeeLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtPleaseEnterEmployee;

	/**
	 * Create the frame.
	 */
	public EmployeeLogin() {
		setMaximumSize(new Dimension(500, 500));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 380, 250);
		contentPane = new JPanel();
		contentPane.setMaximumSize(new Dimension(500, 500));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblJavaAirEmployee = new JLabel("Java Air Employee Portal");
		lblJavaAirEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		lblJavaAirEmployee.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints lbl_EmpLoginTitle = new GridBagConstraints();
		lbl_EmpLoginTitle.gridwidth = 1;
		lbl_EmpLoginTitle.ipady = 30;
		lbl_EmpLoginTitle.gridx = 0;
		lbl_EmpLoginTitle.gridy = 0;
		contentPane.add(lblJavaAirEmployee, lbl_EmpLoginTitle);
		
		txtPleaseEnterEmployee = new JTextField();
		txtPleaseEnterEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					JTextField txtField = (JTextField) arg0.getSource();
					txtField.setText("");
				}
				catch(Exception e){
					//log the error
				}
			}
		});
		txtPleaseEnterEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		txtPleaseEnterEmployee.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPleaseEnterEmployee.setText("Please Enter Employee ID");
		GridBagConstraints txt_EmpLoginId = new GridBagConstraints();
		txt_EmpLoginId.gridwidth = 1;
		txt_EmpLoginId.ipady = 5;
		txt_EmpLoginId.ipadx = 80;
		txt_EmpLoginId.gridx = 0;
		txt_EmpLoginId.gridy = 2;
		contentPane.add(txtPleaseEnterEmployee, txt_EmpLoginId);
		txtPleaseEnterEmployee.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints btn_EmpLogin = new GridBagConstraints();
		btn_EmpLogin.ipady = 5;
		btn_EmpLogin.gridx = 0;
		btn_EmpLogin.gridy = 3;
		contentPane.add(btnLogin, btn_EmpLogin);

	}
	
	private void loadEmployeeFunction(){
		
	}
}
