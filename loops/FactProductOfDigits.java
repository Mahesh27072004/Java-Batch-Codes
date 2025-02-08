import java.util.Scanner;
class FactProductOfDigits
{
	public static void main(String [] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		int rem = 0;
		int pro = 1;
		while(num>0)
		{
			rem = num%10;
			int fact1 = 1;
			for(int i = 1; i<=rem;i++)
			{
				fact1*=i;
			}
			pro *= fact1;
			num/=10;
		}
		System.out.println("the Product of factorial of digits of the number is :"+pro);;
	}
}