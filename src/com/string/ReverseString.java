package com.string;

public class ReverseString {

	public static void main(String[] args) {


		String str = "washington";
		StringBuilder builder1 = new StringBuilder(str);
		builder1.reverse();
		System.out.println(builder1);
		
		
		String str1 = "Samsung";
		StringBuilder builder2 = new StringBuilder();
		int len = str1.length();
		for(int i=len-1; i>=0; i--) {
			//char ch = str1.charAt(i);
			builder2.append(str1.charAt(i));
		}
		System.out.println(builder2.toString());
		
		

		String str2 = "Toshiba";
		int leng = str2.length();
		for(int i=leng-1; i>=0; i--) {
			System.out.print(str2.charAt(i));
		}
		
		System.out.println();
		
		String str3 = "Toronto";
		String t = "";
		for (int i = str3.length() - 1; i >= 0; i--) {
			t = t + str3.charAt(i);
		}
		System.out.println(t);

	}

}
