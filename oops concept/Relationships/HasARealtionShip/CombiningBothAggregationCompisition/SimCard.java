package HasARealtionShip.CombiningBothAggregationCompisition;

public class SimCard {
	private String serviceProvider;
	private String networkType;
	private String type;
	private long number;
	
	public String getServiceProvider() {
		return serviceProvider;
	}
	
	public SimCard(String serviceProvider, String networkType, String type, long number) {
		super();
		this.serviceProvider = serviceProvider;
		this.networkType = networkType;
		this.type = type;
		this.number = number;
		
	}


	public void displaySim() {
		System.out.println( "SimCard Details-----\nserviceProvider=" + serviceProvider + ",\nnetworkType=" + networkType + ",\ntype=" + type
				+ ",\nnumber=" +number + "\n----------------");
	}
	
	
}
