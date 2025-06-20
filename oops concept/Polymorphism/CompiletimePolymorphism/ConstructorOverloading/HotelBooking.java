package Polymorphism.CompiletimePolymorphism.ConstructorOverloading;
// this is the example for constructor overloading with constructor chaining.
public class HotelBooking {
		String guestName;
	    String roomType;
	    int nights;
	    boolean breakfastIncluded;

	 // Constructor 1 – Only name (assume standard room, 1 night, no breakfast)
	    public HotelBooking(String guestName) {
	        this.guestName=guestName;
	    }

	    // Constructor 2 – Only name and room type (assume 1 night, no breakfast)
	    public HotelBooking(String guestName, String roomType) {
	        this(guestName);
	        this.roomType = roomType;
	    }
	    
	 // Constructor 3 – No breakfast info (assume false)
	    public HotelBooking(String guestName, String roomType, int nights) {
	        this(guestName, roomType); // call full constructor
	        this.nights = nights;
	    }
	    
	    // Constructor 4 – Full logic is here
	    public HotelBooking(String guestName, String roomType, int nights, boolean breakfastIncluded) {
	        this(guestName, roomType, nights);
	        this.breakfastIncluded = breakfastIncluded;
	    }
	    
	    public void displayBookingDetails() {
	        System.out.println("Booking for: " + guestName +
	            "\nRoom Type: " + roomType +
	            "\nNights: " + nights +
	            "\nBreakfast Included: " + (breakfastIncluded ? "Yes" : "No") + "\n");
	    }
}
