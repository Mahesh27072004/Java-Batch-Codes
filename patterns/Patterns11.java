import java.util.Scanner;
class Patterns11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 6; i>=1 ; i--)
		{
			for(int j = 1; j<=6; j++)
			{
				if(j<6-i+1){
					System.out.print("  ");
				}
				else{
					System.out.print("* ");
				}
			}
			for(int j = 5; j>=1; j--)
			{
				if(j<6-i+1){
					System.out.print("  ");
				}
				else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
			
	}
}  
//op
/*

	* * * * * * * * * * *
	  * * * * * * * * *
		* * * * * * *
		  * * * * *
			* * *
			  *            */  