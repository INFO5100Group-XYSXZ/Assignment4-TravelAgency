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
public class SeatList {

 private List<Seat> seatList ;
 
    public SeatList() {
        seatList = new ArrayList<Seat>();
        initial();
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    
    public void addSeat(Seat s){
        seatList.add(s);
    }
    
    private void initial(){
        for (int i = 1; i < 26; i++) {
            Seat seat1 = new Seat();
            Seat seat2 = new Seat();
            Seat seat3 = new Seat();
            Seat seat4 = new Seat();
            Seat seat5 = new Seat();
            Seat seat6 = new Seat();

            seat1.setSeat(i + "A");
            seat2.setSeat(i + "B");
            seat3.setSeat(i + "C");
            seat4.setSeat(i + "D");
            seat5.setSeat(i + "E");
            seat6.setSeat(i + "F");

            seatList.add(seat1);
            seatList.add(seat2);
            seatList.add(seat3);
            seatList.add(seat4);
            seatList.add(seat5);
            seatList.add(seat6);
        }
    }

    public int getIndex(String seat) {
        for (int i = 0; i < seatList.size() ; i++) {
            if (seat.equals(seatList.get(i).getSeat())) {
                return i;
            }
        }
        return -1;
    }
    
}
