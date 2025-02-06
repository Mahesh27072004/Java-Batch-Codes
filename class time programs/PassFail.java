import java.util.Scanner;

class PassFail
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the marks : ");
		float marks = sc.nextFloat();
		float percentage = (marks * 100)/600;
		String op = (percentage >= 75)?("grade A"):((percentage >=60)?("grade B"):((percentage >= 35)?("grade C"):("fail")));
		System.out.println("percentage : "+percentage);
		System.out.println(op);
	}
}
		