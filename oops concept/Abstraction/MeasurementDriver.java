package Abstraction;

public class MeasurementDriver {
	public static void main(String[] args) {
        Measurements shape;

        shape = new Circle(5);
        shape.displayShapeName();
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Volume: " + shape.volume());

        System.out.println("\n--------------------");
        
        shape = new Rectangle(5,8);
        shape.displayShapeName();
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Volume: " + shape.volume());
        
        System.out.println("\n--------------------");

        shape = new Cube(4);
        shape.displayShapeName();
        System.out.println("Surface Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Volume: " + shape.volume());
        
        System.out.println("\n--------------------");
        shape = new Cylinder(5,9);
        shape.displayShapeName();
        System.out.println("Surface Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Volume: " + shape.volume());
	}
}
