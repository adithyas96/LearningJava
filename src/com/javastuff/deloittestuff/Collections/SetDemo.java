package com.javastuff.deloittestuff.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		Set s1 = new TreeSet();
		
		s1.add("one");
		s1.add("two");
		s1.add("three");
		s1.add("four");

		System.out.println(s1);  //Alphabetical Order
	}
	public static void main3(String[] args) {
		HashSet s1 = new LinkedHashSet();

		s1.add("one");
		s1.add("two");
		s1.add("three");
		s1.add("four");

		System.out.println(s1);   //Inserted order
		
		
		
	}
	public static void main2(String[] args) {
		HashSet s1 = new HashSet();

		s1.add("one");
		s1.add("two");
		s1.add("three");
		s1.add("four");

		System.out.println(s1);   //Random order
		
		HashSet s2 = new HashSet();
		s2.add("nine");
		s2.add("four");
		s2.add("one");
		s2.add("ten");

		System.out.println(s2);
		
		//s1.addAll(s2);
		//s1.removeAll(s2);
		//s1.retainAll(s2);
		//System.out.println(s1);
		//System.out.println(s1.containsAll(s2));
		
		s1.remove("one");
		System.out.println(s1);
		
		
		Object[] ta = s2.toArray();
		
		
		
	}
	public static void main1(String[] args) {

		HashSet s1 = new HashSet();

		s1.add("one");
		s1.add("two");
		s1.add("three");
		s1.add("four");

		System.out.println(s1);

		Iterator it = s1.iterator();

		while (it.hasNext()) {
			String temp = (String)it.next();
			System.out.println(temp);
			
			if(temp.equals("three")){
				it.remove();
			}
			
		}
		
		System.out.println(s1);
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		
		s1.clear();
		System.out.println(s1.isEmpty());
	}
}