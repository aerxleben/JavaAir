package java_air.main;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: AccountWelcomePanel.java
 * Author: Amy Erxleben
 * Creation: 2016-10-29
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.Properties;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class PasswordResetPanel extends JPanel{
    //private MenuBannerPanel aMenuBannerPanel;
    
    private JTextField emailField;
    private JTextField customerIDField;
    private JTextField passwordField;
    private JTextField cPasswordField;
    
    private JDatePickerImpl birthdayPicker;
   
    private JButton resetButton;
    
    private Image background;
    
    //public MenuBannerPanel getMenuBannerPanel(){return aMenuBannerPanel;}
    public JTextField getEmailField(){return emailField;}
    public JTextField getCustomerIDField(){return customerIDField;}
    public JTextField getPasswordField(){return passwordField;}
    public JTextField getCPasswordField(){return cPasswordField;}
    
    public JDatePickerImpl getBirthdayPicker(){return birthdayPicker;}
    
    public JButton getResetButton(){return resetButton;}
    
   // private String defaultMessage = "Your Java Air Account Username is: ";

    public PasswordResetPanel(){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(layout);
        
      //get image for panel background
      background = Toolkit.getDefaultToolkit().createImage("heart.jpg");
   

        //create "Coffee Brown" color for buttons and fonts.
        Color buttonColor = new Color(100,76,55);
        Color backgroundColor = new Color(255,255,255,150);

           
        JLabel forgotLabel = new JLabel("Forgot Password? ");
        forgotLabel.setFont(new Font("Times", Font.BOLD, 36));
        forgotLabel.setHorizontalAlignment(JLabel.LEFT);
        forgotLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,450,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(forgotLabel, constraints);
        add(forgotLabel);
       
        JLabel infoLabel = new JLabel("Fill out the fields below to reset your password:");
        infoLabel.setFont(new Font("Times", Font.BOLD, 24));
        infoLabel.setHorizontalAlignment(JLabel.LEFT);
        infoLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 4;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,200,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(infoLabel, constraints);
        add(infoLabel);
        
        JLabel emailLabel = new JLabel("Email");
        //emailLabel.setFont(new Font("Times", Font.BOLD, 30));
        emailLabel.setFont(Global.boldFont);
        emailLabel.setHorizontalAlignment(JLabel.LEFT);
        emailLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,200,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(emailLabel, constraints);
        add(emailLabel);
      
        emailField = new JTextField("");
        //emailField.setFont(new Font("Times", Font.PLAIN, 30));
        emailField.setFont(Global.normalFont);
        emailField.setHorizontalAlignment(JTextField.LEFT);
        //emailField.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 4;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(0,0,0,50);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(emailField, constraints);
        add(emailField);
        
        JLabel idLabel = new JLabel("Customer ID Number:");
        //emailLabel.setFont(new Font("Times", Font.BOLD, 30));
        idLabel.setFont(Global.boldFont);
        idLabel.setHorizontalAlignment(JLabel.LEFT);
        idLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,200,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(idLabel, constraints);
        add(idLabel);
      
        customerIDField = new JTextField("");
        //emailField.setFont(new Font("Times", Font.PLAIN, 30));
        customerIDField.setFont(Global.normalFont);
        customerIDField.setHorizontalAlignment(JTextField.LEFT);
        //emailField.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(0,0,0,50);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(customerIDField, constraints);
        add(customerIDField);
        
        JLabel bDayLabel = new JLabel("Birthday");
        //bDayLabel.setFont(new Font("Times", Font.BOLD, 30));
        bDayLabel.setFont(Global.boldFont);
        bDayLabel.setHorizontalAlignment(JLabel.LEFT);
        bDayLabel.setForeground(buttonColor);
        constraints.gridx = 3;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(0,75,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(bDayLabel, constraints);
        add(bDayLabel);
      
        UtilDateModel model = new UtilDateModel();
        Calendar now = Calendar.getInstance();
        model.setDate(now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DATE));
        model.setSelected(true);
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        birthdayPicker = new JDatePickerImpl(datePanel, new DataLabelFormatter());
        birthdayPicker.setFont(new Font("Times", Font.PLAIN, 30));
        constraints.gridx = 4;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(0,0,0,50);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(birthdayPicker, constraints);
        add(birthdayPicker);
        
        JLabel passwordLabel = new JLabel("New Password");
        //passwordLabel.setFont(new Font("Times", Font.BOLD, 30));
        passwordLabel.setFont(Global.boldFont);
        passwordLabel.setHorizontalAlignment(JLabel.LEFT);
        passwordLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(0,200,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(passwordLabel, constraints);
        add(passwordLabel);

        passwordField = new JTextField("");
        //passwordField.setFont(new Font("Times", Font.PLAIN, 30));
        passwordField.setFont(Global.normalFont);
        passwordField.setHorizontalAlignment(JLabel.LEFT);
        passwordField.setForeground(buttonColor);
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

        JLabel confirmLabel = new JLabel("Confirm Password");
        //confirmLabel.setFont(new Font("Times", Font.BOLD, 30));
        confirmLabel.setFont(Global.boldFont);
        confirmLabel.setHorizontalAlignment(JLabel.LEFT);
        confirmLabel.setForeground(buttonColor);
        constraints.gridx = 3;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(0,75,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(confirmLabel, constraints);
        add(confirmLabel);

        cPasswordField = new JTextField("");
        //cPasswordField.setFont(new Font("Times", Font.PLAIN, 30));
        cPasswordField.setFont(Global.normalFont);
        cPasswordField.setHorizontalAlignment(JLabel.LEFT);
        cPasswordField.setForeground(buttonColor);
        constraints.gridx = 4;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(0,0,0,50);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(cPasswordField, constraints);
        add(cPasswordField);
        
    }
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(background,0,0,null);
   }
  
}