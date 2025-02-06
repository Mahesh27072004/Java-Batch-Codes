import java.util.Scanner;
class Uppercase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		System.out.print((ch >= 'A' && ch <= 'Z' || ch >='a' && ch<='z')?((ch>='a'&&ch<=122)?(ch+" is a lowerCase Character"):(ch+" is an uppercase Character")):((ch>= 48 && ch<=57)?(ch+" is a digit"):(ch+" is a special Character")));
	}
}