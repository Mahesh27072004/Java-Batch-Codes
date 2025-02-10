import java.util.Scanner;
class PrimeFactors
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num : ");
		int num  = sc.nextInt();
		
		for(int i=2; i<=num ; i++)
		{
			while(num % i==0){
				
					System.out.print(i+" ");
					num/=i;
			}
			
		}
		
	}
}