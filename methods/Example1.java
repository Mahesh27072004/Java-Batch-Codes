class Example1
{
	public static void main(String[] args)
	{
		System.out.println(add(8, 19));
		System.out.println(sub(8, 19));
	}
	
	public static int add(int x, int y)
	{
		int res = x+y;
		return res;
	}
	public static int sub(int x, int y)
	{
		int res = x-y;
		return res;
	}
}
