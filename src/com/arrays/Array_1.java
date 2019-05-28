package com.arrays;

public class Array_1 {
	
	// Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
	public int countEven(int[] numbs) {
		int count = 0;
		for(int i=0; i<numbs.length; i++) {
			if(numbs[i] % 2 == 0)
				count++;
		}
		return count;
	}
	
	
	// Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
	public int bigDiff(int[] nums) {
		 int max = nums[0];
		 int min = nums[0];
		 
		 for(int i=0; i<nums.length; i++) {
			 if(nums[i] > max)
				 max = nums[i];
			 else if(nums[i] < min)
				 min = nums[i];
			 
		 }
		 System.out.println("max is: "+max );
		 System.out.println("min is: "+min);
		 return (max-min);
	}

	// Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, 
	//so it does not count and numbers that come immediately after a 13 also do not count.
	public int sum13(int[] nums) {
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 13)
				i++;
			else
				sum = sum + nums[i];
		}
		return sum;
	}
	
	
	// Given an array of ints, return true if the array contains a 2 next to a 2
	// somewhere.
	public boolean has22(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2)
				return true;
		}
		return false;
	}
	
	
	// Given an array of ints, return true if the array contains no 1's and no 3's.
	public boolean lucky13(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 || nums[i] == 3)
				return false;
		}
		return true;
	}
	
	
	// Given an array of ints, return true if the sum of all the 2's in the array is
	// exactly 8.
	public boolean sum28(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2)
				sum += 2;
		}
		return (sum == 8);
	}
	
	
	// Given an array of ints, return true if the number of 1's is greater than the
	// number of 4's
	public boolean more14(int[] nums) {
		int balance = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				balance++;
			else if (nums[i] == 4)
				balance--;
		}
		return (balance > 0);
	}
	
	
	// Given an array of ints, return true if every element is a 1 or a 4.
	public boolean only14(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1 && nums[i] != 4)
				return false;
		}
		return true;
	}
	
	
	// Given an array of ints, return true if 6 appears as either the first or last
	// element in the array.
	// The array will be length 1 or more.
	public boolean firstLast6(int[] nums) {
		return (nums[0] == 6 || nums[nums.length - 1] == 6);

	}
	
	
	// Given an array of ints, return true if the array is length 1 or more, and the
	// first element and the last element are the same.
	public boolean sameFirstLast(int[] nums) {

		return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
		
	}
	
	
	// Given 2 arrays of ints, a and b, return true if they have the same first
	// element or they have the same last element.
	// Both arrays will be length 1 or more.

	public boolean commonEnd(int[] a, int[] b) {

		int len_a = a.length;
		int len_b = b.length;
		return (a[0] == b[0] || a[len_a - 1] == b[len_b - 1]);
	}
	
	// Given an array of ints length 3, return the sum of all the elements.
	public int sum3(int[] nums) {
		return (nums[0] + nums[1] + nums[2]);
	}

	// Given an array of ints length 3, return an array with the elements
	// "rotated left" so {1, 2, 3} yields {2, 3, 1}.
	public int[] rotateLeft3(int[] nums) {
		int[] rotated = { nums[1], nums[2], nums[0] };
		return rotated;
	}

	// Given an array of ints, return the sum of the first 2 elements in the array.
	// If the array length is less than 2, just sum up the elements that exist,
	// returning 0 if the array is length 0.
	public int sum2(int[] nums) {
		if (nums.length >= 2)
			return (nums[0] + nums[1]);
		if (nums.length == 1)
			return nums[0];
		return 0;
	}
	
	
	/*
	 * Given an array of ints, return true if there is a 1 in the array with a 2
	 * somewhere later in the array.
	 */

	public boolean has12(int[] nums) {
		boolean found1 = false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				found1 = true;

			if (found1 && nums[i] == 2)
				return true;
		}

		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
