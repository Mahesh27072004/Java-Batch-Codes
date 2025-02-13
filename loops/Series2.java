// 79,108,139,176,217,260
class Series2
{
	public static void main(String[] args)
	{
		int term = 79;
		int prime = 29;
		int n = 6;
		for(int i = 0; i<n ; i++)
		{
			System.out.print(term+" ");
			
			term += prime;
			
			int nextPrime = prime + 1;
			while(true)
			{
				boolean flag = true;
				for(int j = 2; j <= nextPrime/2 ; j++)
				{
					if(nextPrime % j == 0)
					{
						flag = false;
						break;
					}
				}
				if(flag){
					prime = nextPrime;
					break;
				}
				
				nextPrime++;
			}
			
		}
	}
}