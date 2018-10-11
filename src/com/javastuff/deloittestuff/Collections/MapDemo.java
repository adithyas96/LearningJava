package com.javastuff.deloittestuff.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {
		SortedMap m1 = new TreeMap();
		
		System.out.println(m1.isEmpty());
		System.out.println(m1.size());
		
		m1.put("James", "Gosling");
		m1.put("java", 199);
		m1.put("sea",100);
		m1.put("Codd", "Oracle");
		
		System.out.println(m1);
		
		Map m2 = m1.tailMap("sea");
		System.out.println(m2);
	}
	public static void main1(String[] args) {
		Map m1 = new HashMap();
		
		System.out.println(m1.isEmpty());
		System.out.println(m1.size());
		
		m1.put("James", "Gosling");
		m1.put("java", 199);
		m1.put("sea",100);
		
		System.out.println(m1);  //Unordered 
		
		System.out.println(m1.containsKey("James"));
		System.out.println(m1.containsKey(99));
		System.out.println(m1.containsValue(199));
		
		System.out.println(m1.get("java"));
		
		Set keys = m1.keySet();
		System.out.println(keys);
		
		Collection values = m1.values();
		System.out.println(values);
	}
}
