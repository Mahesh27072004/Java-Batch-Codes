package Polymorphism.RuntimePolymorphism.MethodOverriding;

public class CreditCardPayment extends Payment {
	private long cardNumber;
    private String cardHolder;
    private String expiryDate;

    public CreditCardPayment(String transactionId, double amount, long cardNumber, String cardHolder, String expiryDate) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment() {
        System.out.println("\n[Credit Card Payment]");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Verifying card details and processing payment...");
    }
}
