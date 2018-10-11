package com.javastuff.deloittestuff.Collections;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {

		List t1 = new LinkedList();

		t1.add("one");
		t1.add("two");
		t1.add("three");
		t1.add("four");
		t1.add("Johnson");
		t1.add(22);

		System.out.println(t1);   //Inserted order
		
		t1.add(3, "Ted");
		System.out.println(t1);
		
		System.out.println(t1.get(4));
		
		t1.remove("four");
		System.out.println(t1);
		
		t1.remove(new Integer(22));
		System.out.println(t1);
	}
}
