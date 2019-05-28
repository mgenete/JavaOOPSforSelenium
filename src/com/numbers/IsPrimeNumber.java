package com.numbers;

import java.util.ArrayList;
import java.util.List;

public class IsPrimeNumber {
	
	
	public void isPrimeNumber(int num) {
		boolean isPrime = true;

		if (num <= 1) {
			isPrime = false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime == false) {
			System.out.println(num + " is not prime");

		} else if (isPrime == true) {
			System.out.println(num + " is prime");
		}

	}

	public static boolean isPrimeNumber2(int number) {
		for(int i=2; i<number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		IsPrimeNumber obj = new IsPrimeNumber();
		obj.isPrimeNumber(81);
		obj.isPrimeNumber(82);
		obj.isPrimeNumber(83);

		System.out.println();
		
		List<Integer> primeNumb = new ArrayList<Integer>();
		for (int i = 2; i <= 34; i++) {
            if (isPrimeNumber2(i)) {
            	primeNumb.add(i);
            }
        }
		System.out.println(primeNumb.toString());
	}

}
