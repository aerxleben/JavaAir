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
 * 
 */

import java.util.ArrayList;
import java_air.main.Flight;
import java_air.main.Passenger;

public class Reservation {
    
    public static enum PaymentType{ CREDIT, REWARD }
    public static enum ReservationStatus { NORMAL, CANCELLED }
    
    private boolean isRoundTrip;
    private Flight originFlight;
    private Flight returnFlight;
    private ArrayList<Passenger> passengerList;
    private int numberOfCheckedBags;
    private PaymentType paymentType;
    private int pointsRedeemed;
    private float amountPaid;
    private String billingAddress;
    private String billingPhone;
    private String billingEmail;
    private ReservationStatus status;
    
    public Reservation(boolean isRoundTrip){
        this.isRoundTrip = isRoundTrip;
        this.passengerList = new ArrayList<Passenger>();
        this.status = ReservationStatus.NORMAL;
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
        if(!isRoundTrip){ this.returnFlight = returnFlight; }
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
    
    
}
