import java.util.*;

public class Test {

    public static double CalculateTotalFootPrint(ArrayList<CarbonProducer> entity) {
        double t = 0.0;

        for (int i = 0; i < entity.size(); i++) {
            t += entity.get(i).getCarbonFootPrint();
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.println("Enter The Miles: ");
        double cars = input.nextInt();
        Car car1 = new Car(cars);

        System.out.println("Enter Covered Area: ");
        double house = input.nextInt();
        House house1 = new House(house);

        ArrayList<CarbonProducer> entity = new ArrayList<CarbonProducer>();
        entity.add(house1);
        entity.add(car1);
        System.out.println("Total Carbon Footprint is: " + CalculateTotalFootPrint(entity));

    }

}
