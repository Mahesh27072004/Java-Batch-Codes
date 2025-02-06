class CharWidening
{
	public static void main(String[] args)
	{
		char c = 'a';
		//byte b = c;
		//System.out.println("to byte : "+b);//CTE lossy conversion
		//short a = c;
		//System.out.println("to short : "+a);//CTE lossy conversion
		int d = c;
		System.out.println("to int : "+d);
		long e = c;
		System.out.println("to long : "+e);
		float f = c;
		System.out.println("to float : "+f);
		double g = c;
		System.out.println("to double : "+g);
	}
}