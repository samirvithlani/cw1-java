package com.thread;

public class ThreadDemo4 extends Thread{

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread is running..." + Thread.currentThread().getName()+ " - " +i);
		}
	}
	
	public static void main(String[] args) {

		ThreadDemo4 t1 = new ThreadDemo4();
		ThreadDemo4 t2 = new ThreadDemo4();
		ThreadDemo4 t3 = new ThreadDemo4();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		
	}
}
