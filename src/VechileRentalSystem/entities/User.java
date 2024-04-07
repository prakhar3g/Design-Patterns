package VechileRentalSystem.entities;

public class User {
    private String userName;
    private String userId;
    private String drivingLicenseNumber;

    public User(String userName, String userId, String drivingLicenseNumber) {
        this.userName = userName;
        this.userId = userId;
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public void setDrivingLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }
}

