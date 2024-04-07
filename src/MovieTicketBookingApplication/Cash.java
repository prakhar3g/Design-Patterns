package MovieTicketBookingApplication;

import MovieTicketBookingApplication.enums.PaymentMode;

import java.math.BigDecimal;

public class Cash extends Payment{

    public Cash(PaymentMode paymentMode) {
        super(paymentMode);
    }

    @Override
    public void doPayment(BigDecimal amount) {
        System.out.println("CASH PAYMENT DONE");
    }
}
