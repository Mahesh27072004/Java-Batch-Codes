package Abstraction;

public class Cube extends Measurements {
	private double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;
    }

    @Override
    public double area() {
        return 6 * side * side; // Surface area
    }

    @Override
    public double perimeter() {
        return 12 * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
