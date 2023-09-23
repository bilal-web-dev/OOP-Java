
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        Course course1 = new Course(01, "OOP");
        Course course2 = new Course(02, "DSA");

        System.out.println("Enter Phone Number: ");
        PhoneNumber phoneNum = new PhoneNumber(input.nextInt(), input.nextInt(), input.nextInt());

        System.out.println("Enter Address:  ");
        Address add = new Address(inputString.nextLine(), inputString.nextLine(), inputString.nextLine(),
                inputString.nextLine(), phoneNum);

        System.out.println("Enter your Name and Cnic: ");
        Student s1 = new Student(inputString.nextLine(), inputString.nextLine(), add);
        s1.setEmail("bilalch6061@gmail.com");
        s1.setCourse1(course1);
        s1.setCourse2(course2);
        s1.setContactNum(phoneNum);
        System.out.println("Student 1 Name is: ");
        System.out.println(s1.getName());
        System.out.println(s1.getCnic());
        System.out.println(s1.getEmail());
        System.out.println(s1.getCourse1().getCourseCode() + "  " + s1.getCourse1().getCourseTitle());
        System.out.println(s1.getCourse2().getCourseCode() + "  " + s1.getCourse2().getCourseTitle());
        System.out.println(s1.getContactNum().getCityCode() + " " + s1.getContactNum().getCountryCode() + " "
                + s1.getContactNum().getLineNumber());
        System.out.println(s1.getPostalAddress().getStreetAdd() + " " + s1.getPostalAddress().getTown() + " "
                + s1.getPostalAddress().getCity() + " " +
                s1.getPostalAddress().getCountry());

        System.out.println("Student 2:");
        Student s2 = new Student("Ali", "32110020", add);
        System.out.println(s2.getPostalAddress().getStreetAdd() + " " + s2.getPostalAddress().getTown() + " "
                + s2.getPostalAddress().getCity() + " " +
                s2.getPostalAddress().getCountry());

    }
}