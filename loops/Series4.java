//1,3,9,33,...
class Series4
{
	public static void main(String[] args)
	{
		int term = 0;
		int n = 6;
		for(int i=1; i<=6; i++)
		{
			
			int fact = 1;
			for(int j = 1;j<=i;j++)
			{
				fact *=j;
			}
			 term += fact;
			System.out.print(term+" ");
			
		}
	}
}
		
		