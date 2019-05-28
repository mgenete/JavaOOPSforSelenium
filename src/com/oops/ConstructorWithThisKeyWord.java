package com.oops;

public class ConstructorWithThisKeyWord {

	String name;

	public ConstructorWithThisKeyWord() {
		System.out.println("default constructor");
	}

	// this is the reference to the current Object
	public ConstructorWithThisKeyWord(String name) {
		this.name = name;
		System.out.println(name);
	}

	public static void main(String[] args) {

//		use 'this' key word if we want to initialize class variables with the current value of constructor

		ConstructorWithThisKeyWord Obj = new ConstructorWithThisKeyWord();

		ConstructorWithThisKeyWord Obj1 = new ConstructorWithThisKeyWord("tom peter");

	}

}
