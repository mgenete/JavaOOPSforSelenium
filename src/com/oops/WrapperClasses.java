package com.oops;

public class WrapperClasses {
	
	/*
	 * wrapper classes
		each primitive data type has a wrapper
	 	class dedicated to it -use wrapper classes to add primitive data types to
	 	collections -use wrapper classes to convert primitive values to and from
	  	String -in Selenium getText() method returns value in the form of String. Use
	 	wrapper class to convert the String to int/long to do some calculations
	 */
	

	public static void main(String[] args) {


		int year = 1990;
		String byear = String.valueOf(year);
		

		String utility = "45";
		int util = Integer.parseInt(utility);
		double d = Double.parseDouble(utility);
		
		int i = 10; // single value container
		Integer iRef = new Integer(i); // Boxing (constructing the Object)

		int j = iRef.intValue(); // Unboxing (Extracting the value from Object)

		Integer kRef = i; // AutoBoxing (Integer kRef = new Integer(i);)
		int l = kRef; // AutoUnboxing
	}

}
