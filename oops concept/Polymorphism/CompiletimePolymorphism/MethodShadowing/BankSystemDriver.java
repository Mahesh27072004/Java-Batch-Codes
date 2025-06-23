package Polymorphism.CompiletimePolymorphism.MethodShadowing;

public class BankSystemDriver {
	public static void main(String[] args) {
        // Case 1: Regular User
        User u1 = new User("Mahesh", "SB12345678", 15000);
        u1.displayDetails();
        User.getSupportInfo();   // Static call from class
        u1.getSupportInfo();     // Static call from object (still uses class type)
        User.login();            // Static call

        System.out.println("-------------");

        // Case 2: Premium User
        PremiumUser p1 = new PremiumUser("Sneha", "PR98765432", 50000, 5.0);
        p1.displayDetails();
        PremiumUser.getSupportInfo();  // Shadowed static method
        p1.getSupportInfo();           // Still uses PremiumUser type directly
        PremiumUser.login();           // Shadowed login method

        System.out.println("--------------");

        // Case 3: Reference of User pointing to PremiumUser (method shadowing in action)
        User u2 = new PremiumUser("Ravi", "PR10203040", 80000, 3.5);//upcasting
        u2.displayDetails();       // Dynamic dispatch: PremiumUser's version
        u2.getSupportInfo();       // Compile-time binding: User's version (shadowed)
        u2.login();                // Compile-time binding: User's login method 
        // as we can see clearly even if the object type is of PremiumUser still the priority is given to the static methods of the refernce type(i.e User) not to the object type this is called method shadowing
        // because in method overriding instance methods or nonstatic methods gets excuted in runtime i.e dynamic dispatch means at compile time it is binded with the referncetype method but at runtime the method of objecttype gets excuted which is called as method overriding
        // so in simple terms if a instance or nonstatic methods gets overriden then it is called as method overriding and if the static method get overriden its called as method shadowing 
        // method overriding comes under runtime polymorphism as the actual excution of which method should be done is decided at runtime.
        // method shadowing comes under compile time poly.. as the compiler do the the binding same method will be excuting.
	}
}
