class Sample
{
	public static void main(String args[])
	{
		int num =  123,count=0,sum=0;
		int temp = num ,m=1,rem;
		int evenRes = 0;
		while(temp>0)
		{
			sum=sum+(temp%10);
			count++;
			temp/=10;
		}
		System.out.println(sum);
		temp = num ;
		if(sum%2==0)
		{
			while(temp>0)
			{
				rem = temp%10;
				if(rem%2!=0)
				{
					rem++;
				}
				else if(rem==9)
				{
					rem--;
				}
				evenRes = evenRes+rem*m;
				m=m*10;
				temp/=10;
			}
		}
		else
		{
			temp = num;
			while(temp>0)
			{
				rem = temp%10;
				if(rem%2==0)
				{
					rem++;
				}
				evenRes = evenRes+rem*m;
				m=m*10;
				temp/=10;
			}
		}
		System.out.println(evenRes);
	}
	
}