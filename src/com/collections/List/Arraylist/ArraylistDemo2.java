package com.collections.List.Arraylist;

import java.util.ArrayList;

public class ArraylistDemo2 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(91);
		al.add(13);
		al.add(41);
		
		for(int x:al) {
			System.out.println(x);
		}
	}
}
