package com.string;

public class ShortlongShort {
	
	/* Given 2 strings, a and b, return a string of the form short+long+short, 
	 * with the shorter string on the outside and the longer string on the 
	 * inside. The strings will not be the same length, but they may be empty 
	 * (length 0).
	 */
	
	public static String comboString(String a, String b) {
		if(b.length() < a.length()) {
			String temp = a;
			a = b;
			b = temp;
		}
		
		return a + b + a;
	}

	public static void main(String[] args) {


		System.out.println(comboString("Word", "nu"));

	}

}
