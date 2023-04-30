package com.collections.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
	
		Predicate<Integer> p1 = (x)->(x<10);
		Predicate<Integer> p2 =(x)->(x%2==0);
		
		
		//boolean b = p1.and(p2).test(9);
		boolean b = p1.or(p2).test(28);
		System.out.println(b);
	}
}
