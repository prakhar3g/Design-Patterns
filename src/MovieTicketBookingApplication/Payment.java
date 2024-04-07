package MovieTicketBookingApplication;

import MovieTicketBookingApplication.enums.PaymentMode;

import java.math.BigDecimal;

public abstract class Payment {

    protected PaymentMode paymentMode;

    public Payment(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public abstract void doPayment(BigDecimal amount);
}
