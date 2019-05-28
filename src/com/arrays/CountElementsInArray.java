package com.arrays;

import java.util.HashMap;

public class CountElementsInArray {
	
	public static void getCount() {

		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		map2.put('6', 1);
		System.out.println(map2);

		System.out.println(map2.get('6'));
		System.out.println(map2.get('6') + 1); // .get() returns value 1. 1+1=2

	}

	public static void intArrayToCharArray() {
		int[] a = { 367, 576, 554 };
		char[] ch = null;
		for (int i = 0; i < a.length; i++) {
			ch = String.valueOf(a[i]).toCharArray();
			System.out.print(ch);
		}

	}
	

	public static void main(String[] args) {
		//getCount();
		//intArrayToCharArray();
		
		int[] a = { 367,576,554 };
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<a.length; i++) {
			char[] c = String.valueOf(a[i]).toCharArray();
			for(int j=0; j<c.length; j++) {
				if(map.containsKey(c[j])) {
					map.put(c[j], map.get(c[j])+1);
				}
				else {
					map.put(c[j], 1);
				}
			}
		}
		System.out.println(map);

	}

}
