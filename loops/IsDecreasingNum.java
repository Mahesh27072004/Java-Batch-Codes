import java.util.Scanner;
class IsDecreasingNum
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("enter the num:");
		int num = sc.nextInt();
		boolean flag = true;
		int intial = num%10;
		num /= 10;
		for(int i=num;i>0;i/=10)
		{
			System.out.print(intial+" ");
			System.out.println(num);
			if(i%10 >= intial){
				intial = i%10;
			}
			else{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("num is decreasing ");
		else
			System.out.println(" num is not increasing");
	}
}
			