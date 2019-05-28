package com.thread;

public class ThreadClass extends Thread {
	
	public void run() {
		System.out.println("Hello from thread class--");
	}

	public static void main(String[] args) {


		ThreadClass thread = new ThreadClass();
		thread.run();

	}

}
