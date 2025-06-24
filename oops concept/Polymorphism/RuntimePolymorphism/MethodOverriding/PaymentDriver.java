package Polymorphism.RuntimePolymorphism.MethodOverriding;

public class PaymentDriver {

	public static void main(String[] args) {
		 // Upcasting all payment types to Payment reference
        Payment payment;

        // Credit Card Payment
        payment = new CreditCardPayment("TXN1001", 2500.00, 1234567890123456l, "Mahesh Sanap", "12/27");
        payment.processPayment();  // Dynamic dispatch

        // UPI Payment
        payment = new UPIPayment("TXN1002", 1500.00, "mahesh@upi", "Mahesh");
        payment.processPayment();  // Dynamic dispatch

        // Wallet Payment
        payment = new WalletPayment("TXN1003", 1200.00, "Paytm", "9876543210");
        payment.processPayment();  // Dynamic dispatch
	}

}
