package java_air.main;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: Customer.java
 * Author: Steve Jia
 * Creation: 2016/10/22
 * 
 * Changelog:
 * 
 */

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
 
public class Customer{
 
   private ArrayList<String> customerInfoList;
   /*private String firstName;		//index 0
   private String lastName;             //index 1
   private String dateOfBirth;		//index 2
   private String gender;		//index 3
   private String physicalAddress;	//index 4
   private String addressCity;		//index 5
   private String addressState;		//index 6
   private String addressZipCode;	//index 7
   private String phoneNumber;          //index 8
   private String emailAddress;		//index 9
   private String password;		//index 10*/
   
   private int customerID;
           
   private final String notApplicable = "N/A";
   private final String textSetValueError = "Setting Customer Value Error; Null ";
   
   
   /*public Customer(String newFirstName, String newLastName){
      this.firstName = newFirstName;
      this.lastName = newLastName;
   }*/
   
   public Customer(ArrayList<String> newCustomerInfoList) throws Exception{
      if(newCustomerInfoList.size() != 11){
    	  throw new Exception("Customer Creation Error; Incorrect Structure Size");    	  
      }
      
      this.customerInfoList =  newCustomerInfoList;
   }
   
   private boolean validCustomerAttribute(int index){
       boolean result = false;
       
       try{
           if(index >= 0 && index <= 10 && this.customerInfoList != null){
               if(this.customerInfoList.size() == 11
                    && this.customerInfoList.get(index) != null){
                   result = true;
               }
           }
       }
       catch(Exception x){
            //display and log error
       }
       
       return result;
   }//end: validCustomerAttribute()
   
   private boolean setCustomerAttribute(int index, String newValue){
       boolean result = false;
       
       try{
           if(index >= 0 
                   && index <= 10 
                   && this.customerInfoList != null
                   && newValue != null){
               if(this.customerInfoList.size() == 11){
                   this.customerInfoList.set(index, newValue);
                   result = true;
               }
           }
       }
       catch(Exception x){
           //display and log error
       }
       
       return false;
   }
   
   public String getFirstName(){
       //return (this.firstName == null ? notApplicable : this.firstName);
       return(validCustomerAttribute(0) ?  this.customerInfoList.get(0) : notApplicable);
   }
   
   public String getLastName(){
       //return (this.lastName == null ? notApplicable : this.firstName);
       return(validCustomerAttribute(1) ? this.customerInfoList.get(1) : notApplicable);
         
   }
   
   public String getDateOfBirth(){
       //return (this.dateOfBirth == null ? notApplicable : this.dateOfBirth);
       return(validCustomerAttribute(2) ? this.customerInfoList.get(2) : notApplicable);
   }
   
   public String getGender(){
       //return (this.gender == null ? notApplicable : this.gender);
       return(validCustomerAttribute(3) ? this.customerInfoList.get(3) : notApplicable);
   }
   
   public String getPhysicalAddress(){
       //return (this.physicalAddress == null ? notApplicable : this.physicalAddress);
       return(validCustomerAttribute(4) ? this.customerInfoList.get(4) : notApplicable);
   }
   
   public String getAddressCity(){
       //return (this.addressCity == null ? notApplicable : this.addressCity);
       return(validCustomerAttribute(5) ? this.customerInfoList.get(5) : notApplicable);
   }
   
   public String getAddressState(){
       //return (this.addressState == null ? notApplicable : this.addressState);
       return(validCustomerAttribute(6) ? this.customerInfoList.get(6) : notApplicable);
   }
   
   public String getAddressZipCode(){
       //return (this.addressZipCode == null ? notApplicable : this.addressZipCode);
       return(validCustomerAttribute(7) ? this.customerInfoList.get(7) : notApplicable);
   }
   
   public String getPhoneNumber(){
       //return(this.phoneNumber == null ? notApplicable : this.phoneNumber);
       return(validCustomerAttribute(8) ? this.customerInfoList.get(8) : notApplicable);
   }
   
   public String getEmailAddress(){
       //return (this.emailAddress == null ? notApplicable : this.emailAddress);
       return(validCustomerAttribute(9) ? this.customerInfoList.get(9) : notApplicable);
   }
   
   public void setFirstName(String newFirstName) throws Exception{
       if(newFirstName == null || !setCustomerAttribute(0, newFirstName)){
           //this.firstName = newFirstName;
           throw new Exception(textSetValueError + "First Name");
       }
   }
   
   public void setLastName(String newLastName) throws Exception{
       if(newLastName == null || !setCustomerAttribute(1, newLastName)){
           throw new Exception(textSetValueError + "Last Name");
       }
   }
   
   public void setDateOfBirth(String newDateOfBirth) throws Exception{
       if(newDateOfBirth == null || !setCustomerAttribute(2, newDateOfBirth)){
           throw new Exception(textSetValueError + "Date of Birth");
       }
   }
   
   public void setGender(String newGender) throws Exception{
       if(newGender == null || !setCustomerAttribute(3, newGender)){
           throw new Exception(textSetValueError + "Gender");
       }
   }
   
   public void setPhysicalAddress(String newPhysicalAddress) throws Exception{
       if(newPhysicalAddress == null || !setCustomerAttribute(4, newPhysicalAddress)){
           throw new Exception(textSetValueError + "Address");
       }
   }
   
   public void setAddressCity(String newCity) throws Exception{
       if(newCity == null || !setCustomerAttribute(5, newCity)){
           throw new Exception(textSetValueError + "City");
       }
   }
   
   public void setAddressState(String newState) throws Exception{
       if(newState == null || !setCustomerAttribute(6, newState)){
           throw new Exception(textSetValueError + "State");
       }
   }
   
   public void setAddressZipCode(String newZipCode) throws Exception{
       if(newZipCode == null || !setCustomerAttribute(7, newZipCode)){
           throw new Exception(textSetValueError + "Zip Code");
       }
   }
   
   public void setPhoneNumber(String newPhoneNumber) throws Exception{
       if(newPhoneNumber == null || !setCustomerAttribute(8, newPhoneNumber)){
           throw new Exception(textSetValueError + "Phone Number");
       }
   }
   
   public void setEmailAddress(String newEmail) throws Exception{
       if(newEmail == null || !setCustomerAttribute(9, newEmail)){
           throw new Exception(textSetValueError + "E-mail");
       }
   }
   
   public void setPassword(String newPassword) throws Exception{
       if(newPassword == null || !setCustomerAttribute(10, newPassword)){
           throw new Exception(textSetValueError + "Password");
       }
   }
   
   public void saveCustomerInfo() throws Exception{
       if(this.customerInfoList == null){
           throw new NullPointerException("Customer.saveCustomerInfo(): Null customerInfoList");
       }
       
       //save to file for now, later save to DB
       saveToFile();
   }
   
   private static Customer loadCustomerInfo(String email, String password) throws Exception{
       Customer newCustomer = null;
               
       if(email == null || password == null){
           throw new NullPointerException("loadCustomerInfo(): Null Email or Password");
       }
       
       Scanner reader = null;
       
       try{
           ArrayList<String> infoList = new ArrayList();
           
           reader = new Scanner(new File(email + ".txt"));
           while(reader.hasNextLine()){
               infoList.add(reader.nextLine());
           }
           
           if(infoList.get(10).equals(password)){
               newCustomer = new Customer(infoList);
           }
       }
       catch(Exception x){
           throw x;
       }
       finally{
           if(reader != null) reader.close();
       }
       
       return newCustomer;
   }//end: loadCustomerInfo()
   
   private void saveToFile() throws Exception{
       //FileWriter fw = null;
       BufferedWriter bw = null;
       
       if(this.customerInfoList == null){
           throw new Exception("Customer.saveToFile(): Null customerInfoList");
       }
       
       if(this.customerInfoList.size() != 11){
           throw new Exception("Customer.saveToFile(): customerInfoList Incorrect Size");
       }
       
       try{
           String fileName = this.customerInfoList.get(9) + ".txt";
           /*fw = new FileWriter(fileName);
           for(String value : this.customerInfoList){
               fw.append(value);
               fw.append('\n');
           }*/
           
           FileOutputStream fos = new FileOutputStream(new File(fileName));
           bw = new BufferedWriter(new OutputStreamWriter(fos));
           for(String value : this.customerInfoList){
               bw.write(value);
               bw.newLine();
           }
       }
       catch(Exception x){
           //display and log error
           throw x;
       }
       finally{
           if(bw != null){
               bw.close();
           }
       }
   }//end: saveToFile()
 
 }