package HasARealtionShip.Aggregation;

import java.util.ArrayList;

public class Bag {
	String brand;
	String type;
	String material;
	double price;
	int capacity;
	String color;
	ArrayList<Book> listBook = new ArrayList<>();
	int bookCount = 0;
	ArrayList<Pen> listPen = new ArrayList<>();
	int penCount = 0;
	
	public Bag(String brand, String type, String material, double price, int capacity, String color) {
		super();
		this.brand = brand;
		this.type = type;
		this.material = material;
		this.price = price;
		this.capacity = capacity;
		this.color = color;
		
		System.out.println("Bag is Ready to fill");
	}
	
	public void displayBag() {
		System.out.println("");
	}
	
	public void addBook( String type, String brand, String size, int pages, double price) {
		
		if(bookCount <=10) {
			Book book = new Book(type,  brand,  size,  pages,  price);
			listBook.add(book);
			bookCount++;
			if(bookCount == 1) {
				System.out.println(bookCount+" Book has been inserted in the bag!");
			}else {
				System.out.println(bookCount+" Books has been inserted in the bag!");
			}
			
			for(Book ele:listBook) {
				ele.displayBook();
			}
			
		}else {
			System.out.println("insufficient space!!");
		}
		
	}
	
	public void addPen( String type, String brand, String color, double price) {
		
		if(penCount <= 10) {
			Pen pen = new Pen(type, brand, color, price);
			listPen.add(pen);
			penCount++;
			if(penCount == 1) {
				System.out.println(penCount+" Pen has been added in the bag!");
			}else {
				System.out.println(penCount+" Pens has been added in the bag!");
			}
			
			for(Pen ele:listPen) {
				ele.displayPen();
			}
			
		}else {
			System.out.println("insufficient space!!");
		}
	}
	
	public void addWaterBottle(String material, String brand, String capacity, double price) {
		WaterBottle bottle = new WaterBottle(material, brand, capacity, price);
	}
}

















