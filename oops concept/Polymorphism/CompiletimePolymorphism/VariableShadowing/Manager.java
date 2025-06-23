package Polymorphism.CompiletimePolymorphism.VariableShadowing;

public class Manager extends Employee {
	private String name;       // Shadows Employee.name
    private double salary;     // Shadows Employee.salary
    private String department;

    public Manager() {
    	
    }
    public Manager(String empName, double empSalary, String mgrName, double mgrSalary, String department) {
        super(empName, empSalary);
        this.name = mgrName;
        this.salary = mgrSalary;
        this.department = department;
    }

    // Getters
    public String getManagerName() {
        return name;
    }

    public double getManagerSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
    @Override
    public void display() {
        System.out.println("Manager's Name: " + name);              // Manager's name (shadowed)
        System.out.println("Manager's Salary: ₹" + salary);         // Manager's salary (shadowed)
        System.out.println("Manager's Department: " + department);
        System.out.println("Base Employee Salary (super): ₹" + super.getSalary());// to access the salary of Employee
    }
}
