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
 *
 *  Updated 11/02/16 - added reservagtions pannel
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AccountWelcomePanel extends JPanel{
    //private MenuBannerPanel aMenuBannerPanel;
    
    private JButton personalInfoButton;
    private JButton reservationsButton;
    private JButton rewardsButton;
    
    private JPanel cards;
    private JPanel panel;
    
    private Image background;
    
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
   
        JLabel helloLabel = new JLabel("Hello, First Last");//+Global.currentCustomer.getFirstName()+" "+Global.currentCustomer.getLastName());
        helloLabel.setFont(new Font("Times", Font.BOLD, 36));
        helloLabel.setHorizontalAlignment(JLabel.LEFT);
        helloLabel.setForeground(buttonColor);
        //congratulationsLabel.setOpaque(true);
        //helloLabel.setBackground(backgroundColor);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(helloLabel, constraints);
        add(helloLabel);
        
        personalInfoButton = new JButton("<html>" + "PERSONAL" + "<br>" + "INFORMATION" + "</html>");
        personalInfoButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                //validate user inputs && create new account
                personalInformationButtonPressed();
            }
        });
        personalInfoButton.setFont(Global.titleFont);
        personalInfoButton.setHorizontalAlignment(JLabel.CENTER);
        personalInfoButton.setForeground(Color.WHITE);
        personalInfoButton.setBackground(buttonColor);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,80,0,0);
        constraints.weightx = 0;
        constraints.weighty = 0;
        layout.setConstraints(personalInfoButton, constraints);
        add(personalInfoButton);
        
        reservationsButton = new JButton("RESERVATIONS");
        reservationsButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                //validate user inputs && create new account
                reservationsButtonPressed();
            }
        });
        //passwordLabel.setFont(new Font("Times", Font.BOLD, 30));
        reservationsButton.setFont(Global.titleFont);
        reservationsButton.setHorizontalAlignment(JLabel.CENTER);
        //passwordLabel.setOpaque(true);
        reservationsButton.setForeground(Color.WHITE);
        reservationsButton.setBackground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,250,0,200);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(reservationsButton, constraints);
        add(reservationsButton);
        
        rewardsButton = new JButton("REWARDS");
        rewardsButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                //validate user inputs && create new account
                rewardsButtonPressed();
            }
        });
        //accountButton.setFont(new Font("Times", Font.BOLD, 30));
        rewardsButton.setFont(Global.titleFont);
        rewardsButton.setHorizontalAlignment(JButton.CENTER);
        rewardsButton.setBackground(buttonColor);
        rewardsButton.setForeground(Color.WHITE);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,80,0,80);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(rewardsButton, constraints);
        add(rewardsButton);
        
        panel = new JPanel();
        panel.setOpaque(false);
        cards = new JPanel(new CardLayout());
        cards.setOpaque(false);
        cards.add(panel,"Start");
        RewardsPanel aRewardsPanel = new RewardsPanel();
        cards.add(aRewardsPanel, "Rewards");
        RegistrationPanel aRegistrationPanel = new RegistrationPanel(false);
        aRegistrationPanel.setBackground(new Color(255,255,255,150));
        ReservationInfoPanel aReservationInfoPanel = new ReservationInfoPanel();
        cards.add(aReservationInfoPanel, "Reservation");
      //  aRegistrationPanel.getPasswordLabel().setVisible(false);
      //  aRegistrationPanel.getPasswordField().setVisible(false);
      //  aRegistrationPanel.getConfirmLabel().setVisible(false);
      //  aRegistrationPanel.getCPasswordField().setVisible(false);
        cards.add(aRegistrationPanel,"Info");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
          constraints.insets = new Insets(0,80,80,80);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(cards, constraints);
        add(cards);
        //cards.add(panelRegister, Global.textRegister);
        
    }
    
    public void rewardsButtonPressed(){
        CardLayout c2 = (CardLayout)(cards.getLayout());
        c2.show(cards,"Rewards");
    }
    
    public void personalInformationButtonPressed(){
        CardLayout c2 = (CardLayout)(cards.getLayout());
        c2.show(cards,"Info");
    }
    
    public void reservationsButtonPressed(){
        CardLayout c2 = (CardLayout)(cards.getLayout());
        c2.show(cards,"Reservation");
    }
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(background,0,0,null);
   }
  
}