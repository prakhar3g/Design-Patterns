package ParkingLot.enums;

public enum VehicleType {
    TWO_WHEELER("two_wheeler"),
    THREE_WHEELER("three_wheeler"),
    FOUR_WHEELER("four_wheeler");

    String vehicleType;

    VehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}
