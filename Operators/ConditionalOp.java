import java.util.Scanner;
class ConditionalOp
{
	public static void  main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the num 1: ");
		int a = sc.nextInt();
		System.out.print("enter the num 2: ");
		int b = sc.nextInt();
		System.out.print("enter the num 3: ");
		int c = sc.nextInt();
		int lar = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println(lar);
	}
}