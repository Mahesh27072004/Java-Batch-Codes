import java.util.Scanner;
class TechNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the num:");
		
		int num = sc.nextInt();
		int len = 0,sum = 0, div =1;
		for(int i=num ; i>0 ; i/=10)
			len++;
		
		if(len%2==0)
		{	
			for(int i=1;i<=len/2;i++)
				div*=10;
			sum = (num/div) + (num%div);
			int sqr = sum*sum;
			System.out.println(num==sqr ? num+" is a technumber" : num+" is not a technumber");
		}else
			System.out.println(num+" is not a technumber beacause it has odd length and so it can't be split in two equal havles");
		
	}
}
			
		