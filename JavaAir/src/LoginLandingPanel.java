/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: LoginLandingPanel.java
 * Author: Steve Jia
 * Creation: 2016-10-22
 * 
 * Changelog:
 * Erxleben- 2016-10-22, added email and passowrd fields, login button, register button, employee login button
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginLandingPanel extends JPanel{
    private MenuBannerPanel aMenuBannerPanel;
    
    private JTextField emailField;
    private JTextField passwordField;
    
    private JButton loginButton;
    private JButton registerButton;
    private JButton employeeLoginButton;
    
    public JTextField getEmailField(){return emailField;}
    public JTextField getPasswordField(){return passwordField;}
    
    public JButton getLoginButton(){return loginButton;}
    public JButton getRegisterButton(){return registerButton;}
    public JButton getEmployeeLoginButton(){return employeeLoginButton;}
    
    public LoginLandingPanel(){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(layout);

        //create "Coffee Brown" color for buttons and fonts.
        Color buttonColor = new Color(100,76,55);

        aMenuBannerPanel = new MenuBannerPanel();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 9;
        constraints.gridheight = 2;
        constraints.fill = GridBagConstraints.BOTH;
            //constraints.insets = new Insets(12,12,3,3);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(aMenuBannerPanel, constraints);
        add(aMenuBannerPanel);
        
        JLabel loginLabel = new JLabel("Login:");
        loginLabel.setFont(new Font("Times", Font.BOLD, 50));
        loginLabel.setHorizontalAlignment(JLabel.RIGHT);
        loginLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(loginLabel, constraints);
        add(loginLabel);
        
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Times", Font.BOLD, 30));
        emailLabel.setHorizontalAlignment(JLabel.RIGHT);
        emailLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(emailLabel, constraints);
        add(emailLabel);
      
        emailField = new JTextField("");
        emailField.setFont(new Font("Times", Font.PLAIN, 30));
        emailField.setHorizontalAlignment(JTextField.LEFT);
        //emailField.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(emailField, constraints);
        add(emailField);
        
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Times", Font.BOLD, 30));
        passwordLabel.setHorizontalAlignment(JLabel.RIGHT);
        passwordLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(passwordLabel, constraints);
        add(passwordLabel);
      
        passwordField = new JTextField("");
        passwordField.setFont(new Font("Times", Font.PLAIN, 30));
        passwordField.setHorizontalAlignment(JTextField.LEFT);
        //passwordField.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(passwordField, constraints);
        add(passwordField);
        
        loginButton = new JButton("LOGIN");
        loginButton.setFont(new Font("Times", Font.BOLD, 30));
        loginButton.setHorizontalAlignment(JButton.CENTER);
        loginButton.setBackground(buttonColor);
        loginButton.setForeground(Color.WHITE);
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
          constraints.insets = new Insets(100,0,100,400);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(loginButton, constraints);
        add(loginButton);
        
        JLabel newLabel = new JLabel("New Customer?");
        newLabel.setFont(new Font("Times", Font.BOLD, 40));
        newLabel.setHorizontalAlignment(JLabel.CENTER);
        newLabel.setVerticalAlignment(JLabel.BOTTOM);
        newLabel.setForeground(buttonColor);
        constraints.gridx = 4;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
          constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(newLabel, constraints);
        add(newLabel);
      
        registerButton = new JButton("REGISTER");
        registerButton.setFont(new Font("Times", Font.PLAIN, 30));
        registerButton.setHorizontalAlignment(JButton.CENTER);
        registerButton.setBackground(buttonColor);
        registerButton.setForeground(Color.WHITE);
        constraints.gridx = 4;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(0,150,0,150);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(registerButton, constraints);
        add(registerButton);
        
        employeeLoginButton = new JButton("<html>" + "EMPLOYEE" + "<br>" + "LOGIN" + "</html>");
        employeeLoginButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		new EmployeeLoginFrame().setVisible(true);
        	}
        });
        employeeLoginButton.setFont(new Font("Times",Font.PLAIN, 30));
        employeeLoginButton.setHorizontalAlignment(JButton.CENTER);
        employeeLoginButton.setBackground(buttonColor);
        employeeLoginButton.setForeground(Color.WHITE);
        constraints.gridx = 4;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
          constraints.insets = new Insets(0, 150, 50, 150);
        constraints.weightx = 5;
        constraints.weighty = 5;
        layout.setConstraints(employeeLoginButton, constraints);
        add(employeeLoginButton);
    }
}
