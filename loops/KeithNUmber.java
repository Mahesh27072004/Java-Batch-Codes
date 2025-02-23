import java.util.Scanner;
class KeithNUmber
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("enter the num");
		int num = sc.nextInt();
		int len=0, dup =num;
		boolean flag = true;
		int sum=0;
		for(int i=num ; i>0 ; i/=10)
		{
			len++;
		}
		
		int[] arr = new int[len];
		
		for(int i=len-1;i>=0;i--)
		{
			arr[i]=num%10;
			num/=10;
		}
		for( ; ;)
		{
			
			for(int i=0;i<len;i++)
			{
				sum+=arr[i];
		    }
			System.out.println(sum);
			for(int i=1; i<len ; i++)
			{
				arr[i-1]=arr[i];
			}
			arr[len-1]=sum;
			
			if(dup == sum){
				break;
			}
			if(sum > dup){
				flag = false;
				break;
			}
			sum = 0;
		}
		if(flag)
			System.out.println(dup+" ia a keith number");
		else
			System.out.println(dup+" is not keith number");
	}
}
		