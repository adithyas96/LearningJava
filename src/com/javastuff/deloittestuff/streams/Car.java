package com.javastuff.deloittestuff.streams;

import java.io.Serializable;

public class Car implements Serializable {
	private String brand;
	private String model;
	private double price;
	private Engine engine;
	
	public Car(){
		brand = "Ford";
		model = "Figo";
		price = 8393844;
		engine = new Engine();
	}
	
	public Car(String brand, String model, double price, Engine engine){
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.engine = engine;
	}
	
	public Engine getEngine(){
		return engine;
	}
	
	public String getBrand(){
		return brand;
	}
	public String getModel(){
		return model;
	}
	public double getPrice(){
		return price;
	}
}
