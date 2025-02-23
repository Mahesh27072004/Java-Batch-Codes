import java.util.Scanner;
class ConvertNumTOBinary
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the num :");
		int num = sc.nextInt();
		String bin = "";
		int m = 1, cnt = 0;
		for(int i=num; i>0 ; i/=2)
		{
			int rem = i%2;
			bin = rem+bin;
		}
		System.out.println(num+" is converted to binary '"+bin+"'");
	}
}
		