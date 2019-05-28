package com.operators;



class BlockA {
	
	static int i = 10;
	
	static {
		i = i-- - --i;
		System.out.println("First "+i);
	}
	
	{
		i = i++ + ++i;
		System.out.println("Second "+i);
	}
}


class BlockB extends BlockA {
	
	static {
		i = --i - i--;
		System.out.println("Third "+i);
	}
	
	{
		i = ++i + i++;
		System.out.println("Fourth "+i);
	}
}

public class BlocksConcept2 {

	public static void main(String[] args) {

		//to access both static and non static blocks in all classes->need to create Object of class 
		//order of execution is static 1st 
		BlockB block = new BlockB();
		System.out.println(block.i);
		
//		BlockA a = new BlockB();
//		System.out.println(a.i);
		
		// using class name only executes static blocks
//		System.out.println(BlockB.i);
//		System.out.println(BlockA.i);

	}

}
