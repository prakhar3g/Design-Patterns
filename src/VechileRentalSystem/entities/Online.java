package VechileRentalSystem.entities;

public class Online extends Payment{

    public Online(Bill bill, PaymentMode paymentMode) {
        super(bill, paymentMode);
    }

    @Override
    public void madePayment() {
        System.out.println("ONLINE PAYMENT ACCEPTED");
    }
}
