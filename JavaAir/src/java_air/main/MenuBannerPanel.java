package java_air.main;

/*
 *	This file "MenuBannerPanel" contains a JPanel which will be displayed on the 
 *	top of every Java Air page.  This interface uses a Grid Bag Layout Manager.
 *
 *	Author: Amy Erxleben
 *
 *	Created 10/17/16
 * 
 * Changelog:
 * 2016-10-18  S. Jia   changed font size, changed reservation panel gridx to 1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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

        JLabel javaAirLabel = new JLabel("Welcome to Smooth Flying!");
        javaAirLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 36));
        javaAirLabel.setIcon(new ImageIcon("Logo.png"));
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

        loginButton = new JButton(Global.textLogin);
        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                doLoginOrLogout();
            }
        });
        //loginButton.setFont(new Font("Times",Font.PLAIN, 30));
        loginButton.setFont(Global.titleFont);
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

        homeButton = new JButton(Global.textHome);
        //homeButton.setFont(new Font("Times",Font.PLAIN, 30));
        homeButton.setFont(Global.titleFont);
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

        reservationButton = new JButton(Global.textFlights);
        //reservationButton.setFont(new Font("Times",Font.PLAIN, 30));
        reservationButton.setFont(Global.titleFont);
        reservationButton.setBackground(buttonColor);
        reservationButton.setForeground(Color.WHITE);
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        //constraints.insets = new Insets(12,12,3,3);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(reservationButton, constraints);
        add(reservationButton);

        accountButton = new JButton(Global.textAcct);
        accountButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(Global.currentCustomer == null){
                    //not logged in; display log-in
                    Global.switchCard(Global.textLogin);
                }
                else{
                    //logged in already
                    Global.switchCard(Global.textAcct);
                }
            }
        });
        //accountButton.setFont(new Font("Times",Font.PLAIN, 30));
        accountButton.setFont(Global.titleFont);
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

        helpButton = new JButton(Global.textHelp);
        accountButton = new JButton(Global.textAcct);
        helpButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                HelpPanel panelHelp = new HelpPanel();
                panelHelp.setVisible(true);                       
            }
        }); 
//        helpButton.addWindowListener(new WindowAdapter() {
//            @Override
 //           public void windowClosing(WindowEvent e) {
 //           System.exit(0);
 //           }
 //       });
        //helpButton.setFont(new Font("Times",Font.PLAIN, 30));
        helpButton.setFont(Global.titleFont);
        helpButton.setBackground(buttonColor);
        helpButton.setForeground(Color.WHITE);
        constraints.gridx = 3;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        //constraints.insets = new Insets(12, 12, 3, 3);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(helpButton, constraints);
        add(helpButton);

        aboutButton = new JButton(Global.textAbout);
        //aboutButton.setFont(new Font("Times",Font.PLAIN, 30));
        aboutButton.setFont(Global.titleFont);
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
        //annonymousButton.setFont(new Font("Times",Font.PLAIN, 30));
        annonymousButton.setFont(Global.titleFont);
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
    };//end constructor

    private void doLoginOrLogout(){
        if(this.loginButton.getText().equals("Logout")){
            //reset currentCustomer
            Global.currentCustomer = null;
            //change button text to login
            this.loginButton.setText("Login");
            //reset login info
            LoginLandingPanel loginPanel
                     = (LoginLandingPanel)Global.jPanelMap.get(Global.textLogin);
            loginPanel.setEmailField("");
            loginPanel.setPasswordField("");
        }

        //display login panel
        Global.switchCard(Global.textLogin);
    }//end doLoginOrLogout()
}//end class