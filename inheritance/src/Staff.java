public class Staff extends Person {
    private double salary;

    public Staff(int id, String name, Address add, double salary) {
        super(id, name, add);
        setSalary(salary);
    }

    public Staff() {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        super.display();
    }

}
