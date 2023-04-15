package com.collections.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Std{
	
	
}


public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map =new TreeMap<Integer, String>();
		map.put(1, "raj");
		map.put(23, "jay");
		map.put(12, "neha");
		map.put(12, "priya");
		map.put(7, "jay");
		
		
		
		
//		Set<Entry<Integer, String>> set = map.entrySet();
//		
//		for(Map.Entry mm : set) {
//			System.out.println(mm.getKey()  );
//			
//		}
		
		//System.out.println("contains key"+map.containsKey(77));
		System.out.println("value....."+map.containsValue("jay"));
		
		//map.isEmpty();
//		String ss = map.remove(7);
//		System.out.println("remvinf..."+ss);

		boolean b = map.remove(7, "jaya");
		System.out.println("is removed...." + b);
		
		
		for(Map.Entry m:map.entrySet()) {
			
			System.out.println(m.getKey() + " " +m.getValue());
		}
		
	}

}
