package com.collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemp {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("java");
		ts.add("python");
		ts.add("node");
		ts.add("react");
		ts.add("php");
		
		SortedSet<String> ss = ts.subSet("node", "react");
		ss = ts.subSet("node", true, "react", true);
		//ss = ts.tailSet("node",false);
		
		
		for(String s:ss) {
			System.out.println(s);
		}
		///ts.clear();
		
		
		
	}
}
