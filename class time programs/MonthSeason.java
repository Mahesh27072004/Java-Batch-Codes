import java.util.Scanner;
class MonthSeason
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the months first three letters:");
		String month = sc.next().toUpperCase();

		String op = month.equals("JAN") || month.equals("DEC") || month.equals("OCT") || month.equals("NOV") ?
					"WINTER" :
					month.equals("FEB") || month.equals("MAR") || month.equals("APR") || month.equals("MAY")?
					"SUMMER" :
					month.equals("JUN") || month.equals("JUL") || month.equals("AUG") || month.equals("SEP") ?
					"MONSOON" : "Invalid MONTH";
		System.out.println("SEASON: "+op);
	}
}					