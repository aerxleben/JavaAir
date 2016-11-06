/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.database;

import java_air.main.Flight;

/**
 *
 * @author Georege
 */
public interface FlightQueryBuilder {
    abstract String buildQueryStrForSearchFlight(Flight flight);
    abstract String buildQueryStrForAddFlight(Flight flight);
    abstract String buildQueryStrForRemoveFlight(Flight flight);
    abstract String buildQueryStrForUpdateFlight(Flight flight);
}
