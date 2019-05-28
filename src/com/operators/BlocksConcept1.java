package com.operators;


// block is a compound statement enclosed in curly braces
// a statement is command terminated by semi-colon
// non-static block is executed when we create the Object of the class
// static is executed when the class is loaded 



class BlockOne {
	static int i = 10;
	
	static {
		i = i-- - --i;
	}
}



class BlockTwo {
	int i = 10;
	
	{
		i = i-- + --i;
	}
}



public class BlocksConcept1 {

	public static void main(String[] args) {

		//access static blocks using class name
		System.out.println(BlockOne.i);
		
		//access non static blocks using Object
		BlockTwo bTwo = new BlockTwo();
		System.out.println(bTwo.i);
	}

}
