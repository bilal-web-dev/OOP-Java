import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Person p1 = new Person();

        try {
            System.out.println("Enter Your Age");
            p1.setAge(input.nextInt());
        } catch (AgeOutOfRangeException exp) {
            System.out.println(exp.getMessage());
        }

        try {
            System.out.println("Enter Your GPA");
            p1.setGpa(input.nextDouble());
            System.out.println("Your application is accepted and is under study.");

        } catch (LowGpaException exp) {
            System.out.println(exp.getMessage());
        }

    }
}

class Person {
    private int age;
    private double gpa;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeOutOfRangeException {
        if (age > 25) {
            throw new AgeOutOfRangeException();
        } else {
            this.age = age;
        }

    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) throws LowGpaException {
        if (gpa < 2.5) {
            throw new LowGpaException();
        } else {
            this.gpa = gpa;
        }

    }
}