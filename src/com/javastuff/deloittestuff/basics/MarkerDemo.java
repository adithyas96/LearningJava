package com.javastuff.deloittestuff.basics;

import java.util.Date;

public class MarkerDemo {
	
	public static void main(String[] args) {
		Marker m1 = new Marker();
		try{
			m1.editPrice(30);
			m1.printPrice();
			m1.editPrice(-12);
			m1.printPrice();
		}
		
		catch(IllegalArgumentException i){
			System.out.println(i);
		}
		
		System.out.println(m1.getColor());
		try{
		m1.setColor("Brown");
		System.out.println(m1.getColor());
		}catch(MarkerColorNotSupportedException i){
			System.out.println("Error Color");
		}
	}
	public static void main4(String[] args) {
		Marker m1 = new Marker();
		System.out.println(m1.getPrice());
		
		m1.setCategory("Hello");
		System.out.println(m1.category);
	}
	
	public static void main3(String[] args) {
		Marker m1 = new Marker();
		Date d1 = new Date();
		System.out.println(m1);
		System.out.println(d1);
		System.out.println(m1.toString());
		System.out.println(d1.toString());
	}
	public static void main2(String[] args) {
		Marker a = new Marker("raynold", "black", 25.0);
		Marker b = new Marker("camlin", "blue", 11.0);

		System.out.println(a.category);
		System.out.println(b.category);
		System.out.println(Marker.category);
	}

	public static void main1(String[] args) {
		Marker a = new Marker("raynold", "black", 25.0);
		Marker b = new Marker("camlin", "blue", 11.0);
		
		System.out.println(a.getPrice() + " " + b.getPrice());
		
		swap(a,b);
		System.out.println(a.getPrice() + " " + b.getPrice());
	
		Marker m1 = new Marker();
		m1.write(289);
		m1.write("joo");
		m1.write(123.123);
		
		
		
	}
	
	public static void swap(Marker m1, Marker m2){
		double temp = m2.getPrice();
		m2.editPrice(m1.getPrice());
		m1.editPrice(temp);
	}
}
