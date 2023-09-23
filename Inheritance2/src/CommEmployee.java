public class CommEmployee extends Employee {

    private double comm;
    private double noOfProd;

    public CommEmployee(int id, String name, double salary, double comm, double noOfProd) {
        super(id, name, salary);
        this.comm = comm;
        this.noOfProd = noOfProd;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public double getNoOfProd() {
        return noOfProd;
    }

    public void setNoOfProd(double noOfProd) {
        this.noOfProd = noOfProd;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (noOfProd * comm);

    }
}
