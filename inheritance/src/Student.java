public class Student extends Person {

    private double cgpa;

    public Student(int id, String name, Address add, double cgpa) {
        super(id, name, add);
        setCgpa(cgpa);

    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
