class SumOfDigit
{
	public static void main(String[] args)
	{
		int num = 1234;
		int dub = num;
		int sum = 0;
		
		int rem = num%10;
		sum = sum+rem;
		
		num = num/10;
		rem = num%10;
		sum = sum+rem;
		
		num = num/10;
		rem = num%10;
		sum = sum+rem;
		
		num = num/10;
		rem = num%10;
		sum = sum+rem;
		
		System.out.println("sum of digits of "+dub+" is "+sum);	
	}
}