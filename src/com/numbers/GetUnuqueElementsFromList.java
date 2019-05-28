package com.numbers;

import java.util.ArrayList;

public class GetUnuqueElementsFromList {

	public static void main(String[] args) {


		int a[] = {4,5,5,5,4,6,6,9,4};
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int i=0;
		for(int j=0; j<a.length; j++) {
			if(!array.contains(a[j])) {
				array.add(a[j]);
				i++;
			}
		}
		System.out.println(array);
	}

}
