package com.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Employee{
	
	int id;
	String name;
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	
}

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		Set<Employee> emps = new HashSet<Employee>();
		emps.add(new Employee(101, "raj"));
		
//		HashSet<String> hs = new HashSet<E>();
//		hs.a`
	}
}
