class IntWidening
{
	public static void main(String[] args)
	{
		int a = 4997;
		long b = a;
		System.out.println("to long : "+b);
		float c = a;
		System.out.println("to float : "+c);
		double d = a;
		System.out.println("to double : "+d);
	}
}
		