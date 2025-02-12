import java.util.Scanner;
class HighestFrequencyDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a num :" );
		int num = sc.nextInt();
		int max = 0 ,min = 9, dgt = 0, dgt1=0;
		for(int i = 0; i<=9; i++)
		{
			int cnt = 0;
			for(int j = num; j>0 ; j/=10)
			{
				int rem = j%10;
				if(rem == i)
					cnt++;
			}
			if (cnt != 0){
				if(max<cnt){
					max = cnt;
					dgt = i;
				}
				else if(min>cnt)
				{
					min = cnt;
					dgt1 = i;
				}
			}
			
		}
		System.out.println("max frequecy digit :"+dgt+" with frquency :"+max);
		System.out.println("min frequecy digit :"+dgt1+" with frquency :"+min);
	}
}
				