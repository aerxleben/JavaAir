/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_air.main.Flight;

/**
 *
 * @author Rui Zhang
 */
public class FlightDAO implements IFlightDAO{
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    
    public Flight searchFlight(Flight flight) {
       //Flight tempFlight = new Flight();
        
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Connection conn = DataClient.getConnection();
            stmt = conn.createStatement();
            MySQLFlightQueryBuilder mySQL = new MySQLFlightQueryBuilder();
            String sql = mySQL.buildQueryStrForSearchFlight(flight);
            rs = stmt.executeQuery(sql); 
            // loop through the result set
            while (rs.next()) {
              //  flight.setScheduledDeparture(simpleDateFormat.parse(rs.getString("scheduledDepartureDate")));
            }
            return flight;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally{
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FlightDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(FlightDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
        return null;
    }
        
    

    @Override
    public boolean addFlight(Flight flight) {
        return false;
    }

    @Override
    public boolean removeFlight(Flight flight) {
       return false;
    }

    @Override
    public boolean updateFlight(Flight flight) {
       return false; 
    }
    
}
