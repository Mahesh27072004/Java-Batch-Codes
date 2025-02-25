import java.util.Scanner;
class GoodPrimeCount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the num:");
		int num = sc.nextInt();
		boolean flag = true;
		int cnt = 0;
		for(int i=2; i<=num ; i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j == 0)
				{
					flag = false;
					break;
				}
				
			}
			
			if(flag){
				
				for(int k = i;k>0;k/=10)
				{
					int rem = k%10;
					if(rem == 1){
							flag = false;
							break;
						}
					for(int j=2;j<=rem/2;j++)
					{	
						if(rem%j == 0)
						{
							flag = false;
							break;
						}
						
					}		
				}	
				if(flag){
					System.out.println(i);
					cnt++;
				}
			}	
		}
		System.out.println("good primes before the given numbers are "+cnt);
		
	}
}