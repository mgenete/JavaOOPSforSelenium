package com.arrays;

public class SwapFirstnLastInArray {
	
	/* Given an array of ints, swap the first and last elements in the array. 
	 * Return the modified array. The array length will be at least 1.
	 */
	
	public static int[] swapEnds(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		
		return nums;
	}

	public static void main(String[] args) {
		int[] num = {2,4,6,77,99,103,37,88};
		int[] arr = swapEnds(num);
		for(int a : arr) {
			System.out.print(a+" ");
		}

	}

}
