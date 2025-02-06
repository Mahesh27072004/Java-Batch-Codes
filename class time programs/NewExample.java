import java.util.Scanner;
class NewExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float subtotal = sc.nextFloat();
		float gratuityRate = sc.nextFloat();
		float grauity = (subtotal*gratuityRate)/100;
		float total = subtotal + grauity;
		System.out.println("the tip is : "+grauity+" and total is : "+total);
	}
}
		