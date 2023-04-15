package com.collections.map;

import java.util.HashMap;
import java.util.TreeMap;

class Employee {

	int id;
	String name;

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}

}

public class HashMapDemo {

	public static void main(String[] args) {

		// TreeMap<Integer, Employee> empmap = new TreeMap<Integer, Employee>();

		// empmap.put(1, new Employee(1, "raj"));
		
		
		HashMap<String, Employee> emps = new HashMap<String,Employee>();
		

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("a", "anj");
		map.put("b", "bike");
		map.put("c", "cim");

	}
}
