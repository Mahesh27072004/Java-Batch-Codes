import java.util.Scanner;
class PalindromeNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a num : ");
		int num = sc.nextInt();
		int temp = num;
		long rev = 0;
		boolean flag = false;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		if(num<0)
		{
			temp = temp*-1;
			flag = true;
		}
		while(temp>0)
		{
			rev = rev*10+temp%10;
			temp/=10;
		}
		if(flag == true)
		{
			if(max>=rev && min<=rev)
				if(rev*-1 == num)
					System.out.println(num+" is palindrome");
				else
					System.out.println(num+"not a palindrome");
			else
				System.out.println(0);
		}else{
			if(max>=rev && min<=rev)
				if(rev == num)
					System.out.println(num+" is palindrome");
				else
					System.out.println(num+"not a palindrome");
			else
				System.out.println(0);
		}
	}
}
		