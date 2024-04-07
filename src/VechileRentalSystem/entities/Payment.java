package VechileRentalSystem.entities;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Payment {
    protected String paymentId;
    protected Bill bill;
    protected PaymentMode paymentMode;

    public Payment(Bill bill, PaymentMode paymentMode) {
        this.paymentId = UUID.randomUUID().toString();
        this.bill = bill;
        this.paymentMode = paymentMode;
    }

    public abstract void madePayment();
}
