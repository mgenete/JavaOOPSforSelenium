package com.operators;

public class Operators {

	public static void main(String[] args) {

		/*
		 * Comparison operators [<, >, <=, >=, !=, ==]
		 * Arithmetic operators [+, -, *, /, %]
		 * Logical operators [&&, ||, !]
		 * Unary operators [++, --]
		 */
		
		int a =32;
		int b= 35;
		int c= 30;
		
		
		
		if(a>b || a>c) { //Condition is fulfilled here
			System.out.println("a is the greatest");
		}
		else if(b>c) {
			System.out.println("b is the greatest");
		}
		else {
			System.out.println("c is the greatest");
		}
		
		System.out.println("=============");
		
		if(a>b && a>c){ 
			System.out.println("a is the highest");
		}
		else if(b>c){ //Condition is fulfilled here
			System.out.println("b is the highest");
		}
		else{
			System.out.println("c is the highest");
		}
			

		System.out.println("=============");
		
		
		boolean b1 = (a<b) && (a<c);
		System.out.println(b1+" -- because "+a+" is less than "+b+" but "+a+ " is not less than " +c);
		
		boolean b2 = (a<b) && (b<c);
		System.out.println(b2);
		
		boolean b3 = (a<b) || (b==c);
		System.out.println(b3);
		
		System.out.println();
		
		
		
		int i = 10 + +11 - -12 + +13 - -14 + +15; //10+(+11)-(-12)+(+13)-(-14)+(+15)
		System.out.println(i);
		
		
		int l = 10;
		int k = 20;
		
		System.out.println(l+=k); //l=l+k [l=10+20]
		System.out.println(l-=k); //l=l-k [l=30-20]
		
		
		
		
		
		
		
		
		
	}

}
