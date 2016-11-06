package java_air.main;

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
 * Erxleben- 2016-10-31, added forgotPassword Button
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
    private JButton forgotPasswordButton;
    private JButton registerButton;
    private JButton employeeLoginButton;
    
    private ActionListener registerListener;
    
    private Image background;
    
    public JTextField getEmailField(){return emailField;}
    public JTextField getPasswordField(){return passwordField;}
    
    public JButton getLoginButton(){return loginButton;}
    public JButton getForgotPasswordButton(){return forgotPasswordButton;}
    public JButton getRegisterButton(){return registerButton;}
    public JButton getEmployeeLoginButton(){return employeeLoginButton;}
    
    public MenuBannerPanel getMenuBannerPanel(){return aMenuBannerPanel;}
    
    public LoginLandingPanel(){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(layout);
        this.setSize(750, 300);
      //get image for panel background
      background = Toolkit.getDefaultToolkit().createImage("heart.jpg");
   

        //create "Coffee Brown" color for buttons and fonts.
        Color buttonColor = new Color(100,76,55);

        /*aMenuBannerPanel = new MenuBannerPanel();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 9;
        constraints.gridheight = 2;
        constraints.fill = GridBagConstraints.BOTH;
            //constraints.insets = new Insets(12,12,3,3);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(aMenuBannerPanel, constraints);
        add(aMenuBannerPanel);*/
       
        JLabel loginLabel = new JLabel("Already Have An Account?");
        loginLabel.setFont(new Font("Times", Font.BOLD, 36));
        loginLabel.setHorizontalAlignment(JLabel.RIGHT);
        loginLabel.setHorizontalTextPosition(JLabel.CENTER);
        loginLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(loginLabel, constraints);
        add(loginLabel);
        
        JLabel emailLabel = new JLabel("Email");
        //emailLabel.setFont(new Font("Times", Font.BOLD, 30));
        emailLabel.setFont(Global.titleFont);
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
        //emailField.setFont(new Font("Times", Font.PLAIN, 30));
        emailField.setFont(Global.titleFont);
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
        //passwordLabel.setFont(new Font("Times", Font.BOLD, 30));
        passwordLabel.setFont(Global.titleFont);
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
        //passwordField.setFont(new Font("Times", Font.PLAIN, 30));
        passwordField.setFont(Global.titleFont);
        passwordField.setHorizontalAlignment(JTextField.LEFT);
        //passwordField.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(passwordField, constraints);
        add(passwordField);
        
        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                //validate user inputs && create new account
                loginButtonPressed();
            }
        });
        //loginButton.setFont(new Font("Times", Font.BOLD, 30));
        loginButton.setFont(Global.titleFont);
        loginButton.setHorizontalAlignment(JButton.CENTER);
        loginButton.setBackground(buttonColor);
        loginButton.setForeground(Color.WHITE);
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
        //  constraints.insets = new Insets(100,0,100,400);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(loginButton, constraints);
        add(loginButton);
        
        forgotPasswordButton = new JButton("Forgot Password?");
        forgotPasswordButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                //validate user inputs && create new account
                forgotPasswordButtonPressed();
            }
        });
        forgotPasswordButton.setFont(Global.titleFont);
        forgotPasswordButton.setHorizontalAlignment(JButton.CENTER);
        forgotPasswordButton.setBackground(buttonColor);
        forgotPasswordButton.setForeground(Color.WHITE);
        constraints.gridx = 3;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
     //     constraints.insets = new Insets(0, 150, 50, 150);
        constraints.weightx = 5;
        constraints.weighty = 5;
        layout.setConstraints(forgotPasswordButton, constraints);
        add(forgotPasswordButton);
        
        JLabel newLabel = new JLabel("New Customer?");
        //newLabel.setFont(new Font("Times", Font.BOLD, 40));
        newLabel.setFont(Global.titleFont);
        newLabel.setHorizontalAlignment(JLabel.CENTER);
        newLabel.setVerticalAlignment(JLabel.BOTTOM);
        newLabel.setForeground(Color.WHITE);//buttonColor);
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
      
        registerButton = new JButton("Register");
        //registerButton.setFont(new Font("Times", Font.PLAIN, 30));
        registerButton.setFont(Global.titleFont);
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
        
        employeeLoginButton = new JButton("<html>" + "Employee" + "<br>" + "Login" + "</html>");
        employeeLoginButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		new EmployeeLoginFrame().setVisible(true);
        	}
        });
        //employeeLoginButton.setFont(new Font("Times",Font.PLAIN, 30));
        employeeLoginButton.setFont(Global.titleFont);
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
        
       /* registerButton.addActionListener(registerListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleRegisterButtonPress();
            }
        });
        */
    }
    
    public void loginButtonPressed(){
        
        //validate user inputs
        if(this.emailField.getText() == null
                && this.passwordField.getText() == null){
            JOptionPane.showMessageDialog(null
                    , "Invalid E-mail or Password"
                    , "Login Error"
                    , JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //check against DB
        //to-do
        
         CardLayout cl = (CardLayout)Global.cardsPanel.getLayout();
         cl.show(Global.cardsPanel, Global.textAcct);
    }
    
    public void forgotPasswordButtonPressed(){
        CardLayout cl = (CardLayout)Global.cardsPanel.getLayout();
        cl.show(Global.cardsPanel, Global.textForgot);
    }
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(background,0,0,null);
   }
    /*public void handleRegisterButtonPress(){
        this.getContentPane().removeAll();
        aHomePanel = new HomePanel();
            this.getContentPane().add(aHomePanel);
            update();
    
    }*/
}