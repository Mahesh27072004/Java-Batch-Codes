import java.util.Scanner;

class ReturnValueOfChar
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the chars :");
		String user = sc.next().toUpperCase();
		int count = 26, res = 0;
		int i = 1;
		if(user.length()==1)
		{
			res = user.charAt(0)-64;
		}
		else{
			for(char ch = 'A' ; ch<='Z' ; ch++)
			{
				if(ch == user.charAt(0))
				{
					break;
				}
				count += 26;
				
			}
			res = count + user.charAt(1)-64;
		}
		System.out.println(res);
	}
}