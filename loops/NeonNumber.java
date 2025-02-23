import java.util.Scanner;
class NeonNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dup =num,pow=1,sum = 0;
		for(int i=1;i<=2;i++)
			pow*=dup;
		
		for(int i=pow;i>0;i/=10)
		{
				sum+=(i%10);
				
		}
		System.out.println(sum);
		if(sum == num)
			System.out.println(num+" is a neon number");
		else 
			System.out.println(num+" is not an neon number");
	}
}
