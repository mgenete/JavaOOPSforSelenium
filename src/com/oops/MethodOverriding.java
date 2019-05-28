package com.oops;


class Toyota {

	public void engine() {
		System.out.println("Toyota---> engine method");
	}

	public void brakes() {
		System.out.println("Toyota---> brakes method");
	}
}


class ToyotaCamry extends Toyota {

	public void engine() {
		System.out.println("Camry---> engine method");
	}

	public void brakes() {
		System.out.println("Camry---> brakes method");
	}
}


class ToyotaCamrySE extends ToyotaCamry {

	public void navigation() {
		System.out.println("CamryXSE---> navigation method");
	}

	public void cruiseControl() {
		System.out.println("CamryXSE---> cruiseControl method");
	}
}


public class MethodOverriding {

	public static void main(String[] args) {


		Toyota tRef = new Toyota();
		ToyotaCamry cRef = new ToyotaCamry();
		ToyotaCamrySE seRef = new ToyotaCamrySE();
		
		
		//compile time polymorphism
		System.out.println("--Toyota--");
		tRef.engine();
		tRef.brakes();
		
		System.out.println("--ToyotaCamry--");
		cRef.engine();
		cRef.brakes();
		
		System.out.println("--ToyotaCamrySE--");
		seRef.engine();
		seRef.brakes();
		seRef.cruiseControl();
		seRef.navigation();
		
		System.out.println("---dynamic/run-time polymorphism -----");
		Toyota tCam = new ToyotaCamry(); //to access overridden functions in subclasses
		tCam.brakes();
		tCam.engine();

	}

}
