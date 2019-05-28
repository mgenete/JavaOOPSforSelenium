package com.string;

public class CompareTwoStrings {

	public static void main(String[] args) {


		//compareTo(String str)
		//equals(String str)
		//equalsIgnoreCase(String str)
		
		String str = new String("matti");
		String str2 = new String("matti");
		
		System.out.println(str == str2); //compares ref+value
		System.out.println(str.equals(str2)); //compare value only
		System.out.println(str = str2);
		
		

		//“==” operator, it checks for the value of String as well as the reference 
		//equals method  checks if two Strings are equal or not.
        String s1 = "abc";
        String s2 = "abc";
        String s3= new String("abc");
        System.out.println("s1 == s2 ? "+(s1==s2)); //true
        System.out.println("s1 == s3 ? "+(s1==s3)); //false
        System.out.println("s1 equals s3 ? "+(s1.equals(s3))); //true


	}

}
