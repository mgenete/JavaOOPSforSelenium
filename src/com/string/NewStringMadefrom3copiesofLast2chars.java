package com.string;

public class NewStringMadefrom3copiesofLast2chars {
	
	/* Given a string, return a new string made of 3 copies of the last 2 chars 
	 * of the original string. The string length will be at least 2.
	 */
	
	public static String extraEnd(String str) {
		String last = str.substring(str.length() - 2);
		return last + last + last;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
