package Methods;

import java.util.Scanner;



public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt()
;
		if((num/2)*2 == num) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
