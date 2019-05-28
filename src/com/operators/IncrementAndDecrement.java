package com.operators;

public class IncrementAndDecrement {

	public static void main(String[] args) {


		
		int a = 30;
		int b = 40;
		int c = 50;
		int d = 60;
		
		
		System.out.println(a++); //30 print current value and increment to 31
		System.out.println(a); // a is now 31
		
		System.out.println(--a); // a is now 30
		System.out.println(a);
		
		System.out.println(b--); //40 print current value and decrement to 39
		System.out.println(b);
		
		System.out.println(++c); //51
		System.out.println(c);
		
		

		int s = 3;
		if (s++ == 4) //value of s to use 3
			System.out.println(s); // post increment so this statement will not print
		System.out.println(s); // this statement will print the post incremented value
	
	
		System.out.println("-------------");
		
		int z = 9;
		System.out.println(z);
		System.out.println(z++);
		System.out.println(z);
		
		System.out.println();
		
		int w = 9;
		System.out.println(w);
		System.out.println(w--);
		System.out.println(w);
		
		System.out.println();
		
		int u = 9;
		System.out.println(u);
		System.out.println(++u);
		System.out.println(u);

		System.out.println();
		
		int g=9;
		System.out.println(g);
		System.out.println(--g);
		System.out.println(g);
		
		
		
	}

}
