package com.loops;

public class DoWhile {

	public static void main(String[] args) {

		//the statements within the do block are always executed at least once,
		int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } 
        while (count < 10);
	}

}
