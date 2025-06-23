package Polymorphism.CompiletimePolymorphism.VariableShadowing;

public class Employee {
	 	private String name;
	    private double salary;
	    public Employee() {
	    	
	    }
	    public Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void display() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Salary: ₹" + salary);
	    }
}
