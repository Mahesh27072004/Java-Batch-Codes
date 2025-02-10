import java.util.Scanner;
class PalindromeString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.next();
		String rev = "" , rev1="";
		//1st way
		for(int i= 0 ; i<str.length() ; i++)
		{
			rev = str.charAt(i) + rev;
		}
		if(str.equals(rev))
			System.out.println(str+" is a palindrome string");
		else
			System.out.println(str+" is not a palindrome string");
	}
}