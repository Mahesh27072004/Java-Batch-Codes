import java.util.Scanner;
class SquareRoot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the num ");
		int num = sc.nextInt();
		int result = 0;
		boolean flag=false;
		for(int i = 1; i<=num/2 ; i++)
		{
			if(num/i == i)//or(i*i == num)
			{
				result = i;
				flag = true;
			}
			if(i*i > num)
				break;
		}
		if(flag == true){
			System.out.println(result);
		}
		else{
			System.out.println(num+" does not have a perfect sqaureroot");
		}
		
	}
}