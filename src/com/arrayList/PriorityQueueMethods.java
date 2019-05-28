package com.arrayList;

import java.util.PriorityQueue;

public class PriorityQueueMethods {

	public static void main(String[] args) {


		PriorityQueue<Integer> prq = new PriorityQueue<Integer>();

		// to add
		prq.add(6);
		prq.add(9);
		prq.add(5);
		prq.add(4);
		prq.add(16);
		System.out.println(prq);

		// retrieves, but does not remove, the head of this queue
		prq.peek();

		// method retrieves and removes the head of this queue, or returns null if this
		// queue is empty.
		prq.poll();

		// method returns true if this queue contains the specified element
		prq.contains(8);

		// method is used to remove all of the contents of the priority queue.
		prq.clear();
		
		
		

	}

}
