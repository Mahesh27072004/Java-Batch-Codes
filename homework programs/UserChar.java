import java.util.Scanner;
class UserChar
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the name: ");
		String name = sc.next().toUpperCase();
		
		for(int i = 0; i < name.length(); i++)
		{
			System.out.print(name.charAt(i));
			Thread.sleep(2000);
		}
	}
}
		