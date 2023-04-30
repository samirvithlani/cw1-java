package com.lambda;

import java.util.function.Predicate;

public class PreidicateDemo2 {

	static void pred(int no,Predicate<Integer> p) {
		if(p.test(no)) {
			
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	static void pred1(String str,Predicate<String> p) {
		if(p.test(str)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	public static void main(String[] args) {
		
		pred(100, (i)->(i>7));
		pred(100,(i)->(i%2==0));
		pred(27,(x)->(x%3==0));
		
		pred1("raja",(x)->(x.length()>3));
		pred1("Amit", (x)->(x.startsWith("A")));
		
		
	}
}
