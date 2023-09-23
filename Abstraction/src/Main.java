import java.util.Scanner;

public class Main {

    public static void shapesSummary(Shape[] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] instanceof Circle) {
                Circle c = (Circle) s[i];
                System.out.println(c.toString());
            } else {
                Rectangle r = (Rectangle) s[i];
                System.out.println(s[i].toString());
            }

        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shape s[] = new Shape[4];
        s[0] = new Circle("blue", true, 5.5);
        s[1] = new Circle("red", false, 2.5);
        s[2] = new Rectangle("red", true, 2.54, 3.54);
        s[3] = new Rectangle("white", false, 5.01, 2.01);
        System.out.println("Enter Choice, 1 for Circle, 2 for Rectangle");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Enter Radius of the Circle: ");
            double radius = input.nextDouble();
            for (int i = 0; i < s.length; i++) {
                if (s[i] instanceof Circle) {
                    Circle c = (Circle) s[i];
                    c.setRadius(radius);
                }

            }

        }

        if (choice == 2) {
            System.out.println("Enter Length and width:");
            double length = input.nextDouble();
            double width = input.nextDouble();
            for (int i = 0; i < s.length; i++) {
                if (s[i] instanceof Rectangle) {
                    Rectangle r = (Rectangle) s[i];
                    r.setLength(length);
                    r.setWidth(width);
                }

            }
        }

        shapesSummary(s);

    }
}