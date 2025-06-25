package Abstraction;

public class VehicleBookingDriver {
	public static void main(String[] args) {
        // Abstract class reference — abstraction + upcasting
        Vehicle vehicle;

        vehicle = new Bike("MH12AB1234", "Bajaj Pulsar");// Bike upcasted to Vehicle
        vehicle.displayInfo(); // method from Vehicle class 
        vehicle.bookVehicle(4);  // overridden method of Bike class

        
        vehicle = new Car("MH14CD5678", "Hyundai i20");// Car upcasted to Vehicle
        vehicle.displayInfo();
        vehicle.bookVehicle(2);  // overridden method of Car class
        
//the question arise is why we do upcasting in this scenrio?
        
        // the answer is, if we don't do upcasting then if the service provider who is implementing the abstract class with implementation logic 
        // can add its own different methods which are not in the requirement or in the blueprint of the abstract(designed by service specifier) class 
        // so to avoid this if we do upcasting even if the service provider can define any its own different methods, but it wont be accessed at the compile time 
        // as the refernce of the object is upcasted to the superclass type so compiler will not do the binding to newly declared methods by the service provider. 

   }
}
