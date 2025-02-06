import java.util.Scanner;
class LoanCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("          loan Calculator      \n");
		System.out.print("Enter the amount : ");
		float amount = sc.nextFloat();
		System.out.print("enter the ROI: ");
		float roi = sc.nextFloat();
		System.out.print("enter the duration in months: ");
		int months = sc.nextInt();
		float years = 0;
		if(months%12*0.1f < 1 )
		{
			years = months/12+(months%12*0.1f);
		}else{
			years = months/12+(months%12*0.01f);
		}
		System.out.println("  ");
		System.out.println("**********loan calculation*******");
		System.out.println("Principal Amount: "+ amount);
		System.out.println("ROI: "+roi+" %");
		System.out.println("Tenure: "+months+" months");
		
		float intPerYear = amount*roi/100;
		float totalInterest = intPerYear*years;
		System.out.println("Interest : "+totalInterest);
		float outstanding = amount+totalInterest;
		System.out.println("Total Outstanding Amount: "+outstanding);
		System.out.println("EMI: "+outstanding/months+" rs");
	}  
	
	
}