class EvenOddSumOfEachDigit
{
	public static void main(String[] args)
	{
		int num = 7264;
		int sumEven = 0;
		int sumOdd = 0;
		int rem = num%10;
		int temp = (rem%2==0)?(sumEven=sumEven+rem):(sumOdd=sumOdd+rem);
		num = num/10;
		rem = num%10;
		temp = (rem%2==0)?(sumEven=sumEven+rem):(sumOdd=sumOdd+rem);
		num = num/10;
		rem = num%10;
		temp = (rem%2==0)?(sumEven=sumEven+rem):(sumOdd=sumOdd+rem);
		num = num/10;
		rem = num%10;
		temp = (rem%2==0)?(sumEven=sumEven+rem):(sumOdd=sumOdd+rem);
		System.out.println("even sum: "+sumEven+"\n odd sum: "+sumOdd);
		
	}
}