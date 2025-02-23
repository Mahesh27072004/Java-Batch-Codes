class FascinatingNum1
{
	public static void main(String[] args)
	{
		for(int num=100; num<=999;num++)
		{
			
			int temp = num;
			for (int i = 2; i <= 3; i++) {
                int mul = num * (i);
                int pow = 1;
                while (pow <= mul) 
					pow *= 10; // Dynamically adjust for correct digit placement
                temp = temp * pow + mul;
            }
			
			
			boolean flag = true;
			
			for(int i=1;i<=9;i++)
			{
				int cnt = 0;
				for(int j=temp;j>0;j/=10)
				{

					if(j%10 == i)
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
			//else
			//	System.out.println(num+" is not a fascinating num ");
		}	
	}
}	