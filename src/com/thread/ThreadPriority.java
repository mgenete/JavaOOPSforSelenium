package com.thread;

public class ThreadPriority extends Thread {

	ThreadPriority() {
		super(); // calling the constructor of Thread class
	}

	ThreadPriority(String name) { // parameterized constructor
		super(name);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " i: " + i);
		}
	}
}
