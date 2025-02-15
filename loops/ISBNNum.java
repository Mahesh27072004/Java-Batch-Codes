import java.util.Scanner;
class ISBNNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.print("enter the num :");
		long num = 1259060977;
		int sum = 0;
		for(long i = num , j=1; i>0 ;i/=10,j++)
		
			sum += ((i%10)*j);
			
		if(sum%11 == 0)
			System.out.println(num+" is a valid isbn number ");
		else
			System.out.println(num+" is not a valid isbn number ");
	}
}