import java.util.Scanner;
class BuzzNumber
{
	public static void main(String[] args)
	{
		System.out.print("enter the num :");
		int num = new Scanner(System.in).nextInt();
		if(num%10==7 || num%7==0)
			System.out.println(num+" is a buzz number");
		else
			System.out.println(num+" is not a buzz number");
	}
}