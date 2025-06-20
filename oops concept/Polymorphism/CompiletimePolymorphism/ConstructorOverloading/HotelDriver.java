package Polymorphism.CompiletimePolymorphism.ConstructorOverloading;

public class HotelDriver {
	  public static void main(String[] args) {
	        HotelBooking b1 = new HotelBooking("Mahesh");
	        HotelBooking b2 = new HotelBooking("Anita", "Deluxe");
	        HotelBooking b3 = new HotelBooking("Ravi", "Suite", 3);
	        HotelBooking b4 = new HotelBooking("Sneha", "Executive", 2, true);

	        b1.displayBookingDetails();
	        b2.displayBookingDetails();
	        b3.displayBookingDetails();
	        b4.displayBookingDetails();
	    }
}
