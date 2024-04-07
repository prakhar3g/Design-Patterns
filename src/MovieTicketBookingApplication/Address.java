package MovieTicketBookingApplication;

public class Address {

    private String streetAddress;
    private String cityName;
    private String state;
    private String pinCode;

    public Address(String streetAddress, String cityName, String state, String pinCode) {
        this.streetAddress = streetAddress;
        this.cityName = cityName;
        this.state = state;
        this.pinCode = pinCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
