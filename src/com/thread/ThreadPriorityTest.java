package com.thread;



public class ThreadPriorityTest {

	public static void main(String[] args) {
		
		


		ThreadPriority tP1 = new ThreadPriority("child1");
		ThreadPriority tP2 = new ThreadPriority("child2");
		
		System.out.println("tP1 Thread's initial name & priority");
		System.out.println("tP1 name: "+tP1.getName());
		System.out.println("tP1 priority: "+tP1.getPriority());
		
		System.out.println();
		
		System.out.println("tP2 Thread's initial name & priority");
		System.out.println("tP2 name: "+tP2.getName());
		System.out.println("tP2 priority: "+tP2.getPriority());
		
		System.out.println();
		
		tP1.setName("child1");
		tP2.setName("child2");
		
		tP1.setPriority(6);
		tP2.setPriority(8);

		System.out.println("tP1 Thread's changed name & priority");
		System.out.println("tP1 name: "+tP1.getName());
		System.out.println("tP1 priority: "+tP1.getPriority());
		
		System.out.println();
		
		System.out.println("tP2 Thread's changed name & priority");
		System.out.println("tP2 name: "+tP2.getName());
		System.out.println("tP2 priority: "+tP2.getPriority());
		
		System.out.println();
		
		tP1.start();
		tP2.start();
	}

}
