/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: Aircraft.java
 * Author: Steve Jia
 * Creation: 2016-10-29
 * 
 * Changelog:
 * 
 */
public class Aircraft {
    
    private String aircraftName;
    private int passengerCapacity;
    private int flightRange;
    private int speed;
    private static int numberInFleet;
    private float purchasePrice;

    public Aircraft(String aircraftName, int passengerCapacity) {
        this.aircraftName = aircraftName;
        this.passengerCapacity = passengerCapacity;
    }
    
    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static int getNumberInFleet() {
        return numberInFleet;
    }

    public static void setNumberInFleet(int numberInFleet) {
        Aircraft.numberInFleet = numberInFleet;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    
}//end class Aircraft
