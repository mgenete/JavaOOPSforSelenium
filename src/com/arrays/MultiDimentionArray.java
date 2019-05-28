package com.arrays;

public class MultiDimentionArray {

	public static void main(String[] args) {

		int a[][] = new int[3][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 6;

		a[1][0] = 1;
		a[1][1] = 3;
		a[1][2] = 5;

		a[2][0] = 11;
		a[2][1] = 12;
		a[2][2] = 13;

		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println(" ");
		
		
		
		int b[][] = { { 2, 4, 6 }, { 1, 3, 5 }, { 11, 12, 13 } };
		System.out.println("total number of row is: " + b.length);
		System.out.println("total number of col is: " + b[0].length);

	
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				System.out.println(b[i][j]);
			}
		}
	}

}
