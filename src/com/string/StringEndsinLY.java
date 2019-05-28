package com.string;

public class StringEndsinLY {
	
	/* Given a string, return true if it ends in "ly".
	 */
	
	public static boolean endsLY(String str) {
		if(str.length() < 2)
			return false;
		
		return str.substring(str.length() - 2).equals("ly");
	}

	public static void main(String[] args) {
		System.out.println(endsLY("lovely"));

	}

}
