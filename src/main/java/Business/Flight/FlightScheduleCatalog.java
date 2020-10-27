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
    
    private List<FlightSchedule> flightScheduleCatalog;
    
    public FlightScheduleCatalog(){
        flightScheduleCatalog = new ArrayList<FlightSchedule>();
    }

    public List<FlightSchedule> getFlightScheduleCatalog() {
        return flightScheduleCatalog;
    }

    public void setFlightScheduleCatelog(List<FlightSchedule> flightScheduleCatelog) {
        this.flightScheduleCatalog = flightScheduleCatelog;
    }
    
    public FlightSchedule addFlight(){
        FlightSchedule flightschedule = new FlightSchedule() ;
        flightScheduleCatalog.add(flightschedule);
        return flightschedule;
    }
    
    public void removeFlight(FlightSchedule fs){
        flightScheduleCatalog.remove(fs);
    }
}
