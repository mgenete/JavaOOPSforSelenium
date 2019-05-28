package com.arrays;

import java.util.ArrayList;

public class PrintUniqueNumbersFromArray {

	public static void main(String[] args) {


		int a[] = {4,5,5,5,4,6,6,9,4};
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int j=0;
		for(int i=0; i<a.length; i++) {
			if(!array.contains(a[i])) {
				array.add(a[i]);
				j++;
			}
		}
		System.out.println(array);

	}

}
