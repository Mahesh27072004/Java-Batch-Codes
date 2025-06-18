package Inheritance.Sealed_Class;
// sealed classes helps us to achieve control in inheritance
// where the parent class can decide which and all class can inherit it using the permits keyword
// the parent class must be declared as sealed
// the child can be marked as sealed, non-sealed, and final. 
public sealed class  Parent permits Child1,Child2 {
	String name = "Raju";
	int age = 50;
	
	public void displayParent()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
