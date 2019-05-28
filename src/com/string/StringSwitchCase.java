package com.string;

public class StringSwitchCase {
	
	
	private static void printColorUsingIf(String color) {
		if(color.equals("blue")) {
			System.out.println("Blue");
		} else if (color.equals("red")) {
			System.out.println("Red");
		} else {
			System.out.println("Invalid color code");
		}
	}
	
	
	private static void printColorUsingSwitch(String color) {
		switch(color) {
		case "blue":
			System.out.println("Blue");
			break;
		case "red":
			System.out.println("Red");
			break;
		default:
			System.out.println("Invalid color code");
		}
	}

	public static void main(String[] args) {
		printColorUsingIf("red");
		printColorUsingSwitch("blue");
		

	}

}
