import java.util.Scanner;
class Factors
{
	public static void main(String [] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		int factors=0;
		int cnt = 0 ;
		for(int i = 1; i<=num; i++)
		{
			if(num % i == 0){
				System.out.print(i+" "); 
				cnt++;
			}
		}
		System.out.println("count :"+cnt);
	}
}