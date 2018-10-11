package com.javastuff.deloittestuff.basics;

//hello

public class Marker {

	final String brand;
	private String color;
	private double price;
	static String category;
	
	public String toString(){
		return "Marker[Brand: " + brand + ", Color: " + color + "Price : " + price + "]";
	}
	
	public String getColor(){
		return color;
	}
	
	public String setColor(String c) throws MarkerColorNotSupportedException{
		
		switch(c){
		case "Blue": 
		case "Black":
		case "Green":
		case "Red": this.color = c;
		default: throw new MarkerColorNotSupportedException("For Color:" + c);
		}
	}
	
	public double getPrice(){
		return price;
	}
	
	public static void setCategory(String cat){
		Marker.category = cat;
	}
	public void printPrice(){
		System.out.println(price);
	}
	public void editPrice(double p) throws IllegalArgumentException{
		if(p>0)
			price = p ; 
		else{ 
			throw new IllegalArgumentException("Invalid Price :" + p);
			//System.out.println("Invalid");
		}	
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
