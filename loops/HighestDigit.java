import java.util.Scanner;
class HighestDigit
{
	public static void main(String[]  args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int max = 0;// for smallest max = 9;
		for(int i=num ; i>0 ; i/=10)
		{
			int rem = i%10;
			if(max<rem) // for smallest max > rem
				max = rem;
		}
		System.out.println("the highest digit is : "+max);
	}
}