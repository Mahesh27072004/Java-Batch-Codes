package Inheritance.Multilevel_Inheritance;

public class Department extends Collage{
	String deparment;
	int stdCount;
	String HOD;
	int classes;
	
	Department(){}
	
	Department(String collegeName, int clgYear, int student, String principal,String uniName,int year,int collegeCnt,String vc,String chancellor,String deparment,int stdCount,String HOD,int classes)
	{
		this.collegeCnt = collegeCnt;
		this.uniName = uniName;
		this.year = year;
		this.chancellor = chancellor;
		this.vc = vc;
		
		this.collegeName = collegeName;
		this.clgYear = clgYear;
		this.student = student;
		this.principal = principal;
		
		this.deparment = deparment;
		this.stdCount = stdCount;
		this.HOD = HOD;
		this.classes = classes;
	}
	
	public void displayDeparment()
	{
		displayCollege();
		System.out.println("Deparment: "+deparment);
		System.out.println("Student Count: "+stdCount);
		System.out.println("Head Of Deparment: "+HOD);
		System.out.println("Classes: "+classes);
	}

}
