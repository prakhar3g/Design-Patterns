package MovieTicketBookingApplication;

public class User {

    private String firstName;
    private String secondName;
    private String userId;

    public User(String firstName, String secondName, String userId) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void makeBooking(BookMyShowApplication bookMyShowApplication) {
        bookMyShowApplication.createBooking("BANGALORE","BAHUBALI");
    }
}
