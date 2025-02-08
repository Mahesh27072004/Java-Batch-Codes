import java.util.Scanner;
class NumberExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number : ");
		int num = sc.nextInt();
		int sum = 0, sum1 =0;
		int dup = num;
		
		while(num>0)
		{
			int rem = num%10;
			sum += rem;
			num /= 10;
		}
		System.out.println("sum of the digits : "+sum);
		System.out.println();
		System.out.print("enter the number : ");
		int num1 = sc.nextInt();
		while(num1>0)
		{
			int rem = num1%10;
			if(rem %2 == 0)
				sum1 += rem;
			num1 /= 10;
		}
		System.out.println("sum of even digits from the given number : "+sum1);
		
	}
}