package MovieTicketBookingApplication;

public class Main {

    public static void main(String[] args) {
        BookMyShowApplication bookMyShowApplication = new BookMyShowApplication();
        User user = new User("A","B","C");
        user.makeBooking(bookMyShowApplication);
    }
}
