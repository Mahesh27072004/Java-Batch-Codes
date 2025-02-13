//1,3,9,33,153,873
class Series3
{
	public static void main(String[] args)
	{
		int n = 5;
		int num = 2;
		for(int i = 0; i<n; i++)
		{
			int cube = 1;
			
			for(int j=0;j<3;j++)
			{
				cube*=num;
			}
			int term = cube + num;
			System.out.print(term+" ");
			num++;
		}
	}
}