package Inheritance.Sealed_Class;

public class ParentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 ch1 = new Child1();
		System.out.println(ch1.name);
		ch1.displayChidl1();
		
		Child2 ch2 = new Child2();
		System.out.println(ch2.name);
		ch2.displayChild2();
		
	}

}
