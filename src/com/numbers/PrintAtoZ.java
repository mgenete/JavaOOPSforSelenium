package com.numbers;

public class PrintAtoZ {

	public static void main(String[] args) {

		for(char ch='a'; ch<='z'; ch++) {
			System.out.print(ch);
		}
		
		System.out.println();
		
		char ZtoA = 'z';
		while(ZtoA>='a') {
			System.out.print(ZtoA);
			ZtoA--;
		}
		
		System.out.println();
		
		char AtoZ = 'a';
		while(AtoZ <='z') {
			System.out.print(AtoZ);
			AtoZ++;
		}
		
	}

}
