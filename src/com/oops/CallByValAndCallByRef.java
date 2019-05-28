package com.oops;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {


		CallByValAndCallByRef Obj = new CallByValAndCallByRef();
		int x =10;
		int y =20;
		System.out.println(Obj.sumMethodOne(x, y)); //call by value/pass by value
		
		System.out.println();
		
		System.out.println(Obj.sumMethodTwo(x, y));
				
		Obj.p=50;
		Obj.q=60;
		
		Obj.swap(Obj);
		System.out.println(Obj.p);
		System.out.println(Obj.q);
		
		
	}
	
	public int sumMethodOne(int a, int b) {
		int c = a+b;
		return c;
	}

	
	public int sumMethodTwo(int a, int b) {
		a= 30;
		b= 40;
		int c = a+b;
		return c;
	}

	
	//call by reference (we are passing the value of object reference)
	public void swap(CallByValAndCallByRef t) {
		
		int s;
		s = t.p;   //s=50
		t.p = t.q; //t.p=60
		t.q = s;   //t.q=50
		
	}
	
	
	
}
