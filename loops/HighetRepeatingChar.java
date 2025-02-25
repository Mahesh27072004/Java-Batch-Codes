import java.util.Scanner;

class HighetRepeatingChar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter te string ");
		String str = sc.next().toUpperCase();
		//System.out.println(str);
		int max = 0 ;
		char c ='n';
		for(char ch='A' ; ch<='Z' ; ch++)
		{
			int cnt = 0 ;
			for(int i = 0 ; i<str.length() ; i++)
			{
				if(ch ==  str.charAt(i))
				{
					cnt++;
				}
			}
			if(max<cnt)
			{
				max=cnt;
				c = ch;
			}
		}
		System.out.println(" the most repeating char is "+c+" and its freq is "+max);
	}
}