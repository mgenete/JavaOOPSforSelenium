package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {
	
	//set interface doesnot accept duplicate values
		//element is not stored in sequential order

	public static void main(String[] args) {


		HashSet<String> hs = new HashSet<String>();
		
		//to add
		hs.add("Monday");
		hs.add("Tuesday");
		hs.add("Wednesday");
		hs.add("Thursday");
		hs.add("Friday");
		System.out.println(hs);
		
		hs.add("Tuesday");
		System.out.println(hs);
		
		
		hs.remove("Monday");
		
		hs.isEmpty();
		
		hs.size();
		
		System.out.println();
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
