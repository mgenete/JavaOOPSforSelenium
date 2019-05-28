package com.oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputStreams {

	public void useScanner() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");

		int y = sc.nextInt();
		try {
			if (y == 0) {
				System.out.println(5 / 0);
			} else {
				System.out.println("exception has not occurred, to see exception enter zero");
			}
			y = sc.nextInt();
			System.out.println(5 / y);
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero exception");
			System.out.println(e);
			sc.close();
		}

	}

	public void useBufferedReader() throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		System.out.println("Enter your name");
		String name = reader.readLine();
		System.out.println("Your name is: " + name);
		System.out.println("Enter your age");
		String age = reader.readLine();
		System.out.println("Your age is: " + age);
	}

	public static void main(String[] args) throws IOException {

		InputStreams obj = new InputStreams();
		//obj.useScanner();
		obj.useBufferedReader();

		
	}

}
