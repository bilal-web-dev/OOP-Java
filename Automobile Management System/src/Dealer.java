import java.io.*;

public class Dealer extends Person implements Serializable {
    private int id;
    private String password;
    private double commission;
    private double baseSalary;

    public Dealer(String name, String address, int phone, int id, double commission, double baseSalary,
            String password) {
        super(name, address, phone);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.id = id;
        this.password = password;
    }

    public Dealer(String name, String address, int phone, int id) {
        super(name, address, phone);
        this.id = id;
    }

    public Dealer() {
        super();
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double totalPayment() {
        double total = baseSalary + commission;
        return total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
