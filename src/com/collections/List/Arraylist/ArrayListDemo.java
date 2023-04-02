package com.collections.List.Arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("raj");
		al.add("ram");
		al.add("krunal");
		al.add("jay");
		al.add("jay");
		al.add(1, "rama");
		al.add("jay");

		// al.clear();
		// System.out.println(al.isEmpty());
		boolean isAvailable = al.contains("JAY");
		System.out.println("is available " + isAvailable);

		int x = al.indexOf("jaya");
		System.out.println("index  = " + x);

		int x1 = al.lastIndexOf("jay");
		System.out.println("indexlast " + x1);
		Object elms[] = al.toArray();

//		String removing = al.remove(0);
//		System.out.println("removing...." + removing);
//		boolean isRemoved = al.remove("jay");
//		System.out.println("removed???" + isRemoved);

		ArrayList<String> remove = new ArrayList<String>();
		remove.add("jay");
		remove.add("priya");
		remove.add("neha");
		
		al.removeAll(remove);

//		for (Object s : elms) {
//			System.out.println("....."+s);
//		}

		for (String s : al) {
			System.out.println(s);
		}

//		for (int i = 0; i < al.size(); i++) {
//
//			System.out.println(al.get(i));
//		}

		// System.out.println(al.size());

	}
}
