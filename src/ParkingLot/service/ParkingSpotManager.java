package ParkingLot.service;

import ParkingLot.entities.ParkingSpot;
import ParkingLot.entities.Ticket;
import ParkingLot.entities.Vehicle;
import ParkingLot.enums.ParkingType;
import ParkingLot.factory.ParkingSpotFactory;
import ParkingLot.strategy.CostStrategy;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManager {

    private List<ParkingSpot> parkingSpotList;
    ParkingSpotFactory parkingSpotFactory;
    int occupiedParkingSlots;

    public ParkingSpotManager(ParkingSpotFactory parkingSpotFactory) {
        this.parkingSpotFactory = parkingSpotFactory;
        occupiedParkingSlots = 0;
    }

    public void createParkingSpots(int size,ParkingType parkingType){
        if (parkingSpotList == null) {
            parkingSpotList = new ArrayList<>();
        }
        for (int i=0;i<size;i++){
            addParkingSpot(parkingType);
        }
    }

    public boolean removeParkingSpot(int parkingSlotId) {
        for (ParkingSpot parkingSpot: parkingSpotList){
            if (parkingSpot.getParkingSlotId().equals(parkingSlotId)){
                parkingSpotList.remove(parkingSpot);
                return true;
            }
        }
        return false;
    }

    public void addParkingSpot(ParkingType parkingType) {
        ParkingSpot parkingSpot = parkingSpotFactory.getParkingSpot(parkingType);
        parkingSpotList.add(parkingSpot);
    }


    public void parkVehicle(ParkingSpot parkingSpot,Vehicle vehicle) {
        parkingSpot.setVehicle(vehicle);
        parkingSpot.setOccupied(true);
        occupiedParkingSlots++;
        System.out.println("----Booked Parking Sport with id "+ parkingSpot.getParkingSlotId() +" and generating ticket-----");
    }

    public BigDecimal removeParkedVehicle(LocalDateTime exitTime, Ticket ticket, CostStrategy costStrategy) {
        BigDecimal cost = costStrategy.getCost(exitTime,ticket.getEntryTime());
        for (ParkingSpot parkingSpot:parkingSpotList){
            if (parkingSpot.equals(parkingSpot)){
                occupiedParkingSlots--;
                parkingSpot.setOccupied(false);
                parkingSpot.setVehicle(null);
                return cost;
            }
        }
        return null;
    }

    public ParkingSpot findNextEmptyParkingSpot(ParkingType parkingType){
        for (ParkingSpot parkingSpot : parkingSpotList) {
            if (parkingSpot.getParkingType().equals(parkingType) && !parkingSpot.isOccupied()) {
                return parkingSpot;
            }
        }
        return null;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public int getOccupiedParkingSlots() {
        return occupiedParkingSlots;
    }

    public void setOccupiedParkingSlots(int occupiedParkingSlots) {
        this.occupiedParkingSlots = occupiedParkingSlots;
    }
}
