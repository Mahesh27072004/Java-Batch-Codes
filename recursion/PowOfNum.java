package Recursion;

public class PowOfNum {
	public static void main(String[] args) {
		System.out.println(power(15,2));
	}
	
	static int power(int num, int raise) {
		if(raise == 0) {
			return 1;
		}
		return num*power(num,raise-1);
	}
}
