package com.javastuff.deloittestuff.inheritance;

public class Bird extends Animal {
	public void fly(int distance) {
		System.out.println("Bird is flying: " + distance + " distance");
	}
	public void move(int distance){
		System.out.println("Bird has moved: " + distance + " distance");
	}
}
