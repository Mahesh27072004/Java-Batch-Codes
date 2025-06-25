package Abstraction;

// Abstraction is the process which helps the service specifier to specify the most essential features of a project without providing their implementation details
// means its the process of hiding the implementation details and only showing the essential features is called as abstraction.
// to achieve abstraction we use abstract methods and abstract classes
// abstract class and methods are declared using abstract modifier in prefix.
// abstract methods are the methods which don't have any method definition or body it only has declaration that includes (syntax: accessmodifier abstract returntype methodName(formal arg);)
// if a class contains at least one abstract method either inherited or declared but not overridden, it must be declared as abstract
// we can't create a object of an abstract class 
// if any class inherits the abstract class it should implement or define all the abstract methods otherwise it must be also declared as abstract
// an abstract class can have both the abstract and concrete methods 
// we can have a constructor in a abstract class because if we declare any attributes in abstract class, that must load in the subclass for which constructor is needed to which the super call statement of subclass constructor will invoke


// understanding through one real time example of online vehicle rental system

public abstract class Vehicle {
	 private String registrationNumber;
	 private String brand;

	 public Vehicle(String registrationNumber, String brand) {
		 	this.registrationNumber = registrationNumber;
	        this.brand = brand;
	 }

	    // Common method shared by all
	    public void displayInfo() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Registration No: " + registrationNumber);
	    }

	    // Abstract method (Abstraction!)
	    public abstract void bookVehicle(int hours);
	    
	    public abstract double calculateFare(int hours);

	    // Optional abstract method (some vehicles may require license verification)
	    public abstract void verifyDocuments();
}
