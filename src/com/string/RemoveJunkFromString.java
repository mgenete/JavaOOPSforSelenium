package com.string;

public class RemoveJunkFromString {

	public static void main(String[] args) {

		//1. use regular expression= [^a-zA-Z0-9]
		//2. to trim before and after spaces
		String s = "*()&%$#@! Good Moring 0123456789 *()&%$#@!";

		s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		System.out.println(s.trim());
		
		
		String m = "Matt 495859 Wollega";
		m=m.replaceAll("[0-9]", "");
		System.out.println(m);
		
	}

}
