package com.thread;

class Sender {

	public void sendMsg(String msg) {
		System.out.println("sending message " + msg);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(msg + " sent...");
	}

}

class SenderWThread extends Thread {

	private String msg;
	Sender sd;

	public SenderWThread(String msg, Sender sd) {

		this.msg = msg;
		this.sd = sd;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (sd) {
			sd.sendMsg(msg);	
		}
	}

}

public class SyncronizedEx {

	
	
	public static void main(String[] args) {
		
		Sender sender = new Sender();
		SenderWThread s1 = new SenderWThread("Hi", sender);
		SenderWThread s2 = new SenderWThread("Hello", sender);
		
		s1.start();
		s2.start();
		
		
	}
	
	
	
	
	
	
	
	
}
