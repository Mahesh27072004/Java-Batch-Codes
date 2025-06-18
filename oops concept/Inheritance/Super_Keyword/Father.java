package Inheritance.Super_Keyword;

// super keyword is use to represent the immediate superclass member when their is same name member in the child class
// so super helps to differentiate or to tell us to refer the member of immediate superclass or parent class not of the child class.
// as we know this keyword contains an reference of object whenever it get created, so that's why we can print this keyword
// but we can't print super as it never holds any actual reference or value.

public class Father {
	String name="Ram";
	
	public void displayName()
	{
		System.out.println("Father Name: "+name);
	}
}
