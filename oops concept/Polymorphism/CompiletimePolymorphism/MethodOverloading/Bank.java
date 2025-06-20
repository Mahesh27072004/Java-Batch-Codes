package Polymorphism.CompiletimePolymorphism.MethodOverloading;

public class Bank {
//	1. transfer using account number and amount
	public void transferFunds(long accno, double amount) {
		System.out.println("Transferred rupess "+amount+" to account no: "+accno);
	}
	
//	2. transfer using account number , amount, and ifsc code
	public void transferFunds(long accno, double amount, String ifsc) {
		System.out.println("Transferred rupess "+amount+" to account no: "+accno+" via ifsc :"+ifsc);
	}
	
//  3. Transfer using UPI ID
    public void transferFunds(String upiId) {
        System.out.println("Transferred default ₹100 to UPI ID: " + upiId);
    }

//  4. Transfer using UPI ID and amount
    public void transferFunds(String upiId, double amount) {
        System.out.println("Transferred ₹" + amount + " to UPI ID: " + upiId);
    }
}
