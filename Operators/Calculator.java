import java.util.Scanner;
class Calculator
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		for( ; ; )
		{
		System.out.print("enter the number 1: ");
		float num1 = sc.nextFloat();
		System.out.print("enter the number 2: ");
		float num2 = sc.nextFloat();
		System.out.print("enter the operation to perform(operator): ");
		char ch = sc.next().charAt(0);
		float opt = 0;
		opt = (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') ?
						   ch == '+' ? num1+num2:
						   ch == '-' ? num1-num2:
						   ch == '*' ? num1*num2:
						   ch == '/' ? num1/num2: 0.000001f : 0; 
						   
		System.out.println();
		String output = "Ans = "+num1+" "+ch +" "+num2 +" = "+opt;
			
		if(!(opt == 0.000001f))
			System.out.println(output);
		System.out.println();
		}
	}
}
