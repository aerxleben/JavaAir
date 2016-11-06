
package java_air.database;

import java.sql.*;
import java.util.ArrayList;
import java_air.main.*;
import java_air.panel.reservation.*;
import javax.swing.JOptionPane;

public class DataClient {
    
    private static final String dbUrl = "jdbc:sqlite:java_air.db";
    
    public static Connection getConnection() 
            throws SQLException{
        Connection dbConnection = null;
        try{
            dbConnection = DriverManager.getConnection(dbUrl);
        }
        catch(SQLException e){
            throw e;
        }
        
        return dbConnection;
    }//end getConnection()
    
    
    public static ResultSet getData(String query) 
            throws Exception{
        ResultSet set = null;
        try{
            Connection c = getConnection();
            Statement stmt = c.createStatement();
            set = stmt.executeQuery(query);
            
            //stmt.close();
            //c.close();
        }//end try
        catch(Exception x){
            JOptionPane.showMessageDialog(null
                    ,x.getMessage()
                    ,"DB Select Error"
                    ,JOptionPane.ERROR_MESSAGE);
        }//end catch
        
        return set;
    }//end getData()
    
    public static void dbInsertOrUpdate(String query) throws Exception{
        try{
            Connection c = getConnection();
            Statement stmt = c.createStatement();
            int res = stmt.executeUpdate(query);
            
            if(res <= 0){ throw new Exception("No Rows Inserted/Updated"); }
            
            stmt.close();
            c.close();
        }
        catch(Exception x){
            JOptionPane.showMessageDialog(null
                    ,x.getMessage()
                    ,"DB Insert/Update Error"
                    ,JOptionPane.ERROR_MESSAGE);
        }
    }//get insertData()
    
    public static int getCount(String query) 
            throws Exception{
        ResultSet set = null;
        int count = 0;
        try{
            Connection c = getConnection();
            Statement stmt = c.createStatement();
            set = stmt.executeQuery(query);
            count = set.getInt(1);
            
            stmt.close();
            c.close();
        }//end try
        catch(Exception x){
            JOptionPane.showMessageDialog(null
                    ,x.getMessage()
                    ,"DB Select Error"
                    ,JOptionPane.ERROR_MESSAGE);
        }//end catch
        
        return count;
    }//end getData()
    
    
    public static ArrayList<Customer> getCustomerData(String query) 
            throws Exception{
        //ResultSet set = null;
        ArrayList<Customer> customerData = null;
        try{
            Connection c = getConnection();
            Statement stmt = c.createStatement();
            ResultSet set = stmt.executeQuery(query);
            
            customerData = new ArrayList<Customer>();
            
            while(set.next()){
                ArrayList<String> tempList = new ArrayList<String>();
                
                int customerId = set.getInt("CustomerID");
                
                tempList.add(set.getString("FirstName"));
                tempList.add(set.getString("LastName"));
                tempList.add(set.getString("DOB"));
                tempList.add(set.getString("Gender"));
                tempList.add(set.getString("Address"));
                tempList.add(set.getString("City"));
                tempList.add(set.getString("State"));
                tempList.add(set.getString("ZipCode"));
                tempList.add(set.getString("PhoneNumber"));
                tempList.add(set.getString("Email"));
                tempList.add(set.getString("Password"));
                
                int rewardPoints = set.getInt("RewardMiles");
                
                Customer tempCustomer = new Customer(tempList);
                tempCustomer.setCustomerId(customerId);
                tempCustomer.setRewardPoints(rewardPoints);
                
                customerData.add(tempCustomer);
            }
            
            set.close();
            stmt.close();
            c.close();
        }//end try
        catch(Exception x){
            JOptionPane.showMessageDialog(null
                    ,x.getMessage()
                    ,"DB Select Error"
                    ,JOptionPane.ERROR_MESSAGE);
        }//end catch
        
        return customerData;
    }//end getCustomerData()
    
    
    public static ArrayList<Flight> getFlightData(String query) 
            throws Exception{
        //ResultSet set = null;
        ArrayList<Flight> flightsList = null;
        try{
            Connection c = getConnection();
            Statement stmt = c.createStatement();
            ResultSet set = stmt.executeQuery(query);
            
            flightsList = new ArrayList<Flight>();
            
            while(set.next()){
                Flight tempFlight = new Flight(set.getString("FlightNumber")
                        , set.getString("OriginAirport")
                        , set.getString("DestinationAirport")
                        , set.getString("ScheduledDepartureTime")
                        , set.getString("ScheduledArriveTime"));
                
                tempFlight.setAircraftName(set.getString("AircraftType"));
                tempFlight.setTripMileage(set.getInt("FlightDistance"));
                tempFlight.setFlightDuration(Float.parseFloat(set.getString("FlightDuration")));
                
                flightsList.add(tempFlight);
            }
            
            set.close();
            stmt.close();
            c.close();
        }//end try
        catch(Exception x){
            JOptionPane.showMessageDialog(null
                    ,x.getMessage()
                    ,"DB Select Error"
                    ,JOptionPane.ERROR_MESSAGE);
        }//end catch
        
        return flightsList;
    }//end getFlightData()
    
    
    public static ArrayList<Reservation> getReservationData(String query) 
            throws Exception{
        //ResultSet set = null;
        ArrayList<Reservation> reservationList = null;
        try{
            Connection c = getConnection();
            Statement stmt = c.createStatement();
            ResultSet set = stmt.executeQuery(query);
            
            reservationList = new ArrayList<Reservation>();
            
            while(set.next()){
                
            }
            
            set.close();
            stmt.close();
            c.close();
        }//end try
        catch(Exception x){
            JOptionPane.showMessageDialog(null
                    ,x.getMessage()
                    ,"DB Select Error"
                    ,JOptionPane.ERROR_MESSAGE);
        }//end catch
        
        return reservationList;
    }//end getFlightData()
}
