package Polymorphism.CompiletimePolymorphism.MethodOverloading;

public class BankDriver {

	public static void main(String[] args) {
		Bank b = new Bank();
		
		b.transferFunds(1234567890l, 5000.00);
        b.transferFunds(1234567890l, 7500.00, "SBIN0001234");
        b.transferFunds("mahesh@upi");
        b.transferFunds("mahesh@upi", 250.00);

	}

}
