package com.javastuff.deloittestuff.Collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.javastuff.deloittestuff.basics.Marker;

public class SortedDemo {
	public static void main(String[] args) {
		Marker m1 = new Marker("Calmin", "Blue", 22.3);
		Marker m2 = new Marker("Reynolds", "Black", 20.1);
		
		System.out.println(m1);
		System.out.println(m2);
		
		Set s1 = new TreeSet();
		s1.add(m1);
	
		s1.add(m2);
		
		System.out.println(s1);
	}
}
