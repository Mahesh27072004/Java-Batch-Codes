package Methods;

public class IsRotatingPrimeOrNot {

	public static void main(String[] args) {
		System.out.println("printing all the numbers between 1 to 10000 which are roatating prime");
		for(int i=2; i<=10000; i++) {
			if(isRotatingPrime(i)) {
				System.out.println(i);
			}
		}
		System.out.println(count(1452));
		System.out.println(power(5,3));

	}
	public static boolean isRotatingPrime(int num) {
		if(isPrime(num)) {
			int rotate = rotate(num);
			while(rotate != num &&  isPrime(rotate)) {
				rotate = rotate(rotate);
			}
			return num == rotate;
		}
		return false;
		
	}
	
	public static boolean isPrime(int num) {
		if(num < 2)
			return false;
		for(int i=2;i*i<=num;i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int rotate(int num) {
		int last = num%10;
		num/=10;
		int cnt = count(num);
		return last*power(10,cnt)+num;
	}
	
	public static int count(int num) {
		int cnt = 0;
		for(int i=num; i>0; i/=10) {
			cnt++;
		}
		return cnt;
	}
	
	public static int power(int num,int cnt) {
		int pow = 1;
		for(int i=1; i<=cnt;i++) {
			pow *=num; 
		}
		return pow;
	}
	

}
