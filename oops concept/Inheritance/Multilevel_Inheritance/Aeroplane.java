package Inheritance.Multilevel_Inheritance;

public class Aeroplane {
	String brand;
	double price;
	int engines;
	int year;
	int fuelCap;
	int speed;
	int wt;
	int cap;
	
	public Aeroplane() {
		
	}

	public Aeroplane(String brand, double price, int engines, int year, int fuelCap, int speed, int wt, int cap) {
		super();
		this.brand = brand;
		this.price = price;
		this.engines = engines;
		this.year = year;
		this.fuelCap = fuelCap;
		this.speed = speed;
		this.wt = wt;
		this.cap = cap;
	}
	
	public void displayAeroplane() {
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Engines: "+engines);
		System.out.println("Year: "+year);
		System.out.println("FuelCap: "+fuelCap);
		System.out.println("Speed: "+speed);
		System.out.println("weight: "+wt);
		System.out.println("capacity: "+cap);
	}
}
