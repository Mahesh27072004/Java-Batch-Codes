package DerivedTypecasting.Upcasting;
import Inheritance.super_call.*;

// upcasting is the process of converting or storing the subclass object reference into superclass type.
// it is achieved only in IS-A Relationship(inheritance)
// it helps to achieve Generalization (i.e even if the object has the members of subclass but it cant use it he can only use the members of superclass)
// upcasting meaning in simple way forces the subclass to only act like superclass.
// it is done implicitly
// syntax: 
public class DoctorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d1 = new Cardiologist("Pradeep","Susan","MBBS",4,"Cardio","Heart");
		d1.displayDoctor();
		//d1.displayCardiologist();// as it is the method of cardiologist and object type is also of cardiologist still we cant use it, beacause of upcasting to Doctor so we can use only the members of the doctor.
	}

}
