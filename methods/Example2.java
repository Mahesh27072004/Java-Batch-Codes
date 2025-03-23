//learning how methods call flow from the program

class Example2
{
	public static void main(String[] args)
	{
		System.out.println("main method starts");
		add(10,20);
		System.out.println("main method ends");
	}
	public static void add(int x, int y)
	{
		System.out.println("add method starts");
		int res = x+y;
		System.out.println(res);
		sub(10, 5);
		System.out.println("add method ends");
	}
	public static void sub(int x, int y)
	{
		System.out.println("sub method starts");
		int res = x-y;
		System.out.println(res);
		System.out.println("sub method ends");
	}
}