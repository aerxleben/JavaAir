package java_air.main;

/*
 *	This file "HomePanel" contains the JPanel which will be displayed on the 
 *	Java Air Home Page.  This interface uses a Grid Bag Layout Manager.
 *
 *	Author: Amy Erxleben
 *
 *	Created 10/15/16
 *
 *	Updated 10/17/16, Erxleben, Added Comments, updated colors, addeded buttons: flight status, check in, login, employee Login
 *	
 *	Updated 10/16/16, Erxleben, Added FlightSearchPanel
 *
 *      Updated 10/31/16, Erxleben, added action listener for CheckIn Button
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java_air.panel.flight.*;

public class HomePanel extends JPanel{

   private JButton flightStatusButton;
   private JButton checkInButton;
   private JButton employeeLoginButton;
	
   private MenuBannerPanel aMenuBannerPanel;
   private FlightSearchPanel searchPanel;
   //private BookTravelPanel searchPanel;

   private Image background;

   public JButton getFlightStatusButton(){return flightStatusButton;}
   public JButton getCheckInButton(){return checkInButton;}
   public JButton getEmployeeLoginButton(){return employeeLoginButton;}
   
   public FlightSearchPanel getFlightSearchPanel(){return searchPanel;}
   //public BookTravelPanel getFlightSearchPanel(){return this.searchPanel;}
   public MenuBannerPanel getMenuBannerPanel(){return aMenuBannerPanel;}

   public HomePanel(){
       //this.setBackground(new Color(WHITE));
       //this.setOpaque(false);
   
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(layout);
   
   	//get image for panel background
      background = Toolkit.getDefaultToolkit().createImage("heart.jpg");
   
   	//create "Coffee Brown" color for buttons and fonts.
      Color buttonColor = new Color(100,76,55);
   
      /*aMenuBannerPanel = new MenuBannerPanel();
      constraints.gridx = 0;
      constraints.gridy = 0;
      constraints.gridwidth = 7;
      constraints.gridheight = 2;
      constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12,12,3,3);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(aMenuBannerPanel, constraints);
      add(aMenuBannerPanel);*/
        
      JLabel welcomeLabel = new JLabel("Welcome");
      welcomeLabel.setFont(new Font("Serif", Font.ITALIC, 36));
      welcomeLabel.setHorizontalAlignment(JLabel.LEFT);
      welcomeLabel.setForeground(buttonColor);
      constraints.gridx = 0;
      constraints.gridy = 2;
      constraints.gridwidth = 2;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12,12,3,3);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(welcomeLabel, constraints);
      add(welcomeLabel);
   
        //create flight search panel
      searchPanel = new FlightSearchPanel();
      //searchPanel = new BookTravelPanel();
      constraints.gridx = 1;
      constraints.gridy = 3;
      constraints.gridwidth = 2;
      constraints.gridheight = 2;
      constraints.fill = GridBagConstraints.BOTH;
          constraints.insets = new Insets(0, 150, 100, 0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(searchPanel, constraints);
      add(searchPanel);
   
      flightStatusButton = new JButton("FLIGHT STATUS");
      flightStatusButton.setFont(new Font("Times",Font.PLAIN, 24));
      flightStatusButton.setBackground(buttonColor);
      flightStatusButton.setForeground(Color.WHITE);
      constraints.gridx = 4;
      constraints.gridy = 3;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.BOTH;
      constraints.insets = new Insets(0, 12, 0, 150);
      constraints.weightx = 5;
      constraints.weighty = 5;
      layout.setConstraints(flightStatusButton, constraints);
      add(flightStatusButton);
   
      checkInButton = new JButton("CHECK IN");
      checkInButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                //validate user inputs && create new account
                checkInButtonPressed();
            }
        });
      checkInButton.setFont(new Font("Times",Font.PLAIN, 24));
      checkInButton.setBackground(buttonColor);
      checkInButton.setForeground(Color.WHITE);
      constraints.gridx = 4;
      constraints.gridy = 4;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.BOTH;
      constraints.insets = new Insets(0, 12, 100, 150);
      constraints.weightx = 5;
      constraints.weighty = 5;
      layout.setConstraints(checkInButton, constraints);
      add(checkInButton);
   
/*      employeeLoginButton = new JButton("<html>" + "EMPLOYEE" + "<br>" + "LOGIN" + "</html>");
      employeeLoginButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		new EmployeeLoginFrame().setVisible(true);
        	}
        });
      employeeLoginButton.setFont(new Font("Times",Font.PLAIN, 20));
      employeeLoginButton.setHorizontalAlignment(JButton.RIGHT);
      employeeLoginButton.setBackground(Color.WHITE);
      constraints.gridx = 6;
      constraints.gridy = 5;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.VERTICAL;
          //constraints.insets = new Insets(12, 12, 3, 3);
      constraints.weightx = 5;
      constraints.weighty = 5;
      layout.setConstraints(employeeLoginButton, constraints);
      add(employeeLoginButton);
  */ 
   }

	//method used to paint background with image
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(background,0,0,null);
   }
   
   public void checkInButtonPressed(){
         CardLayout cl = (CardLayout)Global.cardsPanel.getLayout();
         cl.show(Global.cardsPanel, Global.textCheckIn);
    }
   
}