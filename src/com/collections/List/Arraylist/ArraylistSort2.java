package com.collections.List.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

class User implements Comparable<User> {
	int id;
	String name;

	public User(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(User o) {
		if (this.id > o.id) {
			return 1;
		} else if (this.id < o.id) {
			return -1;
		}
		return 0;
	}

//	@Override
//	public int compareTo(User o) {
//
//		return this.name.compareTo(o.name);
//	}

}

public class ArraylistSort2 {

	public static void main(String[] args) {

		ArrayList<User> users = new ArrayList<User>();
		users.add(new User(1, "raj"));
		users.add(new User(12, "jay"));
		users.add(new User(133, "parth"));
		users.add(new User(7, "neha"));

		Collections.sort(users);

		for (User u : users) {
			System.out.println(u.id + " - " + u.name);
		}

	}
}
