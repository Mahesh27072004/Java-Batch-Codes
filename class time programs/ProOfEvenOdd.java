import java.util.Scanner;
class ProOfEvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a int value of 4 digit:");
		int num = sc.nextInt();
		int proEven = 1;
		int proOdd = 1;
		int rem = num%10;
		int temp = (rem%2==0)?(proEven=proEven*rem):(proOdd=proOdd*rem);
		num = num/10;
		rem = num%10;
		temp = (rem%2==0)?(proEven=proEven*rem):(proOdd=proOdd*rem);
		num = num/10;
		rem = num%10;
		temp = (rem%2==0)?(proEven=proEven*rem):(proOdd=proOdd*rem);
		num = num/10;
		rem = num%10;
		temp = (rem%2==0)?(proEven=proEven*rem):(proOdd=proOdd*rem);
		System.out.println("even product: "+proEven+"\nodd product: "+proOdd);
		
	}
}