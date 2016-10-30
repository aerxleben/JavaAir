package java_air.main;

/*
 *	This file "RegistrationPanel" contains the JPanel which will be displayed on the 
 *	when a customer Registers for an Account.  This interface uses a Grid Bag Layout Manager.
 *
 *	Author: Amy Erxleben
 *
 *	Created 10/19/16
 *
 *      Update Log:
 *      10/22/16- Erxleben,added gender, birthdate, address, city, state, zip
 *              phone, email, password, and confrim password fields, submit button.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Properties;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class RegistrationPanel extends JPanel{
    
    private JTextField firstField;
    private JTextField lastField;
    //private JTextField birthdayField;
    private JDatePickerImpl birthdayPicker;
    private JComboBox genderBox;
    private JTextField addressField;
    private JTextField cityField;
    private JTextField stateField;
    private JTextField zipField;
    private JTextField phoneField;
    private JTextField emailField;
    private JTextField passwordField;
    private JTextField cPasswordField;  //Confirm Password Field

    private JButton submitButton;

    //private JButton employeeLoginButton;

    //private MenuBannerPanel aMenuBannerPanel;

    private Image background;

    public JTextField getFirstField(){return firstField;}
    public JTextField getLastField(){return lastField;}
    //public JTextField getBirthdayField(){return birthdayField;}
    public JDatePickerImpl getBirthdayPicker(){return birthdayPicker;}
    public JComboBox getGenderBox(){return genderBox;}
    public JTextField getAddressField(){return addressField;}
    public JTextField getCityField(){return addressField;}
    public JTextField getStateField(){return stateField;}
    public JTextField getZipField(){return zipField;}
    public JTextField getPhoneField(){return phoneField;}
    public JTextField getEmailField(){return emailField;}
    public JTextField getPasswordField(){return passwordField;}
    public JTextField getCPasswordField(){return cPasswordField;}

    public JButton getSubmitButton(){return submitButton;}
    //public JButton getEmployeeLoginButton(){return employeeLoginButton;}

    //public MenuBannerPanel getMenuBannerPanel(){return aMenuBannerPanel;}

    public RegistrationPanel(){
        
        //this.setBackground(new Color(WHITE));
       
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(layout);

        //create "Coffee Brown" color for buttons and fonts.
        Color buttonColor = new Color(100,76,55);

        /*aMenuBannerPanel = new MenuBannerPanel();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 9;
        constraints.gridheight = 2;
        constraints.fill = GridBagConstraints.BOTH;
            //constraints.insets = new Insets(12,12,3,3);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(aMenuBannerPanel, constraints);
        add(aMenuBannerPanel);*/

        JLabel firstLabel = new JLabel("First");
        //firstLabel.setFont(new Font("Times", Font.BOLD, 30));
        firstLabel.setFont(Global.normalFont);
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

        firstField = new JTextField();
        //firstField.setFont(new Font("Times", Font.PLAIN, 30));
        firstField.setFont(Global.normalFont);
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
        //lastLabel.setFont(new Font("Times", Font.BOLD, 30));
        lastLabel.setFont(Global.normalFont);
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

        lastField = new JTextField();
        //lastField.setFont(new Font("Times", Font.PLAIN, 30));
        lastField.setFont(Global.normalFont);
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

        JLabel bDayLabel = new JLabel("Birthday");
        //bDayLabel.setFont(new Font("Times", Font.BOLD, 30));
        bDayLabel.setFont(Global.normalFont);
        bDayLabel.setHorizontalAlignment(JLabel.RIGHT);
        bDayLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(bDayLabel, constraints);
        add(bDayLabel);
      
        //birthdayField = new JTextField("");
        //birthdayField.setFont(new Font("Times", Font.PLAIN, 30));
        //birthdayField.setHorizontalAlignment(JLabel.LEFT);
        //birthdayField.setForeground(buttonColor);
        UtilDateModel model = new UtilDateModel();
        Calendar now = Calendar.getInstance();
        model.setDate(now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DATE));
        model.setSelected(true);
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        birthdayPicker = new JDatePickerImpl(datePanel, new DataLabelFormatter());
        birthdayPicker.setFont(new Font("Times", Font.PLAIN, 30));
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        //layout.setConstraints(birthdayField, constraints);
        //add(birthdayField);
        layout.setConstraints(birthdayPicker, constraints);
        add(birthdayPicker);
      
        JLabel genderLabel = new JLabel("Gender");
        //genderLabel.setFont(new Font("Times", Font.BOLD, 30));
        genderLabel.setFont(Global.normalFont);
        genderLabel.setHorizontalAlignment(JLabel.RIGHT);
        genderLabel.setForeground(buttonColor);
        constraints.gridx = 4;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(genderLabel, constraints);
        add(genderLabel);
      
        genderBox = new JComboBox(Global.genderList);
        genderBox.setSelectedIndex(0);
        genderBox.setRenderer(new ComboBoxRenderer());
        //genderBox.setFont(new Font("Times", Font.PLAIN, 30));
        genderBox.setFont(Global.normalFont);
        //genderBox.setHorizontalAlignment(JLabel.LEFT);
        genderBox.setForeground(buttonColor);
        constraints.gridx = 5;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(genderBox, constraints);
        add(genderBox);
      
        JLabel addressLabel = new JLabel("Address");
        //addressLabel.setFont(new Font("Times", Font.BOLD, 30));
        addressLabel.setFont(Global.normalFont);
        addressLabel.setHorizontalAlignment(JLabel.RIGHT);
        addressLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(addressLabel, constraints);
        add(addressLabel);
      
        addressField = new JTextField("");
        //addressField.setFont(new Font("Times", Font.PLAIN, 30));
        addressField.setFont(Global.normalFont);
        addressField.setHorizontalAlignment(JLabel.LEFT);
        addressField.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.gridwidth = 5;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(addressField, constraints);
        add(addressField);

        JLabel cityLabel = new JLabel("City");
        //cityLabel.setFont(new Font("Times", Font.BOLD, 30));
        cityLabel.setFont(Global.normalFont);
        cityLabel.setHorizontalAlignment(JLabel.RIGHT);
        cityLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(cityLabel, constraints);
        add(cityLabel);

        cityField = new JTextField("");
        //cityField.setFont(new Font("Times", Font.PLAIN, 30));
        cityField.setFont(Global.normalFont);
        cityField.setHorizontalAlignment(JLabel.LEFT);
        cityField.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(cityField, constraints);
        add(cityField);

        JLabel stateLabel = new JLabel("State");
        //stateLabel.setFont(new Font("Times", Font.BOLD, 30));
        stateLabel.setFont(Global.normalFont);
        stateLabel.setHorizontalAlignment(JLabel.RIGHT);
        stateLabel.setForeground(buttonColor);
        constraints.gridx = 3;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(stateLabel, constraints);
        add(stateLabel);

        stateField = new JTextField("");
        //stateField.setFont(new Font("Times", Font.PLAIN, 30));
        stateField.setFont(Global.normalFont);
        stateField.setHorizontalAlignment(JLabel.LEFT);
        stateField.setForeground(buttonColor);
        constraints.gridx = 4;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(stateField, constraints);
        add(stateField);

        JLabel zipLabel = new JLabel("Zip");
        //zipLabel.setFont(new Font("Times", Font.BOLD, 30));
        zipLabel.setFont(Global.normalFont);
        zipLabel.setHorizontalAlignment(JLabel.RIGHT);
        zipLabel.setForeground(buttonColor);
        constraints.gridx = 5;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(zipLabel, constraints);
        add(zipLabel);

        zipField = new JTextField("");
        //zipField.setFont(new Font("Times", Font.PLAIN, 30));
        zipField.setFont(Global.normalFont);
        zipField.setHorizontalAlignment(JLabel.LEFT);
        zipField.setForeground(buttonColor);
        constraints.gridx = 6;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(zipField, constraints);
        add(zipField);

        JLabel phoneLabel = new JLabel("Phone");
        //phoneLabel.setFont(new Font("Times", Font.BOLD, 30));
        phoneLabel.setFont(Global.normalFont);
        phoneLabel.setHorizontalAlignment(JLabel.RIGHT);
        phoneLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(phoneLabel, constraints);
        add(phoneLabel);

        phoneField = new JTextField("");
        //phoneField.setFont(new Font("Times", Font.PLAIN, 30));
        phoneField.setFont(Global.normalFont);
        phoneField.setHorizontalAlignment(JLabel.LEFT);
        phoneField.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(phoneField, constraints);
        add(phoneField);

        JLabel emailLabel = new JLabel("Email");
        //emailLabel.setFont(new Font("Times", Font.BOLD, 30));
        emailLabel.setFont(Global.normalFont);
        emailLabel.setHorizontalAlignment(JLabel.RIGHT);
        emailLabel.setForeground(buttonColor);
        constraints.gridx = 4;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(emailLabel, constraints);
        add(emailLabel);

        emailField = new JTextField("");
        //emailField.setFont(new Font("Times", Font.PLAIN, 30));
        emailField.setFont(Global.normalFont);
        emailField.setHorizontalAlignment(JLabel.LEFT);
        emailField.setForeground(buttonColor);
        constraints.gridx = 5;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(emailField, constraints);
        add(emailField);

        JLabel passwordLabel = new JLabel("Password");
        //passwordLabel.setFont(new Font("Times", Font.BOLD, 30));
        passwordLabel.setFont(Global.normalFont);
        passwordLabel.setHorizontalAlignment(JLabel.RIGHT);
        passwordLabel.setForeground(buttonColor);
        constraints.gridx = 1;
        constraints.gridy = 7;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(passwordLabel, constraints);
        add(passwordLabel);

        passwordField = new JTextField("");
        //passwordField.setFont(new Font("Times", Font.PLAIN, 30));
        passwordField.setFont(Global.normalFont);
        passwordField.setHorizontalAlignment(JLabel.LEFT);
        passwordField.setForeground(buttonColor);
        constraints.gridx = 2;
        constraints.gridy = 7;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(passwordField, constraints);
        add(passwordField);

        JLabel confirmLabel = new JLabel("Confirm Password");
        //confirmLabel.setFont(new Font("Times", Font.BOLD, 30));
        confirmLabel.setFont(Global.normalFont);
        confirmLabel.setHorizontalAlignment(JLabel.RIGHT);
        confirmLabel.setForeground(buttonColor);
        constraints.gridx = 4;
        constraints.gridy = 7;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(confirmLabel, constraints);
        add(confirmLabel);

        cPasswordField = new JTextField("");
        //cPasswordField.setFont(new Font("Times", Font.PLAIN, 30));
        cPasswordField.setFont(Global.normalFont);
        cPasswordField.setHorizontalAlignment(JLabel.LEFT);
        cPasswordField.setForeground(buttonColor);
        constraints.gridx = 5;
        constraints.gridy = 7;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(cPasswordField, constraints);
        add(cPasswordField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                //validate user inputs && create new account
                createNewAccount();
            }
        });
        submitButton.setFont(new Font("Times", Font.PLAIN, 30));
        submitButton.setHorizontalAlignment(JLabel.LEFT);
        submitButton.setForeground(buttonColor);
        constraints.gridx = 4;
        constraints.gridy = 8;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(submitButton, constraints);
        add(submitButton);


        // adding label to create white space
        JLabel label = new JLabel("");
        constraints.gridx = 8;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 8;
        constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(0,0,0,0);
        constraints.weightx = 10;
        constraints.weighty = 10;
        layout.setConstraints(label, constraints);
        add(label);

        //get image for panel background
        background = Toolkit.getDefaultToolkit().createImage("heart.jpg");
    }
   
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(background,0,0,null);
    }
    
    private void createNewAccount(){
        int missing = 0;
        ArrayList<String> list = new ArrayList<String>();
        Color error = Color.RED;
        Color normal = Color.WHITE;
        
        //check first name
        if(firstField.getText().length() > 0){
            list.add(firstField.getText());
            firstField.setBackground(normal);
        }
        else{
            firstField.setBackground(error);
            missing++;
        }
        
        //check last name
        if(lastField.getText().length() > 0){
            list.add(lastField.getText());
            lastField.setBackground(normal);
        }
        else{
            lastField.setBackground(error);
            missing++;
        }
        
        //validate picked date
        int yearDifference = 0;
        try{
            SimpleDateFormat formater = Global.dateFormat;
            Calendar pickedDate = Calendar.getInstance();
            pickedDate.setTime(formater.parse(birthdayPicker.getJFormattedTextField().getText()));
            Calendar today = Calendar.getInstance();
            yearDifference = today.get(Calendar.YEAR) - pickedDate.get(Calendar.YEAR);
        }
        catch(ParseException x){
            JOptionPane.showMessageDialog(null
                    , "Unable to Parse Picked Date; " + x.getMessage()
                    , "Birthday Picker Error"
                    , JOptionPane.ERROR_MESSAGE);
        }
        //check birthday
        if(yearDifference >= 4){
            list.add(birthdayPicker.getJFormattedTextField().getText());
            birthdayPicker.setBackground(normal);
        }
        else{
            birthdayPicker.setBackground(error);
            missing++;
        }
        
        //check gender
        if(genderBox.getSelectedItem().toString().length() > 0){
            list.add(genderBox.getSelectedItem().toString());
            genderBox.setBackground(normal);
        }
        else{
            genderBox.setBackground(error);
            missing++;
        }
        
        //check address
        if(addressField.getText().length() > 0){
            list.add(addressField.getText());
            addressField.setBackground(normal);
        }
        else{
            addressField.setBackground(error);
            missing++;
        }
        
        //check city
        if(cityField.getText().length() > 0){
            list.add(cityField.getText());
            cityField.setBackground(normal);
        }
        else{
            cityField.setBackground(error);
            missing++;
        }
        
        //check state
        if(stateField.getText().length() == 2){
            list.add(stateField.getText());
            stateField.setBackground(normal);
        }
        else{
            stateField.setBackground(error);
            missing++;
        }
        
        //check zip code
        if(zipField.getText().length() == 5){
            list.add(zipField.getText());
            zipField.setBackground(normal);
        }
        else{
            zipField.setBackground(error);
            missing++;
        }
        
        //check phone number
        if(phoneField.getText().length() == 10){
            list.add(phoneField.getText());
            phoneField.setBackground(normal);
        }
        else{
            phoneField.setBackground(error);
            missing++;
        }
        
        //check email
        if(emailField.getText().length() > 0
                && emailField.getText().contains("@")){
            list.add(emailField.getText());
            emailField.setBackground(normal);
        }
        else{
            emailField.setBackground(error);
            missing++;
        }
        
        //check password
        if(passwordField.getText().length() > 0
                && cPasswordField.getText().length() > 0
                && passwordField.getText().equals(cPasswordField.getText())){
            list.add(passwordField.getText());
            passwordField.setBackground(normal);
            cPasswordField.setBackground(normal);
        }
        else{
            passwordField.setBackground(error);
            cPasswordField.setBackground(error);
            missing++;
        }
        
        if(missing > 0){
            JOptionPane.showMessageDialog(null
                    , "Please Incorrect Highlighted Fields"
                    , "Fields With Error: " + missing
                    , JOptionPane.ERROR_MESSAGE);
            list = null;
        }
        else{
            try{
                Customer newAcct = new Customer(list);
                newAcct.saveCustomerInfo();
                
                JOptionPane.showMessageDialog(null
                    , "New Account Creation Successful"
                    , "Good News!"
                    , JOptionPane.INFORMATION_MESSAGE);
                
                //display AccountConfirmationPanel
                if(Global.jPanelMap != null){
                    AccountConfirmationPanel confirmPanel = (AccountConfirmationPanel)Global.jPanelMap.get(Global.textRegConfirm);
                    confirmPanel.setEmailLabelText(newAcct.getEmailAddress());
                }
                
                CardLayout cl = (CardLayout)this.getParent().getLayout();
                cl.show(this.getParent(), Global.textRegConfirm);
                
                /*CardLayout newCL = new CardLayout();
                this.setLayout(newCL);
                this.add(new AccountConfirmationPanel(), "Confirm");
                //newCL.show(this, "Confirm");
                newCL.next(this);*/
            }
            catch(Exception x){
                JOptionPane.showMessageDialog(null
                    , "Failed Creating New Account; " + x.getMessage()
                    , "New Account Error"
                    , JOptionPane.ERROR_MESSAGE);
            }
        }
    }//end: createNewAccount()
    
}