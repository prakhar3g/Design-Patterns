package MovieTicketBookingApplication.enums;

public enum PaymentMode {
    UPI("Upi"),
    NET_BANKING("Net banking"),
    CASH("Cash");

    private String paymentMode;

    PaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}
