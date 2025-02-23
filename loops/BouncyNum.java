import java.util.Scanner;
class BouncyNum
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("enter the num:");
		int num = sc.nextInt();
		int dup = num;
		boolean flag = true,flag1 = true;
		int intial = num%10;
		dup /= 10;
		for(int i=dup;i>0;i/=10)
		{
			
			if(i%10 >= intial)
				intial = i%10;
			else{
				flag = false;
				break;
			}
		}
		intial = num%10;
		for(int i=dup;i>0;i/=10)
		{
			if(i%10 <= intial)
				intial = i%10;	
			else{
				flag1 = false;
				break;
			}
		}
		if(!flag && !flag1)
			System.out.println("num is bouncy num ");
		else
			System.out.println(" num is not bouncy number");
	}
}
			