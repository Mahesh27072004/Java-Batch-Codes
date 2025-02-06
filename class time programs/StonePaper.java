import java.util.Scanner;
class StonePaper
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int rNum =0;
		for(int i=1;  i<=1; i++)
		{
			int num = (int)(Math.random()*10);
			if(num>=1 && num<=3)
			{
				rNum = num;
				continue;
			}
			i--;
		}
		String codeopt = null;
		if(rNum == 1){
			codeopt = "STONE";
		}
		else if(rNum == 2){
			codeopt = "PAPER";
		}
		else {
			codeopt = "SCISSOR";
		}
		
		System.out.println("\n STONE PAPER SCICSSOR GAME  \n");
		System.out.println();
		System.out.println("enter your choice number among: \n 1.STONE \n 2.PAPER \n 3.SCISSOR\n");
		int ip = sc.nextInt();
		String userOpt = null;
		if(ip == 1){
			userOpt = "STONE";
		}
		else if(ip == 2){
			userOpt = "PAPER";
		}
		else if(ip == 3){
			userOpt = "SCISSOR";
		}else{
			System.out.println("INVALID INPUT");
			return;
		}
		
		System.out.println("user : "+userOpt+"  BOT: "+codeopt);
		System.out.println();
		if((rNum == 3 && ip ==1)||(rNum == 1 && ip ==2)||(rNum == 2 && ip ==3)){
			System.out.println("*** USER WINS ****");
		}
		else if((rNum == 2 && ip ==1)||(rNum == 3 && ip ==2)||(rNum == 1 && ip ==3)){
			System.out.println("*** BOT WINS ****");
		}
		else {
			System.out.println("*** DRAW ****");
		}
	}
}