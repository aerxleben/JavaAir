package java_air.main;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: AccountConfirmationPanel.java
 * Author: Amy Erxleben
 * Creation: 2016-10-22
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AccountConfirmationPanel extends JPanel{
    private MenuBannerPanel aMenuBannerPanel;
    
    private JButton accountButton;
    
    private JLabel emailLabel;
    
    private Image background;
    
    public MenuBannerPanel getMenuBannerPanel(){return aMenuBannerPanel;}
    
    public JLabel getEmailLabel(){return emailLabel;}
    
    private String defaultMessage = "Your Java Air Account Username is: ";

    public AccountConfirmationPanel(){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(layout);
        
      //get image for panel background
      background = Toolkit.getDefaultToolkit().createImage("heart.jpg");
   

        //create "Coffee Brown" color for buttons and fonts.
        Color buttonColor = new Color(100,76,55);
        Color backgroundColor = new Color(255,255,255,150);

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
        
        JLabel congratulationsLabel = new JLabel("Congratulations!");
        congratulationsLabel.setFont(new Font("Times", Font.BOLD, 36));
        congratulationsLabel.setHorizontalAlignment(JLabel.LEFT);
        congratulationsLabel.setForeground(buttonColor);
        //congratulationsLabel.setOpaque(true);
        congratulationsLabel.setBackground(backgroundColor);
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(congratulationsLabel, constraints);
        add(congratulationsLabel);
        
        emailLabel = new JLabel("Your Java Air Account Username is: ");
        //emailLabel.setFont(new Font("Times", Font.BOLD, 30));
        emailLabel.setFont(Global.titleFont);
        emailLabel.setHorizontalAlignment(JLabel.CENTER);
        emailLabel.setForeground(buttonColor);
        //emailLabel.setOpaque(true);
        emailLabel.setBackground(backgroundColor);
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(emailLabel, constraints);
        add(emailLabel);
        
        JLabel passwordLabel = new JLabel("You're ready to start earning miles!");
        //passwordLabel.setFont(new Font("Times", Font.BOLD, 30));
        passwordLabel.setFont(Global.titleFont);
        passwordLabel.setHorizontalAlignment(JLabel.CENTER);
        //passwordLabel.setOpaque(true);
        passwordLabel.setForeground(buttonColor);
        passwordLabel.setBackground(backgroundColor);
        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(passwordLabel, constraints);
        add(passwordLabel);
        
        /*accountButton = new JButton("GO TO ACCOUNT");
        //accountButton.setFont(new Font("Times", Font.BOLD, 30));
        accountButton.setFont(Global.titleFont);
        accountButton.setHorizontalAlignment(JButton.CENTER);
        accountButton.setBackground(buttonColor);
        accountButton.setForeground(Color.WHITE);
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
          constraints.insets = new Insets(100,400,100,400);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(accountButton, constraints);
        add(accountButton);*/
        
    }
    
    public void setEmailLabelText(String newEmail){
        if(this.emailLabel != null){
            this.emailLabel.setText(defaultMessage + newEmail);
        }
    }
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(background,0,0,null);
   }
  
}