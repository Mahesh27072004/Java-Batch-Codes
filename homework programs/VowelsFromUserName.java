import java.util.Scanner;
class VowelsFromUserName
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the name: ");
		String name = sc.next().toUpperCase();
		
		for(int i = 0; i < name.length(); i++)
		{
			char ch = name.charAt(i);
			if(ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U' || ch == 'I'  ){
				System.out.println("vowels from the name "+name+" : "+ch);
			}
			
		}
	}
}
	