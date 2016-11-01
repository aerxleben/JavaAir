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

        private JSlider rewardsSlider;
//        private Dictionary sliderLabels;
    
        public JSlider getRewardsSlider(){ return rewardsSlider;}
        
        //FlightSearchPanel Constructor
	public RewardsPanel(){

            GridBagLayout layout = new GridBagLayout();
            GridBagConstraints constraints = new GridBagConstraints();
            setLayout(layout);

            this.setBackground(new Color(255,255,255,150));

            //Create "Royal Blue" color for fonts
            Color fontColor = new Color(0,35,102);
            
            Hashtable<Integer, javax.swing.JComponent> rewardsLabels = new Hashtable<Integer, javax.swing.JComponent>();
            rewardsLabels.put(Global.bronzeRewards, new JLabel("Bronze"));
            rewardsLabels.put(Global.silverRewards, new JLabel("Silver"));
            rewardsLabels.put(Global.goldRewards, new JLabel("Gold"));
            rewardsLabels.put(Global.platinumRewards, new JLabel("Platinum"));
            
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
            
            rewardsSlider = new JSlider(JSlider.VERTICAL);
            rewardsSlider.setMaximum(Global.maxRewards);
            rewardsSlider.setMinimum(0);
            rewardsSlider.setMajorTickSpacing(5000);
            rewardsSlider.setPaintTicks(true);
            rewardsSlider.setLabelTable(rewardsLabels);
            rewardsSlider.setPaintLabels(true);
//            rewardsSlider.enable(false);
            rewardsSlider.setValue(40000);
            rewardsSlider.setEnabled(false);
            rewardsSlider.setOpaque(true);
            constraints.gridx = 1;
            constraints.gridy = 1;
            constraints.gridwidth = 1;
            constraints.gridheight = 3;
            constraints.fill = GridBagConstraints.BOTH;
           // constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(rewardsSlider, constraints);
            add(rewardsSlider);
           
	}//end constructor 
        
}//end class