import java.util.Scanner;
class ReverseNum
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
				System.out.println("reverse :"+rev*-1);
			else
				System.out.println(0);
		}else{
			if(max>=rev && min<=rev)
				System.out.println("reverse :"+rev);
			else
				System.out.println(0);
		}
	}
}
		