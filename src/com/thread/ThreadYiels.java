package com.thread;

public class ThreadYiels extends Thread {

	public void run() {

		for (int i = 0; i < 5; ++i) {
			Thread.yield(); // By calling this method, MyThread stop its execution and giving a chance to a
							// main thread
			System.out.println("Thread started:" + Thread.currentThread().getName());
		}
		System.out.println("Thread ended:" + Thread.currentThread().getName());
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadYiels thread = new ThreadYiels();
		thread.setName("A");
		thread.start();
		for (int i = 0; i < 5; ++i) {
			System.out.println("Thread started:" + Thread.currentThread().getName());
		}
		System.out.println("Thread ended:" + Thread.currentThread().getName());

	}
}
