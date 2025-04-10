

public class Student {
	private String institute = "Qspiders";
	private String name;
	private String course;
	private double fees;
	private String branch;
	private double cgpa;
	private String degree;
	private double sscPer;
	private double hscPer;
	private long phno;
	
	public Student(String name,String course,double fees,String branch,double cgpa,String degree,double sscPer,double hscPer,long phno) 
	{
		this.name = name;
		this.course = course;
		this.fees =fees;
		this.branch=branch;
		this.cgpa = cgpa;
		this.degree = degree;
		this.sscPer =sscPer;
		this.hscPer = hscPer;
		this.phno=phno;
		System.out.println(name+" Student Registered");
	}
	//getters
	public String getInstituteName() {
		return institute;
	}
	public String getName()
	{
		return name;
	}
	public String getCourse()
	{
		return course;
	}
	public double getFees()
	{
		return fees;
	}
	public String getBranch()
	{
		return branch;
	}
	
	public double getCgpa()
	{
		return cgpa;
	}
	public String getDegree()
	{
		return degree;
	}
	public double getSscPer()
	{
		return sscPer;
	}
	public double getHsc()
	{
		return hscPer;
	}
	public long getPhno()
	{
		return phno;
	}
	//setters
	public void setBranch(boolean permission,String branch)
	{
		if(permission)
		{
			this.branch=branch;
		}
		else
		{
			System.out.println("To Change The Branch Please Take Permission");		
		}
	}
	public void setPhno(boolean permission,long phno)
	{
		if(permission)
		{
			this.phno = phno;
			System.out.println("phone number updated!");
		}
		else
		{
			System.out.println("To Change The Number Please Take Permission");
		}
	}
}