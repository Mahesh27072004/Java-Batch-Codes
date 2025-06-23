package Polymorphism.CompiletimePolymorphism.MethodShadowing;

public class PremiumUser extends User {
	double cashbackRate;

    public PremiumUser(String name, String accountNumber, double balance, double cashbackRate) {
        super(name, accountNumber, balance);
        this.cashbackRate = cashbackRate;
    }

    // Overriding instance method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Cashback Rate: " + cashbackRate + "%");
    }

    // Static method shadowing
    public static void getSupportInfo() {
        System.out.println("Call 1800-PREMIUM-HELP for priority support.");
    }

    // Static method shadowing
    public static void login() {
        System.out.println("Logging in as a premium user...");
    }
}
