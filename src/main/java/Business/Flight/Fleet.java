/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Flight;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author suoxiyue
 */
public class Fleet {
    
    private List<Airplane> fleet;
    
    public Fleet(){
        fleet = new ArrayList<Airplane>();
    }

    public List<Airplane> getFleet() {
        return fleet;
    }
    
    public Airplane addAirplane(){
        Airplane a = new Airplane();
        fleet.add(a);
        return a;
    }
    
}
