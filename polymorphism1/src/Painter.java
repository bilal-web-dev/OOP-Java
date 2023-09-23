public class Painter {

    int id;
    String name;

    final static int Rate = 200;

    public double estimateCost(Shape shape) {
        double cost = shape.calculateArea() * Rate;
        return cost;

    }
}
