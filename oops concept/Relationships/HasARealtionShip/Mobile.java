package HasARealtionShip;
import HasARealtionShip.CombiningBothAggregationCompisition.*;
public class Mobile {
	private String brand;
	private String model;
	private String color;
	private double price;
	private int camera;
	private Processor processor;
	SimCard[] simcards = new SimCard[2];
	private Charger charger;
	private HeadPhone headphone ;
	int indx = 0;
	
	private Battery battery = new Battery( "Xiaomi", "5100mah",  67,  "05/08/2023",  5) ;
	
	
	
	public Processor getProcessor() {
		return processor;
	}
	
	public HeadPhone getHeadphone() {
		return headphone;
	}
	
	public Battery getBattery() {
		return battery;
	}
	public Charger getCharger() {
		return charger;
	}
	public Mobile(String brand, String model, String color, double price, int camera, Processor processor) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.camera = camera;
		this.processor = processor;
		
		System.out.println("Mobile Created Successfully!");
	}
	

	public SimCard[] getSimcards() {
		return simcards;
	}

	public void displayMobile() {
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Color : "+color);
		System.out.println("Price : "+price);
		System.out.println("camera : "+camera+" PX");
		System.out.println("===========================");
	}
	
	public void addSimcard(String serviceProvider, String networkType, String type, long number) {
		if(indx<=1) {
			SimCard sim =new SimCard(serviceProvider, networkType, type, number);
			System.out.println(sim.getServiceProvider()+" sim has been inserted");
			simcards[indx]= sim;
			indx++;
		}
		else {
			System.out.println("no space !! you can only keep maximum two simcards in the mobile ");
		}
		
	}
	
	public void addHeadPhone(String brand, String type, String driver, double price) {
		headphone = new HeadPhone(brand,type,driver,price);
	}
	
	public void addCharger( String brand, int power, String type) {
		charger = new Charger(brand, power, type);
	}
	
	
}
