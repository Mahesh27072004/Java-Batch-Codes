import java.util.Scanner;
class IsIncresingNum
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("enter the num:");
		int num = sc.nextInt();
		boolean flag = true;
		intial = num%10;
		int dup =num/10;
		for(int i=dup;i>0;i/=10)
		{
			if(i%10 <= intial)
				intial = i%10;	
			else{
				flag1 = false;
				break;
			}
		}
		if(flag)
			System.out.println("num is increasing ");
		else
			System.out.println(" num is not increasing");
	}
}
			