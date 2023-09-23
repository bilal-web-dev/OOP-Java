import java.io.*;
import java.util.*;

public class Garage {
    public ArrayList<Vehicles> vehicles;
    public ArrayList<Dealer> dealers;
    public ArrayList<Order> orders;
    private double totalSales;

    Scanner input = new Scanner(System.in);

    public Garage() {
        this.vehicles = this.readVehicleData("Vehicles.ser");
        this.dealers = this.readDealerData("Dealers.ser");
        this.orders = this.readOrderData("Orders.ser");
    }

    public void addVehicle(Vehicles veh) {
        vehicles.add(veh);
    }

    public void removeVehicle(int index) {
        vehicles.remove(index);
    }

    public void addDealer(Dealer dealer) {
        dealers.add(dealer);
    }

    public void removeDealer(int index) {
        dealers.remove(index);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(int index) {
        orders.remove(index);
    }

    public ArrayList<Vehicles> readVehicleData(String filename) {
        ArrayList<Vehicles> objectsList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream input = new ObjectInputStream(fis);
            objectsList = (ArrayList<Vehicles>) input.readObject();
        } catch (Exception e) {

        } finally {
            return objectsList;
        }
    }

    public ArrayList<Dealer> readDealerData(String filename) {
        // filename = input.nextLine();
        ArrayList<Dealer> objectsList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream input = new ObjectInputStream(fis);
            objectsList = (ArrayList<Dealer>) input.readObject();

        } catch (Exception e) {

        } finally {
            return objectsList;
        }
    }

    public ArrayList<Order> readOrderData(String filename) {
        ArrayList<Order> objectsList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream input = new ObjectInputStream(fis);
            objectsList = (ArrayList<Order>) input.readObject();

        } catch (Exception e) {

        } finally {
            return objectsList;
        }
    }
}
