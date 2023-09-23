public class Main {
    public static void main(String[] args) {

        Shape shape = new Rectangle(1.3, 4.5);
        Shape shape1 = new Circle(2.5);
        Painter painter = new Painter();

        System.out.println(shape.calculateArea());

        double cost = painter.estimateCost(shape1);
        System.out.println(cost);

        System.out.println(painter.estimateCost(shape));

    }
}