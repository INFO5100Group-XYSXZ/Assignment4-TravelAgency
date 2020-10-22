/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Flight;

/**
 *
 * @author zhaoxi
 */
public class Airliner {
    private String airlinerName;
    private Fleet fleet;
    private FlightScheduleCatalog flightScheduleCatalog;
    
    public Airliner() {
        fleet = new Fleet();
        flightScheduleCatalog = new FlightScheduleCatalog();
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public Fleet getFleet() {
        return fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

    public FlightScheduleCatalog getFlightScheduleCatalog() {
        return flightScheduleCatalog;
    }

    public void setFlightScheduleCatalog(FlightScheduleCatalog flightScheduleCatalog) {
        this.flightScheduleCatalog = flightScheduleCatalog;
    }
    
    public String toString() {
        return airlinerName;
    }
}
