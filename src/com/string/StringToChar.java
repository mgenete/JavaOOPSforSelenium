package com.string;

public class StringToChar {

	public static void main(String[] args) {


		String name = "washington";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(4));
		
		char[] nameChar = name.toCharArray();
		System.out.println(nameChar);

	}

}
