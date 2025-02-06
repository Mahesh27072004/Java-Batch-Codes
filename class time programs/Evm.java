import java.util.Scanner;
class Evm
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int bjp = 0 , cng = 0 , ss = 0 , aap = 0 , mns = 0 , nota = 0;
		System.out.println();
		System.out.println("       Welcome       ");
		System.out.println();
		System.out.println("Enter the Population");
		int population = sc.nextInt();
		
		
		for(int i = 1; i<=population ; i++)
		{
			System.out.println();
			System.out.println("***List of Parties***");
			System.out.println("1. BJP");
			System.out.println("2. CONGRESS");
			System.out.println("3. SHIV SENA");
			System.out.println("4. AAP");
			System.out.println("5. MNS");
			System.out.println("6. NOTA");
			System.out.println();
			System.out.println("Enter the Option :");
			int opt = sc.nextInt();
			if(opt>=1 && opt<=6){
				if(opt == 1)
				{
					bjp++;
					System.out.println("ACHE din ayange");
				}
				if(opt == 2)
				{
					cng++;
					System.out.println("BHARAT TODO");
				}
				if(opt == 3)
				{
					ss++;
					System.out.println("MAHARASHTRA MADHE FAKT MARATHI");
				}
				if(opt == 4)
				{
					aap++;
					System.out.println("MUJHE AZAD KARO");
				}
				if(opt == 5)
				{
					mns++;
					System.out.println("JAI MAHARASHTRA");
				}
				if(opt == 6)
				{
					nota++;
					System.out.println("SAMJADAR BALAK HE TU");
				}
			}
			if(!(opt>=1 && opt<=6))
			{
				i--;
				System.out.println("INVALID OPTION");
			}
		}
		System.out.println("++++++ Result ++++++++");
		if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota){
			System.out.println("BJP has WON the Election by "+ bjp + " votes ");
			return;
		}
		if(cng>=bjp && cng>=aap && cng>=ss && cng>=mns && cng>=nota){
			System.out.println("CONGRESS has WON the Election by "+ cng + " votes ");
			return;
		}
		if(ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota){
			System.out.println("SHIV SENA has WON the Election by "+ ss + " votes ");
			return;
		}
		if(aap>=bjp && aap>=cng && aap>=ss && aap>=mns && aap>=nota){
			System.out.println("AAP has WON the Election by "+ aap + " votes ");
			return;
		}
		if(mns>=bjp && mns>=cng && mns>=ss && mns>=aap && mns>=nota){
			System.out.println("MNS has WON the Election by "+ mns + " votes ");
			return;
		}
		
	}
}
	   
