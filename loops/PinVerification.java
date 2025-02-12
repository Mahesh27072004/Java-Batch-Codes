import java.util.Scanner;
class PinVerification
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int storedPin = 143 ; 
		int seconds = 5000 ; 
		
		outerLoop:
		for( ; ; )
		{
			int attempts = 3;
			do{
				System.out.print("enter the pin : ");
				int pin = sc.nextInt();
				if(storedPin == pin )
				{
					System.out.println("phone unlocked " );
					break outerLoop;
				}else{
					System.out.println("invalid pin " );
					System.out.println("Attempts left "+(attempts-1) );
				
				}
				attempts--;
					
				
			}while(attempts>=1);
				
			System.out.println();
			System.out.println("PHONE US LOCKED FOR "+(seconds/1000)+" seconds");
			Thread.sleep(seconds);
			seconds *= 2;
			System.out.println();
		}
	}
}
		