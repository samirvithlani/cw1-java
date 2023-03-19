package com.thread;

public class ThreadDemo2 extends Thread {

	public void run() {

		System.out.println("Thread is going to sleep.."+Thread.currentThread().getName());
		for(int i=1;i<=10;i++)
		{
			System.out.println(i + " -"+Thread.currentThread().getName());
		}
		
		try {
			Thread.sleep(1500);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ThreadDemo2 t1 = new ThreadDemo2();
		ThreadDemo2 t2 = new ThreadDemo2();
		ThreadDemo2 t3 = new ThreadDemo2();

		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.start();
		t2.start();
		t3.start();

	}
}
