package com.string;

public class IsPalindrome {

	public static void isPalindromeNumber(int num) {
		System.out.println("Given Number is :" + num);

		int r = 0;
		int sum = 0;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10; // get the remainder
			sum = (sum * 10) + r;
			num = num / 10;
		}

		if (t == sum) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not palindrome number");
		}
	}

	public static boolean isPalindromeUsingStringBuilder(String str) {
		if (str == null)
			return false;
		StringBuilder stbuilder = new StringBuilder(str);
		stbuilder.reverse();
		return stbuilder.toString().equals(str);
	}
	
	public static boolean isPalindromeUsingLoop(String str) {
		String holder = "";
		int len = str.length();
		for(int i=len-1; i>=0; i--) {
			char ch = str.charAt(i);
			holder = holder + ch;
		}
		return holder.equals(str);
	}
	
	
	

	public static void main(String[] args) {

		System.out.println(isPalindromeUsingStringBuilder("aba"));
		System.out.println(isPalindromeUsingStringBuilder("coeiede"));
		System.out.println(isPalindromeUsingLoop("madam"));
		isPalindromeNumber(151);
	}

}
