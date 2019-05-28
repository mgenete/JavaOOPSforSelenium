package com.arrays;

public class DiffBtwLargestnSmallest {
	
	/* Given an array length 1 or more of ints, return the difference between the 
	 * largest and smallest values in the array.
	 */
	
	public static int bifDiff(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}
		return max - min;
	}
	
	
	public static int bifDiff2(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			if(nums[i] < min)
				min=nums[i];
			if(nums[i] > max)
				max=nums[i];
		}
		return max-min;
	}
	

	public static void main(String[] args) {


		int[] num = {2,4,6,77,99};
		System.out.println(bifDiff(num));
		System.out.println(bifDiff2(num));


	}

}
