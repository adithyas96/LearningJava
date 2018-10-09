package com.javastuff.deloittestuff.basics;

public class Marker {

	final String brand;
	String color;
	private double price;
	static String category;
	
	public double getPrice(){
		return price;
	}
	
	public static void setCategory(String cat){
		Marker.category = cat;
	}
	public void printPrice(){
		System.out.println(price);
	}
	public void editPrice(double p){
		if(p>0)
			this.price = price ; 
		else 
			System.out.println("Invalid");
	}

	public Marker() {
		brand = "hello";
		price = 1.1;
		color = "white";
	}

	public Marker(String v, String y, Double z) {
		brand = v;
		color = y;
		price = z;
	}
	
	public void write(String input){
		System.out.println(input);
	}
	
	public void write(int input){
		System.out.println(input);
	}
	
	public void write(double input){
		System.out.println(input);
	}

	public static void main(String[] args) {

	}
}
