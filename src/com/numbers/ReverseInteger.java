package com.numbers;

public class ReverseInteger {

	public static void main(String[] args) {


		int num = 12345;
		int rev =0;
		
		while(num !=0){
			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num /10;
		}
		System.out.println("reverse num is:: "+rev);
		
		
		int num1 = 987654321;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		
		
		
		String k = "abcd";
		StringBuffer sb = new StringBuffer(k);
		System.out.println(sb.reverse());
	

	}

}
