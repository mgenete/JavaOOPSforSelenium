package com.arrays;

public class IsFirstAndLastElementTheSame {
	
	
	
	public static boolean sameFirstLast(int[]nums) {
		return nums.length > 0 && nums[0] == nums[nums.length - 1];
	}
	

	
	public static void main(String[] args) {
		int[] num = {2,4,6,4,77,2,2,99,2};
		
		System.out.println(sameFirstLast(num));

	}

}
