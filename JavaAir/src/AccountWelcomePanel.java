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

public class AccountWelcomePanel extends JPanel{
    //private MenuBannerPanel aMenuBannerPanel;
    
    private JButton personalInfoButton;
    private JButton reservationsButton;
    private JButton rewardsButton;
    
    private Image background;
    
    //public MenuBannerPanel getMenuBannerPanel(){return aMenuBannerPanel;}
    public JButton getPersonalInfoButton(){return personalInfoButton;}
    public JButton getReservationsButton(){return reservationsButton;}
    public JButton getRewardsButton(){return rewardsButton;}
    
   // private String defaultMessage = "Your Java Air Account Username is: ";

    public AccountWelcomePanel(){
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
   
        JLabel helloLabel = new JLabel("Hello, ");//+Global.currentCustomer.getFirstName()+" "+Global.currentCustomer.getLastName());
        helloLabel.setFont(new Font("Times", Font.BOLD, 36));
        helloLabel.setHorizontalAlignment(JLabel.LEFT);
        helloLabel.setForeground(buttonColor);
        //congratulationsLabel.setOpaque(true);
        //helloLabel.setBackground(backgroundColor);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(helloLabel, constraints);
        add(helloLabel);
        
        personalInfoButton = new JButton("<html>" + "PERSONAL" + "<br>" + "INFORMATION" + "</html>");
        //emailLabel.setFont(new Font("Times", Font.BOLD, 30));
        personalInfoButton.setFont(Global.titleFont);
        personalInfoButton.setHorizontalAlignment(JLabel.CENTER);
        personalInfoButton.setForeground(Color.WHITE);
        //emailLabel.setOpaque(true);
        personalInfoButton.setBackground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(personalInfoButton, constraints);
        add(personalInfoButton);
        
        reservationsButton = new JButton("RESERVATIONS");
        //passwordLabel.setFont(new Font("Times", Font.BOLD, 30));
        reservationsButton.setFont(Global.titleFont);
        reservationsButton.setHorizontalAlignment(JLabel.CENTER);
        //passwordLabel.setOpaque(true);
        reservationsButton.setForeground(Color.WHITE);
        reservationsButton.setBackground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(reservationsButton, constraints);
        add(reservationsButton);
        
        rewardsButton = new JButton("REWARDS");
        //accountButton.setFont(new Font("Times", Font.BOLD, 30));
        rewardsButton.setFont(Global.titleFont);
        rewardsButton.setHorizontalAlignment(JButton.CENTER);
        rewardsButton.setBackground(buttonColor);
        rewardsButton.setForeground(Color.WHITE);
        constraints.gridx = 3;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
          //constraints.insets = new Insets(100,400,100,400);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(rewardsButton, constraints);
        add(rewardsButton);
        
    }
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(background,0,0,null);
   }
  
}