package com.string;

public class CountTheNumbofTimesStringAppearsInString {
	
	/* Return the number of times that the string "code" appears anywhere in the 
	 * given string, except we'll accept any letter for the 'd', so "cope" and 
	 * "cooe" count.
	 */
	
	public static int countCode(String str) {
		int count = 0;
		for(int i=0; i<str.length()-3; i++) {
			if(str.substring(i, i+2).equals("co") && str.charAt(i+3) == 'e')
				count++;
		}
		return count;
	}
	
	
	/* Return the number of times that the string "hi" appears anywhere in the 
	 * given string.
	 */
	
	public static int countHi_1(String str) {
		int count = 0;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i')
				count++;
		}
		return count;
	}
	
	public static int countHi_2(String str) {
		int count = 0;
		for(int i=0; i<str.length()-1; i++) {
			if(str.substring(i, i+2).equals("hi"))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countCode("i love to code not cove"));
		System.out.println(countHi_1("the guy said hi to her but she hi"));
		System.out.println(countHi_2("the guy said hi to her but she hi hi him"));

	}

}
