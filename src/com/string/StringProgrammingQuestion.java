package com.string;

public class StringProgrammingQuestion {
	
	
	
	public void stringTest1() {
		String s1 = new String("pankaj");
		String s2 = new String("PANKAJ");
		System.out.println(s1 = s2);
	}
	
	public void stringTest2() {

		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);

	}
	
	
	public void stringTest3() {

		String s1 = "abc";
		String s2 = new String("abc");
		//s2.intern();
		System.out.println(s1 == s2);

	}

	public static void main(String[] args) {
		StringProgrammingQuestion obj = new StringProgrammingQuestion();
		obj.stringTest1(); //it will print “PANKAJ” because we are assigning s2 String to s1.
		
		obj.stringTest2(); // print false because we are using new operator to create String,
		                  //If we create them using double quotes, then they will be part of string pool and it will print true.
	
		obj.stringTest3(); //print false because s2 is not of type String.
	}

}
