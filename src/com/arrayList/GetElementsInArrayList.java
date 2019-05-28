package com.arrayList;

import java.util.ArrayList;

public class GetElementsInArrayList {

	public static void main(String[] args) {


		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("hi");
		a1.add("hello");
		a1.add("Bono");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Kume");
		a2.add("Tame");
		a2.add("frog");
		
		a2.addAll(a1);
		
		for(String str : a2) {
			System.out.println(str);
		}
		
		System.out.println();
		
		for(int i=0; i<a2.size(); i++) {
			System.out.println(a2.get(i));
		}

	}

}
