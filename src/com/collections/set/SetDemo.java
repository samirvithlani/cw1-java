package com.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		
		Set<String> set1 = new TreeSet<String>();
		set1.add("zara");
		set1.add("jay");
		set1.add("amit");
		
		Set<String> set = new TreeSet<String>();
		set.add("zara");
		set.add("jay");
		set.add("jay");
		set.add("amit");
		set.add("anil");
		set.add("neha");
		set.add("krunal");

		System.out.println(set.contains("neha"));

		System.out.println(set.isEmpty());

		System.out.println(set.remove("jay"));
		
		set.removeAll(set1);

		for (String s : set) {
			System.out.println(s);
		}

	}
}
