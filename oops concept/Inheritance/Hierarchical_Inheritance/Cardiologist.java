package Inheritance.Hierarchical_Inheritance;

public class Cardiologist extends Doctor {
	String spl;
	String organ;
	
	public Cardiologist(){}
	
	Cardiologist(String name,String hospital,String degree,int exp,String spl,String organ)
	{
		super(name,hospital,degree,exp);
		
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
