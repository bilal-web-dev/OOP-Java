import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.println("Enter No of Faculty members: ");
        int size = input.nextInt();

        Faculty[] f = new Faculty[size];

        for (int i = 0; i < f.length; i++) {
            System.out.println("1 for Permanent Facullty and 2 for Visiting Faculty");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Enter Id:");
                int id = input.nextInt();
                System.out.println("Enter Name");
                String name = inputString.nextLine();
                System.out.println("Enter Salary");
                double salary = input.nextDouble();
                f[i] = new PermanentFaculty(id, name, salary);

            }

            if (choice == 2) {

                System.out.println("Enter Id:");
                int id = input.nextInt();
                System.out.println("Enter Name");
                String name = inputString.nextLine();
                System.out.println("Hours");
                int hours = input.nextInt();
                System.out.println("Enter Salary");
                double salary = input.nextDouble();
                f[i] = new VisitingFaculty(id, name, hours, salary);
            }

        }

        for (int i = 0; i < f.length; i++) {
            if (f[i] instanceof VisitingFaculty) {
                System.out.println("Salary of Visiting Faculty is" + f[i].calculateSalary());
            }
            if (f[i] instanceof PermanentFaculty) {
                System.out.println("Salary of Permanent Faculty is" + f[i].calculateSalary());
            }

        }

        for (int i = 0; i < f.length; i++) {
            if (f[i] instanceof PermanentFaculty) {
                PermanentFaculty p = (PermanentFaculty) f[i];
                double increased = p.calculateSalary() * 10;
                System.out.println("The increased Salary is: " + increased);
            }
        }

    }
}