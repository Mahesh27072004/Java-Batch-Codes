package Inheritance.Hierarchical_Inheritance;

public class PersonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1 = new Teacher("Nilesh",40,8957492939l,123456789012l,"BLOCKCHAIN",15,80000,"LGNSCOE");
		t1.displayPerson();
		t1.displayTeacher();
		
		System.out.println("------------------------");
		
		Student s1 = new Student("Mahesh",22,9876543210l,987654321012l,4,"LGNSCOE","MACHINE LEARNING,SOFTWARE TESTING,CYBER SECURITY,BLOCKCHAIN,DESIGN AND ANALYSIS OF ALGORTIHTMS,DATA SCIENCE",84.4);
		s1.displayPerson();
		s1.displayStudent();
	}

}
