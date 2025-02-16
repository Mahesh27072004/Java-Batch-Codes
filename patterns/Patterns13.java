import java.util.Scanner;
class Patterns13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 6; i>=1 ; i--)
		{
			for(int j = 1; j<=5; j++)
			{
				if(j>6-i+1){
					System.out.print("  ");
				}
				else{
					System.out.print("* ");
				}
			}
			for(int j = 6; j>=1; j--)
			{
				if(i==1){
					System.out.print("* ");
				}else if(j<6-i+1){
					System.out.print("  ");
				}
				else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		for(int i = 2; i<=6 ; i++)
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
				if(j>6-i+1){
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
		*         * * * * * *
		* *       * * * * *
		* * *     * * * *
		* * * *   * * *
		* * * * * * *
		* * * * * * * * * * *
				* * * * * * *
			  * * *   * * * *
			* * * *     * * *
		  * * * * *       * *
		* * * * * *         *     */