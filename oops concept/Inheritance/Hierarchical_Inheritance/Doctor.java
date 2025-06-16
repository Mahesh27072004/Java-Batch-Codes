package Inheritance.Hierarchical_Inheritance;

public class Doctor {
	String name;
	String hospital;
	String degree;
	int exp;
	
	public Doctor() {}
	
	Doctor(String name,String hospital,String degree,int exp)
	{
		this.name = name;
		this.hospital = hospital;
		this.degree = degree;
		this.exp = exp;
	}
	
	public void displayDoctor()
	{
		System.out.println("Name: "+name);
		System.out.println("Hospital: "+hospital);
		System.out.println("Degree: "+degree);
		System.out.println("Experience: "+exp);
	}
}
