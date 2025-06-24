package Polymorphism.RuntimePolymorphism.MethodOverriding;

public class WalletPayment extends Payment {
	private String walletProvider;
    private String mobileNumber;

    public WalletPayment(String transactionId, double amount, String walletProvider, String mobileNumber) {
        super(transactionId, amount);
        this.walletProvider = walletProvider;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("\n[Wallet Payment]");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Wallet: " + walletProvider);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Checking balance and completing payment...");
    }
}
