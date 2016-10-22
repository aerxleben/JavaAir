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
   
   private JButton employeeLoginButton;
	
   private MenuBannerPanel aMenuBannerPanel;

   private Image background;

   public JTextField getFirstField(){return firstField;}
   public JTextField getLastField(){return lastField;}
   
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
      constraints.gridwidth = 7;
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
      constraints.gridwidth = 1;
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
      constraints.gridx = 3;
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
      constraints.gridx = 4;
      constraints.gridy = 2;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(0,0,0,0);
      constraints.weightx = 10;
      constraints.weighty = 10;
      layout.setConstraints(lastField, constraints);
      add(lastField);
      
      employeeLoginButton = new JButton("<html>" + "EMPLOYEE" + "<br>" + "LOGIN" + "</html>");
      employeeLoginButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		new EmployeeLogin().setVisible(true);
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
   
   	//get image for panel background
      background = Toolkit.getDefaultToolkit().createImage("heart.jpg");
   }
   
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(background,0,0,null);
   }
}