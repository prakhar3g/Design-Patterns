package ParkingLot.entities;

import ParkingLot.enums.ParkingType;

public class TwoWheelerParkingSpot extends ParkingSpot {

    public TwoWheelerParkingSpot(boolean isOccupied, Vehicle vehicle, ParkingType parkingType) {
        super(isOccupied, vehicle, parkingType);
    }

}
