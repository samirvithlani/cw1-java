package com.collections.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<String, String> tmap = new TreeMap<String, String>();
		tmap.put("A", "Amit");
		tmap.put("Z", "Zara");
		tmap.put("C", "Close");
		tmap.put("D", "Diya");
		tmap.put("P", "Preet");
		
		NavigableMap<String, String> nmap = tmap.descendingMap();
		SortedMap<String, String>sm = tmap.tailMap("C");
		nmap =tmap.subMap("A", false, "Z", false);
		
		for(Map.Entry mm:nmap.entrySet()) {
			System.out.println(mm);
		}
		
	}
}
