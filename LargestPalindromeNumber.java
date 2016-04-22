package euler;

public class LargestPalindromeNumber {
	
	public static boolean isPalindrome(long number){
		long num = number;
		long reversed = 0;

		while(num > 0) {
			reversed = reversed * 10 + num % 10;
			num /= 10;
		}

		return reversed == number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int max = -1, p;
		
		for(int i = 999; i > 0; --i) {
			for(int j = 999; j > 0; --j) {
				p = i * j;
				
				if(isPalindrome(p) && max < p) {
					max = p;
				}
			}
		}
		System.out.println(max);
		
	}

}
