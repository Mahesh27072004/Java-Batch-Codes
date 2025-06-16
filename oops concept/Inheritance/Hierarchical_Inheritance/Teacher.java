package Inheritance.Hierarchical_Inheritance;

public class Teacher extends Person {
	String subject;
	int exp;
	double salery;
	String college;
	
	Teacher(){}
	
	Teacher(String name, int age,long phno,long aadhar,String subject,int exp,double salery,String college)
	{
		this.name = name;
		this.aadhar = aadhar;
		this.age = age;
		this.phno = phno;
		
		this.subject = subject;
		this.salery = salery;
		this.exp =exp;
		this.college = college;
	}
	
	public void displayTeacher()
	{
		displayPerson();
		System.out.println(subject);
		System.out.println(exp);
		System.out.println(salery);
		System.out.println(college);
	}
}
