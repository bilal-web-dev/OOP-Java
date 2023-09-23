import java.io.*;

public class Order implements Serializable {
    private Vehicles vehicle;
    private Dealer dealer;
    private double amount;
    private String status;

    public Order(Vehicles vehicle, Dealer dealer) {
        this.vehicle = vehicle;
        this.dealer = dealer;
        this.amount = vehicle.getCost();
        this.status = "pending";
    }

    public Vehicles getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicles vehicle) {
        this.vehicle = vehicle;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String Status) {
        this.status = Status;
    }

    private double calculateBill() {
        return amount;
    }
}
