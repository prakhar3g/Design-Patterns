package InventoryorManegementSystem;

import java.util.ArrayList;
import java.util.List;

public class OrderController {
    List<Order> orders;

    public OrderController() {
        orders = new ArrayList<>();
    }

    public Order createNewOrder(User user,Warehouse warehouse) {
        Order order = new Order(user,warehouse);
        orders.add(order);
        return order;
    }



    public void removeOrder(Order order) {
        orders.remove(order);
    }
}
