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
public interface IFlightDAO {
     abstract Flight searchFlight(Flight flight);
     abstract boolean addFlight(Flight flight);
     abstract boolean removeFlight(Flight flight);
     abstract boolean updateFlight(Flight flight);
     //abstract void connectionDB()
}
