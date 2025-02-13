import java.util.Scanner;
class ArmstrongNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the  num:");
		int num = sc.nextInt();
		int sum=0, dup = num, len = 0;
		for(int i = num;i>0;i/=10)
			len++;
		
		while(num>0)
		{
			int rem = num%10;
			int pow = 1;
			for(int i=1; i<=len;i++)
			{
				pow*=rem;
			}
			sum+=pow;
			num/=10;
		}
		System.out.println(dup == sum ? dup+" is a armstrong number " : dup+" is not an armstrong number");
	}
}