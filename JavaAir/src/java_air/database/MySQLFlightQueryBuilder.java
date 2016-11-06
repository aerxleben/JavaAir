/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.database;

import java_air.main.Flight;

/**
 *
 * @author Rui Zhang
 */
public class MySQLFlightQueryBuilder implements FlightQueryBuilder{

    @Override
    public String buildQueryStrForSearchFlight(Flight flight) {
        String sql = "SELECT scheduledDepartureDate, scheduledArriveDate "
                + "FROM table_flight "
                + "WHERE "
                +"originAirport = '" + flight.getOriginAirport() + "' and "
                + "destinationAirport = '" + flight.getDestinationAirport() + "'";
               // + "originAirport = 'Chicago'"
               // + "and destinationAirport = 'NewYork'"; 
        return sql;
    }

    @Override
    public String buildQueryStrForAddFlight(Flight flight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String buildQueryStrForRemoveFlight(Flight flight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String buildQueryStrForUpdateFlight(Flight flight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
