import java.util.Scanner;
class ReverseString
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
		System.out.println("reverse string : "+rev);
		
		//2nd way
		for(int i=0; i<=str.length()-1 ; i++)
		{
			rev1 =str.charAt(i) + rev1;
		}
		System.out.println("reverse string : "+rev1);
		
		//3rd way 
		StringBuffer rev2 = new StringBuffer(str);
		System.out.println(rev2.reverse());
		
	}
}