package Abstraction;

public abstract class Measurements {
	 	private String shapeName;

	    public Measurements(String shapeName) {
	        this.shapeName = shapeName;
	    }

	    // Concrete method
	    public void displayShapeName() {
	        System.out.println("Shape: " + shapeName);
	    }

	    // Abstract methods
	    public abstract double area();

	    public abstract double perimeter();

	    public abstract double volume();  // Return 0.0 if not applicable
}
