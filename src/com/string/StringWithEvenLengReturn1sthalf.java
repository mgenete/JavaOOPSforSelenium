package com.string;

public class StringWithEvenLengReturn1sthalf {
	
	/* Given a string of even length, return the first half. So the string 
	 * "WooHoo" yields "Woo".
	 */
	
	public static String firstHalf(String str) {
		return str.substring(0, str.length()/2);
	}

	public static void main(String[] args) {
		System.out.println(firstHalf("testng"));

	}

}
