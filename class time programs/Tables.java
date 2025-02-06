import java.util.Scanner;
class Tables
{
	public static void main(String[] args)
	{
		System.out.print("enter num : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("enter the range : ");
		int range = sc.nextInt();
		
		for(int i = 1; i<=range; i++)
		{
			System.out.println(num+"X"+i+" = "+(num*i));
		}
		int i=1;
		for(char ch='A'; ch <= 'Z'; ch+=i)
		{
			
			System.out.println(ch);
			i++;
		}
		

	}
}
		