package euler;

public class LargestPrimeNumber {
	
	public static void main(String[] args) {
		long num = 600851475143l;
		int x = 2;
		
		while(num > 1) {
			if(num % x ==0) {
				num /=x;
			} else {
				++x;
			}
			
		}
		System.out.println(x);
	}
}
