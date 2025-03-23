import java.util.Scanner;
class CurrencyCon
{
	public static void rupeeTODollar(double rupee)
	{
		double dollar = rupee/87.15;
		System.out.println(rupee+" rupee to dollar is "+dollar);
		dollarToEuro(dollar);
	}
	
	public static void dollarToEuro(double dollar)
	{
		double euro = dollar*0.95;
		System.out.println(dollar+" dollar to Euro is "+euro);
		euroToDirham(euro);
		
	}
	
	public static void euroToDirham(double euro){
		double dirham = euro*3.85;
		System.out.println(euro+" euro to Dirham is "+dirham);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double rupee = sc.nextInt();
		rupeeTODollar(rupee);
	}
}