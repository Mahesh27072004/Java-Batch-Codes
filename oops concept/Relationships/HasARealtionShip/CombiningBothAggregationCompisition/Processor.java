package HasARealtionShip.CombiningBothAggregationCompisition;

import HasARealtionShip.OperatingSystem;

public class Processor {
	private String type;
	private String netType;
	private double clockSpeed;
	private int ram;
	private int rom;
	private OperatingSystem os;
	public Processor(String type, String netType, double clockSpeed, int ram, int rom) {
		super();
		this.type = type;
		this.netType = netType;
		this.clockSpeed = clockSpeed;
		this.ram = ram;
		this.rom = rom;
		this.os = new OperatingSystem("Android 13","Xiaomi HyperOS",128,"26/10/2023");
		System.out.println("Processor is ready with OS installed inbuilt");
	}
	
	public void diaplayProcessor(String type, String netType, int clockSpeed, int ram, int rom) {
		System.out.println("Processor [type=" + type + ", netType=" + netType + ", clockSpeed=" + clockSpeed + ", ram=" + ram
				+ ", rom=" + rom + ", os=" + os + "]");
	}
	
	public OperatingSystem getos() {
		return os;
	}
	
	
	
}
