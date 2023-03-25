package com.thread;

class Call {

	public synchronized void currentCall(int flag) {

		System.out.println("current call is running");
		if (flag == 1) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("new call is on wait...");
			System.out.println("current call is puttin on hold...");
			try {
				wait();
				System.out.println("holded call recived...");
				System.out.println("holded call done...");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public synchronized void comingCall() {

		System.out.println("new call received...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("new call is running...");
		System.out.println("new call is about to end");
		System.out.println("new call finished");
		System.out.println("notfying holded call....");
		notify();

	}

}

class Thread01 extends Thread {

	Call c;

	public Thread01(Call c) {

		this.c = c;
	}

	@Override
	public void run() {

		c.currentCall(1);
	}

}

class Thread02 extends Thread {

	Call c;

	public Thread02(Call c) {

		this.c = c;
	}

	public void run() {

		c.comingCall();
	}

}

public class CallingDemo {

	
	public static void main(String[] args) {
		
		
		Call c = new Call();
		Thread01 t1 = new Thread01(c);
		Thread02 t2 = new Thread02(c);
		t1.start();
		try {
			Thread.sleep(200);
			t2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
}
