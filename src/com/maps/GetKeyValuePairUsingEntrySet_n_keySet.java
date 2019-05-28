package com.maps;

import java.util.HashMap;
import java.util.Map;

public class GetKeyValuePairUsingEntrySet_n_keySet {

	public static void main(String[] args) {


		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Accept", "application/json");
		headers.put("Content-Type", "application/json");
		
		//1.
		for(Map.Entry<String, String> entry: headers.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
		
		System.out.println();
		
		//2.
		for(String str : headers.keySet()) {
			System.out.println(str);
		}
		
		
		
		System.out.println();
		
		//3.
		for(String str : headers.keySet()) {
			System.out.println(str+" -- "+headers.get(str));
		}
		
	}

}
