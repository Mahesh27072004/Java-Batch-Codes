package HasARealtionShip;

public class Mobile {
	private String brand;
	private String model;
	private String color;
	private double price;
	private int camera;
	private OperatingSystem os;
	private Battery battery = new Battery( "Xiaomi", "5100mah",  67,  "05/08/2023",  5) ;
	
	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public double getCamera() {
		return camera;
	}
	
	public OperatingSystem getOS() {
		return os;
	}
	public Battery getBattery() {
		return battery;
	}
	public Mobile(String brand, String model, String color, double price, int camera, OperatingSystem os) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.camera = camera;
		this.os = os;
		
		System.out.println("Mobile Created Successfully!");
	}

	public void displayMobile() {
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Color : "+color);
		System.out.println("Price : "+price);
		System.out.println("camera : "+camera+" PX");
		System.out.println("===========================");
	}
	
	
}
