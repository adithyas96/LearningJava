package com.javastuff.deloittestuff.basics;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date d1 = new Date();
		
		System.out.println(d1);
		System.out.println(d1.getTime());
		d1.setTime(0);
		System.out.println(d1);
	}
}
