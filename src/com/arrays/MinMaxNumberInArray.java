package com.arrays;

public class MinMaxNumberInArray {

	public static void main(String[] args) {


		int num[] = {4,6,77,99,767,44,1};
		int smallest = num[0];
		int largest = num[0];
		
		for(int i=0; i<num.length; i++) {
			if(num[i] < smallest) {
				smallest=num[i];
			}
			else if(num[i]>largest) {
				largest=num[i];
			}
		}
		
		System.out.println("in one dimensional array smallest is: "+smallest);
		System.out.println("in one dimensional array largest is: "+largest);

	}

}
