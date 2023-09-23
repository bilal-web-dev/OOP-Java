import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        Address add = new Address();
        add.setStreetNum(10);
        add.setCity("Lahore");
        add.setCountry("Pakistan");

        Employee emp1 = new Employee(123, add);
        System.out.println("Employee 1 id:" + emp1.getEmpId());
        System.out.println("Enter Name of 1st Employee");
        emp1.setEmpName(inputString.nextLine());
        System.out.println("Employee 1 name is:" + emp1.getEmpName());
        System.out.println("Employee 1 Address is:" + emp1.getEmpAdd().getStreetNum() + " , "
                + emp1.getEmpAdd().getCity() + "  , " + emp1.getEmpAdd().getCountry());

        Employee emp2 = new Employee(456, add);
        System.out.println("Employee 2 id:" + emp2.getEmpId());
        System.out.println("Enter Name of 2nd Employee");
        emp2.setEmpName(inputString.nextLine());
        System.out.println("Employee 2 name is:" + emp1.getEmpName());
        System.out.println("Employee 2 Address is:" + emp2.getEmpAdd().getStreetNum());

    }
}