package Abstraction;

public class Circle extends Measurements {
	 	private double radius;
	 	private float pi = 3.14f;

	    public Circle(double radius) {
	        super("Circle");
	        this.radius = radius;
	    }

	    @Override
	    public double area() {
	        return  pi * radius * radius;
	    }

	    @Override
	    public double perimeter() {
	        return 2 * pi * radius;
	    }

	    @Override
	    public double volume() {
	        return 0.0; // Not applicable for 2D shape
	    }
}
