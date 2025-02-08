import java.util.Scanner;
class Vowels
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.print((ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')?(ch+" is a vowel"):(ch+" is not a vowel"));
	}
}
		