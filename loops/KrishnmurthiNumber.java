import java.util.Scanner;
class KrishnmurthiNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the  num:");
		int num = sc.nextInt();
		int sum=0, dup = num, len = 0;

		
		while(num>0)
		{
			int rem = num%10;
			int fact = 1;
			for(int i=1; i<=rem;i++)
			{
				fact*=i;
			}
			sum+=fact;
			num/=10;
		}
		System.out.println(dup == sum ? dup+" is a KrishnmurthiNumber number " : dup+" is not an KrishnmurthiNumber number");
	}
}