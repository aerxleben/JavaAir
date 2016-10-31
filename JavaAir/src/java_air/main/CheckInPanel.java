package java_air.main;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: CheckInPanel.java
 * Author: Amy Erxleben
 * Creation: 2016-10-31
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

public class CheckInPanel extends JPanel{
    //private MenuBannerPanel aMenuBannerPanel;
    
    private JTextField firstField;
    private JTextField lastField;
    private JTextField reservationIDField;
   
    private JButton checkInButton;
    
    private Image background;
    
    //public MenuBannerPanel getMenuBannerPanel(){return aMenuBannerPanel;}
    public JTextField getFirstField(){return firstField;}
    public JTextField getLastField(){return lastField;}
    public JTextField getReservationIDField(){return reservationIDField;}
    
    public JButton getResetButton(){return checkInButton;}
    
   // private String defaultMessage = "Your Java Air Account Username is: ";

    public CheckInPanel(){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(layout);
        
      //get image for panel background
      background = Toolkit.getDefaultToolkit().createImage("heart.jpg");
   

        //create "Coffee Brown" color for buttons and fonts.
        Color buttonColor = new Color(100,76,55);
        Color backgroundColor = new Color(255,255,255,150);

           
        JLabel checkInLabel = new JLabel("Check In");
        checkInLabel.setFont(new Font("Times", Font.BOLD, 36));
        checkInLabel.setHorizontalAlignment(JLabel.LEFT);
        checkInLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,200,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(checkInLabel, constraints);
        add(checkInLabel);
       
        JLabel infoLabel = new JLabel("Fill out the fields below to check in for your flight:");
        infoLabel.setFont(new Font("Times", Font.BOLD, 24));
        infoLabel.setHorizontalAlignment(JLabel.LEFT);
        infoLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 5;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,200,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(infoLabel, constraints);
        add(infoLabel);
               
        JLabel idLabel = new JLabel("Reservation ID Number:");
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
      
        reservationIDField = new JTextField("");
        //emailField.setFont(new Font("Times", Font.PLAIN, 30));
        reservationIDField.setFont(Global.normalFont);
        reservationIDField.setHorizontalAlignment(JTextField.LEFT);
        //emailField.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(0,0,0,50);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(reservationIDField, constraints);
        add(reservationIDField);
        
        JLabel firstLabel = new JLabel("First: ");
        //passwordLabel.setFont(new Font("Times", Font.BOLD, 30));
        firstLabel.setFont(Global.boldFont);
        firstLabel.setHorizontalAlignment(JLabel.LEFT);
        firstLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(0,200,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(firstLabel, constraints);
        add(firstLabel);

        firstField = new JTextField("");
        //passwordField.setFont(new Font("Times", Font.PLAIN, 30));
        firstField.setFont(Global.normalFont);
        firstField.setHorizontalAlignment(JLabel.LEFT);
        firstField.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(firstField, constraints);
        add(firstField);

        JLabel lastLabel = new JLabel("Last:");
        //confirmLabel.setFont(new Font("Times", Font.BOLD, 30));
        lastLabel.setFont(Global.boldFont);
        lastLabel.setHorizontalAlignment(JLabel.LEFT);
        lastLabel.setForeground(buttonColor);
        constraints.gridx = 3;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(0,20,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(lastLabel, constraints);
        add(lastLabel);

        lastField = new JTextField("");
        //cPasswordField.setFont(new Font("Times", Font.PLAIN, 30));
        lastField.setFont(Global.normalFont);
        lastField.setHorizontalAlignment(JLabel.LEFT);
        lastField.setForeground(buttonColor);
        constraints.gridx = 4;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(0,0,0,50);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(lastField, constraints);
        add(lastField);
        
        checkInButton = new JButton("CHECK IN");
        //cPasswordField.setFont(new Font("Times", Font.PLAIN, 30));
        checkInButton.setFont(Global.boldFont);
        checkInButton.setHorizontalAlignment(JLabel.LEFT);
        checkInButton.setBackground(buttonColor);
        checkInButton.setForeground(Color.WHITE);
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(checkInButton, constraints);
        add(checkInButton);
    }
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(background,0,0,null);
   }
  
}