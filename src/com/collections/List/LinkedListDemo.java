package com.collections.List;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("raj");
		list.add(0, "jay");
		list.addFirst("priya");
		list.addLast("shreya"); //last
		list.add("amit");
		list.push("okk");
		//list.clear();
		
		//String removed = list.remove();
		//System.out.println("removing..."+removed);
//		String removed = list.remove(0);
//		System.out.println("removing..."+removed);
		
		//System.out.println("isRemoved??"+list.remove("jay"));
		//System.out.println("removinf... "+list.removeFirst());
		//removeLast
		
		
		//System.out.println("poping......"+list.pop());
		//System.out.println("poll"+list.poll());
		//list.pollFirst();
		//list.pollLast();
		
		System.out.println("retrive...."+list.element());
		System.out.println("retrive..."+list.peek());
		
		
		System.out.println("contains..."+list.contains("jay"));
		
		//list.get(0)
		//list.subList(0, 4);
		//list.set(index, element)
		System.out.println("get first..."+list.getFirst());
		//System.out.println(list.getLast());	
		for(String s:list) {
			System.out.println(s);
		}
	}
}
