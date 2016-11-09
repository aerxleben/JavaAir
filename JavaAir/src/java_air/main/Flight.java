package java_air.main;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: Flight.java
 * Author: Steve Jia
 * Creation: 2016-10-22
 * 
 * Changelog:
 * 
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Flight{

    public Flight() {
    }

    public enum FlightStatus{ DELAYED, ONTIME, EARLY }
    
    private String flightNumber;
    private String aircraftName;
    private String originAirport;
    private String destinationAirport;
    private String scheduledDeparture;
    private String scheduledArrival;
    private String actualDeparture;
    private String actualArrival;
    private int tripMileage;
    private float flightDuration;
    private FlightStatus flightStatus;
    private int totalCheckedBags;
    private double flightCost;
    
    private final SimpleDateFormat sdf = 
            new SimpleDateFormat("yyyy-MM-dd HH:mm");
    
    //Flight Constructor
    public Flight(String flightNumber
            , String originAirport
            , String destinationAirport
            , String scheduledDeparture
            , String scheduledArrival) 
            throws Exception{
        try{
            this.flightNumber = flightNumber;
            this.originAirport = originAirport;
            this.destinationAirport = destinationAirport;
            //this.scheduledDeparture = sdf.parse(scheduledDeparture);
            this.scheduledDeparture = scheduledDeparture;
            //this.scheduledArrival = sdf.parse(scheduledArrival);
            this.scheduledArrival = scheduledArrival;
        }
        catch(Exception x){
            throw x;
        }
    }//end constructor
    
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public String getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(String originAirport) {
        this.originAirport = originAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getScheduledDeparture() {
        return scheduledDeparture;
        //return sdf.format(scheduledDeparture);
    }

    public void setScheduledDeparture(String scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }

    public String getScheduledArrival() {
        return scheduledArrival;
        //return sdf.format(scheduledArrival);
    }

    public void setScheduledArrival(String scheduledArrival) {
        this.scheduledArrival = scheduledArrival;
    }

    public String getActualDeparture() {
        return actualDeparture;
        //return sdf.format(actualDeparture);
    }

    public void setActualDeparture(String actualDeparture) {
        this.actualDeparture = actualDeparture;
    }

    public String getActualArrival() {
        return actualArrival;
        //return sdf.format(actualArrival);
    }

    public void setActualArrival(String actualArrival) {
        this.actualArrival = actualArrival;
    }

    public int getTripMileage() {
        return tripMileage;
    }

    public void setTripMileage(int tripMileage) {
        this.tripMileage = tripMileage;
        this.flightCost = tripMileage * 0.24;
    }
    
    public double getFlightCost(){
        return this.flightCost;
    }

    public float getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(float flightDuration) {
        this.flightDuration = flightDuration;
    }
    
    public FlightStatus getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(FlightStatus flightStatus) {
        this.flightStatus = flightStatus;
    }

    public int getTotalCheckedBags() {
        return totalCheckedBags;
    }

    public void setTotalCheckedBags(int totalCheckedBags) {
        this.totalCheckedBags = totalCheckedBags;
    }
    
    private void generateRandomDelay(){
        Random rand = new Random();
        //random delay in minutes
        int randomDelay = rand.nextInt(120) - 30;
        
        //set the flight status
        if(randomDelay <= 10 && randomDelay >= 0){
            setFlightStatus(FlightStatus.ONTIME);
        }
        else if(randomDelay > 10){
            setFlightStatus(FlightStatus.DELAYED);
        }
        else{
            setFlightStatus(FlightStatus.EARLY);
        }
        
        //update actual times
        //this.actualDeparture = updateTime(randomDelay);
        //this.actualArrival = updateTime(randomDelay);
    }//end generateRandomDelay
    
    private Date updateTime(int timeToAdjust){
        long oneMinuteInMillis = 60000; //milliseconds
        Calendar date = Calendar.getInstance();
        long time = date.getTimeInMillis();
        return(new Date(time + (timeToAdjust * oneMinuteInMillis)));
    }//end updateTime
}
