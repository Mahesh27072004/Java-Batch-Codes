import java.util.Scanner;
class ConvertToPrime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num :");
		int num = sc.nextInt();
		
		boolean flag1 = true;
		int temp = num;
		for(int j = 2; j<=temp/2 ; j++)
		{
			if(temp%j ==0 )
			{
				flag1 = false;
				temp++;
				j=1;
				
			}
		}
		if(flag1)
			System.out.println(temp+" is already prime ");
		else if(!flag1)
			System.out.println(num+" is converted to prime i.e "+temp);
				
	}
}