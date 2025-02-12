class Series1
{
	public static void main(String[] args)
	{
		int res = 2;
		for(int i=1 ,p=2; i<=5; i++,p*=2)
		{
			int temp = 2;
			int pow = 1;
			
			for(int j=1; j<=p ;j++)
			{
				pow*=temp;				
			}
			res = pow + res;
			System.out.print(res+" " );
		}
	}
}