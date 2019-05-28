package com.string;

public class RemoveFirstAndLastChars {
	
	/* Given a string, if the first or last chars are 'x', return the string 
	 * without those 'x' chars, and otherwise return the string unchanged.
	 */
	
	public static String withoutX(String str) {
		int begin = 0;
		int end = str.length();
		
		if(str.length() > 0 && str.charAt(0) == 'x')
			begin = 1;
		if(str.length() > 0 && str.charAt(str.length() - 1) == 'x')
			end--;
		
		return str.substring(begin, end);
	}
	
	
	/* Given a string, return a version without both the first and last char of 
	 * the string. The string may be any length, including 0.
	 */
	
	public String windoutEnd2(String str) {
		if(str.length() <=2)
			return "";
		return str.substring(1, str.length() - 1);
	}

	public static void main(String[] args) {
		System.out.println(withoutX("xfordx"));

	}

}
