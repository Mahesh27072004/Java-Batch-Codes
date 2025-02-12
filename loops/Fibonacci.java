import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the range :");
		int num = sc.nextInt();
		
		int a = 0, b=1;
		for(int i =1 ; i<=num ; i++)
		{
			System.out.print(a+" ");
			int c = a+b;
			a = b;
			b = c;
		}
	}
}
		
	