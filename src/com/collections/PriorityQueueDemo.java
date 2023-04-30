package com.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<String> q = new PriorityQueue<String>();
		q.add("Parth");
		q.add("Ajay");
		q.add("Ram");
		q.add("Amit");
		q.add("Anil");
		
		for(String s:q) {
			System.out.println(s);
		}
		q.poll();
		System.out.println("............");
		for(String s:q) {
			System.out.println(s);
		}
		
	}
}
