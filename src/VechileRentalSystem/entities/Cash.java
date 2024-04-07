package VechileRentalSystem.entities;

import java.math.BigDecimal;

public class Cash extends Payment{
    public Cash(Bill bill, PaymentMode paymentMode) {
        super(bill, paymentMode);
    }

    @Override
    public void madePayment() {
        System.out.println("CASH PAYMENT ACCEPTED: "+bill.getTotalAmount());
    }


}
