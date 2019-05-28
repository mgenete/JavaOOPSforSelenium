package com.loops;

public class Forloop {

	public static void main(String[] args) {

		// use for loop if the number of iterations is fixed
		// For loop
		// print 1 to 10

		/*
		  for(Initialization; condition; increment) {
		  
		  }
		 */

		// *** print 1 to 10 **********
		for (int j = 1; j <= 10; j++) {
			System.out.print(j);
		}

		// *** print 10 to 1 *********
		System.out.println("");

		for (int k = 10; k >= 1; k--) {
			System.out.print(k);
		}

		// print numbers between -10 and 10
		System.out.println("");

		for (int k = -10; k <= 10; k++) {
			System.out.print(k);
		}

		// //if we don't give incremental value while loop will generate infinite loop
		System.out.println("");

		int i = 1; // Initialization
		while (i <= 10) { // condition
			System.out.print(i); // statement
			i++; // increment
		}

	}

}
