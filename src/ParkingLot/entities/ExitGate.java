package ParkingLot.entities;

import ParkingLot.service.ParkingSpotManager;
import ParkingLot.strategy.CostStrategy;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ExitGate {
    private String gateId;
    ParkingSpotManager parkingSpotManager;

    public ExitGate(String gateId, ParkingSpotManager parkingSpotManager) {
        this.gateId = gateId;
        this.parkingSpotManager = parkingSpotManager;
    }

    public String getGateId() {
        return gateId;
    }

    public void setGateId(String gateId) {
        this.gateId = gateId;
    }

    public ParkingSpotManager getParkingSpotManager() {
        return parkingSpotManager;
    }

    public void setParkingSpotManager(ParkingSpotManager parkingSpotManager) {
        this.parkingSpotManager = parkingSpotManager;
    }

    public BigDecimal calculateCostAndUnparkCar(LocalDateTime exitTime, Ticket ticket, CostStrategy costStrategy) {
        return parkingSpotManager.removeParkedVehicle(exitTime,ticket,costStrategy);
    }
}
