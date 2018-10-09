package com.javastuff.deloittestuff.inheritance;

public class InheritanceDemo {
	
	public static void main(String[] args) {
		Bird b1 = new Bird();
		b1.move(500);
		//b1.move(500L);
	}
	public static void main2(String[] args) {
		Bird b1 = new Bird();
		Animal a1 = new Bird();
		b1.eat();
		a1.eat();
		b1.fly(100);
		//a1.fly(100);
		Bird b2 = (Bird) a1;
		b2.fly(100);
		
		Animal a2 = new Animal();
		Bird b3 = (Bird) a2;
	}
	public static void main1(String[] args) {
		Animal a1 = new Animal();
		Bird b1 = new Bird();
		b1.eat();
		b1.fly(200);
		b1.
		System.out.println(a1.alive);
	}
}
