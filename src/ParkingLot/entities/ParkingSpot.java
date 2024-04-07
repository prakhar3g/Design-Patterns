package ParkingLot.entities;

import ParkingLot.enums.ParkingType;

import java.util.UUID;

public abstract class ParkingSpot {
    private String parkingSlotId;
    private boolean isOccupied;
    private Vehicle vehicle;

    private ParkingType parkingType;

    public ParkingSpot(boolean isOccupied, Vehicle vehicle, ParkingType parkingType) {
        this.parkingSlotId = UUID.randomUUID().toString();
        this.isOccupied = isOccupied;
        this.vehicle = vehicle;
        this.parkingType = parkingType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingType getParkingType() {
        return parkingType;
    }

    public void setParkingType(ParkingType parkingType) {
        this.parkingType = parkingType;
    }

    public String getParkingSlotId() {
        return parkingSlotId;
    }

    public void setParkingSlotId(String parkingSlotId) {
        this.parkingSlotId = parkingSlotId;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "parkingSlotId='" + parkingSlotId + '\'' +
                ", isOccupied=" + isOccupied +
                ", vehicle=" + vehicle +
                ", parkingType=" + parkingType +
                '}';
    }
}
