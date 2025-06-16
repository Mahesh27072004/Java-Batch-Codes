package Inheritance.Hierarchical_Inheritance;

public class Student extends Person {
	int year;
	String college;	
	String subjects;
	double score;
	
	Student(){}
	
	Student(String name, int age,long phno,long aadhar,int year,String college,String subjects,double score)
	{
		this.name = name;
		this.aadhar = aadhar;
		this.age = age;
		this.phno = phno;
		
		this.year = year;
		this.college = college;
		this.subjects = subjects;
		this.score = score;
	}
	
	public void displayStudent()
	{
		displayPerson();
		System.out.println(year);
		System.out.println(college);
		System.out.println(subjects);
		System.out.println(score);
	}
}
