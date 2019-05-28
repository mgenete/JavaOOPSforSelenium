package com.numbers;

import java.util.Random;



public class GenerateRandomNumber {
	
	public void generateRandomNumber() {
		 Random ran = new Random();
		 
		 //prints any mumber
		/* for(int i=0; i<5; i++) {
			 int number = ran.nextInt();
			 System.out.println(number);
		 }*/
		 
		 //prints numbers between 0 and 200
		 for(int i=0; i<5;i++){
				int number = ran.nextInt(200);
				System.out.println(number);
			}
	}
	
	public static void main(String[] args) {
		GenerateRandomNumber obj = new GenerateRandomNumber();
		obj.generateRandomNumber();
				
	}

}
