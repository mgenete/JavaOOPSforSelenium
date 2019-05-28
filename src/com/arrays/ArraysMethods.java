package com.arrays;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {


		char[] ch = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
		
		

		//copy arrays
		char[] chCopy = Arrays.copyOfRange(ch, 2, 9);
		String str = new String(chCopy);
		System.out.println(str);
		
		//compare to arrays
		int[] integer1 = {10,20,30,40};
		int[] integer2 = {10,20,30,40};
		
		boolean equals = Arrays.equals(integer1, integer2);
		System.out.println(equals);
		
		
		//to sort arrays
		int[] integer3 = {99,77,55,33,88,22,66,11};
		for(int i : integer3) {
			System.out.print(i + " ");
		}

		
		System.out.println();
		
		
		Arrays.sort(integer3);
		for(int i : integer3) {
			System.out.print(i + " ");
		}
	}

}
