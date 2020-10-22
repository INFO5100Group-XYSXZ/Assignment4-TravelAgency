/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhaoxi
 */
public class PassengerDirectory {
    private List<Passenger> passengerDir;
    
    public PassengerDirectory(){
        passengerDir = new ArrayList<Passenger>();
    }

    public List<Passenger> getPassengerDir() {
        return passengerDir;
    }

    public void setPassengerDir(List<Passenger> passengerDir) {
        this.passengerDir = passengerDir;
    }

    
    public Passenger addPassenger(){
        Passenger p = new Passenger();
        passengerDir.add(p);
        return p;
    }
}
