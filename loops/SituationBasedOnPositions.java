import java.util.Scanner;

class SituationBasedOnPositions
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string containing 0 and 1 : ");
		String positions = sc.next();
		int cnt1 = 0;
		int cnt0 = 0;
		boolean flag = false;
		for(int i = 0; i<=positions.length()-1; i++)
		{
			if(positions.charAt(i) == '1'){
				cnt1++;
				cnt0=0;
				if(cnt1 >=7){
					flag = true;
					break;
				}
			}else if(positions.charAt(i) == '0'){
				cnt0++;
				cnt1 = 0;
				if(cnt0 >=7){
					flag = true;
					break;
				}
			}
			
				
		}
		if(flag)
			System.out.println(" situation is in dangerous");
		else
			System.out.println(" situation is not in danger");
	}
}