package com.collections.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("python");
		list.add("cpp");
		list.add("node");
		list.add("php");
		list.add("perl");
		list.add("pascle");
		
		
		
		//list.stream().forEach((x)->System.out.println(x));
		//list.stream().filter((x)->x.length()>3).forEach((x)->System.out.println(x));
		
		//list.stream().filter((x)->x.length()>3).map(String::toUpperCase).forEach((x)->System.out.println(x));
		List<String> fl =  list.stream().filter((x)->x.length()>3).map(String::toUpperCase).collect(Collectors.toList());
		Set<String> set =  list.stream().filter((x)->x.length()>3).map(String::toUpperCase).collect(Collectors.toSet());
		//fl.stream().forEach((x)->System.out.println(x));
		set.stream().forEach((x)->System.out.println(x));
		//StartsWIth
		
		
		
	}
}
