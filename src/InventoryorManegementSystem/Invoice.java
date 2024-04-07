package InventoryorManegementSystem;

import java.util.Map;
import java.util.UUID;

public class Invoice {
    private String invoiceNumber;
    private double totalProductAmount;
    private double totalTaxAmount;
    private double totalAmount;

    public Invoice() {
        invoiceNumber = UUID.randomUUID().toString();
        totalProductAmount = 0;
        totalTaxAmount = 0;
        totalAmount = 0;
    }


    public void generateInvoice(Order order) {
        int totalUnits = 0;
        for (Map.Entry<String,Integer> entry:order.getProductIdVsCount().entrySet()) {
            double cost = order.getWarehouse().getInventory().getProductFromId(entry.getKey()).getPrice()*entry.getValue();
            totalAmount += cost;
            totalUnits += entry.getValue();
        }

        totalTaxAmount = 0.5*totalUnits;
        totalAmount = totalProductAmount+totalTaxAmount;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getTotalProductAmount() {
        return totalProductAmount;
    }

    public void setTotalProductAmount(double totalProductAmount) {
        this.totalProductAmount = totalProductAmount;
    }

    public double getTotalTaxAmount() {
        return totalTaxAmount;
    }

    public void setTotalTaxAmount(double totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
