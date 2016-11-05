package java_air.main;

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
 *      
 *      Updated 10/29/16, Erxleben, added JRadioButtons to select one way or round trip flight
 */

import java_air.panel.flight.FlightInfoPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
import org.jdatepicker.impl.*;

public class FlightSearchPanel extends JPanel{

        private JRadioButton[] tripTypeButtons;
	private JComboBox originComboBox;
	private JComboBox destinationComboBox;
	private JComboBox numPassengersComboBox;
	private JTextField departTextField;
	private JTextField returnTextField;
	private JButton searchButton;
        private JDatePickerImpl departDatePicker;
        private JDatePickerImpl returnDatePicker;

	private boolean isRoundTrip;
        
        //FlightSearchPanel Constructor
	public FlightSearchPanel(){

            GridBagLayout layout = new GridBagLayout();
            GridBagConstraints constraints = new GridBagConstraints();
            setLayout(layout);

            this.setBackground(new Color(255,255,255,150));
            //this.setBackground(new Color(135,206,235,150));

            //Create "Royal Blue" color for fonts
            Color fontColor = new Color(0,35,102);

            JLabel messageLabel = new JLabel("Search Flights");
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
            
            ButtonGroup operations = new ButtonGroup();
            tripTypeButtons = new JRadioButton[2];
            tripTypeButtons[0] = new JRadioButton("Round Trip", true);
            tripTypeButtons[0].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    isRoundTrip = true;
                }
            });
            tripTypeButtons[1] = new JRadioButton("One Way", false);
            tripTypeButtons[1].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    isRoundTrip = false;
                }
            });
            tripTypeButtons[0].setOpaque(false);
            tripTypeButtons[1].setOpaque(false);
            tripTypeButtons[0].setHorizontalAlignment(JLabel.RIGHT);
            constraints.gridx = 1;
            constraints.gridy = 1;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(tripTypeButtons[0], constraints);
            add(tripTypeButtons[0]);
            operations.add(tripTypeButtons[0]);
            //tripTypeButtons[0].addActionListener(this);
            constraints.gridx = 2;
            constraints.gridy = 1;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(tripTypeButtons[1], constraints);
            add(tripTypeButtons[1]);
            operations.add(tripTypeButtons[1]); 
            

            JLabel originLabel = new JLabel("Origin");
            //originLabel.setFont(new Font("Times", Font.PLAIN, 40));
            originLabel.setFont(Global.titleFont);
            originLabel.setForeground(fontColor);
            originLabel.setHorizontalAlignment(JLabel.RIGHT);
            constraints.gridx = 0;
            constraints.gridy = 2;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(originLabel, constraints);
            add(originLabel);

            originComboBox = new JComboBox(Global.airportList);
            originComboBox.setSelectedIndex(0);
            originComboBox.setRenderer(new ComboBoxRenderer());
            constraints.gridx = 1;
            constraints.gridy = 2;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(originComboBox, constraints);
            add(originComboBox);

            JLabel destinationLabel = new JLabel("Destination");
            //destinationLabel.setFont(new Font("Times", Font.PLAIN, 40));
            destinationLabel.setFont(Global.titleFont);
            destinationLabel.setForeground(fontColor);
            destinationLabel.setHorizontalAlignment(JLabel.RIGHT);
            constraints.gridx = 2;
            constraints.gridy = 2;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(destinationLabel, constraints);
            add(destinationLabel);

            destinationComboBox = new JComboBox(Global.airportList);
            destinationComboBox.setSelectedIndex(1);
            destinationComboBox.setRenderer(new ComboBoxRenderer());
            //homeButton.setFont(new Font("Times",Font.PLAIN, 30));
            constraints.gridx = 3;
            constraints.gridy = 2;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(destinationComboBox, constraints);
            add(destinationComboBox);

            JLabel departLabel = new JLabel("Depart");
            //departLabel.setFont(new Font("Times", Font.PLAIN, 40));
            departLabel.setFont(Global.titleFont);
            departLabel.setForeground(fontColor);
            departLabel.setHorizontalAlignment(JLabel.RIGHT);
            constraints.gridx = 0;
            constraints.gridy = 3;
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
            JDatePanelImpl datePanelDepart = new JDatePanelImpl(model, p);
            departDatePicker = new JDatePickerImpl(datePanelDepart, new DataLabelFormatter());
            //departDatePicker.setFont(new Font("Times", Font.PLAIN, 30));
            departDatePicker.setTextEditable(true);
            constraints.gridx = 1;
            constraints.gridy = 3;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(15, 10, 0, 0);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(departDatePicker, constraints);
            add(departDatePicker);

            JLabel returnLabel = new JLabel("Return");
            //returnLabel.setFont(new Font("Times", Font.PLAIN, 40));
            returnLabel.setFont(Global.titleFont);
            returnLabel.setForeground(fontColor);
            returnLabel.setHorizontalAlignment(JLabel.RIGHT);
            constraints.gridx = 2;
            constraints.gridy = 3;
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
            model = new UtilDateModel();
            now = Calendar.getInstance();
            model.setDate(now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DATE));
            model.setSelected(true);
            JDatePanelImpl datePanelReturn = new JDatePanelImpl(model, p);
            returnDatePicker = new JDatePickerImpl(datePanelReturn, new DataLabelFormatter());
            //returnDatePicker.setFont(new Font("Times", Font.PLAIN, 30));
            returnDatePicker.setTextEditable(true);
            constraints.gridx = 3;
            constraints.gridy = 3;
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
            //numPassengersLabel.setFont(new Font("Times", Font.PLAIN, 40));
            numPassengersLabel.setFont(Global.titleFont);
            numPassengersLabel.setForeground(fontColor);
            numPassengersLabel.setHorizontalAlignment(JLabel.RIGHT);
            constraints.gridx = 0;
            constraints.gridy = 4;
            constraints.gridwidth = 3;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12,12,3,3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(numPassengersLabel, constraints);
            add(numPassengersLabel);

            numPassengersComboBox = new JComboBox(Global.numberList);
            numPassengersComboBox.setSelectedIndex(0);
            numPassengersComboBox.setRenderer(new ComboBoxRenderer());
            //numPassengersComboBox.setFont(new Font("Times",Font.PLAIN, 30));
            constraints.gridx = 3;
            constraints.gridy = 4;
            constraints.gridwidth = 1;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(numPassengersComboBox, constraints);
            add(numPassengersComboBox);

            searchButton = new JButton("Search");
            searchButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent event){
                    searchForFlights();
                }
            });
            //searchButton.setFont(new Font("Times",Font.PLAIN, 30));
            searchButton.setFont(Global.titleFont);
            searchButton.setForeground(fontColor);
            searchButton.setHorizontalAlignment(JButton.CENTER);
            constraints.gridx = 0;
            constraints.gridy = 5;
            constraints.gridwidth = 4;
            constraints.gridheight = 1;
            constraints.fill = GridBagConstraints.NONE;
            constraints.insets = new Insets(12, 12, 3, 3);
            constraints.weightx = 10;
            constraints.weighty = 10;
            layout.setConstraints(searchButton, constraints);
            add(searchButton);
	}//end constructor
        
        public JComboBox getOriginComboBox(){
            return originComboBox;
        }
        
	public JComboBox getDestinationComboBox(){
            return destinationComboBox;
        }
        
	public JTextField getDepartTextField(){
            return departTextField;
        }
        
        public JDatePickerImpl getDepartDatePicker(){
            return departDatePicker;
        }
        
	public JTextField getReturnTextField(){
            return returnTextField;
        }
        
        public JDatePickerImpl getReturnDatePicker(){
            return returnDatePicker;
        }
        
	public JComboBox getNumPassengersComboBox(){
            return numPassengersComboBox;
        }
        
	public JButton getSearchButton(){
            return searchButton;
        }
        
        public JRadioButton getRoundTripButton(){
            return this.tripTypeButtons[0];
        }
        
        public JRadioButton getOneWayButton(){
            return this.tripTypeButtons[1];
        }
        
        public void setOriginComboBox(String newOrigin){
            if(newOrigin != null 
                    && Arrays.asList(Global.airportList).contains(newOrigin)){
                this.originComboBox.setSelectedItem(newOrigin);
            }
        }
        
        public void setDestinationComboBox(String newDestination){
            if(newDestination != null
                    && Arrays.asList(Global.airportList).contains(newDestination)){
                this.destinationComboBox.setSelectedItem(newDestination);
            }
        }
        
        public void setDepartDate(String newDeparture){
            if(newDeparture != null && departDatePicker != null){
                try{
                    int[] compArr = getDateComponents(newDeparture);
                    departDatePicker.getModel().setDate(compArr[0]
                            , compArr[1]
                            , compArr[2]);
                }
                catch(Exception x){
                    JOptionPane.showMessageDialog(null
                            , "Unable to Parse and Set New Departure Date"
                            , "JDatePicker Error"
                            , JOptionPane.ERROR_MESSAGE);
                }//end try-catch
            }//end if
        }//end setDepartDate
        
        public void setReturnDate(String newReturnDate){
            if(newReturnDate != null && returnDatePicker != null){
                try{
                    int[] compArr = getDateComponents(newReturnDate);
                    returnDatePicker.getModel().setDate(compArr[0]
                            , compArr[1]
                            , compArr[2]);
                }catch(Exception x){
                    JOptionPane.showMessageDialog(null
                            , "Unable to Parse and Set New Return Date"
                            , "JDatePicker Error"
                            , JOptionPane.ERROR_MESSAGE);
                }//end try-catch
            }//end if
        }//end setReturnDate()
        
        public void setPassengersNumber(String newNumber){
            if(newNumber != null 
                    && Arrays.asList(Global.numberList).contains(newNumber)){
                this.numPassengersComboBox.setSelectedItem(newNumber);
            }
        }//end setPassengersNumber
        
        public void setTripType(boolean isRoundTrip){
            this.tripTypeButtons[0].setSelected(isRoundTrip);
            this.tripTypeButtons[1].setSelected(!isRoundTrip);
        }
        
        
        /*****
         * Method: searchForFlights
         *****/
        private void searchForFlights(){
            //validate user inputs
            String origin = this.originComboBox.getSelectedItem().toString();
            String destination = this.destinationComboBox.getSelectedItem().toString();
            
            //origin vs destination
            if(origin.equals(destination)){
                JOptionPane.showMessageDialog(null
                        , "Origin and Destination Cannot Be The Same!"
                        , "Location Conflict"
                        , JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //departure date vs return date
            String departDateStr = this.departDatePicker.getJFormattedTextField().getText();
            String returnDateStr = this.returnDatePicker.getJFormattedTextField().getText();
            long dayDifference = 0;
            
            try{
                SimpleDateFormat formater = Global.dateFormat;
                
                Calendar departDate = Calendar.getInstance();
                departDate.setTime(formater.parse(departDateStr));
                
                Calendar returnDate = Calendar.getInstance();
                returnDate.setTime(formater.parse(returnDateStr));
                
                long msDiff = returnDate.getTimeInMillis() - departDate.getTimeInMillis();
                dayDifference = msDiff/(1000*60*60*24);
            }
            catch(Exception x){
                JOptionPane.showMessageDialog(null
                        , "Unable to Parse Picked Date or Failed To Calculate Day Difference; " + x.getMessage()
                        , "Date Picker Error"
                        , JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if(dayDifference <= 0){
                JOptionPane.showMessageDialog(null
                        , "Return Date Must Be At Least 1 Day Ahead of Departure Date"
                        , "Date Picker Error"
                        , JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //search result against DB
            String numOfPassengers = this.numPassengersComboBox.getSelectedItem().toString();
            
            if(Global.jPanelMap != null){
                FlightResultsPanel resultsPanel = 
                        (FlightResultsPanel)Global.jPanelMap.get(Global.textFlights);
                resultsPanel.getComponentPanel().add(new FlightInfoPanel());
                resultsPanel.validate();
                
                FlightSearchPanel searchPanel = resultsPanel.getFlightSearchPanel();
                searchPanel.setTripType(this.isRoundTrip);
                searchPanel.setOriginComboBox(this.originComboBox.getSelectedItem().toString());
                searchPanel.setDestinationComboBox(this.destinationComboBox.getSelectedItem().toString());
                searchPanel.setDepartDate(departDateStr);
                searchPanel.setReturnDate(returnDateStr);
                searchPanel.setPassengersNumber(this.numPassengersComboBox.getSelectedItem().toString());
            }
            
            //2016-10-29 S. Jia : Test
            CardLayout cl = (CardLayout)Global.cardsPanel.getLayout();
            cl.show(Global.cardsPanel, Global.textFlights);
            
            //CardLayout cl = (CardLayout)this.getParent().getParent().getLayout();
            //cl.show(this.getParent(), Global.textFlights);
            
        }//end searchForFlights
        
        private int[] getDateComponents(String dateString){
            int[] compArr = new int[3];
            String[] compArrStr= dateString.split("-");
            
            for(int i = 0; i < 3; i++){
                if(i == 1){
                    compArr[i] = Integer.parseInt(compArrStr[i]) - 1;
                }
                else{
                    compArr[i] = Integer.parseInt(compArrStr[i]);
                }
            }

            return compArr;
        }//end getDateComponents
}//end class