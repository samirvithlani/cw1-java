package com.collections.List.vector;

import java.util.Vector;

/*
 * arraylist vector --> 10
 * 11 th element --> 15  
 * 20
 * 
 * */
public class VectorDemo {

	public static void main(String[] args) {
		//thread safe...
		Vector<String> vc = new Vector<String>();
		vc.add("java");
		vc.add("python");
		vc.add("cpp");
		vc.add("node");
		
		String s = vc.elementAt(1);
		System.out.println(s);
	}
}
