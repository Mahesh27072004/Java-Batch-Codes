import java.util.Scanner;
class NumbersInWritten
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number :");
		int num = sc.nextInt();
		int rem = 0;
		String value= "";
		while(num>0)
		{
			rem = num%10;
			
			switch(rem)
			{
				case 1:
					value = "One " + value;
					break;
				case 2:
					value = "Two " + value;
					break;
				case 3:
					value = "Three " + value;
					break;
				case 4:
					value = "Four " + value;
						break;
				case 5:	
					value = "Five " + value;
					break;
				case 6:
					value = "Six " + value;
					break;
				case 7:
					value = "Seven " + value;
					break;
				case 8:
					value = "Eight " + value;
					break;
				case 9:
					value = "Nine " + value;
					break;
				case 0:
					value = "Zero " + value;
			}
			num /= 10;
		}
		System.out.println(value);
	}
}