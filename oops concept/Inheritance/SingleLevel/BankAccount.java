package Inheritance.SingleLevel;

public class BankAccount {
	String name;
	String bankName;
	String ifsc;
	long accno;
	long phno;
	long aadhar;
	int pin;
	String branch;
	
	public BankAccount() {
		
	}
	
	public BankAccount(String name, String bankName, String ifsc, String branch, long accno, long phno,long aadhar, int pin ) {
		this.name = name;
		this.bankName = bankName;
		this.ifsc = ifsc;
		this.branch = branch;
		this.accno = accno;
		this.phno = phno;
		this.aadhar = aadhar;
		this.pin = pin;		
	}
	
	public void displayBankAcc() {
		System.out.println(name);
		System.out.println(bankName);
		System.out.println(ifsc);
		System.out.println(branch);
		System.out.println(accno);
		System.out.println(phno);
		System.out.println(aadhar);
	}
	

}
