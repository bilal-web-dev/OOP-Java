import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.println("Enter your Add city and Country for Person1:");
        Address add1 = new Address(inputString.nextLine(), inputString.nextLine());

        System.out.println("Enter Personal Details for Person1 : ");
        Person p1 = new Student(input.nextInt(), inputString.nextLine(), add1, input.nextDouble());

        System.out.println("Enter your Add city and Country for Person2:");
        Address add2 = new Address(inputString.nextLine(), inputString.nextLine());

        System.out.println("Enter Personal Details for Person2 : ");
        Person p2 = new Staff(input.nextInt(), inputString.nextLine(), add2, input.nextDouble());

        Student s1 = (Student) p1;
        System.out.println("Person 1 Printing:");
        System.out.println("Id: " + p1.getId() + "Name: " + p1.getName() + " " + p1.getAdd().getCity() + " "
                + p1.getAdd().getCountry() + s1.getCgpa());

        Staff s2 = (Staff) p2;
        System.out.println("Person 2 Printing" + p2.getId() + " " + p2.getName() + " " + p2.getAdd().getCity() + " "
                + s2.getSalary());

    }

}