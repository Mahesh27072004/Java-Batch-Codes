class ByteWidening
{
	public static void main(String[] args)
	{
		byte a = 20;
		short b = a;
		System.out.println("to short : "+b);
		int c = a;
		System.out.println("to int : "+c);
		long g = a;
		System.out.println("to long : "+g);
		//char d = a;
		//System.out.println(d);//CTE lossy conversion from byte to char
		float e = a;
		System.out.println("to float : "+e);
		double f = a;
		System.out.println("to double : "+f);
		
	}
}
		