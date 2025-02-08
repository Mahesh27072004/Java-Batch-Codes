import java.util.Scanner;
class FactOfOddEvenDigits
{
	public static void main(String [] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		int rem = 0;
		int sumOdd = 0 ; 
		int sumEven = 0 ; 
		while(num>0)
		{
			rem = num%10;
			int fact1 = 1;
			int fact2 = 1;
			if(rem%2!=0){
				for(int j = rem; j>=1; j--)
				{
					fact1 *= j;
				}
				sumOdd+=fact1;
			}else{
				for(int j = rem; j>=1; j--)
				{
					fact2 *= j;
				}
				sumEven+=fact2;
			}
			
			num/=10;
		}
		System.out.println("the sum of factorial of odd digits of the number is :"+sumOdd);
		System.out.println("the sum of factorial of even digits of the number is :"+sumEven);
	}
}