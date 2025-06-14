package Inheritance.SingleLevel;

public class BankAccountDriver {
	public static void main(String[] args)
	{
		DebitAccount d1 = new DebitAccount("BOM","MAHB0001648","Nandur",234973498,9887649239l,893297823498l,"Mahesh","Debit",32300,1.5);
		d1.displayBankAcc();
		d1.displayDebitAccount();
}
}
