package com.string;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharInString {

	public static void main(String[] args) {
		String name = "matti";
		Set<Character> set = new HashSet<Character>();
		for(int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
			if(set.add(c) == false) {
				System.out.println("duplicate char is: "+c);
			}
			
		}



	}

}
