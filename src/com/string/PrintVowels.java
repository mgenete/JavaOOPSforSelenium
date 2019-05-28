package com.string;

import java.util.HashMap;
import java.util.Map;

public class PrintVowels {

	public static void main(String[] args) {


		String str = "matti";
		int count =0;
		for(int i=0; i<str.length(); i++) {
		 if(str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
		count++;
		  }		
		}
		System.out.println(count);
		
		
		Map<Character, Integer> vowels = new HashMap<Character, Integer>() {
		    {
		        put('a', 0);
		        put('e', 0);
		        put('i', 0);
		        put('o', 0);
		        put('u', 0);
		    }
		};
		
		
		for (int i = 0; i < str.length(); i++)
		{
		    char ch = str.charAt(i);
		    ch = Character.toLowerCase(ch);

		    if (vowels.containsKey(ch)) {
		        vowels.put(ch, vowels.get(ch) + 1); 
		    }
		}

		System.out.println(vowels); 


	}

}
