package Inheritance.SingleLevel;

public class Country {
	private String name;
	private String language;
	private int countryCode;
	private String pM;
	private long population;
	private String currency;
	private int states;
	
	public Country() {
		
	}

	public Country(String name, String language, int countryCode, String pM, long population, String currency,
			int states) {
		super();
		this.name = name;
		this.language = language;
		this.countryCode = countryCode;
		this.pM = pM;
		this.population = population;
		this.currency = currency;
		this.states = states;
	}
	
	public void displayCountry(){
		System.out.println("******Country Details*******");
		System.out.println("Name : "+name);
		System.out.println("Language : "+language);
		System.out.println("President : "+pM);
		System.out.println("Country code : "+countryCode);
		System.out.println("Population : "+population);
		System.out.println("Currency : "+currency);
		System.out.println("States : "+states);
		System.out.println("==============================");
	}
	
}
