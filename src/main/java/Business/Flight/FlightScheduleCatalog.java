/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Flight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhaoxi
 */
public class FlightScheduleCatalog {
    
    private List<FlightSchedule> flightScheduleCatelog;
    
    public FlightScheduleCatalog(){
        flightScheduleCatelog = new ArrayList<FlightSchedule>();
    }

    public List<FlightSchedule> getFlightScheduleCatelog() {
        return flightScheduleCatelog;
    }

    public void setFlightScheduleCatelog(List<FlightSchedule> flightScheduleCatelog) {
        this.flightScheduleCatelog = flightScheduleCatelog;
    }
    
    public FlightSchedule addFlight(){
        FlightSchedule flight = new FlightSchedule() ;
        flightScheduleCatelog.add(flight);
        return flight;
    }
}
