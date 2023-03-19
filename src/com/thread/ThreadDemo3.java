package com.thread;

public class ThreadDemo3 extends Thread {

	public void run() {

		for (int i = 1; i <= 10000; i++) {
			System.out.println("Thread is running..." + Thread.currentThread().getName() + " - " + i);
		}
	}

	public static void main(String[] args) {

		ThreadDemo3 t1 = new ThreadDemo3();
		ThreadDemo3 t2 = new ThreadDemo3();

		t1.start();
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();

	}
}
