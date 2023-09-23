import java.io.*;
import java.util.*;

public class Main {
    static Garage g = new Garage();
    static Scanner input = new Scanner(System.in);
    static Scanner inputString = new Scanner(System.in);

    static final String adminUserName = "admin";
    static final String adminPassword = "admin123";

    public static void mainLoop() {
        while (true) {
            System.out.println("\n\t\t\t\t\t--------------------------------------");
            System.out.println("\t\t\t\t\tWELCOME TO NA-PAAK WHEELS CAR PLATFORM");
            System.out.println("\t\t\t\t\t--------------------------------------\n\n");
            System.out.println("\t\t\t\t\t\t   1. Sign In");
            System.out.println("\t\t\t\t\t\t   2. Exit");
            System.out.print("\n\t\t\t\t\t\t Your Choice: ");

            int userinput = input.nextInt();

            if (userinput == 1) {
                signIn();
            } else if (userinput == 2) {
                writeFiles("Vehicles.ser");
                writeFiles("Orders.ser");
                writeFiles("Dealers.ser");
                System.exit(0);
            } else
                System.out.println("\t\t\t\t\tIncorrect Input Try Again..");
        }

    }

    public static void writeFiles(String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            if (filename == "Vehicles.ser")
                out.writeObject(g.vehicles);
            else if (filename == "Orders.ser")
                out.writeObject(g.orders);
            else if (filename == "Dealers.ser")
                out.writeObject(g.dealers);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Boolean signIn() {
        while (true) {
            System.out.println("\n---------------");
            System.out.println(" -- Sign In -- ");
            System.out.println("---------------\n");
            System.out.println("Enter Username:");
            String username = inputString.nextLine();

            System.out.println("Enter Password:");
            String password = inputString.nextLine();

            if (username.equals(adminUserName) && password.equals(adminPassword)) {
                adminPortal();
                break;
            }
            int id = dealerAuthentication(username, password);
            if (id != 0) {
                dealerPortal(id);
                break;
            } else {
                System.out.print("Incorrect Username Or Password!'\nDo You want to Try Again?(y/n):");
                String x = inputString.nextLine();
                if (x.equals("n") || x.equals("N"))
                    break;
            }
        }
        return true;
    }

    public static int dealerAuthentication(String username, String password) {
        for (int i = 0; i < g.dealers.size(); i++) {
            if (username.equals(g.dealers.get(i).getName()) && password.equals(g.dealers.get(i).getPassword())) {
                return g.dealers.get(i).getId();
            }
        }
        return 0;
    }

    public static void displayVehicles() {
        if (g.vehicles.size() == 0)
            System.out.println("No Vehicles to Show\n\n");
        else {
            // System.out.println("Name:" +"\t\t\tCost:" +"\t\t\t\tModel");
            for (int i = 0; i < g.vehicles.size(); i++) {
                System.out.println(i + ": " + g.vehicles.get(i).getName() + "\t\t   PKR " + g.vehicles.get(i).getCost()
                        + "\t\t\t" + g.vehicles.get(i).getModel());
            }
        }
    }

    public static void displayDealers() {
        if (g.dealers.size() == 0)
            System.out.println("No Dealers to Show\n\n");
        else {
            System.out.println("   Name:" + "\t\t  Salary:" + "\t\t    Commission:");
            for (int i = 0; i < g.dealers.size(); i++) {
                System.out.println(i + ": " + g.dealers.get(i).getName() + "\t\t  " + g.dealers.get(i).getBaseSalary()
                        + "\t\t\t" + g.dealers.get(i).getCommission() + "%");
                // System.out.println(i+": " +g.vehicles.get(i).getName()+"\t\t PKR "
                // +g.vehicles.get(i).getCost()+"\t\t\t" +g.vehicles.get(i).getModel());
            }
        }

    }

    public static void addVehicle() {
        System.out.println("Vehicle Name: ");
        String name = inputString.nextLine();
        System.out.println("Vehicle Cost: ");
        double cost = input.nextDouble();
        System.out.println("Vehicle Model: ");
        int model = input.nextInt();
        System.out.println("Chassis No.: ");
        int chassis = input.nextInt();
        System.out.println("Enter Current Status: ");
        String status = inputString.nextLine();
        Vehicles veh = new Vehicles(name, chassis, cost, model, status);
        g.addVehicle(veh);
        System.out.println("Vehicle " + veh.getName() + " is added to Garage Inventory\n\n");
    }

    public static void addDealer() {
        System.out.println("Dealer Name: ");
        String name = inputString.nextLine();
        System.out.println("Dealer ID: ");
        int id = input.nextInt();
        System.out.println("Dealer Address: ");
        String address = inputString.nextLine();
        System.out.println("Dealer Phone: ");
        int phone = input.nextInt();
        System.out.println("Commission: ");
        double commission = input.nextDouble();
        System.out.println("Base Salary: ");
        double baseSalary = input.nextDouble();
        System.out.println("Dealer Password: ");
        String password = inputString.nextLine();
        Dealer dealer = new Dealer(name, address, phone, id, commission, baseSalary, password);
        g.addDealer(dealer);
        System.out.println("Dealer " + dealer.getName() + " is added to Dealer Management Portal");
    }

    public static void garageManagement() {
        System.out.println("\n\n\n-------------------");
        System.out.println(" Garage Management ");
        System.out.println("-------------------\n");
        System.out.println("1. Vehicles Available");
        System.out.println("2. Add Vehicles");
        System.out.println("3. Remove Vehicles");
        System.out.println("4. Exit to ADMIN PORTAL");
        System.out.print("\n Your Choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("\n------------------");
                System.out.println("Vehicles in Garage");
                System.out.println("------------------\n\n");
                displayVehicles();
                break;
            }

            case 2: {
                System.out.println("\n------------");
                System.out.println("Add Vehicle");
                System.out.println("-------------\n");
                addVehicle();
                break;
            }

            case 3: {
                System.out.println("\n----------------");
                System.out.println(" Remove Vehicle ");
                System.out.println("----------------\n");
                displayVehicles();
                System.out.println("Remove Vehicle Number: ");
                int num = input.nextInt();
                System.out.println("Vehicle " + g.vehicles.get(num).getName() + " is removed from Garage Inventory");
                g.removeVehicle(num);
                break;
            }

            case 4: {
                adminPortal();
            }
        }
    }

    public static void dealerManagement() {
        System.out.println("\n\n-------------------");
        System.out.println(" Dealer Management ");
        System.out.println("-------------------\n\n");

        System.out.println("Press :");
        System.out.println("1. All Dealers");
        System.out.println("2. Add Dealers");
        System.out.println("3. Remove Dealers");
        System.out.println("4. Exit to ADMIN PORTAL");
        System.out.println(" Your Choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("\n----------------");
                System.out.println("  All Dealers  ");
                System.out.println("----------------");

                displayDealers();
                break;
            }

            case 2: {
                System.out.println("\n------------");
                System.out.println("Add Dealer");
                System.out.println("-------------\n");

                addDealer();
                break;
            }

            case 3: {
                System.out.println("\n----------------");
                System.out.println(" Remove Dealer ");
                System.out.println("----------------\n");

                displayDealers();
                System.out.println("Remove Dealer Number: ");
                int num = input.nextInt();
                System.out.println("Dealer " + g.dealers.get(num).getName() + " is removed from Dealer Managment");
                g.removeDealer(num);
                break;
            }

            case 4: {
                adminPortal();
            }
        }
    }

    public static void displayOrders() {
        System.out.println("\n----------");
        System.out.println("ALL ORDERS");
        System.out.println("----------\n");

        if (g.orders.size() == 0) {
            System.out.println("No Orders to be Shown.");
        } else {
            System.out.println(" Vehicle" + "\t\t\tDealer" + "\t\t\tAmount" + "\t\t\tStatus");
            for (int i = 0; i < g.orders.size(); i++) {
                System.out.println(i + ": " + g.orders.get(i).getVehicle().getName()
                        + "\t\t\t" + g.orders.get(i).getDealer().getName()
                        + "\t\t\t" + g.orders.get(i).getAmount()
                        + "\t\t" + g.orders.get(i).isStatus());
            }
        }
    }

    public static void adminPortal() {
        while (true) {
            System.out.println("\n\n\n\n----------------------------");
            System.out.println("  ---- ADMIN PORTAL ----  ");
            System.out.println("----------------------------");
            System.out.println("\n\n1. Garage Management");
            System.out.println("2. Dealer Management");
            System.out.println("3. View All Orders");
            System.out.println("4. Exit NA-PAAK WHEELS");
            System.out.print("\n Your Choice: ");
            int choice1 = input.nextInt();

            if (choice1 == 1) {
                garageManagement();
            }

            if (choice1 == 2) {
                dealerManagement();
            }

            if (choice1 == 3) {
                displayOrders();
            }

            if (choice1 == 4) {
                break;
            }
        }
    }

    public static void saleVehicle(int id) {
        System.out.println("\n\nVehicles in Garage");
        displayVehicles();
        System.out.println("Choose Car to Sell: ");
        int num = input.nextInt();
        Dealer dealer = new Dealer();
        int i;
        for (i = 0; i < g.dealers.size(); i++) {
            if (g.dealers.get(i).getId() == id) {
                dealer = g.dealers.get(i);
                break;
            }
        }
        Order order = new Order(g.vehicles.get(num), dealer);
        order.setStatus("pending");
        g.addOrder(order);
        System.out.println(g.dealers.get(i).getName() + " placed order for " + g.vehicles.get(num).getName());
    }

    public static ArrayList<Order> dealerOrders(int id, Boolean showAll) {
        ArrayList<Order> ords = new ArrayList<>();
        System.out.println("\n---------------");
        System.out.println("DEALER'S ORDERS");
        System.out.println("---------------\n");

        System.out.println("Vehicle" + "\t\t\tAmount" + "\t\t\t\tStatus");
        for (int i = 0; i < g.orders.size(); i++) {
            if (g.orders.get(i).getDealer().getId() == id) {
                if (showAll || g.orders.get(i).isStatus().equals("pending")) {
                    System.out.println(i + ": " + g.orders.get(i).getVehicle().getName()
                            + "\t\t\t" + g.orders.get(i).getAmount()
                            + "\t\t\t" + g.orders.get(i).isStatus());
                    ords.add(g.orders.get(i));
                }
            } else {

            }

        }
        return ords;
    }

    public static void completeOrder(int id) {
        ArrayList<Order> dealerOrders = dealerOrders(id, false);
        if (dealerOrders.size() == 0)
            System.out.println("No Pending Orders");

        else {
            System.out.print("Choose Order to Complete: ");
            int num = input.nextInt();

            g.orders.get(num).setStatus("Complete");
            int chassis = g.orders.get(num).getVehicle().getChassisNo();
            for (int i = 0; i < g.vehicles.size(); i++) {
                if (g.vehicles.get(i).getChassisNo() == chassis) {
                    System.out.println("Order Completed.");
                    System.out.println("Vehicle " + g.vehicles.get(i).getName() + " is removed from Garage Inventory");
                    g.removeVehicle(i);
                    break;
                }
            }
        }
    }

    public static void dealerPortal(int id) {
        while (true) {
            System.out.println("\n\n\n----------------------------");
            System.out.println("  ---- Dealer Portal ----  ");
            System.out.println("----------------------------\n");
            System.out.println("Press to Continue: ");
            System.out.println("1. Generate Car Sale Order");
            System.out.println("2. Orders");
            System.out.println("3. Complete Order");
            System.out.println("4. Exit to NA-PAAK WHEELS");
            System.out.print("\n Your Choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                saleVehicle(id);
            }

            if (choice == 2) {
                dealerOrders(id, true);
            }

            if (choice == 3) {
                completeOrder(id);
            }

            if (choice == 4) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        mainLoop();
    }
}
