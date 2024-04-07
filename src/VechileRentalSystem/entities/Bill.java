package VechileRentalSystem.entities;

import java.math.BigDecimal;

public class Bill {
    private Reservation reservation;
    private boolean isPaid;
    private BillStrategy billStrategy;
    private BigDecimal totalAmount;

    public Bill(Reservation reservation,BillStrategy billStrategy) {
        this.reservation = reservation;
        this.billStrategy = billStrategy;
        this.isPaid = false;
        this.totalAmount = computeBillAmount(reservation,billStrategy);
    }

    public BigDecimal computeBillAmount(Reservation reservation,BillStrategy billStrategy){
        return billStrategy.calculateCost(reservation.getPickupTime(),reservation.getDropTime());
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "reservation=" + reservation +
                ", isPaid=" + isPaid +
                ", billStrategy=" + billStrategy +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
