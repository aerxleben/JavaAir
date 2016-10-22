/*
 *	This file "RegistrationPanel" contains the JPanel which will be displayed on the 
 *	when a customer Registers for an Account.  This interface uses a Grid Bag Layout Manager.
 *
 *	Author: Amy Erxleben
 *
 *	Created 10/19/16
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationPanel extends JPanel{

   private JTextField firstField;
   private JTextField lastField;
   private JTextField gender;

   private JTextField addressField;
   private JTextField cityField;
   private JTextField stateField;
   private JTextField zipField;
   private JTextField phoneField;
   
   private JButton employeeLoginButton;
	
   private MenuBannerPanel aMenuBannerPanel;

   private Image background;

   public JTextField getFirstField(){return firstField;}
   public JTextField getLastField(){return lastField;}
   public JTextField getAddressField(){return addressField;}
   public JTextField getCityField(){return addressField;}
   public JTextField getStateField(){return stateField;}
   public JTextField getZipField(){return zipField;}
   public JTextField getphoneField(){return phoneField;}
   
   public JButton getEmployeeLoginButton(){return employeeLoginButton;}

   public MenuBannerPanel getMenuBannerPanel(){return aMenuBannerPanel;}

   public RegistrationPanel(){
   	//this.setBackground(new Color(WHITE));
   
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
      
      JLabel firstLabel = new JLabel("First");
      firstLabel.setFont(new Font("Times", Font.BOLD, 30));
      firstLabel.setHorizontalAlignment(JLabel.RIGHT);
      firstLabel.setForeground(buttonColor);
      constraints.gridx = 1;
      constraints.gridy = 2;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(firstLabel, constraints);
      add(firstLabel);
      
      firstField = new JTextField("");
      firstField.setFont(new Font("Times", Font.PLAIN, 30));
      firstField.setHorizontalAlignment(JLabel.LEFT);
      firstField.setForeground(buttonColor);
      constraints.gridx = 2;
      constraints.gridy = 2;
      constraints.gridwidth = 2;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.HORIZONTAL;
      constraints.insets = new Insets(0,0,0,0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(firstField, constraints);
      add(firstField);
      
      JLabel lastLabel = new JLabel("Last");
      lastLabel.setFont(new Font("Times", Font.BOLD, 30));
      lastLabel.setHorizontalAlignment(JLabel.RIGHT);
      lastLabel.setForeground(buttonColor);
      constraints.gridx = 4;
      constraints.gridy = 2;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(lastLabel, constraints);
      add(lastLabel);
      
      lastField = new JTextField("");
      lastField.setFont(new Font("Times", Font.PLAIN, 30));
      lastField.setHorizontalAlignment(JLabel.LEFT);
      lastField.setForeground(buttonColor);
      constraints.gridx = 5;
      constraints.gridy = 2;
      constraints.gridwidth = 2;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,0,0,0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(lastField, constraints);
      add(lastField);
      
      JLabel addressLabel = new JLabel("Address");
      addressLabel.setFont(new Font("Times", Font.BOLD, 30));
      addressLabel.setHorizontalAlignment(JLabel.RIGHT);
      addressLabel.setForeground(buttonColor);
      constraints.gridx = 1;
      constraints.gridy = 3;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(addressLabel, constraints);
      add(addressLabel);
      
      addressField = new JTextField("");
      addressField.setFont(new Font("Times", Font.PLAIN, 30));
      addressField.setHorizontalAlignment(JLabel.LEFT);
      addressField.setForeground(buttonColor);
      constraints.gridx = 2;
      constraints.gridy = 3;
      constraints.gridwidth = 5;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,0,0,0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(addressField, constraints);
      add(addressField);
      
      JLabel cityLabel = new JLabel("City");
      cityLabel.setFont(new Font("Times", Font.BOLD, 30));
      cityLabel.setHorizontalAlignment(JLabel.RIGHT);
      cityLabel.setForeground(buttonColor);
      constraints.gridx = 1;
      constraints.gridy = 4;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(cityLabel, constraints);
      add(cityLabel);
      
      cityField = new JTextField("");
      cityField.setFont(new Font("Times", Font.PLAIN, 30));
      cityField.setHorizontalAlignment(JLabel.LEFT);
      cityField.setForeground(buttonColor);
      constraints.gridx = 2;
      constraints.gridy = 4;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,0,0,0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(cityField, constraints);
      add(cityField);
      
      JLabel stateLabel = new JLabel("State");
      stateLabel.setFont(new Font("Times", Font.BOLD, 30));
      stateLabel.setHorizontalAlignment(JLabel.RIGHT);
      stateLabel.setForeground(buttonColor);
      constraints.gridx = 3;
      constraints.gridy = 4;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(stateLabel, constraints);
      add(stateLabel);
      
      stateField = new JTextField("");
      stateField.setFont(new Font("Times", Font.PLAIN, 30));
      stateField.setHorizontalAlignment(JLabel.LEFT);
      stateField.setForeground(buttonColor);
      constraints.gridx = 4;
      constraints.gridy = 4;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,0,0,0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(stateField, constraints);
      add(stateField);
      
      JLabel zipLabel = new JLabel("Zip");
      zipLabel.setFont(new Font("Times", Font.BOLD, 30));
      zipLabel.setHorizontalAlignment(JLabel.RIGHT);
      zipLabel.setForeground(buttonColor);
      constraints.gridx = 5;
      constraints.gridy = 4;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(zipLabel, constraints);
      add(zipLabel);
      
      zipField = new JTextField("");
      zipField.setFont(new Font("Times", Font.PLAIN, 30));
      zipField.setHorizontalAlignment(JLabel.LEFT);
      zipField.setForeground(buttonColor);
      constraints.gridx = 6;
      constraints.gridy = 4;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,0,0,0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(zipField, constraints);
      add(zipField);
      
      JLabel phoneLabel = new JLabel("Phone");
      phoneLabel.setFont(new Font("Times", Font.BOLD, 30));
      phoneLabel.setHorizontalAlignment(JLabel.RIGHT);
      phoneLabel.setForeground(buttonColor);
      constraints.gridx = 1;
      constraints.gridy = 5;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.NONE;
          constraints.insets = new Insets(0,0,0,0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(phoneLabel, constraints);
      add(phoneLabel);
      
      phoneField = new JTextField("");
      phoneField.setFont(new Font("Times", Font.PLAIN, 30));
      phoneField.setHorizontalAlignment(JLabel.LEFT);
      phoneField.setForeground(buttonColor);
      constraints.gridx = 2;
      constraints.gridy = 5;
      constraints.gridwidth = 2;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,0,0,0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(phoneField, constraints);
      add(phoneField);
   
   	//get image for panel background
      background = Toolkit.getDefaultToolkit().createImage("heart.jpg");
   }
   
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(background,0,0,null);
   }
}