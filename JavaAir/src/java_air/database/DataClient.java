
package java_air.database;

import java.sql.*;
import java.util.ArrayList;
import java_air.main.*;
import java_air.panel.reservation.*;
import javax.swing.JOptionPane;

public class DataClient {
    
    private final String dbUrl = "jdbc:sqlite:java_air.db";
    
    public Connection getConnection() 
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
    
    
    public ResultSet getData(String query) 
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
    
    public void dbInsertOrUpdate(String query) throws Exception{
        try{
            Connection c = getConnection();
            Statement stmt = c.createStatement();
            int res = stmt.executeUpdate(query);
            
            if(res <= 0){ throw new Exception("No Rows Inserted/Updated"); }
            
            stmt.close();
            c.close();
        }
        catch(Exception x){
            throw new Exception("DB Insert/Update Error; " + x.getMessage());
        }
    }//get insertData()
    
    public int getValidation(String query) 
            throws Exception{
        ResultSet set = null;
        int count = 1;
        try{
            Connection c = getConnection();
            Statement stmt = c.createStatement();
            set = stmt.executeQuery(query);
            /*
            if(set.next()){
                count = set.getInt(1);
            }
            */
            if(set.next()){
                count = 0;
            }
            stmt.close();
            c.close();
        }//end try
        catch(Exception x){
            throw new Exception("DB Select Int Error; " + x.getMessage());
        }//end catch
        
        return count;
    }
    public int getCount(String query) 
            throws Exception{
        ResultSet set = null;
        int count = 1;
        try{
            Connection c = getConnection();
            Statement stmt = c.createStatement();
            set = stmt.executeQuery(query);
            if(set.next()){
                count = set.getInt(1);
            }
            stmt.close();
            c.close();
        }//end try
        catch(Exception x){
            throw new Exception("DB Select Int Error; " + x.getMessage());
        }//end catch
        
        return count;
    }//end getData()
    
    
    public ArrayList<Customer> getCustomerData(String query) 
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
                
                int currentRewardPoints = set.getInt("CurrentRewardPoints");
                int totalRewardPoints = set.getInt("TotalRewardPoints");
                
                Customer tempCustomer = new Customer(tempList);
                tempCustomer.setCustomerId(customerId);
                tempCustomer.setCurrentRewardPoints(currentRewardPoints);
                tempCustomer.setTotalRewardPoints(totalRewardPoints);
                
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
    
    
    public ArrayList<Flight> getFlightData(String query) 
            throws Exception{
        //ResultSet set = null;
        ArrayList<Flight> flightsList = null;
        try{
            Connection c = getConnection();
            Statement stmt = c.createStatement();
            ResultSet set = stmt.executeQuery(query);
            
            flightsList = new ArrayList<Flight>();
            
            while(set.next()){
                flightsList.add(createFlight(set));
            }
            
            set.close();
            stmt.close();
            c.close();
        }//end try
        catch(Exception x){
            throw new Exception("DB Flight Selection Error; " + x.getMessage());
        }//end catch
        
        return flightsList;
    }//end getFlightData()
    
    
    public ArrayList<Reservation> getReservationData(String query) 
            throws Exception{
        //ResultSet set = null;
        ArrayList<Reservation> reservationList = null;
        try{
            Connection c = getConnection();
            Statement stmt = c.createStatement();
            ResultSet set = stmt.executeQuery(query);
            
            reservationList = new ArrayList<Reservation>();
            
            while(set.next()){
                Reservation tempReserv = new Reservation(set.getInt("ReservationNumber"));
                tempReserv.setOriginFlight(createFlight(set));
                tempReserv.setCheckedIn(set.getInt("CheckedIn")==1);
                tempReserv.setFlightOriginDatePrint(set.getString("DepartDate"));
                
                reservationList.add(tempReserv);
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
    
    private Flight createFlight(ResultSet set) throws Exception{
        Flight tempFlight = null;
        
        try{
            tempFlight = new Flight(set.getString("FlightNumber")
                        , set.getString("OriginAirport")
                        , set.getString("DestinationAirport")
                        , set.getString("ScheduledDepartureTime")
                        , set.getString("ScheduledArriveTime"));
                
            tempFlight.setAircraftName(set.getString("AircraftType"));
            tempFlight.setTripMileage(set.getInt("FlightDistance"));
            tempFlight.setFlightDuration(Float.parseFloat(set.getString("FlightDuration")));
        }
        catch(Exception x){
            throw new Exception("DataClient.createFlight(): " + x.getMessage());
        }//end try-catch
        
        return tempFlight;
    }//end createFlight
}
