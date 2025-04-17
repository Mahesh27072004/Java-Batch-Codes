package HasARealtionShip;

public class OperatingSystem {
	private String version;
	private String name;
	private double memory;
	private String releaseDate;
	
	
	public OperatingSystem(String version, String name, double memory, String releaseDate) {
		super();
		this.version = version;
		this.name = name;
		this.memory = memory;
		this.releaseDate = releaseDate;
		
		System.out.println("Operating System Installed!");
	}
	
	public String getVersion() {
		return version;
	}

	public String getName() {
		return name;
	}

	public double getMemory() {
		return memory;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void displayOS() {
		System.out.println("Version : "+version);
		System.out.println("Name : "+name);
		System.out.println("Memory : "+memory+" GB");
		System.out.println("Release date : "+releaseDate);	
		System.out.println("============================");
	}
	
	
}
