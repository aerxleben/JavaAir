package java_air.panel.reservation;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: Reservation.java
 * Author: Steve Jia 
 * Creation: 2016-10-29
 * 
 * Changelog:
 * 1. change getAmountPaid()
 */

import java.util.ArrayList;
import java_air.database.DataClient;
import java_air.main.Flight;
import java_air.main.Global;
import java_air.main.Passenger;
import javax.swing.JOptionPane;

public class Reservation {
    
    public static enum PaymentType{ CREDIT, REWARD }
    public static enum ReservationStatus { NORMAL, CANCELLED }
    
    private int reservationNumber;
    private boolean isRoundTrip;
    private Flight originFlight;
    private Flight returnFlight;
    private ArrayList<Passenger> passengerList;
    private int numberOfCheckedBags;
    private int numberOfPassenger;
    private PaymentType paymentType;
    private int pointsRedeemed;
    private float amountPaid;
    private String billingAddress;
    private String billingPhone;
    private String billingEmail;
    private ReservationStatus status;
    private String flightOriginDatePrint;
    private String flightReturnDatePrint;
    private String paymentFirstName;
    private String paymentLastName;
    private String paymentCardNumber;
    private PriceCalculator priceCalulator;
    private boolean isCheckedIn;
    
    /*Constructor 1*/
    public Reservation(boolean isRoundTrip){
        this.isRoundTrip = isRoundTrip;
        this.passengerList = new ArrayList<Passenger>();
        this.status = ReservationStatus.NORMAL;
    }
    
    /*Constructor 2*/
    public Reservation(int reservNum){
        this.reservationNumber = reservNum;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }
    
    public void setPriceCalculator(PriceCalculator priceCalulator){
        this.priceCalulator = priceCalulator;
    }
    
    public PriceCalculator getPriceCalcuator(){
        return priceCalulator;
    }
    
    public void setPaymentFirstName(String paymentFirstName){
        this.paymentFirstName = paymentFirstName;
    }
    
    public String getPaymentFirstName(){
        return paymentFirstName;
    }
    
    public void setPaymentLastName(String paymentLastName){
        this.paymentLastName = paymentLastName;
    }
    
    public String getPaymentLastName(){
        return paymentLastName;
    }
    
    public void setPaymentCardNumber(String paymentCardNumber){
        this.paymentCardNumber = paymentCardNumber;
    }
    
    public String getPaymentCardNumber(){
        return paymentCardNumber;
    }
    
    public void setFlightOriginDatePrint(String flightOriginDatePrint){
        this.flightOriginDatePrint =flightOriginDatePrint;
    }
    
    public String getFlightOriginDatePrint(){
        return flightOriginDatePrint;
    }
    
    public void setFlightReturnDatePrint(String flightReturnDatePrint){
        this.flightReturnDatePrint =flightReturnDatePrint;
    }
    
    public String getFlightReturnDatePrint(){
        return flightReturnDatePrint;
    }
    
    public void setNumberOfPassenger(int numOfPassenger){
        numberOfPassenger = numOfPassenger;
    }
    
    public int getNumberOfPassenger(){
        return numberOfPassenger;
    }
    
    public boolean getIsRoundTrip(){
        return isRoundTrip;
    }
    
    public Flight getOriginFlight() {
        return originFlight;
    }

    public void setOriginFlight(Flight originFlight) {
        this.originFlight = originFlight;
    }

    public Flight getReturnFlight() {
        return returnFlight;
    }

    public void setReturnFlight(Flight returnFlight) {
        if(isRoundTrip){ this.returnFlight = returnFlight; }
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(ArrayList<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public int getNumberOfCheckedBags() {
        return numberOfCheckedBags;
    }

    public void setNumberOfCheckedBags(int numberOfCheckedBags) {
        this.numberOfCheckedBags = numberOfCheckedBags;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public int getPointsRedeemed() {
        return pointsRedeemed;
    }

    public void setPointsRedeemed(int pointsRedeemed) {
        this.pointsRedeemed = pointsRedeemed;
    }

    public float getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(float amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingPhone() {
        return billingPhone;
    }

    public void setBillingPhone(String billingPhone) {
        this.billingPhone = billingPhone;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    public void setCheckedIn(boolean isCheckedIn) {
        this.isCheckedIn = isCheckedIn;
    }

    public boolean saveReservationToDB() throws Exception{
        boolean result = false;
        try{
            /*first need to check passengers in DB
            if a passenger's name is not in the DB, we need to create
            the record and obtain the CustomerID; otherwise just get
            the customerID; store the customerIDs in a list
            */
            ArrayList<Integer> customerIdList = new ArrayList<Integer>();
            for(Passenger p : this.passengerList){
                int tempId = getCustomerId(p);
                
                if(tempId <= 0){
                    //no record found
                    tempId = savePassengerInfo(p);
                }
                
                if(tempId > 0){
                    customerIdList.add(tempId);
                }
                else{
                    throw new Exception("Invalid CustomerID " + tempId);
                }
            }//end for-loop

            /*insert the record into DB
                if this reservation used points, deduct the amount from
                customer's account
                if a partial cash payment is used, calculat points earned
                and add to customer account
            */
            insertReservationInfo(customerIdList);
            updateRewards();
            JOptionPane.showMessageDialog(null, "Reservation Completed Successfully!");
            result = true;
        }
        catch(Exception x){
            throw x;
        }//end try-catch
        return result;
    }//end saveReservationToDB
    
    private int getCustomerId(Passenger p){
        int newId = 0;
        
        String queryGetId = "SELECT CustomerID FROM Customers " +
                    "WHERE FirstName = '" + p.getFirstName() + "' " +
                    "AND LastName = '" + p.getLastName() + "' LIMIT 1";
        try{
            newId = new DataClient().getCount(queryGetId);
        }
        catch(Exception x){
            JOptionPane.showMessageDialog(null
                ,x.getMessage()
                ,"DB CustomerID Error"
                ,JOptionPane.ERROR_MESSAGE);
        }//end try-catch
        
        return newId;
    }//end getCustomerId()
    
    private int savePassengerInfo(Passenger p){
        int newId = 0;
        String queryAddPassenger = "INSERT INTO CUSTOMERS " + 
                    "(FIRSTNAME, LASTNAME, DOB, GENDER, " + 
                    "ADDRESS, CITY, STATE, ZIPCODE, PHONENUMBER, " +
                    "EMAIL, PASSWORD, CURRENTREWARDPOINTS, TOTALREWARDPOINTS)" + 
                    "VALUES " + 
                    "('" + p.getFirstName() + "', " +
                    "'" + p.getLastName() + "', " +
                    "'" + p.getDateOfBirth() + "', " +
                    "'" + p.getGender() + "', " +
                    "' ', " +   //address
                    "' ', " +   //city
                    "' ', " +   //state
                    "' ', " +   //zip
                    "'" + p.getPhone() + "', " +
                    "'" + p.getFirstName()+ p.getLastName() + "@javaair.com', " +
                    "'12345', " +
                    "0, 0)";
        try{
            new DataClient().dbInsertOrUpdate(queryAddPassenger);
            
            newId = getCustomerId(p);
        }
        catch(Exception x){
            JOptionPane.showMessageDialog(null
                ,x.getMessage()
                ,"DB Add Passenger Error"
                ,JOptionPane.ERROR_MESSAGE);
        }//end try-catch
        
        return newId;
    }//end savePassengerInfo()
    
    private void insertReservationInfo(ArrayList<Integer> idList){
        try{
            String queryReservNum = 
                    "SELECT MAX(ReservationNumber)+1 AS NextNumber FROM Reservations";
            int reservNum = new DataClient().getCount(queryReservNum);
            if(reservNum <= 1){ throw new Exception("Invalid Reservation Number " + reservNum); }
            
            String queryReserv = "INSERT INTO Reservations " +
                    "(ReservationNumber, FlightNumber, DepartDateTime, " +
                    "ArrivalDateTime, Status, CustomerID, CustomerID2, " +
                    "CustomerID3, Cost, CashPaid, RewardsUsed, CheckedIn, " +
                    "CardNumber) " +
                    "VALUES " +
                    "(" + reservNum + ", " +
                    "'" + this.originFlight.getFlightNumber() + "', " +
                    "'" + this.flightOriginDatePrint + "', " +
                    "'" + this.flightOriginDatePrint + "', " +
                    "'Normal', " + (idList.size() > 0 ? idList.get(0) : 0) + ", " +
                    (idList.size() > 1 ? idList.get(1) : 0) + ", " +
                    (idList.size() > 2 ? idList.get(2) : 0) + ", " + 
                    this.originFlight.getFlightCost() + ", " +
                    this.getPriceCalcuator().getTotalFeeValue() + ", " + 
                    this.getPriceCalcuator().getRewardRedeemValue() + ", 0, '" +
                    this.paymentCardNumber + "')";
            
            new DataClient().dbInsertOrUpdate(queryReserv);
            
            if(this.isRoundTrip){
                String queryReserv2 = "INSERT INTO Reservations " +
                    "(ReservationNumber, FlightNumber, DepartDateTime, " +
                    "ArrivalDateTime, Status, CustomerID, CustomerID2, " +
                    "CustomerID3, Cost, CashPaid, RewardsUsed, CheckedIn, " +
                    "CardNumber) " +
                    "VALUES " +
                    "(" + reservNum + ", " +
                    "'" + this.returnFlight.getFlightNumber() + "', " +
                    "'" + this.flightReturnDatePrint + "', " +
                    "'" + this.flightReturnDatePrint + "', " +
                    "'Normal', " + (idList.size() > 0 ? idList.get(0) : 0) + ", " +
                    (idList.size() > 1 ? idList.get(1) : 0) + ", " +
                    (idList.size() > 2 ? idList.get(2) : 0) + ", " +
                    this.returnFlight.getFlightCost() + ", " +
                    this.getPriceCalcuator().getTotalFeeValue() + ", " + 
                    this.getPriceCalcuator().getRewardRedeemValue() + ", 0, '" +
                    this.paymentCardNumber + "')";
                
                new DataClient().dbInsertOrUpdate(queryReserv2);
            }//end if
        }
        catch(Exception x){
            JOptionPane.showMessageDialog(null
                ,x.getMessage()
                ,"DB Insert Reserv Error"
                ,JOptionPane.ERROR_MESSAGE);
        }//end try-catch
    }//end insertReservationInfo()
    
    private void updateRewards() throws Exception{
        if(Global.currentCustomer == null){ return; }
        
        PriceCalculator pc = this.getPriceCalcuator();
        double pointsEarned 
                = pc.getTotalFeeValue() * pc.getCashRate();
        double netPoints
                = (pc.getRewardRedeemValue() * -1) + pointsEarned;
        
        int currentPoints = Global.currentCustomer.getCurrentRewardPoints() + 
                new Double(netPoints).intValue();
        int totalPoints = Global.currentCustomer.getTotalRewardPoints() +
                new Double(pointsEarned).intValue();
        
        String queryRewards = "UPDATE Customers " +
                "SET CurrentRewardPoints = " + currentPoints +
                ", TotalRewardPoints = " + totalPoints + " " +
                "WHERE CustomerID = " + 
                Global.currentCustomer.getCustomerID() + " " +
                "AND FirstName = '" + 
                Global.currentCustomer.getFirstName() + "' " +
                "AND LastName = '" + Global.currentCustomer.getLastName() + "'";
        
        try{
            new DataClient().dbInsertOrUpdate(queryRewards);
            
            Global.currentCustomer.setCurrentRewardPoints(currentPoints);
            Global.currentCustomer.setTotalRewardPoints(totalPoints);
        }
        catch(Exception x){
            throw x;
        }
    }//end updateRewards()
    
}//end class Reservation
