package com.thread;

public class ThreadDeadlock {

	public static void main(String[] args) {

		final String res1 = "royal";
		final String res2 = "java";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (res1) {

					System.out.println("Thread 1: locked resourc1 1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (res2) {

						System.out.println("Thread 1 localed resource 2");
					}
				}
			};
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (res2) {

					System.out.println("Thread 2: locked resourc1 2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (res1) {

						System.out.println("Thread 2 localed resource 1");
					}
				}
			};
		};

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();

	}
}
