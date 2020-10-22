/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author zhaoxi
 */
public class OrderList {
    private List<Order> orderList;
    
    public OrderList(){
        orderList = new ArrayList<Order>();
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
    
    public Order addOrder(){
        Order order = new Order();
        orderList.add(order);
        return order;
    }
    
    public void deleteOrder(Order order){
        orderList.remove(order);
    }
            
            
}
