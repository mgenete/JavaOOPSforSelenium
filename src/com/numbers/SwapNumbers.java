package com.numbers;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		System.out.println("current value of a is: " +a);
		System.out.println("current value of b is: " +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("new value of a is: " +a);
		System.out.println("new value of b is: " +b);

	}

}
