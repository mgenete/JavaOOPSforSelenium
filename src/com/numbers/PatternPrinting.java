package com.numbers;

public class PatternPrinting {

	public static void main(String[] args) {

		PatternPrinting obj = new PatternPrinting();
	
		obj.patternPrintOne();
		obj.patternPrintTwo();
		obj.patternPrintThree();
	}
	
	public void patternPrintOne() {
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+ "  ");
			}
			System.out.println();
		}
	}
	
	public void patternPrintTwo() {
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+ "  ");
			}
			System.out.println();
		}
	}
	
	public  void patternPrintThree() {
		for(int i =1; i<=7;i++){
			for(int j =1; j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=6;i>=1;i--){
			for(int j =1; j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
