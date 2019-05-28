package com.arrays;

public class AddValuesInArray {

	public static void main(String[] args) {


		int arr[] = {3,4,6,8,9};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of array values is: " + sum);

	}

}
