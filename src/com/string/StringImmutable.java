package com.string;

public class StringImmutable {
	
	
	//String is immutable. Immutable objects are instances whose state doesn't change after it has been initialized
	//immutable objects are thread safe
	//JVM uses String pool to store all the String objects
	
	
	/*
	 * When we create a String using double quotes, JVM looks in the String
	 * pool to find if any other String is stored with the same value. If found, it
	 * just returns the reference to that String object else it creates a new String
	 * object with given value and stores it in the String pool. When we use the new
	 * operator, JVM creates the String object but don’t store it into the String
	 * Pool.
	 *  String Pool is a pool of Strings stored in Java heap memory.
	 */
	  
	 

	public static void main(String[] args) {
		
		
		/*
		 * String will store value in the form of object so if 
		 */
		String str = new String("matti");
		System.out.println("str is: "+str);
		
		//it will create an other object to store value doe
		str = "doe";
		System.out.println("str is: "+str);
		String s = str;
		System.out.println("s is: "+s);
		System.out.println(str.concat(" base"));

	}

}
