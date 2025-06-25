package Abstraction;

public class Car extends Vehicle {
	 public Car(String registrationNumber, String brand) {
	        super(registrationNumber, brand);
	    }

	    @Override
	    public void bookVehicle(int hours) {
	        System.out.println("Booking a Car for " + hours + " hours...");
	        verifyDocuments();
	        double fare = calculateFare(hours);
	        System.out.println("Car booked successfully. Total Fare: ₹" + fare);
	        System.out.println();
	    }

	    @Override
	    public double calculateFare(int hours) {
	        return 150 * hours; // ₹150 per hour
	    }

	    @Override
	    public void verifyDocuments() {
	    	// should implement the logic for verifying documents
	        System.out.println("Checking driving license, ID proof, and age for car rental...");
	    }
}
