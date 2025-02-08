import java.util.Scanner;
class TaxSlab
{
	public  static void main(String[] args)
	{
		System.out.print("enter your income: ");
		Scanner sc = new Scanner(System.in);
		float income = sc.nextFloat();
		float tax= 0;
		if(income >= 3000000){
			tax = (income*25)/100;
			System.out.println("tax cutted: "+tax);
		}else if(income >= 1500000){
			tax = (income*21)/100;
			System.out.println("tax cutted: "+tax);
		}else if(income >= 1200000){
			tax = (income*18)/100;
			System.out.println("tax cutted: "+tax);
		}else{
			System.out.println("You don't need to pay tax");
		}
	}
}