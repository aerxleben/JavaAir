/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: Passenger.java
 * Author: Steve Jia
 * Creation: 2016-10-29
 * 
 * Changelog:
 * 
 */

public class Passenger {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String phoneNumber;
    private boolean isPrimaryPassenger;
    
    public Passenger(String firstName
            , String lastName
            , String dateOfBirth
            , String gender
            , String phoneNumber
            , boolean isPrimary) 
            throws Exception{
        try{
            setFirstName(firstName);
            setLastName(lastName);
            setDateOfBirth(dateOfBirth);
            setGender(gender);
            setPhoneNumber(phoneNumber);
            setPrimaryStatus(isPrimary);
        }
        catch(Exception x){
            throw x;
        }
        
    }
    
    public String getFirstName(){ return this.firstName; }
    public String getLastName(){ return this.lastName; }
    public String getDateOfBirth(){ return this.dateOfBirth; }
    public String getGender(){ return this.gender; }
    public String getPhone(){ return this.phoneNumber; }
    public boolean getPrimaryStatus(){ return this.isPrimaryPassenger; }
    
    public void setFirstName(String newFirst) throws Exception{
        if(newFirst != null && !newFirst.isEmpty()){
            this.firstName = newFirst;
        }
        else{
            throw new Exception("Invalid Passenger First Name");
        }
    }
    
    public void setLastName(String newLast) throws Exception{
        if(newLast != null && !newLast.isEmpty()){
            this.lastName = newLast;
        }
        else{
            throw new Exception("Invalid Passenger Last Name");
        }
    }
    
    public void setDateOfBirth(String newDate)throws Exception{
        if(newDate != null && !newDate.isEmpty()){
            this.dateOfBirth = newDate;
        }
        else{
            throw new Exception("Invalid Passenger Date Of Birth");
        }
    }
    
    public void setGender(String newGender)throws Exception{
        if(newGender != null && !newGender.isEmpty()){
            this.gender = newGender;
        }
        else{
            throw new Exception("Invalid Passenger Gender");
        }
    }
    
    public void setPhoneNumber(String newPhone)throws Exception{
        if(newPhone != null && !newPhone.isEmpty()){
            this.phoneNumber = newPhone;
        }
        else{
            throw new Exception("Invalid Passenger Phone Number");
        }
    }
    
    public void setPrimaryStatus(boolean newStatus)throws Exception{
        this.isPrimaryPassenger = newStatus;
    }
}
