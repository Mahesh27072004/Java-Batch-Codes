package Inheritance.super_call;

public class Cardiologist extends Doctor {
	String spl;
	String organ;
	
	public Cardiologist(){}
	
	public Cardiologist(String name,String hospital,String degree,int exp,String spl,String organ)
	{
		super(name, hospital, degree, exp); // super call helps to load the non-static members of superclass into the object of the subclass
		// here the super call is invoking the constructor of the superclass to perform intialization of the non-static members to the object of subclass with the data provided by the subclass.
		// to super call helps to load the members of the superclass into subclass object at runtime.
		this.spl = spl;
		this.organ = organ;
	}
	
	public void displayCardiologist()
	{
		displayDoctor();
		
		System.out.println("Speceilizatoin: "+spl);
		System.out.println("Organ: "+organ);
	}
}
