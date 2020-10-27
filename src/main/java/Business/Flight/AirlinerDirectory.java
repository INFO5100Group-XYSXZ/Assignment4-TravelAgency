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
public class AirlinerDirectory {
    
    private List<Airliner> alinerDirectory;
    
    public AirlinerDirectory(){
        alinerDirectory = new ArrayList<Airliner>();
//        Airliner a = new Airliner("Delta");
//        alinerDirectory.add(a);
//        a.getFleet().addAirplane("BOEING-B747");
    }

    public List<Airliner> getAirlinerDirectory() {
        return alinerDirectory;
    }
    
    public Airliner addAirliner(){
        Airliner a = new Airliner();
        alinerDirectory.add(a);
        return a;
    }
    
    public void removeAirliner(Airliner a){
        alinerDirectory.remove(a);
    }
}
