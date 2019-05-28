package com.oops;



class Overload {
	
	public void print() {
		System.out.println("--method overloading--");
		System.out.println("print method with no param");
	}
	
	
	public void print(int x) {
		System.out.println();
		System.out.println("print int: "+x);
	}
	
	public void print(double x) {
		System.out.println();
		System.out.println("print double: "+x);
	}
	
	public void print(String s) {
		System.out.println();
		System.out.println("print String: "+s);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {


		Overload Obj = new Overload();
		Obj.print();
		Obj.print(99.99);
		Obj.print(100);
		Obj.print("Price");

	}

}
