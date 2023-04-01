package com.collections.List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> finalList = new ArrayList<String>();
		
		
		list1.add("dhoni");
		list1.add("jadeja");
		list1.add("stocks");
		
		list2.add("pandya");
		list2.add("rohit");
		list2.add("kohli");
		
		finalList.addAll(list2);
		finalList.addAll(list1);
		
		
		for(String s:finalList) {
			System.out.println(s);
		}
		
		
	}
}
