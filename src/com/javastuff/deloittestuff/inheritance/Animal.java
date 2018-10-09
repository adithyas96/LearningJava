package com.javastuff.deloittestuff.inheritance;

public class Animal extends Object {
	boolean alive = true;
	
	{
		alive = true;
	}
	
	public void eat(){
		System.out.println("Animal is eating");
		
		
	}
	/* public void move(int distance){
		System.out.println("Animal has moved: " + distance + " distance");
		
	}
	*/
	public abstract move(int distance);

}
