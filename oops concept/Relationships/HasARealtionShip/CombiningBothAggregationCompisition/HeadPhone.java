package HasARealtionShip.CombiningBothAggregationCompisition;

public class HeadPhone {
	private String brand;
	private String type;
	private String driver;
	private double price;
	public HeadPhone(String brand, String type, String driver, double price) {
		super();
		this.brand = brand;
		this.type = type;
		this.driver = driver;
		this.price = price;
		System.out.println("headphones has been pluged to mobile");
		System.out.println("=================================");
	}
	
	public void displayHeadPhone() {
		System.out.println( "HeadPhone Details------------------- \nbrand=" + brand + ",\ntype=" + type + ",\ndriver=" + driver + ",\nprice=" + price+"\n----------------" );
	}
	
}
