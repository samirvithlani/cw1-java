package com.collections.List;

import java.util.ArrayList;
import java.util.List;

//java.util
public class ListDemo1 {

	
	public static void main(String[] args) {
		
		
		//methods list --> arrayList
		// dynamic array [0][1][2][3] 
		List<String> list = new ArrayList<String>();
		list.add("raj");
		list.add("ram");
		list.add("Neha");
		list.add("jay");
		
		
		//System.out.println(list.get(0));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		boolean b = list.contains("rama");
		System.out.println("contains "+b);
		
		int x = list.indexOf("jay");
		System.out.println("index of  ->"+x);
		
		list.set(1, "krishna");
		
//		String removedelm = list.remove(1);
//		System.out.println("removed elm = "+removedelm);
//		
//		boolean isRemoved = list.remove("jaya");
//		System.out.println("isRevmoved"+isRemoved);
//		
		
		List<String> sublist = list.subList(1, 3);
		for(String ss:sublist) {
			
			System.out.println("submoist"+ss);
		}
		
		
		
		
		
		for(String s:list) {
			
			System.out.println(s);
		}
		
		
		
		
		
				
		
	}
}
