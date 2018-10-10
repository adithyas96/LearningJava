package com.javastuff.deloittestuff.streams;

import java.io.Serializable;

public class Engine implements Serializable {
	private String brand;
	private String type;
	private String hp;
	
	public Engine(){
		brand  = "Ford";
		type = "Diesel";
		hp = "28.5";
	}
	
	public Engine(String brand, String type, String hp ){
		this.brand = brand;
		this.type = type;
		this.hp = hp;
	}
	
	
	
	public String getBrand(){
		return brand;
	}
	
	public String getType(){
		return type;
	}
	
	public String getHp(){
		return hp;
	}
}
