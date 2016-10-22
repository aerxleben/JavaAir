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

import javax.swing.JOptionPane;
 
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
   
   private final String notApplicable = "N/A";
   
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
       return(validCustomerAttribute(0) ? notApplicable : this.customerInfoList.get(0));
   }
   
   public String getLastName(){
       //return (this.lastName == null ? notApplicable : this.firstName);
       return(validCustomerAttribute(1) ? notApplicable : this.customerInfoList.get(1));
         
   }
   
   public String getDateOfBirth(){
       //return (this.dateOfBirth == null ? notApplicable : this.dateOfBirth);
       return(validCustomerAttribute(2) ? notApplicable : this.customerInfoList.get(2));
   }
   
   public String getGender(){
       //return (this.gender == null ? notApplicable : this.gender);
       return(validCustomerAttribute(3) ? notApplicable : this.customerInfoList.get(3));
   }
   
   public String getPhysicalAddress(){
       //return (this.physicalAddress == null ? notApplicable : this.physicalAddress);
       return(validCustomerAttribute(4) ? notApplicable : this.customerInfoList.get(4));
   }
   
   public String getAddressCity(){
       //return (this.addressCity == null ? notApplicable : this.addressCity);
       return(validCustomerAttribute(5) ? notApplicable : this.customerInfoList.get(5));
   }
   
   public String getAddressState(){
       //return (this.addressState == null ? notApplicable : this.addressState);
       return(validCustomerAttribute(6) ? notApplicable : this.customerInfoList.get(6));
   }
   
   public String getAddressZipCode(){
       //return (this.addressZipCode == null ? notApplicable : this.addressZipCode);
       return(validCustomerAttribute(7) ? notApplicable : this.customerInfoList.get(7));
   }
   
   public String getPhoneNumber(){
       //return(this.phoneNumber == null ? notApplicable : this.phoneNumber);
       return(validCustomerAttribute(8) ? notApplicable : this.customerInfoList.get(8));
   }
   
   public String getEmailAddress(){
       //return (this.emailAddress == null ? notApplicable : this.emailAddress);
       return(validCustomerAttribute(9) ? notApplicable : this.customerInfoList.get(9));
   }
   
   public void setFirstName(String newFirstName) throws Exception{
       if(newFirstName == null || !setCustomerAttribute(0, newFirstName)){
           //this.firstName = newFirstName;
           throw new Exception("Setting Customer Value Error; Incorrect First Name");
       }
   }
   
   public void setLastName(String newLastName) throws Exception{
       if(newLastName == null || !setCustomerAttribute(1, newLastName)){
           throw new Exception("Setting Customer Value Error; Incorrect Last Name");
       }
   }
   
   public void setDateOfBirth(String newDateOfBirth) throws Exception{
	   if(newDateOfBirth != null){
		   this.dateOfBirth = newDateOfBirth;
	   }
	   else{
		   throw new Exception("Setting Customer Value Error; Incorrect DOB");
	   }
   }
   
   public void setGender(String newGender) throws Exception{
	   if(newGender != null){
		   this.gender = newGender;
	   }
	   else{
		   throw new Exception("Setting Customer Value Error; Incorrect Gender");
	   }
   }
   
   public void setPhysicalAddress(String newPhysicalAddress) throws Exception{
	   if(newPhysicalAddress != null){
		   this.physicalAddress = newPhysicalAddress;
	   }
	   else{
		   throw new Exception("Setting Customer Value Error; Incorrect Physical Address");
	   }
   }
   
   public void setAddressCity(String newCity) throws Exception{
	   if(newCity != null){
		   this.addressCity = newCity;
	   }
	   else{
		   throw new Exception("Setting Customer Value Error; Incorrect City Name");
	   }
   }
   
   public void setAddressState(String newState) throws Exception{
	   if(newState != null){
		   this.addressState = newState;
	   }
	   else{
		   throw new Exception("Setting Customer Value Error; Incorrect State Name");
	   }
   }
   
   public void setAddressZipCode(String newZipCode) throws Exception{
	   if(newZipCode != null){
		   this.addressZipCode = newZipCode;
	   }
	   else{
		   throw new Exception("Setting Customer Value Error; Incorrect Zip Code");
	   }
   }
   
   public void setPhoneNumber(String newPhoneNumber) throws Exception{
       if(newPhoneNumber != null){
           this.phoneNumber = newPhoneNumber;
       }
       else{
           throw new Exception("Setting Customer Value Error; Incorrect Phone Number");
       }
   }
   
   public void setEmailAddress(String newEmail) throws Exception{
	   if(newEmail != null){
		   this.emailAddress = newEmail;
	   }
	   else{
		   throw new Exception("Setting Customer Value Error; Incorrect Email Address");
	   }
   }
   
   public void setPassword(String newPassword) throws Exception{
	   if(newPassword != null){
		   this.password = newPassword;
	   }
	   else{
		   throw new Exception("Setting Customer Value Error; Incorrect Password");
	   }
   }
   
   private void saveCustomerInfo() throws Exception{
       
   }
   
   private static void loadCustomerInfo() throws Exception{
       
   }
 
 }