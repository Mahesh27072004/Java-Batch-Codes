import java.util.Scanner;
class FindNearestPrime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num :");
		int num = sc.nextInt();
		
		int prePrime = 0 , nextPrime=0;
		int temp = 0;
		if(num == 1)
			System.out.println(1+" "+2);
		else{
			for( int i = 2 ; ; i++)
			{
				boolean flag = true;
				for(int j= 2; j<=i/2 ; j++)
				{
					if( i%j == 0)
					{
						flag = false;
						break ;
					}
				}
				if(flag)
					temp = i;
				if(flag)
				{
						if(temp < num)
							prePrime = temp;
						if(temp>num){
							nextPrime = temp;
						break;
						}
				}		
				
			}
			if(num-prePrime > nextPrime-num)	
				System.out.println(num+" "+nextPrime);
			else if(num-prePrime < nextPrime-num)
				System.out.println(prePrime+" "+num);
			else 
				System.out.println(prePrime+" "+num+" "+nextPrime);
		}
	}
}
			