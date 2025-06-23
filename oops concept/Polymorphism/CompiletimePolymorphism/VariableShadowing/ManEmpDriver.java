package Polymorphism.CompiletimePolymorphism.VariableShadowing;

public class ManEmpDriver {
	 public static void main(String[] args) {
	        Manager mgr = new Manager(
	            "Mahesh Sanap",      // Employee name (passed to superclass)
	            35000.00,            // Employee salary (passed to superclass)
	            "Pratik Chaudhari",         // Shadowed manager name
	            70000.00,            // Shadowed manager salary
	            "IT Department"      // Manager-specific field
	        );

	        mgr.display();
	        //variable shadowing is also the part of compile time polymorphism
	        // so here the binding happens with the help of refernce type not with the help of objecttype.
	        // the variable will be accessed on the basis of the reference type declared
	        // if the referencetype is of manager the members of Manager(subclass) will get called not of the Empolyee(Superrclass) that means it gets shadowed.

	        System.out.println("\nAccessing via Employee reference:");
	        Employee empRef = mgr;// upcasting
	        System.out.println("Name from Employee reference: " + empRef.getName());    // From Employee
	        System.out.println("Salary from Employee reference: ₹" + empRef.getSalary()); // From Employee
	        empRef.display(); // Calls Manager's display due to method overriding(dynamic dispatch)
	    }
}
