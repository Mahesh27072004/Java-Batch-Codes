package Recursion;

public class revNum {

	public static void main(String[] args) {
		System.out.println(reverse(758,0));

	}
	public static int reverse(int num,int rev) {
		if(num != 0) {
			rev = rev*10 +num%10;
			return reverse(num/10,rev);
		}
		return rev;
	}
}
