package com.thread;

public class ThreadDemo1 extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread is running..." + Thread.currentThread().getName()+ " - " +i);
		}
	}

	public static void main(String[] args) {

		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo1 t2 = new ThreadDemo1();

		t1.setName("A");
		t2.setName("B");
		// thread
		t1.start();
		//gap
		t2.start();
	}
}
