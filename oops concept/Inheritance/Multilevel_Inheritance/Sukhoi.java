package Inheritance.Multilevel_Inheritance;

public class Sukhoi extends FighterPlane {
	String model;
	int years;
	String weapons;
	String country;
	String service;
	
	public Sukhoi() {
		
	}

	public Sukhoi(String brand, double price, int engines, int year, int fuelCap, int speed, int wt, int cap, int gen,
			int seat, int range, String type, String refuel,String model, int years, String weapons, String country, String service) {
		super(brand, price, engines, year, fuelCap, speed, wt, cap, gen, seat, range, type, refuel);
		this.model = model;
		this.years = years;
		this.weapons = weapons;
		this.country = country;
		this.service = service;
	}
	
	public void displaySukhoi() {
		displayFighterPlane();
		System.out.println("Model: "+model);
		System.out.println("Years: "+years);
		System.out.println("Weapons: "+weapons);
		System.out.println("Country: "+country);
		System.out.println("Service: "+service);
		System.out.println("----------------");
	}
}
