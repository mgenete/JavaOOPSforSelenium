package com.arrays;

public class ReturnMinElementFromArrayMatrix {

	public static void main(String[] args) {

		
		int abc[][] = {{2,4,-2,8}, {4,71,2,55}, {2,0,33,55}};
		int min = abc[0][0];
		int minCol = 0;
		
		System.out.println("row size: "+abc.length);
		System.out.println("col size: " + abc[0].length);

		for (int i = 0; i < abc.length; i++) {

			for (int j = 0; j < abc[0].length; j++) {

				if (abc[i][j] < min) {
					min = abc[i][j];
					minCol = j;
				}
			}

		}
		System.out.println("min value is: " + min);
		System.out.println("min column is: "+ minCol);
		
		int max = abc[0][minCol];
		int k = 0;
		while (k < abc.length) {
			if (abc[k][minCol] > max) {
				max = abc[k][minCol];
			}
			k++;
		}
		System.out.println("max value in the min column is: " + max);

	}

}
