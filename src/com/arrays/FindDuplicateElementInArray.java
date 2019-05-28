package com.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElementInArray {
	
	
	
	public void getDuplicateIntUsingLoop(int[] nums) {
		
		for(int i=0; i<nums.length; i++) {
			for(int k=i+1; k<nums.length; k++) {
				if(nums[i] == nums[k]) {
					System.out.println("Duplicate element is: "+nums[i]);
				}
			}
		}
	}

	public void getDuplicateCharUsingLoop(char[] ch) {

		for (int i = 0; i < ch.length; i++) {
			for (int k = i + 1; k < ch.length; k++) {
				if (ch[i] == ch[k]) {
					System.out.println("Duplicate element is: " + ch[i]);
				}
			}
		}
	}
	
	
	public void getDuplicateUsingSet(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<nums.length; i++) {
			if(set.add(nums[i]) == false) {
				System.out.println("Duplicate value is: "+nums[i]);
			}
		}
	}
	
	public void getDuplicateUsingMap(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer i: nums) {
			Integer count = map.get(i);
			if(count == null) {
				map.put(i, 1);
			}
			else {
				map.put(i, ++count);
			}
		}
		
		for(Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println("duplicate element is: "+entry.getKey());
			}
		}
	}
	
	
	public static void main(String[] args) {
		FindDuplicateElementInArray obj = new FindDuplicateElementInArray();
		
		int[] a = {1,2,2,4,4,6,8,6,9};
		obj.getDuplicateIntUsingLoop(a);
		
		System.out.println();
		
		char[] c = {'q','r','b','t','q','y','b','z','r','w'};
		obj.getDuplicateCharUsingLoop(c);
		
		System.out.println();
		
		obj.getDuplicateUsingSet(a);

	}

}
