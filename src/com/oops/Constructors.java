package com.oops;




class ConstructorsModel {
	
	public ConstructorsModel() {
		System.out.println("Parent default constructor");
	}

	
	public ConstructorsModel(String str) {
		System.out.println("Parent one param constructor -> "+str);
	}
}




public class Constructors extends ConstructorsModel{
	
	
	public Constructors() {
		super();
		System.out.println("child default constructor");
	}

	
	public Constructors(String str) {
		super(str);
	}
	
	
	
	public static void main(String[] args) {
		Constructors obj = new Constructors();
		Constructors obj2 = new Constructors("Mars");

	}

}
