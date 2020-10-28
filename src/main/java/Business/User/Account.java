/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Order.Order;
import Business.Order.OrderList;

/**
 *
 * @author zhaoxi
 */
public class Account {
    private String userName;
    private String passWord;
    private PassengerDirectory passengerDir;
    private OrderList orderList;
    private String accountCreatDate;


    public Account() {
        passengerDir = new PassengerDirectory();
        orderList = new OrderList();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public PassengerDirectory getPassengerDir() {
        return passengerDir;
    }

    public void setPassengerDir(PassengerDirectory passengerDir) {
        this.passengerDir = passengerDir;
    }

    public OrderList getOrderList() {
        return orderList;
    }

    public void setOrderList(OrderList orderList) {
        this.orderList = orderList;
    }
    
    public Passenger addPassenger(){
        Passenger p = new Passenger();
        passengerDir.getPassengerDir().add(p);
        return p;
    }
    
    public Order addOrder(){
        Order o = new Order();
        orderList.getOrderList().add(o);
        return o;
    }
    
    public String getAccountCreatDate() {
        return accountCreatDate;
    }

    public void setAccountCreatDate(String accountCreatDate) {
        this.accountCreatDate = accountCreatDate;
    }
    
    @Override
    public String toString(){
        return userName;
    }
    
}
