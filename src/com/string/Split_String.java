package com.string;

import java.util.Arrays;

public class Split_String {

	public static void main(String[] args) {

		String s1 = "abcaada";
		System.out.println(Arrays.toString(s1.split("a")));
		
		System.out.println();

		String s = "Pankaj,New York,USA";
		String[] data = s.split(",", 2);
		System.out.println("Name = " + data[0]); // Pankaj
		System.out.println("Address = " + data[1]); // New York,USA

		System.out.println();
		
		String s2 = "Pankaj,New York,USA";
		String[] data1 = s2.split(",");
		System.out.println("Name = " + data1[0]); // Pankaj
		System.out.println("Address = " + data1[1]); // New York,USA
		System.out.println("Address = " + data1[2]); // New York,USA
	}

}
