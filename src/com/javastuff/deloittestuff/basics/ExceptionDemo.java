package com.javastuff.deloittestuff.basics;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Start main");
		m1();
		System.out.println("End main");
	}
	
	public static void m1(){
		System.out.println("Start m1");
		m2();
		System.out.println("End m1");
	}
	
	public static void m2(){
		System.out.println("Start m2");
		int i;
		try{
			 i = Integer.parseInt("12m");
			 System.out.println(i*3);
		}catch(NumberFormatException nfe){
			System.out.println("Incorrect input");
		}
		
		
		
		System.out.println("End m2");
	}
}
