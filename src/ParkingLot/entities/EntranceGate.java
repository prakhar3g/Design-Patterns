package ParkingLot.entities;

import ParkingLot.enums.ParkingType;
import ParkingLot.service.ParkingSpotManager;

import java.time.LocalDateTime;

public class EntranceGate {
    private String gateId;
    ParkingSpotManager parkingSpotManager;

    public EntranceGate(String gateId,ParkingSpotManager parkingSpotManager) {
        this.gateId = gateId;
        this.parkingSpotManager = parkingSpotManager;
    }

    public ParkingSpot findParkingSpot(ParkingType parkingType) {
        return parkingSpotManager.findNextEmptyParkingSpot(parkingType);
    }

    public void bookParkingSpot(ParkingSpot parkingSpot,Vehicle vehicle){
        parkingSpotManager.parkVehicle(parkingSpot,vehicle);
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot, LocalDateTime entryTime){
            return new Ticket(entryTime,vehicle,parkingSpot);
    }
}
