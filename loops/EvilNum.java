import java.util.Scanner;
class EvilNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the num :");
		int num = sc.nextInt();
		String bin = "";
		int m = 1, cnt = 0;
		for(int i=num; i>0 ; i/=2)
		{
			int rem = i%2;
			if(rem == 1)
				cnt++;
			bin = rem+bin;
		}
		System.out.println(bin);
		if(cnt%2==0){
			System.out.println("the count of 1 is even and i.e "+cnt);
			System.out.println(num+" is a evil number");
		}else
			System.out.println(num+" is a odious number means not an evil num");
	}
}
		