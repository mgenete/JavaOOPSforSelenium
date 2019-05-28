package com.arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {


		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(0, 400);//insert by index
		ar.add(500);
		System.out.println(ar);
		
		//to remove
		ar.remove(3);
		System.out.println(ar);
		
		//to retrieve
		ar.get(2);
		
		//to check an element in arraylist
		ar.contains(100);
		
		//to find index of an element
		ar.indexOf(300);
		
		//it it empty
		ar.isEmpty();
		
		//to get size
		ar.size();
		

	}

}
