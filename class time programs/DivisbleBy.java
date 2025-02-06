import java.util.Scanner;
class DivisbleBy
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println((n%2==0 && n%5==0)?("hiTwoFive"):((n%2==0)?("hiTwo"):((n%5==0)?("hiFive"):(" "))));
		
	}
}

//deloite code 