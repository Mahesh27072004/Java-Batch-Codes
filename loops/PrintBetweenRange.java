import java.util.Scanner;
class PrintBetweenRange
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the start of range:");
		int start = sc.nextInt();
		System.out.print("enter the end of range:");
		int end = sc.nextInt();
		int cnt = 0;
		for(int i=start; i<=end; i++)
		{
			
			boolean flag = true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j == 0)
				{
					flag = false;
					break;
				}	
			}
			if(flag){
				cnt++;
				System.out.print(i+" ");
			}
		}
		System.out.println("\n total primes are :"+cnt);
	}
}