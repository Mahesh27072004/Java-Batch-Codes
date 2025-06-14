package Inheritance.SingleLevel;

public class DebitAccount extends BankAccount {
		String type;
		double balance;
		double interestRate;
		
		DebitAccount(){}
		
		DebitAccount(String bankName,String ifsc, String branch,long phno,long aadhar,long accno,String name,String type,double balance,double interestRate)
		{
			this.bankName = bankName;
			this.ifsc = ifsc;
			this.branch = branch;
			this.phno = phno;
			this.aadhar = aadhar;
			this.accno = accno;
			this.name = name;
			
			this.type = type;
			this.balance = balance;
			this.interestRate = interestRate;
		}
		
		public void displayDebitAccount()
		{
			System.out.println("-------------------");
			displayBankAcc();
			System.out.println(type);
			System.out.println(balance);
			System.out.println(interestRate);
			System.out.println("-------------------");
	}
}

