package ParkingLot.entities;


import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;

    public Ticket(LocalDateTime entryTime, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "entryTime=" + entryTime +
                ", vehicle=" + vehicle +
                ", parkingSpot=" + parkingSpot +
                '}';
    }
}
