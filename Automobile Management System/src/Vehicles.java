import java.io.*;

public class Vehicles implements Serializable {
    private String name;
    private int chassisNo;
    private double cost;
    private int model;
    private String status;

    public Vehicles(String name, int chassisNo, double cost, int model, String status) {
        this.name = name;
        this.chassisNo = chassisNo;
        this.cost = cost;
        this.model = model;
        this.status = status;
    }

    public Vehicles() {
    }

    public Vehicles(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(int chassisNo) {
        this.chassisNo = chassisNo;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
