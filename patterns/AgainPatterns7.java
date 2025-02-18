class AgainPatterns7
{
	public static void main(String[] args)
	{
		int a = 2;// for odd a=1;
		for(int i =1; i<=4;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(a +" ");
				a+=2;
			}
			System.out.println();
		}
	}
}
//op
/*
2
4 6
8 10 12
14 16 18 20
*/
//for odd 
/*
1
3 5
7 9 11 
13 15 17 19
*/