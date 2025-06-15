package Inheritance.Multilevel_Inheritance;

public class University {
	String uniName;
	int year;
	int collegeCnt;
	String vc;
	String chancellor;	
	
	University(){}
	
	University(String uniName, int year, int collegeCnt,String vc,String chancellor)
	{
		this.uniName = uniName;
		this.year = year;
		this.collegeCnt = collegeCnt;
		this.vc = vc;
		this.chancellor = chancellor;
	}
	
	public void displayUniversity()
	{
		System.out.println("University Name: "+uniName);
		System.out.println("Year Of Istablishment: "+year);
		System.out.println("College Affiliated: "+collegeCnt);
		System.out.println("Chancellor");
		System.out.println("Vice chancellor: "+vc);
	}
}
