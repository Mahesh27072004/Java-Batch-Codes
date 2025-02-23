import java.util.Scanner;
class SpyNum
{
	public static void main(String[] args)
	{
		for(int j=10; j<=500;j++)
		{
			int sum = 0, pro = 1;
			int num = j;
			while(num>0)
			{
				sum+=(num%10);
				pro*=(num%10);
				num/=10;
			}
			
			if(sum == pro)
				System.out.println(j+" is a spy num");
		}
		
	}
}
		