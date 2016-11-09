package java_air.main;

/* 
 * CS5900 - Software Engineering
 * Professor: Dr. Ruijian Zhang
 * Project: Java Air
 * Team: Avian Limited
 * 
 * Filename: ReservationsScrollPanel.java
 * Author: Amy Erxleben
 * Creation: 2016-11-02
 * 
 * Changelog:
 * 
 */
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java_air.database.DataClient;
import java_air.panel.reservation.Reservation;
import javax.swing.*;

public class ReservationsScrollPanel extends JPanel{
    
    private JScrollPane scrollPane;
    private JPanel panel;
    
    public ReservationsScrollPanel() {
        this.setOpaque(false);
        BoxLayout layout = new BoxLayout(this,BoxLayout.Y_AXIS); 
        this.setLayout(layout);
        
        /*for(int i=1;i<5;i++){
            ReservationInfoPanel aReservationInfoPanel = new ReservationInfoPanel();
            add(aReservationInfoPanel);
        }*/
    }//end constructor
    
    public void loadReservations(){
        //check to make sure logged in
        if(Global.currentCustomer == null){
            JOptionPane.showMessageDialog(null
                    , "No Currently Logged In Customer"
                    , "Must Be Logged In"
                    , JOptionPane.WARNING_MESSAGE);
            Global.switchCard(Global.textLogin);
        }
        
        //get a list of reservations from db
        String query = "SELECT R.TICKETID AS TicketID" +
                ", R.RESERVATIONNUMBER AS ReservationNumber" +
                ", R.FLIGHTNUMBER AS FlightNumber" +
                ", F.ORIGINAIRPORT AS OriginAirport" +
                ", F.DESTINATIONAIRPORT AS DestinationAirport" +
                ", R.DEPARTDATETIME AS DepartDate" +
                ", R.ARRIVALDATETIME AS ArrivalDate" +
                ", F.SCHEDULEDDEPARTURETIME AS ScheduledDepartureTime" +
                ", F.SCHEDULEDARRIVETIME AS ScheduledArriveTime" +
                ", F.AIRCRAFTTYPE AS AircraftType" +
                ", F.FLIGHTDISTANCE AS FlightDistance" +
                ", F.FLIGHTDURATION AS FlightDuration" +
                ", R.CUSTOMERID AS CustomerID" +
                ", R.COST AS Cost" +
                ", R.CASHPAID AS CashPaid" +
                ", R.REWARDSUSED AS RewardsUsed " +
                "FROM RESERVATIONS R INNER JOIN FLIGHTS F " +
                "ON R.FLIGHTNUMBER = F.FLIGHTNUMBER " +
                "WHERE R.CUSTOMERID = " + Global.currentCustomer.getCustomerID();
        
        ArrayList<Reservation> reservList = null;
        try{
            reservList = new DataClient().getReservationData(query);
        }
        catch(Exception x){
            return;
        }//end try-catch
        
        if(reservList != null && !reservList.isEmpty()){
            for(Reservation reserv : reservList){
                //ReservationInfoPanel infoPanel = new ReservationInfoPanel(reserv);
                //add(infoPanel);
            }//end for loop
        }//end if
    }//end loadReservations()
    
}//end class ReservationScrollPanel