package Polymorphism.RuntimePolymorphism.MethodOverriding;

public class Payment {
	protected String transactionId;
    protected double amount;
    
    public Payment() {
    	
    }
    
    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    // Method to be overridden
    public void processPayment() {
        System.out.println("Processing generic payment of ₹" + amount);
    }

    // Getters
    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }
}
