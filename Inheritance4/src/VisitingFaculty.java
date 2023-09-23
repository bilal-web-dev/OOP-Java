public class VisitingFaculty extends Faculty {
    private int hrs;
    private double salaryPerHr;

    public VisitingFaculty(int id, String name, int hrs, double salaryPerHr) {
        super(id, name);
        this.hrs = hrs;
        this.salaryPerHr = salaryPerHr;
    }

    @Override
    double calculateSalary() {
        return hrs * salaryPerHr;
    }
}