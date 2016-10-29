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
    
    public Passenger(){
        
    }
    
    public String getFirstName(){ return this.firstName; }
    public String getLastName(){ return this.lastName; }
    public String getDateOfBirth(){ return this.dateOfBirth; }
    public String getGender(){ return this.gender; }
    public String getPhone(){ return this.phoneNumber; }
    public boolean getPrimaryStatus(){ return this.isPrimaryPassenger; }
    
    public void setFirstName(String newFirst){
        if(newFirst != null && !newFirst.isEmpty()){
            this.firstName = newFirst;
        }
    }
    
    public void setLastName(String newLast){
        if(newLast != null && !newLast.isEmpty()){
            this.lastName = newLast;
        }
    }
    
    public void setDateOfBirth(String newDate){
        if(newDate != null && !newDate.isEmpty()){
            this.dateOfBirth = newDate;
        }
    }
    
    public void setGender(String newGender){
        if(newGender != null && !newGender.isEmpty()){
            this.gender = newGender;
        }
    }
    
    public void setPhoneNumber(String newPhone){
        if(newPhone != null && !newPhone.isEmpty()){
            this.phoneNumber = newPhone;
        }
    }
    
    public void setPrimaryStatus(boolean newStatus){
        this.isPrimaryPassenger = newStatus;
    }
}
