public class Circle extends Shape implements Stats {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * (radius * radius);
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + " " + super.toString() +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        System.out.println("Area is " + getArea() + field);
        return getArea();
    }

    @Override
    public void resetArea() {
        radius = 0.0;
    }
}
