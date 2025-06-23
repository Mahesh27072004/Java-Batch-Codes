package Polymorphism.CompiletimePolymorphism.MethodShadowing;

public class User {
	String name;
    String accountNumber;
    double balance;

    public User(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("User Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    // Static method (will be shadowed)
    public static void getSupportInfo() {
        System.out.println("Call 1800-USER-HELP for general support.");
    }

    // Static method for login
    public static void login() {
        System.out.println("Logging in as a basic user...");
    }
}
