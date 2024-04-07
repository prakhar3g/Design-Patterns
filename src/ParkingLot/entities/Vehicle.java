package ParkingLot.entities;

import ParkingLot.enums.VehicleType;

public class Vehicle {
    private String vehicleNumber;
    private String vehicleColor;
    private VehicleType vehicleType;

    public Vehicle(String vehicleNumber, String vehicleColor, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleColor = vehicleColor;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleColor='" + vehicleColor + '\'' +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
