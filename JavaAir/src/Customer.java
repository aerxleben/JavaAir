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
 
 public class Customer{
 
   private String firstName;
   private String lastName;
   private String dateOfBirth;
   private String gender;
   private String physicalAddress;
   private String addressCity;
   private String addressState;
   private String addressZipCode;
   private String emailAddress;
   private String password;
   
   public Customer(String newFirstName, String newLastName){
      this.firstName = newFirstName;
      this.lastName = newLastName;
   }
 
 }