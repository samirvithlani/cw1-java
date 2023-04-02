package com.collections.List.Arraylist;

import java.util.ArrayList;

class Student {

	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class ArrayListDemo3 {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student(101, "raj");
		Student s2 = new Student(102, "jay");
		Student s3 = new Student(103, "parth");

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(new Student(104, "priya"));

		
//		System.out.println(students.contains(s1));

		for (Student s : students) {

			// System.out.println(s);
			System.out.println(s.id + " - " + s.name);
		}

	}
}
