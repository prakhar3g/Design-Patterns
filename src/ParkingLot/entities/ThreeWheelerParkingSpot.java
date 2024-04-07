package ParkingLot.entities;

import ParkingLot.enums.ParkingType;

public class ThreeWheelerParkingSpot extends ParkingSpot {

    public ThreeWheelerParkingSpot(boolean isOccupied, Vehicle vehicle, ParkingType parkingType) {
        super(isOccupied, vehicle, parkingType);
    }
}
