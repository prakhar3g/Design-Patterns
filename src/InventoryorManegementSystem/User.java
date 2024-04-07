package InventoryorManegementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String userId;
    private String userName;
    private Address address;
    private Cart cart;
    private List<String> orderIds;

    public User(String userName, Address address) {
        this.userId = UUID.randomUUID().toString();
        this.userName = userName;
        this.address = address;
        this.cart = new Cart();
        orderIds = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }

    public void addOrderId(String orderId) {
        orderIds.add(orderId);
    }
}
