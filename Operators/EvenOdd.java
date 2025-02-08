import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		//without using the modulus operator
		System.out.println("enter the number");
		int num = new Scanner(System.in).nextInt();
		System.out.println(num/2 == num/2.0);
		
		//other logic
		System.out.println((num/2)*2 == num);
	}
}
		