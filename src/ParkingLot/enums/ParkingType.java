package ParkingLot.enums;

public enum ParkingType {
    TWO_WHEELER("two_wheeler"),
    THREE_WHEELER("three_wheeler"),
    FOUR_WHEELER("four_wheeler");

    String parkingType;

    ParkingType(String vehicleType) {
        this.parkingType = vehicleType;
    }

    public String getParkingType() {
        return parkingType;
    }
}
