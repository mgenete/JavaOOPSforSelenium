package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsFramework {
	
	//Generics allow us to provide the type of Object that a collection can contain,
	//List is an ordered collection and can contain duplicate elements.
	
	 /*
     * Iterator fail-safe property work with the clone of underlying collection, hence it’s not affected by 
     * any modification in the collection. By design, all the collection classes in java.util package are fail-fast 
     * whereas collection classes in java.util.concurrent are fail-safe. Fail-fast iterators throw 
     * ConcurrentModificationException whereas fail-safe iterator never throws ConcurrentModificationException.
     * CopyOnWriteArrayList 
     * ConcurrentHashMap 
     * 
     */
	
	//concurrent Collection Classes contains thread-safe collection classes that allow collections to be modified while iterating. 

	public static void main(String[] args) {


		List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        
     // get the iterator
        Iterator<String> it = list.iterator();
        
        while(it.hasNext()){
            System.out.println("list is:"+list);
            String str = it.next();
            System.out.println(str);
            

            //we get java.util.ConcurrentModificationException
            //It happens because ArrayList iterator is fail-fast by design
            //once the iterator is created, if the ArrayList is modified, it throws ConcurrentModificationException.
            if(str.equals("2"))list.remove("5");
            if(str.equals("3"))list.add("3 found");
            //below code don't throw ConcurrentModificationException
            //because it doesn't change modCount variable of list
            if(str.equals("4")) list.set(1, "4");
            System.out.println(str);
        }
        
       

	}

}
