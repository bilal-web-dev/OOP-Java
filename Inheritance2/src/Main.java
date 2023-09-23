import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.println("Enter Commissioned Employee Id, Name, Salary, Comm Rate, NO of Prod:  ");
        CommEmployee c1 = new CommEmployee(input.nextInt(), inputString.nextLine(), input.nextDouble(),
                input.nextDouble(), input.nextDouble());

        System.out.println(c1.calculateSalary());

    }
}