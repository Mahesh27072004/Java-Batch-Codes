import java.util.Scanner;
class  Pattern
{
	public static void main(String[] args)
	{
		int n = 5;
		int a = 0;
		for(int i = 1; i<=n ; i++)
		{
			a = i+a;
			int b =a;
			for(int j =1; j<=i ; j++)
			{
				
					System.out.print((a--)+" ");
			}
			a=b;
			System.out.println();
		}
	}
}

	//op
	/*
			1
			3 2
			6 5 4
			10 9 8 7
			15 14 13 12 11   */