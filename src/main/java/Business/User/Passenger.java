/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Flight.FlightSchedule;
import Business.Flight.Seat;

/**
 *
 * @author zhaoxi
 */
public class Passenger {
    private String firstName;
    private String lastName;
    private String id;
    private FlightSchedule fs;
    private Account account;
    private Seat seat;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public FlightSchedule getFs() {
        return fs;
    }

    public void setFs(FlightSchedule fs) {
        this.fs = fs;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

}
