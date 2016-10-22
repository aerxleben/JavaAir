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
   private String firstName;		//index 0
   private String lastName;             //index 1
   private String dateOfBirth;		//index 2
   private String gender;		//index 3
   private String physicalAddress;	//index 4
   private String addressCity;		//index 5
   private String addressState;		//index 6
   private String addressZipCode;	//index 7
   private String phoneNumber;          //index 8
   private String emailAddress;		//index 9
   private String password;		//index 10
   
   private final String notApplicable = "N/A";
   
   public Customer(String newFirstName, String newLastName){
      this.firstName = newFirstName;
      this.lastName = newLastName;
   }
   
   public Customer(ArrayList<String> newCustomerInfoList) throws Exception{
      if(newCustomerInfoList.size() != 11){
    	  throw new Exception("Customer Creation Error; Incorrect Structure Size");    	  
      }
      
      this.customerInfoList =  newCustomerInfoList;
   }
   
   public String getFirstName(){
	   return (this.firstName == null ? notApplicable : this.firstName);
   }
   
   public String getLastName(){
	   return (this.lastName == null ? notApplicable : this.firstName);
   }
   
   public String getDateOfBirth(){
	   return (this.dateOfBirth == null ? notApplicable : this.dateOfBirth);
   }
   
   public String getGender(){
	   return (this.gender == null ? notApplicable : this.gender);
   }
   
   public String getPhysicalAddress(){
	   return (this.physicalAddress == null ? notApplicable : this.physicalAddress);
   }
   
   public String getAddressCity(){
	   return (this.addressCity == null ? notApplicable : this.addressCity);
   }
   
   public String getAddressState(){
	   return (this.addressState == null ? notApplicable : this.addressState);
   }
   
   public String getAddressZipCode(){
	   return (this.addressZipCode == null ? notApplicable : this.addressZipCode);
   }
   
   public String getPhoneNumber(){
       return(this.phoneNumber == null ? notApplicable : this.phoneNumber);
   }
   
   public String getEmailAddress(){
	   return (this.emailAddress == null ? notApplicable : this.emailAddress);
   }
   
   public void setFirstName(String newFirstName) throws Exception{
	   if(newFirstName != null){
		   this.firstName = newFirstName;
	   }
	   else{
		   throw new Exception("Setting Customer Value Error; Incorrect First Name");
	   }
   }
   
   public void setLastName(String newLastName) throws Exception{
	   if(newLastName != null){
		   this.lastName = newLastName;
	   }
	   else{
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
 
 }