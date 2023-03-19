package com.thread;
class Table1{
	
	//t1 -->t2
	public synchronized void printTable(int no) {
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(no + " * "+ i + " = "+no*i);
		}
	}
	
}
class Thread1 extends Thread{
	
	Table1 t;
	

	public Thread1(Table1 t) {
	
		this.t = t;
	}



	@Override
	public void run() {
		
		t.printTable(10);
		//System.out.println(".......");
		//System.out.println(Thread.currentThread().getName() + "is runnig...");
	}
	
}
class Thread2 extends Thread{
	
	//instance...
	Table1 t;
	
	
	
	public Thread2(Table1 t) {
	
		//new
		this.t = t;
	}



	@Override
	public void run() {
	
		//System.out.println("*****");
		t.printTable(50);
		//System.out.println(Thread.currentThread().getName() + "is runnig...");
		
	}
	
}


public class ThreadDemo5 {

	public static void main(String[] args) {
		
		Table1 t=new Table1();
		Thread1 t1 = new Thread1(t);
		Thread2 t2 = new Thread2(t);
		
		t1.start();
		t2.start();
		
		
		
		
	}
}
