public class BankAccountDriver{
	public static void main(String[] args){
		BankAccount b = new BankAccount("mahesh", "BOM", 6022763473l, "MAHB0001648", 2345);
		b.showdetails();
		b.credit(6022763473l, 2345, 10000);
		System.out.println(b.getBal(6022763473l, 2345));
		b.debit(6022763473l, 2345, 4500);
		System.out.println(b.getBal(6022763473l, 2345));
	}
}