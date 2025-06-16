package Inheritance.Hierarchical_Inheritance;

public class Person {
	String name;
	int age;
	long phno;
	long aadhar;
	
	Person(){}
	
	Person(String name, int age,long phno,long aadhar)
	{
		this.name = name;
		this.aadhar = aadhar;
		this.age = age;
		this.phno = phno;
	}
	
	public void displayPerson()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(phno);
		System.out.println(aadhar);
	}
}
