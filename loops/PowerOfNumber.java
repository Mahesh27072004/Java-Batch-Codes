import java.util.Scanner;
class PowerOfNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int num = sc.nextInt();
		System.out.print("enter the power: ");
		int pow = sc.nextInt();
		int result=1;
		for(int i=1 ; i<=pow; i++)
		{
			result*=num;
		}
		System.out.println("ans :"+result);
	}
}