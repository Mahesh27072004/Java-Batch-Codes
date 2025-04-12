package Recursion;

public class RecFibonacci {

	public static void main(String[] args) {
		recfibo(6,0,1);
	}
	public static void recfibo(int num,int a,int b) {
		if(num>0) {
			int c = a+b;
			System.out.println(a);
			recfibo(--num,b,c);
		}
		return;
	}
}
