package Abstraction;

public class Bike extends Vehicle{
	
	public Bike(String registrationNumber, String brand) {
        super(registrationNumber, brand);
    }

    @Override
    public void bookVehicle(int hours) {
        System.out.println("Booking a Bike for " + hours + " hours...");
        verifyDocuments();
        double fare = calculateFare(hours);
        System.out.println("Bike booked successfully. Total Fare: ₹" + fare);
        System.out.println();
    }

    @Override
    public double calculateFare(int hours) {
        return 50 * hours; // ₹50 per hour
    }

    @Override
    public void verifyDocuments() {
    	// should implement the logic for verifying documents
        System.out.println("Checking helmet and valid license for bike...");
    }
}
