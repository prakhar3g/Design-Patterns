package MovieTicketBookingApplication;

import MovieTicketBookingApplication.enums.PaymentMode;

import java.math.BigDecimal;

public class NetBanking extends Payment{

    public NetBanking(PaymentMode paymentMode) {
        super(paymentMode);
    }

    @Override
    public void doPayment(BigDecimal amount) {
        System.out.println("NET BANKING PAYMENT DONE");
    }
}
