import java.util.Scanner;
class DuckNum
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("enter the num:");
		String num = sc.next();
		for(int i=0;i<num.length();i++)
		{
			if(num.charAt(0)=='0'){
				System.out.println("it is not duck number");
				break;
			}else if(num.charAt(i) == '0'){
				System.out.println("it is a duck number");
			}
		}
	}
}
		