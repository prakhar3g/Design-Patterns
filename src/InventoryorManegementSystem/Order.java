package InventoryorManegementSystem;

import java.util.Map;

public class Order {
    private String orderId;
    private Map<String,Integer> productIdVsCount;
    private User user;
    private Warehouse warehouse;
    private Invoice invoice;
    private Payment payment;
    private OrderStatus orderStatus;


    public Order(User user, Warehouse warehouse) {
        this.user = user;
        this.warehouse = warehouse;
        productIdVsCount = user.getCart().getCartItems();
        invoice = new Invoice();
        orderStatus = OrderStatus.PENDING;
        generateInvoice();
    }

    public void checkOut() {
        warehouse.removeItemFromInventory(productIdVsCount);
        boolean isPayment  = makePayment(new UPIPayment());
        if (isPayment) {
            user.getCart().clearCart();
            user.addOrderId(orderId);
        }
        else {
            warehouse.addItemsToInventory(productIdVsCount);
        }
    }

    public boolean makePayment(Payment payment) {
        this.payment = payment;
        return payment.makePayment(invoice.getTotalAmount());
    }

    public void generateInvoice() {
        invoice.generateInvoice(this);
    }

    public Map<String, Integer> getProductIdVsCount() {
        return productIdVsCount;
    }

    public void setProductIdVsCount(Map<String, Integer> productIdVsCount) {
        this.productIdVsCount = productIdVsCount;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
