package HasARealtionShip.Aggregation;

import java.util.ArrayList;

public class Pen {
	String type;
	String brand;
	String color;
	double price;
	
	
	public Pen(String type, String brand, String color, double price) {
		super();
		this.type = type;
		this.brand = brand;
		this.color = color;
		this.price = price;
		
		System.out.println("===================================");
	}

	public void displayPen() {
		System.out.println("-----Pen Details-------");
		System.out.println("Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("color : "+color);
		System.out.println("price : "+price);
		System.out.println("==============================");
		
	}
}
