package Inheritance.SingleLevel;

public class State extends Country {
	private String name;
	private String language;
	private int dist;
	private String cm;
	private long pop;
	private double area;
	
	public State() {
		
	}

	public State(String name1, String language1, int countryCode, String pM, long population, String currency,
			int states, String name, String language, int dist, String cm, long pop, double area) {
		//calling parent constructor
		super( name,  language,  countryCode,  pM,  population,  currency, states);
		this.name = name;
		this.language = language;
		this.dist = dist;
		this.cm = cm;
		this.pop = pop;
		this.area = area;
	}
	
	public void displayState() {
		System.out.println("******State Details*******");
		System.out.println("Name : "+name);
		System.out.println("Language : "+language);
		System.out.println("ChiefMinister : "+cm);
		System.out.println("Population : "+pop);
		System.out.println("Districts : "+dist);
		System.out.println("Area : "+area);
		System.out.println("==============================");
	}
}
