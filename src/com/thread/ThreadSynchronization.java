package com.thread;

class MyThread extends Thread {
	static String message[] = { "A", "year", "from", "now", "you", "will", "wish", "you", "had", "started", "today" };

	public MyThread(String id) {
		super();
	}

	public void run() {
		SynchronizedOutPut.displayList(getName(), message);
	}
}

class SynchronizedOutPut {
	public static synchronized void displayList(String name, String list[]) {
		for (int i = 0; i < list.length; i++) {
			MyThread t = (MyThread) Thread.currentThread();
			System.out.println(name + list[i]);
		}
	}
}

public class ThreadSynchronization {

	public static void main(String[] args) {

		MyThread thread1 = new MyThread("thread1: ");
		MyThread thread2 = new MyThread("thread2: ");

		thread1.start();
		thread2.start();

		boolean thread1_IsAlive = true;
		boolean thread2_IsAlive = true;

		do {
			if (thread1_IsAlive && !thread1.isAlive()) {
				thread1_IsAlive = false;
				System.out.println("\n");
				System.out.println("Thread 1 is dead");
				System.out.println("\n");
			}
			if (thread2_IsAlive && !thread2.isAlive()) {
				thread2_IsAlive = false;
				System.out.println("\n");
				System.out.println("Thread 2 is dead");
				System.out.println("\n");

			}
		} while (thread1_IsAlive || thread2_IsAlive);

	}

}
