package com.thread;

class Table {

	void printTable(int no) {

		System.out.println("***");
		synchronized (this) {

			for (int i = 1; i <= 10; i++) {
				System.out.println(no + " * " + i + " = " + no * i);
			}
		}
		System.out.println("22");
	}
}

class Thread11 extends Thread {

	Table t;

	public Thread11(Table t) {

		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(15);
	}
}

class Thread12 extends Thread {

	Table t;

	public Thread12(Table t) {

		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(20);
	}
}

public class ThreadDemo6 {

	public static void main(String[] args) {

		Table t = new Table();
		Thread11 t1 = new Thread11(t);
		Thread12 t2 = new Thread12(t);

		t1.start();
		t2.start();
	}

}
