package InventoryorManegementSystem;

public class Address {
    private String streetName;
    private String cityName;
    private String stateName;
    private String countryName;
    private String pinCode;

    public Address(String streetName, String cityName, String stateName, String countryName, String pinCode) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.countryName = countryName;
        this.pinCode = pinCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
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

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
