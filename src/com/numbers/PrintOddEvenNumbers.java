package com.numbers;

public class PrintOddEvenNumbers {

	public static void main(String[] args) {

		System.out.println("Even Numbers");
		for(int i=0; i<=20; i++) {
			if(i % 2 == 0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println("Odd Numbers");
		for(int i=0; i<=20; i++) {
			if(i % 2 != 0) {
				System.out.print(i+" ");
			}
		}
		
	}
	

}
