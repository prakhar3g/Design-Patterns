package VechileRentalSystem.entities;

public class Vehicle {

    private int vehicleNumber;
    private String vehicleModel;
    private VehicleType vehicleType;
    private Status status;

    public Vehicle(int vehicleNumber, String vehicleModel, VehicleType vehicleType, Status status) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleModel = vehicleModel;
        this.vehicleType = vehicleType;
        this.status = status;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNumber=" + vehicleNumber +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleType=" + vehicleType +
                ", status=" + status +
                '}';
    }
}
