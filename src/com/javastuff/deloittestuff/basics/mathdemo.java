package com.javastuff.deloittestuff.basics;

public class mathdemo {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.max(23, 213));
		System.out.println(Math.min(23, 213));
		System.out.println(Math.floor(36.7));
		System.out.println(Math.ceil(32.4));
		System.out.println(Math.round(32.5));
		System.out.println(Math.sqrt(24));
		System.out.println(Math.pow(10,1000));
		System.out.println(Math.abs(220.1));
		System.out.println(Math.random());
		
		for(int i=0,j;i<10;i++){
			j=(int)Math.round(Math.random()*1);
			System.out.print(j + " ");
		}
	}
}
