/* 
 *	This file "FlightSearchPanel" contains the JPanel which will bed reused on multiple pages of the 
 *	Java Air Application.  This interface uses a Grid Bag Layout Manager.
 *
 *	Author: Amy Erxleben
 *
 *	Created 10/16/16
 *
 *	Updated 10/17/16, Erxleben, removed numPassengersField, changed to numPassengersComboBox
 *
 *	Updated 10/17/16, Erxleben, Added Comments, updated colors, addeded JLabels
 *
 *      Updated 10/23/16, Erxleben, changed position settings of date pickers
 */


//Testing Git Hub!
import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import org.jdatepicker.impl.*;

public class FlightSearchPanel extends JPanel{

	private JComboBox originComboBox;
	private JComboBox destinationComboBox;
	private JComboBox numPassengersComboBox;
	private JTextField departTextField;
	private JTextField returnTextField;
	private JButton searchButton;
        private JDatePickerImpl departDatePicker;
        private JDatePickerImpl returnDatePicker;

	public JComboBox getOriginComboBox(){return originComboBox;}
	public JComboBox getDestinationComboBox(){return destinationComboBox;}
	public JTextField getDepartTextField(){return departTextField;}
	public JTextField getReturnTextField(){return returnTextField;}
	public JComboBox getNumPassengersComboBox(){return numPassengersComboBox;}
	public JButton getSearchButton(){return searchButton;}
        
	public FlightSearchPanel(){

            GridBagLayout layout = new GridBagLayout();
            GridBagConstraints constraints = new GridBagConstraints();
            setLayout(layout);

            this.setBackground(new Color(255,255,255,150));
            //this.setBackground(new Color(135,206,235,150));

            //Create "Royal Blue" color for fonts
            Color fontColor = new Color(0,35,102);

            JLabel messageLabel = new JLabel("Search Flights");
            messageLabel.setFont(new Font("Times", Font.PLAIN, 60));
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

            JLabel originLabel = new JLabel("Origin");
            originLabel.setFont(new Font("Times", Font.PLAIN, 40));
            originLabel.setForeground(fontColor);
            originLabel.setHorizontalAlignment(JLabel.RIGHT);
            constraints.gridx = 0;
            constraints.gridy = 1;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(originLabel, constraints);
            add(originLabel);

            originComboBox = new JComboBox(Tools.getAirportList());
            originComboBox.setSelectedIndex(0);
            // homeButton.setFont(new Font("Times",Font.PLAIN, 30));
            constraints.gridx = 1;
            constraints.gridy = 1;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(originComboBox, constraints);
            add(originComboBox);

            JLabel destinationLabel = new JLabel("Destination");
            destinationLabel.setFont(new Font("Times", Font.PLAIN, 40));
            destinationLabel.setForeground(fontColor);
            destinationLabel.setHorizontalAlignment(JLabel.RIGHT);
            constraints.gridx = 2;
            constraints.gridy = 1;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(destinationLabel, constraints);
            add(destinationLabel);

            destinationComboBox = new JComboBox(Tools.getAirportList());
            destinationComboBox.setSelectedIndex(1);
            //homeButton.setFont(new Font("Times",Font.PLAIN, 30));
            constraints.gridx = 3;
            constraints.gridy = 1;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(destinationComboBox, constraints);
            add(destinationComboBox);

            JLabel departLabel = new JLabel("Depart");
            departLabel.setFont(new Font("Times", Font.PLAIN, 40));
            departLabel.setForeground(fontColor);
            departLabel.setHorizontalAlignment(JLabel.RIGHT);
            constraints.gridx = 0;
            constraints.gridy = 2;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(departLabel, constraints);
            add(departLabel);

            /*departTextField = new JTextField();
            departTextField.setFont(new Font("Times",Font.PLAIN, 30));
            constraints.gridx = 1;
            constraints.gridy = 2;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(departTextField, constraints);
            add(departTextField);*/
            
            UtilDateModel model=new UtilDateModel();
            Calendar now = Calendar.getInstance();
            model.setDate(now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DATE));
            model.setSelected(true);
            Properties p = new Properties();
            p.put("text.today", "Today");
            p.put("text.month", "Month");
            p.put("text.year", "Year");
            JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
            departDatePicker = new JDatePickerImpl(datePanel, new DataLabelFormatter());
            departDatePicker.setFont(new Font("Times", Font.PLAIN, 30));
            constraints.gridx = 1;
            constraints.gridy = 2;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(15, 10, 0, 0);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(departDatePicker, constraints);
            add(departDatePicker);

            JLabel returnLabel = new JLabel("Return");
            returnLabel.setFont(new Font("Times", Font.PLAIN, 40));
            returnLabel.setForeground(fontColor);
            returnLabel.setHorizontalAlignment(JLabel.RIGHT);
            constraints.gridx = 2;
            constraints.gridy = 2;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(returnLabel, constraints);
            add(returnLabel);

            //returnTextField = new JTextField();
            //returnTextField.setFont(new Font("Times",Font.PLAIN, 30));
            returnDatePicker = new JDatePickerImpl(datePanel, new DataLabelFormatter());
            returnDatePicker.setFont(new Font("Times", Font.PLAIN, 30));
            constraints.gridx = 3;
            constraints.gridy = 2;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(15, 10, 0, 0);
            constraints.weightx = 10;
            constraints.weighty = 10;
            //layout.setConstraints(returnTextField, constraints);
            layout.setConstraints(returnDatePicker, constraints);
            //add(returnTextField);
            add(returnDatePicker);

            JLabel numPassengersLabel = new JLabel("Number of Passengers");
            numPassengersLabel.setFont(new Font("Times", Font.PLAIN, 40));
            numPassengersLabel.setForeground(fontColor);
            numPassengersLabel.setHorizontalAlignment(JLabel.RIGHT);
            constraints.gridx = 0;
            constraints.gridy = 3;
            constraints.gridwidth = 3;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(numPassengersLabel, constraints);
            add(numPassengersLabel);

            numPassengersComboBox = new JComboBox(Tools.getNumberList());
            numPassengersComboBox.setSelectedIndex(0);
            //numPassengersComboBox.setFont(new Font("Times",Font.PLAIN, 30));
            constraints.gridx = 3;
            constraints.gridy = 3;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(numPassengersComboBox, constraints);
            add(numPassengersComboBox);

            searchButton = new JButton("SEARCH");
            searchButton.setFont(new Font("Times",Font.PLAIN, 30));
            searchButton.setForeground(fontColor);
            searchButton.setHorizontalAlignment(JButton.CENTER);
            constraints.gridx = 0;
            constraints.gridy = 4;
            constraints.gridwidth = 4;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.NONE;
            constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(searchButton, constraints);
            add(searchButton);
	}//end constructor
}//end class