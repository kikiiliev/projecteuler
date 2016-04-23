package euler;

//problem 6
public class SumSquaresDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sumSquared = 0, squaresSum = 0;
		
		for (int i = 1; i <= 100; ++i) {
			sumSquared += i;
			squaresSum += i*i;
		}
		sumSquared *= sumSquared;
		
		System.out.println(sumSquared - squaresSum);

	}
	
}
