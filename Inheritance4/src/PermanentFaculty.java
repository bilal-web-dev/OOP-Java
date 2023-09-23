public class PermanentFaculty extends Faculty {
    private double salary;

    public PermanentFaculty(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary;
    }
}