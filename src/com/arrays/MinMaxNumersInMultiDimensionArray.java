package com.arrays;

public class MinMaxNumersInMultiDimensionArray {

	public static void main(String[] args) {


		int a[][] = {{2,4,6},{3,5,1},{11,12,13}};

		int min = a[0][0];
		int minCol = 0;
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a.length; j++) {
				if(a[i][j] < min) {
					min= a[i][j];
					minCol=j;
				}
			}
		}
		
		int max = a[0][minCol];
		int k=0;
		while(k<3) {
			if(a[k][minCol]>max) {
				max=a[k][minCol];
			}
			k++;
		}
		
		System.out.println("min number is: "+min);
		System.out.println("column # of the min value is: "+minCol);
		System.out.println("max number in column "+minCol+" is: "+max);
	}

}
