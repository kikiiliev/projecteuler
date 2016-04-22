package euler;

import java.util.Arrays;

//problem 5
public class SmallestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		Arrays.sort(nums);
		int max = nums[nums.length - 1];
		
		boolean flag = true;
		int mul = 1;
		
		for (int j = 2; j <= max; j++) {
			flag = true;
			while(flag) {
				flag = false;
				for(int i = 0; i < nums.length; ++i) {
					if(nums[i] % j == 0) {
						flag = true;
						nums[i] = nums[i] / j;
					}
				}
				if(flag == true) {
					mul *= j;
				}
				
			}
			
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "  ");
		}
		
		System.out.println(mul);

	}

}
