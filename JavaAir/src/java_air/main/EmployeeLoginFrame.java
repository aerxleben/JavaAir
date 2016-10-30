package java_air.main;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: EmployeeLoginFrame.java
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class EmployeeLoginFrame extends JFrame {

    private JPanel contentPane;
    private JTextField txtEmployeeId;

    /**
     * Create the frame.
     */
    public EmployeeLoginFrame() {
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

        txtEmployeeId = new JTextField();
        txtEmployeeId.addMouseListener(new MouseAdapter() {
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
        txtEmployeeId.setHorizontalAlignment(SwingConstants.CENTER);
        txtEmployeeId.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtEmployeeId.setText("Please Enter Employee ID");
        GridBagConstraints txtEmpIdConstraints = new GridBagConstraints();
        txtEmpIdConstraints.gridwidth = 1;
        txtEmpIdConstraints.ipady = 5;
        txtEmpIdConstraints.ipadx = 80;
        txtEmpIdConstraints.gridx = 0;
        txtEmpIdConstraints.gridy = 2;
        contentPane.add(txtEmployeeId, txtEmpIdConstraints);
        txtEmployeeId.setColumns(10);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                if(txtEmployeeId != null){
                //load employee function
                loadEmployeeFunction(txtEmployeeId.getText());
                }
            }
        });
        btnLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
        GridBagConstraints btn_EmpLogin = new GridBagConstraints();
        btn_EmpLogin.ipady = 5;
        btn_EmpLogin.gridx = 0;
        btn_EmpLogin.gridy = 3;
        contentPane.add(btnLogin, btn_EmpLogin);

    }//end: constructor
	
    private void loadEmployeeFunction(String employeeIdString){
        int employeeId = 0;
        try{
            employeeId = Integer.parseInt(employeeIdString);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Incorrect Employee ID", "Employee Login Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
      
        switch(employeeId){
           case 1: 
              new CustomerServiceFrame().setVisible(true);
              dispose();
              break;
           case 2: 
              new MaintenanceFrame(employeeId).setVisible(true);
              dispose();
              break;
           default:
              break;

        }
    }//end: loadEmployeeFunction()
}//end: class
