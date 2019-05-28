package com.oops;



/*Abstraction
- in java abstraction is achieved through abstract classes and interfaces
- abstraction is hiding the implementation detail
- allows to define template for a group of classes/sub-classes

Abstract classes
- it may or may not include abstract methods
- it can not be instantiated (no Object)
- to declare abstract method
	- use abstract key word
	- no implementation in the abstract method
	- abstract class sub-classes provide implementation
	- sub-classes inherit both abstract & non abstract methods*/


abstract class AbstractClassModel {

	public abstract void methodOne();

	public abstract void methodTwo();

	public void methodThree() {
		System.out.println("Parent - non abstract method");
	}

}


public class AbstractClasses extends AbstractClassModel{

	public static void main(String[] args) {
		AbstractClasses obj = new AbstractClasses();
		obj.methodOne();
		obj.methodTwo();
		obj.methodThree();

	}

	@Override
	public void methodOne() {
		System.out.println("methodOne abstract method overriden by subclass");
		
	}

	@Override
	public void methodTwo() {
		System.out.println("methodTwo abstract method overriden by subclass");
		
	}

}
