package Inheritance.Multilevel_Inheritance;

public class Collage extends University {
	String collegeName;
	int clgYear;
	int student;
	String principal;
	
	Collage(){}
	
	Collage(String collegeName, int clgYear, int student, String principal,String uniName,int year,int collegeCnt,String vc,String chancellor)
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
	}
	
	public void displayCollege()
	{
		displayUniversity();
		System.out.println("College Name: "+collegeName);
		System.out.println("College Istablish Year: "+clgYear);
		System.out.println("Student Count: "+student);
		System.out.println("Principal: "+principal);
	}

}
