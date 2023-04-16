package com.collections.List.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("samir");
		al.add("raj");
		al.add("jay");
		al.add("priya");
		al.add("neha");
		al.add("parth");
		
		
		Collections.sort(al);
		
		for(String s:al) {
			
			System.out.println(s);
		}
	}
}
