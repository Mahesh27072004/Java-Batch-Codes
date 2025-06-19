package DerivedTypecasting.Downcasting;

import Inheritance.super_call.*;
// downcasting is the process of converting or storing the upcasted reference back to its respective subclass type
// it is not done implicitly 
// we have to do it explicitly using typecast operator
public class DoctorDriver {

	public static void main(String[] args) {
			Doctor d1 = new Cardiologist("Pradeep","Susan","MBBS",4,"Cardio","Heart");
			d1.displayDoctor();
			//d1.displayCardiologist();// not possible as the object is upcasted to Doctor
			// so to get back the object back to its original form to use its own members also we need to do downcating
			// so we can achieve downcasting only if the object is upcasted
			// if do downcasting without doing upcasting then it will gives a Exception Called as ClassCastException
			System.out.println("------------------");
			
			Cardiologist c1 = (Cardiologist) d1;// here we have to use typecast operator in which we have to specify to which type we want to convert the ref.
			
			c1.displayDoctor();
			System.out.println("------------------");
			c1.displayCardiologist();
	}

}
