import java.util.Scanner;
class Emrip
{
	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			System.out.print("enter a num : ");
			int num = sc.nextInt();
			int dup =num;
			boolean flag = true;
			int i = 2;
			while(i<=num/2)
			{
				if(num%i == 0)
				{
					flag = false;
					break;
				}
				i++;
			}
			if(!flag)
			{
				System.out.println(dup+" is not an Emrip");
				
			}else{
				int rev = 0;
				for( i = num; i>0; i/=10)
				{
					rev = rev*10 + (i%10);
				}
				i=2;
				while(i<=rev/2)
				{
					if(rev%i == 0)
					{
						flag = false;
						break;
					}
					i++;
				}
				if(!flag)
				{
					System.out.println(dup+" is not an emrip");
				}else{
					System.out.println(dup+" is an emrip");
				}
			}
	}
}