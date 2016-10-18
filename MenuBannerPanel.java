/*
 *	This file "MenuBannerPanel" contains a JPanel which will be displayed on the 
 *	top of every Java Air page.  This interface uses a Grid Bag Layout Manager.
 *
 *	Author: Amy Erxleben
 *
 *	Created 10/17/16
 *
 */

import javax.swing.*;
import java.awt.*;

public class MenuBannerPanel extends JPanel{

	private JButton loginButton;
	private JButton homeButton;
	private JButton reservationButton;
	private JButton accountButton;
	private JButton helpButton;
	private JButton aboutButton;

	public JButton getLoginButton(){return loginButton;}
	public JButton getHomeButton(){return homeButton;}
	public JButton getReservationButton(){return reservationButton;}
	public JButton getAccountButton(){return accountButton;}
	public JButton getHelpButton(){return helpButton;}
	public JButton getAboutButton(){return aboutButton;}


	public MenuBannerPanel(){
		//this.setBackground(new Color(WHITE));

		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		setLayout(layout);

		this.setOpaque(false);

		//create "Coffee Brown" color for buttons and fonts.
		Color buttonColor = new Color(100,76,55);

		JLabel javaAirLabel = new JLabel("Java Air");
          javaAirLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 128));
          javaAirLabel.setIcon(new ImageIcon("plane.jpg"));
          javaAirLabel.setHorizontalAlignment(JLabel.LEFT);
          javaAirLabel.setForeground(buttonColor);
          javaAirLabel.setBackground(Color.WHITE);
          javaAirLabel.setOpaque(true);
          constraints.gridx = 0;
          constraints.gridy = 0;
          constraints.gridwidth = 7;
          constraints.gridheight = 2;
          constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12,12,3,3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(javaAirLabel, constraints);
          add(javaAirLabel);

        loginButton = new JButton("LOGIN");
          loginButton.setFont(new Font("Times",Font.PLAIN, 30));
          loginButton.setBackground(buttonColor);
          loginButton.setForeground(Color.WHITE);
          constraints.gridx = 6;
          constraints.gridy = 2;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12, 12, 3, 3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(loginButton, constraints);
          add(loginButton);

		homeButton = new JButton("HOME");
          homeButton.setFont(new Font("Times",Font.PLAIN, 30));
          homeButton.setBackground(buttonColor);
          homeButton.setForeground(Color.WHITE);
          constraints.gridx = 0;
          constraints.gridy = 2;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12, 12, 3, 3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(homeButton, constraints);
          add(homeButton);

        reservationButton = new JButton("RESERVATIONS");
          reservationButton.setFont(new Font("Times",Font.PLAIN, 30));
          reservationButton.setBackground(buttonColor);
          reservationButton.setForeground(Color.WHITE);
          constraints.gridx = 1;
          constraints.gridy = 2;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
        //  constraints.insets = new Insets(12,12,3,3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(reservationButton, constraints);
          add(reservationButton);

        accountButton = new JButton("ACCOUNT");
          accountButton.setFont(new Font("Times",Font.PLAIN, 30));
          accountButton.setBackground(buttonColor);
          accountButton.setForeground(Color.WHITE);
          constraints.gridx = 2;
          constraints.gridy = 2;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12, 12, 3, 3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(accountButton, constraints);
          add(accountButton);

       	helpButton = new JButton("HELP");
  		  helpButton.setFont(new Font("Times",Font.PLAIN, 30));
  		  helpButton.setBackground(buttonColor);
  		  helpButton.setForeground(Color.WHITE);
          constraints.gridx = 3;
          constraints.gridy = 2;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
//          constraints.insets = new Insets(12, 12, 3, 3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(helpButton, constraints);
          add(helpButton);

        aboutButton = new JButton("ABOUT");
          aboutButton.setFont(new Font("Times",Font.PLAIN, 30));
          aboutButton.setBackground(buttonColor);
          aboutButton.setForeground(Color.WHITE);
          constraints.gridx = 4;
          constraints.gridy = 2;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12, 12, 3, 3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(aboutButton, constraints);
          add(aboutButton);

        //Create Annonymous Button that has no function to create uniform bar of buttons
        JButton annonymousButton = new JButton("");
          annonymousButton.setFont(new Font("Times",Font.PLAIN, 30));
          annonymousButton.setBackground(buttonColor);
          constraints.gridx = 5;
          constraints.gridy = 2;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          //constraints.insets = new Insets(12, 12, 3, 3);
          constraints.weightx = 10;
          constraints.weighty = 10;
          layout.setConstraints(annonymousButton, constraints);
          add(annonymousButton);
	}
}