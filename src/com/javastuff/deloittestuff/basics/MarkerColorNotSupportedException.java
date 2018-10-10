package com.javastuff.deloittestuff.basics;

public class MarkerColorNotSupportedException extends IllegalArgumentException{
	public MarkerColorNotSupportedException(){
		super();
	}
	public MarkerColorNotSupportedException(String message){
		super(message);
	}
	public MarkerColorNotSupportedException(Throwable throwable){
		super(throwable);
	}
	public MarkerColorNotSupportedException(String message, Throwable throwable){
		super(message, throwable);
	}
}
