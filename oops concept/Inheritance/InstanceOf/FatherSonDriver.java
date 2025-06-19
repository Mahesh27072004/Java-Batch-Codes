package Inheritance.InstanceOf;
import Inheritance.Super_Keyword.*;

// instanceof operator is a binary operator
// syntax : obj_ref instanceof Class_Name;
// is used to check whether the object reference contains all the members of the class specified. 
public class FatherSonDriver {
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s instanceof Son);//true
		System.out.println(s instanceof Father);//true
		
		Father f = new Father();
		System.out.println(f instanceof Son);// false
		System.out.println(f instanceof Father);// true
	}
}
