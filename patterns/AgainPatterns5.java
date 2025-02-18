class AgainPatterns5
{
	public static void main(String[] args)
	{
		
		for(int i =1; i<=4;i++)
		{
			char a = 'a';
			for(int j=1;j<=i;j++)
			{
				System.out.print((a++) +" ");
			}
			System.out.println();
		}
	}
}
//op
/*
1
3 5
7 9 11
13 15 17 19
*/