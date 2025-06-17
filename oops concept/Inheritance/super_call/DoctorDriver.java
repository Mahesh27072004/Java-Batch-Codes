package Inheritance.super_call;

public class DoctorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cardiologist c1 = new Cardiologist("Pradeep","Susan","MBBS",4,"Cardio","Heart");
		c1.displayDoctor();
		System.out.println(".............");
		c1.displayCardiologist();
		System.out.println("----------------------------------");
		Neurologist n1 = new Neurologist("Satish","Susan","MBBS",3,"Neurology","Brain");
		n1.displayDoctor();
		System.out.println(".............");
		n1.displayNeurologist();
	}

}
