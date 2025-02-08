import java.util.Scanner;
class FactOfDigits
{
	public static void main(String [] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		int rem = 0;
		int sum = 0 ; 
		while(num>0)
		{
			 rem = num%10;
			int fact = 1;
			for(int j = rem; j>=1; j--)
			{
				fact *= j;
			}
			sum+=fact;
			
			num/=10;
		}
		System.out.println("the sum of factorial of each digits of the number is :"+sum);
	}
}