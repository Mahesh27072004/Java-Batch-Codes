import java.util.Scanner;
class FactProductOFOddEven
{
	public static void main(String [] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		int rem = 0;
		int proOdd = 1 ; 
		int proEven = 1 ; 
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
				proOdd*=fact1;
			}else{
				for(int j = rem; j>=1; j--)
				{
					fact2 *= j;
				}
				proEven*=fact2;
			}
			
			num/=10;
		}
		System.out.println("the Product of factorial of odd digits of the number is :"+proOdd);
		System.out.println("the Product of factorial of even digits of the number is :"+proEven);
	}
}