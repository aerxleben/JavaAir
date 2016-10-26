/* 
 *	This file "FlightInfoPanel" contains the JPanel which will bed reused in multiple instances on 
 *	flight search results panel of the Java Air Application.  This interface uses a Grid Bag Layout Manager.
 *
 *	Author: Amy Erxleben
 *
 *	Created 10/23/16
 *
 */

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import org.jdatepicker.impl.*;

public class FlightInfoPanel extends JPanel{

	private JLabel flightNumberLabel;
	private JLabel fromLabel;
        private JLabel toLabel;
        private JLabel departTimeLabel;
        private JLabel arrivalTimeLabel;
        
        private JButton priceSelectButton;
        
	public JLabel getFlightNumberLabel(){return flightNumberLabel;}
	public JLabel getFromLabel(){return fromLabel;}
        public JLabel getToLabel(){return toLabel;}
        public JLabel getdepartTimeLabel(){return departTimeLabel;}
        public JLabel getArrivalTimeLabel(){return arrivalTimeLabel;}
        
        public JButton getPriceSelectButton(){return priceSelectButton;}
        
        
	public FlightInfoPanel(boolean color){

            GridBagLayout layout = new GridBagLayout();
            GridBagConstraints constraints = new GridBagConstraints();
            setLayout(layout);

            if(color){
                this.setBackground(new Color(135,206,250,150));
            }
            else{
                this.setBackground(new Color(224,255,255,150));
            }

            //Create "Royal Blue" color for fonts
            Color fontColor = new Color(0,35,102);

            flightNumberLabel = new JLabel("Flight No: ");
            //flightNumberLabel.setFont(new Font("Times", Font.PLAIN, 40));
            flightNumberLabel.setFont(Global.titleFont);
            flightNumberLabel.setForeground(fontColor);
            flightNumberLabel.setHorizontalAlignment(JLabel.CENTER);
            constraints.gridx = 0;
            constraints.gridy = 0;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(flightNumberLabel, constraints);
            add(flightNumberLabel);

            fromLabel = new JLabel("From: ");
            //fromLabel.setFont(new Font("Times", Font.PLAIN, 40));
            fromLabel.setFont(Global.normalFont);
            fromLabel.setForeground(fontColor);
            fromLabel.setHorizontalAlignment(JLabel.RIGHT);
            constraints.gridx = 1;
            constraints.gridy = 0;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(fromLabel, constraints);
            add(fromLabel);

            toLabel = new JLabel("To:");
            //toLabel.setFont(new Font("Times", Font.PLAIN, 40));
            toLabel.setFont(Global.normalFont);
            toLabel.setForeground(fontColor);
            toLabel.setHorizontalAlignment(JLabel.RIGHT);
            constraints.gridx = 2;
            constraints.gridy = 0;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(toLabel, constraints);
            add(toLabel);

            departTimeLabel = new JLabel("6:00AM");
            //departTimeLabel.setFont(new Font("Times", Font.PLAIN, 40));
            departTimeLabel.setFont(Global.titleFont);
            departTimeLabel.setForeground(fontColor);
            departTimeLabel.setHorizontalAlignment(JLabel.RIGHT);
            constraints.gridx = 1;
            constraints.gridy = 2;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(departTimeLabel, constraints);
            add(departTimeLabel);

            arrivalTimeLabel = new JLabel("9:30AM");
            //arrivalTimeLabel.setFont(new Font("Times", Font.PLAIN, 40));
            arrivalTimeLabel.setFont(Global.titleFont);
            arrivalTimeLabel.setForeground(fontColor);
            arrivalTimeLabel.setHorizontalAlignment(JLabel.RIGHT);
            constraints.gridx = 2;
            constraints.gridy = 2;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(arrivalTimeLabel, constraints);
            add(arrivalTimeLabel);
           
            priceSelectButton = new JButton("$204");
            //priceSelectButton.setFont(new Font("Times",Font.PLAIN, 30));
            priceSelectButton.setFont(Global.titleFont);
            priceSelectButton.setForeground(fontColor);
            priceSelectButton.setHorizontalAlignment(JButton.CENTER);
            constraints.gridx = 3;
            constraints.gridy = 1;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.NONE;
            constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(priceSelectButton, constraints);
            add(priceSelectButton);
	}//end constructor
}//end class