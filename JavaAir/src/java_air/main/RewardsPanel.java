package java_air.main;

/* 
 *	This file "RewardsPanel" contains the JPanel which will display 
 *      the current rewards points a registered customer has.
 *
 *	Author: Amy Erxleben
 *
 *	Created 11/01/16
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class RewardsPanel extends JPanel{
        private JLabel pointsLabel;
        private JSlider rewardsSlider;
//        private Dictionary sliderLabels;
    
        public JSlider getRewardsSlider(){ return rewardsSlider;}
        
        //FlightSearchPanel Constructor
	public RewardsPanel(){

            GridBagLayout layout = new GridBagLayout();
            GridBagConstraints constraints = new GridBagConstraints();
            setLayout(layout);

            //this.setBackground(new Color(255,255,255,150));

            //Create "Royal Blue" color for fonts
            Color fontColor = new Color(0,35,102);
            
            Hashtable<Integer, javax.swing.JComponent> rewardsLabels = new Hashtable<Integer, javax.swing.JComponent>();
            rewardsLabels.put(Global.platinumRewards, new JLabel("Platinum"));
            rewardsLabels.put(Global.goldRewards, new JLabel("Gold"));
            rewardsLabels.put(Global.silverRewards, new JLabel("Silver"));
            rewardsLabels.put(Global.bronzeRewards, new JLabel("Bronze"));
            
            JLabel messageLabel = new JLabel("Your Rewards!");
            messageLabel.setFont(new Font("Times", Font.PLAIN, 36));
            messageLabel.setForeground(fontColor);
            messageLabel.setHorizontalAlignment(JLabel.CENTER);
            constraints.gridx = 0;
            constraints.gridy = 0;
            constraints.gridwidth = 4;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(messageLabel, constraints);
            add(messageLabel);
            
            pointsLabel = new JLabel("You Have 40,000 AirBeans!");
            pointsLabel.setFont(new Font("Times", Font.PLAIN, 36));
            pointsLabel.setForeground(fontColor);
            pointsLabel.setHorizontalAlignment(JLabel.CENTER);
            constraints.gridx = 0;
            constraints.gridy = 2;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(pointsLabel, constraints);
            add(pointsLabel);
            
            rewardsSlider = new JSlider(JSlider.VERTICAL);
            rewardsSlider.setMaximum(Global.platinumRewards);
            rewardsSlider.setBackground(new Color(255,255,255,0));
            rewardsSlider.setOpaque(false);
            rewardsSlider.setMinimum(0);
            rewardsSlider.setMajorTickSpacing(100000);
            rewardsSlider.setPaintTicks(true);
            rewardsSlider.setLabelTable(rewardsLabels);
            rewardsSlider.setPaintLabels(true);
            rewardsSlider.setValue(400000);
//            rewardsSlider.setSize(100,100);
//            rewardsSlider.setEnabled(false);
            constraints.gridx = 1;
            constraints.gridy = 1;
            constraints.gridwidth = 1;
            constraints.gridheight = 4;
            constraints.fill = GridBagConstraints.BOTH;
           // constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
//            layout.setConstraints(label, constraints);
  //          add(label);
            layout.setConstraints(rewardsSlider, constraints);
            add(rewardsSlider);
            
            String platinumText = String.format("<html><div WIDTH=%d>%s</div><html>", 400, "Platinum Level Will Get You: "
                    + "You Get To Fly The Plane!");
            JLabel platinumLabel = new JLabel (platinumText);
            platinumLabel.setFont(Global.normalFont);
            platinumLabel.setOpaque(false);
            constraints.gridx = 2;
            constraints.gridy = 1;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.NONE;
           // constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(platinumLabel, constraints);
            add(platinumLabel);
            
            String goldText = String.format("<html><div WIDTH=%d>%s</div><html>", 400, "Gold Level Will Get You: "
                    + "Unlimited Snacks and Priority Use Of Plane Bathrooms!");
            JLabel goldLabel = new JLabel (goldText);
            goldLabel.setFont(Global.normalFont);
            goldLabel.setOpaque(false);
            constraints.gridx = 2;
            constraints.gridy = 2;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.NONE;
           // constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(goldLabel, constraints);
            add(goldLabel);
            
            String silverText = String.format("<html><div WIDTH=%d>%s</div><html>", 400, "Silver Level Will Get You: "
                    + "Free Use Of Java Air Lounge! (Food and Drink Are Not Free)");
            JLabel silverLabel = new JLabel (silverText);
            silverLabel.setFont(Global.normalFont);
            silverLabel.setOpaque(false);
            constraints.gridx = 2;
            constraints.gridy = 3;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.NONE;
           // constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(silverLabel, constraints);
            add(silverLabel);
            
            String bronzeText = String.format("<html><div WIDTH=%d>%s</div><html>", 400, "Brozne Level Will Get You: "
                    + "Priority Boarding! Wait In Queue Faster!");
            JLabel bronzeLabel = new JLabel (bronzeText);
            bronzeLabel.setFont(Global.normalFont);
            bronzeLabel.setOpaque(false);
            constraints.gridx = 2;
            constraints.gridy = 4;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.NONE;
           // constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(bronzeLabel, constraints);
            add(bronzeLabel);

	}//end constructor 
        
        
        public void loadRewards(){
            //check to make sure logged in
            if(Global.currentCustomer == null){
                JOptionPane.showMessageDialog(null
                    , "No Currently Logged In Customer"
                    , "Must Be Logged In"
                    , JOptionPane.WARNING_MESSAGE);
                Global.switchCard(Global.textLogin);
            }//end if
            
            this.pointsLabel.setText("You Have " 
                    + Global.currentCustomer.getCurrentRewardPoints() 
                    + " Air Beans!");
            
            this.rewardsSlider.setValue(Global.currentCustomer.getTotalRewardPoints());
            this.rewardsSlider.setEnabled(false);
        }//end loadRewards()
        
}//end class