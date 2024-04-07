package MovieTicketBookingApplication;

import MovieTicketBookingApplication.enums.PaymentMode;

import java.math.BigDecimal;

public class UPI extends Payment{

    public UPI(PaymentMode paymentMode) {
        super(paymentMode);
    }

    @Override
    public void doPayment(BigDecimal amount) {
        System.out.println("UPI PAYMENT DONE");
    }
}
