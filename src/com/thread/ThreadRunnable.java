package com.thread;

public class ThreadRunnable implements Runnable{
	
	
	public void run() {
		System.out.println("Hello from a thread --");
		
	}

	public static void main(String[] args) {


		ThreadRunnable Obj = new ThreadRunnable();
		Thread tRunnable = new Thread(Obj);
		tRunnable.start();

	}

}
