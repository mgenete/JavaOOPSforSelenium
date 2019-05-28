package com.string;

public class CheckIfTwoStringAppearSameNumofTimes {
	
	/* Return true if the string "cat" and "dog" appear the same number of times 
	 * in the given string.
	 */
	
	public static boolean catDog(String str) {
		int cat = 0;
		int dog = 0;
		
		for(int i=0; i<str.length()-2; i++) {
			if(str.substring(i, i+3).equals("cat"))
				cat++;
			
			if(str.substring(i, i+3).equals("dog"))
				dog++;
		}
		return cat == dog;
	}

	public static void main(String[] args) {
		System.out.println(catDog("the big cat ate the dog food but dog food was not tasty so cat got sick"));

	}

}
