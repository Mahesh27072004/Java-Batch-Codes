package DerivedTypecasting.ClassCastException;
import Inheritance.Multilevel_Inheritance.*;

public class UniversityDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University u1 = new Collage("Late G N Sapkal Collage of Engineering, Nashik",2009,1000,"S.B.Bagal","SPPU",1949,134,"Dr.Suresh Gosavi","C.P.Radhakrushnan");
		u1.displayUniversity();
		//u1.displayCollege();// it wont get access or executed as the Collage is upcasted to University
		
		// but What if we downcast it to any other class which don't have the members of the actual object or it has its own extra members other than the members of the object created
		// this problem is not a error its an exception which we programmer should handle 
		// the exception is known as ClassCastexception.
		// i.e a abnormal situation which occurs when the parent object does not have the members of the subclass.
		// it usually happens if the reference is directly downcasting to the class from which it is not upcasted 
		
		// so as in above code, object of Collage is upcasted to the reference type of University, then if we try to downcast it to the Department(subclass of collage) then the exception will occur
		System.out.println("------------");
		Collage c1 = (Collage) u1;
		c1.displayCollege();
		System.out.println("=================");
		Department d1 = (Department) u1;//ClassCastException
		// the program will stop excuting here. so the below statements will not be executed.
		d1.displayCollege();
		System.out.println("-------------");
		d1.displayUniversity();
		System.out.println("-------------");
		
		
		
	}

}
