package MovieTicketBookingApplication;

import java.math.BigDecimal;
import java.util.List;

public class Booking {

    private int bookingId;
    private Show show;
    private List<Seat> selectedSeats;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<Seat> getSelectedSeats() {
        return selectedSeats;
    }

    public void setSelectedSeats(List<Seat> selectedSeats) {
        this.selectedSeats = selectedSeats;
    }

    public void makePayment(Payment payment) {
        BigDecimal amount = new BigDecimal(0);
        for (Seat seat:selectedSeats) {
            amount = amount.add(seat.getPrice());
        }
        payment.doPayment(amount);
    }
}
