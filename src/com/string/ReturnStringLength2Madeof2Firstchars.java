package com.string;

public class ReturnStringLength2Madeof2Firstchars {
	
	
	
	/* Given a string, return a string length 2 made of its first 2 chars. If the 
	 * string length is less than 2, use '@' for the missing chars.
	 */
	
	public static String atFrist(String str) {
		if(str.length() == 0)
			return "@@";
		if(str.length() == 1)
			return str + "@";
		return str.substring(0, 2);
	}
	

	public static void main(String[] args) {


		System.out.println(atFrist("word"));
		System.out.println(atFrist("At"));
		System.out.println(atFrist("f"));
		System.out.println(atFrist(""));

	}

}
