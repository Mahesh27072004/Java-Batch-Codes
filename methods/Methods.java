import java.util.Scanner;
class Methods
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=1; ; i++)
		{
			System.out.println("1.sum of two num");
			System.out.println("2.factorial of num");
			System.out.println("3.palindrome");
			System.out.println("4.prime num");
			System.out.print("enter your choice : ");
			int ch = sc.nextInt();
			System.out.println();
			
			//choose which method you want to perform
				switch(ch)
				{
					case 1:
					{
						sum();
						System.out.println();
					}break;
					case 2:
					{
						fact();
						System.out.println();
					}break;
					case 3:
					{
						palindrome();
						System.out.println();
					}break;
					case 4:
					{
						prime();
						System.out.println();
					}break;
					default:{
						System.out.println("invalid choice");
						System.exit(0);
					}
				}
		}
		
		
	}
	
	
	//addition of two number method
	public static void sum()
	{
		System.out.println("	Summation  ");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first num: ");
		float a = sc.nextFloat();
		System.out.print("enter the second num: ");
		float b = sc.nextFloat();
		float c = a+b;
		System.out.println("sum of "+a+" and "+b+" is "+c);
		System.out.println();
	}
	
	
	//method for getting factorial of num
	public static void fact()
	{
		System.out.println("     Factorial ");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the num: ");
		int a = sc.nextInt();
		int fact = 1;
		
		for(int i = 1; i<=a;i++){
			fact *=i;
		}
		System.out.println("fcatorial of "+a+" is "+fact);
		System.out.println();
	}
	
	//method for palindrome
	public static void palindrome()
	{
		System.out.println("     Palindrome  ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. checking number palindrome");
		System.out.println("2. checking String palindrome");
		System.out.print("enter the choice:(1 or 2) ");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				System.out.print("enter the num: ");
				int num = sc.nextInt();
				int rev =0;
				for(int i = num; i>0;i/=10){
					 rev = rev*10 + (i%10);
				}
				System.out.println("reverse "+rev);
				if(rev == num)
				{
					System.out.println("the number "+num+" is a palindrome");
				}else{
					System.out.println("the number "+num+" is not a palindrome");
				}
			}break;
			case 2:
			{
				System.out.print("enter the string: ");
				String str = sc.next().toLowerCase();
				String rev = "";
				for(int ch = str.length()-1; ch>=0;ch--){
					rev = rev + str.charAt(ch);
				}
				System.out.println("reverse "+rev);
				if(rev.equals(str))
				{
					System.out.println("the String "+str+" is a palindrome");
				}else{
					System.out.println("the String "+str+" is not a palindrome");
				}	
			}break;
			default:
				System.out.println("Invalid choice");
				break;
		}
		
		System.out.println();
	}
	
	//method for prime num
	public static void prime()
	{
		System.out.println("     Prime Number ");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the num :");
		int num = sc.nextInt();
		boolean flag = true;
		if(num <= 2)
			flag = false;
		for(int i=2;i*i<=num;i++)
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not a prime number");
		
		System.out.println();
	}
	
	
}
