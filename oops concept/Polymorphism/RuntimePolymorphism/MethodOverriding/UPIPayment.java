package Polymorphism.RuntimePolymorphism.MethodOverriding;

public class UPIPayment extends Payment  {
	 private String upiId;
	 private String userName;

	 public UPIPayment(String transactionId, double amount, String upiId, String userName) {
	        super(transactionId, amount);
	        this.upiId = upiId;
	        this.userName = userName;
	 }

	 @Override
	 public void processPayment() {
	        System.out.println("\n[UPI Payment]");
	        System.out.println("Transaction ID: " + transactionId);
	        System.out.println("Amount: ₹" + amount);
	        System.out.println("User: " + userName);
	        System.out.println("UPI ID: " + upiId);
	        System.out.println("Sending UPI request for approval...");
	 }
}
