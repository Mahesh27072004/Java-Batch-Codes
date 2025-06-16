package Inheritance.Hierarchical_Inheritance;

public class Neurologist extends Doctor {
	String spl;
	String organ;
	Neurologist(String name,String hospital,String degree,int exp,String spl,String organ)
	{
		super(name,hospital,degree,exp);//super call statement
		
		this.spl = spl;
		this.organ = organ;
	}
	
	public void displayNeurologist()
	{
		displayDoctor();
		
		System.out.println("Speceilizatoin: "+spl);
		System.out.println("Organ: "+organ);
	}
}
