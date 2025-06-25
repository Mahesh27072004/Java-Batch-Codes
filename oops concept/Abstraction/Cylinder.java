package Abstraction;

public class Cylinder extends Measurements {
    private double radius, height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius * (radius + height);  // Surface area
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius * 2;  // Circular path (top + bottom)
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

