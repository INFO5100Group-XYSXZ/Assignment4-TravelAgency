/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Flight.FlightSchedule;
import Business.User.Account;
import Business.User.Passenger;

/**
 *
 * @author zhaoxi
 */
public class Order {
    private Account account;
    private Passenger passenger;
    private FlightSchedule flight;
    private int orderNumber;
    private String orderDate;
    private static int count;
    
    
    
    public Order(){
        count++;
        orderNumber = count;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public FlightSchedule getFlight() {
        return flight;
    }

    public void setFlight(FlightSchedule flight) {
        this.flight = flight;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }
    
        public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    
    @Override
    public String toString(){
        return Integer.toString(orderNumber);
    }
}
