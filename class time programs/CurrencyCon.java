import java.util.Scanner;
class CurrencyCon
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("-------- Currency Converter -------------");
		System.out.println();
		System.out.print("enter the amount : ");
		float curr = sc.nextFloat();
		
		System.out.println();
		
		System.out.println("list of Currencies:");
		System.out.println("\n 1.USD \n 2.EUR \n 3.GBP \n 4.PKR");
		System.out.println();
		System.out.println("enter the currency to convert: ");
		String currName = sc.next().toUpperCase();
		float conCurr = 0;
		
		if(currName.equals("USD")){
			conCurr = curr / 86.56f;
			System.out.println(curr+" INR is "+String.format("%.2f",conCurr)+" USD");
		}
		else if(currName.equals("EUR")){
			conCurr = curr / 90.26f;
			System.out.println(curr+" INR is "+String.format(".2f",conCurr)+" EUR");
		}else if(currName.equals("GBP")){
			conCurr = curr / 107.67f;
			System.out.println(curr+" INR is "+String.format(".2f",conCurr)+" GBP");
		}else if(currName.equals("PKR")){
			conCurr = curr / 0.31f;
			System.out.println(curr+" INR is "+String.format(".2f",conCurr)+" PKR");
		}else if(currName.equals("REND")){
			conCurr = curr / 0.22f;
			System.out.println(curr+" INR is "+String.format(".2f",conCurr)+" REND");
		}else{
			System.out.println("INAVLID CURRENCY");
		}
		
		
	}
}
