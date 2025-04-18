package HasARealtionShip.Aggregation;

public class WaterBottle {
	String material;
	String brand;
	String capacity;
	double price;
	
	
	public WaterBottle(String material, String brand, String capacity, double price) {
		super();
		this.material = material;
		this.brand = brand;
		this.capacity = capacity;
		this.price = price;
		
		System.out.println("Water bottle has been inserted in the bag!");
		System.out.println("===================================");
	}

	public void disaplayBottle() {
		System.out.println("-----Water Bottle Details-------");
		System.out.println("Brand : "+brand);
		System.out.println("material : "+material);
		System.out.println("capacity: "+capacity);
		System.out.println("price : "+price);
		System.out.println("==================================");
		
	}
}
