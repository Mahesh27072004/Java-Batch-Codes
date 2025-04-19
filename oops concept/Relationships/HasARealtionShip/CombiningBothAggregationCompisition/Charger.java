package HasARealtionShip.CombiningBothAggregationCompisition;

public class Charger {
	private String brand;
	private int power;
	private String type;
	public Charger(String brand, int power, String type) {
		super();
		this.brand = brand;
		this.power = power;
		this.type = type;
		System.out.println("chager has been attached to mobile");
		System.out.println("=================================");
	}

	public void displayCharger() {
		System.out.println( "Charger Details==================\nbrand=" + brand + ",\npower=" + power +"W" + ",\ntype=" + type + "\n-------------------------");
	}
	
	
}
