package VechileRentalSystem.entities;

public class Location {
    String address;
    String cityName;
    String stateName;
    String pinCode;

    public Location(String address, String cityName, String stateName, String pinCode) {
        this.address = address;
        this.cityName = cityName;
        this.stateName = stateName;
        this.pinCode = pinCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
