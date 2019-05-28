package com.arrays;

public class ArrayContains22or44 {
	
	
	/* Given an array of ints, return true if the array contains a 2 next to 
	 * a 2 or a 4 next to a 4, but not both.
	 */
	
	public static boolean either24(int[] nums) {
		boolean has22 = false;
		boolean has44 = false;
		
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] == 2 && nums[i+1] == 2)
				has22=true;
			if(nums[i] == 4 & nums[i+1] == 4)
				has44=true;
		}
		return has22 != has44; // but not both.
	}

	public static void main(String[] args) {
		int[] num = {2,4,6,4,77,2,2,99};
		System.out.println(either24(num));
		

	}

}
