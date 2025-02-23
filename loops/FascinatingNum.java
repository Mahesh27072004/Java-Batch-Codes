class FascinatingNum
{
	public static void main(String[] args)
	{
		
		for(int num=100 ; num<=999 ; num++)
		{
			String str = num+""+(num*2)+(num*3);
			boolean flag = true;
		
			for(char i='1';i<='9';i++)
			{
				int cnt = 0;
				for(int j=0;j<str.length();j++)
				{
					if(i==str.charAt(j))
						cnt++;					
				}
				if(cnt != 1)
				{
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println(num+" is a fascinating number");
			
		}
	}
}	