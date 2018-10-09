package com.javastuff.deloittestuff.inheritance;

public class Cat extends Animal implements Hunter, Jumper, Runner {

	@Override
	public void run() {
		System.out.println("cat running");
		
	}

	@Override
	public void jump() {
		System.out.println("cat jumping");
		
	}

	@Override
	public void hunt() {
		System.out.println("cat hunting" ");
		
	}

}
