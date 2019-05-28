package com.arrays;

public class GetIndexOfElementInArray {

	public static void main(String[] args) {


		int arr[] = { 3, 4, 6, 8, 9, 2, 88 };
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 8) {
				System.out.println("Index of 8 is: " + i);
				break;
			}
		}

	}

}
