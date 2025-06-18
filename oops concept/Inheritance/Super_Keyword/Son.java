package Inheritance.Super_Keyword;

public class Son extends Father {
	String name = "Kush";
	
	
	public void displayName()
	{
		super.displayName();// super is calling to the displayName() method from the superclass
		System.out.println("Son Name: "+name);
		System.out.println("Father Name: "+super.name);// the name variable is same for both Father and Son so using super we can simply refer to Father which helps to write code in more understandable or readable format
	}
}
