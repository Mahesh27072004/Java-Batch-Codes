
public class StudentDriver {

	public static void main(String[] args) {
		Student s1 = new Student("Mahesh","Java Full Stack",0,"Deccan",9.55,"BE",82.40,84.83,9370682720l);
		System.out.println(s1.getBranch());
		System.out.println(s1.getInstituteName());
		s1.setBranch(false, "WAKAD");
		s1.setPhno(true, 9822740586l);
	}
}