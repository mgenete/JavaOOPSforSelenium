package com.arrays;

public class RearrangeArrayAsEvenOdd {
	
	/* Return an array that contains the exact same numbers as the given array, 
	 * but rearranged so that all the even numbers come before all the odd 
	 * numbers. Other than that, the numbers can be in any order. You may modify 
	 * and return the given array, or make a new array.
	 */
	
	public static int[] evenodd(int[] nums) {
		int temp;
		int evenindex=0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] % 2 == 0) {
				temp = nums[i];
				nums[i] = nums[evenindex];
				nums[evenindex] = temp;
				evenindex++;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] num = {2,4,6,77,99,103,37,88};
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println();
		for(int j=0; j<evenodd(num).length; j++) {
			System.out.println(num[j]);
		}

	}

}
