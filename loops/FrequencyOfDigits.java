import java.util.Scanner;
class FrequencyOfDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a num :" );
		int num = sc.nextInt();
		
		for(int i = 0; i<=9; i++)
		{
			int cnt = 0;
			for(int j = num; j>0 ; j/=10)
			{
				int rem = j%10;
				if(rem == i)
					cnt++;
			}
			if (cnt != 0)
				System.out.println(i+" : "+cnt);//System.out.print(i); to print the number withour repition
		}
	}
}
				