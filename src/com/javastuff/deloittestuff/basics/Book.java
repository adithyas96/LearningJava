package com.javastuff.deloittestuff.basics;

public class Book {
	int noOfPages;
	String title;
	String author;
	String publisher;
	int currPage;
	
	
	public Book(int a, String b, String c, String d, int e){
		noOfPages = a;
		title = b;
		author = c;
		publisher = d;
		currPage = e;
		
	}
	public void open(){
		currPage = 1;
	}
	
	public void close(){
		currPage = 0;
	}
	
	public void getBook(){
		System.out.println(noOfPages);
		System.out.println(title);
		System.out.println(author);
		System.out.println(publisher);
		System.out.println(currPage);
	}

	public void turnLeft(){
		currPage = currPage - 1;
	}
	public void turnRight(){
		currPage = currPage + 1;
		
	}
	public boolean isOpen(){
		if(currPage != 0)
			return true;
		else 
			return false;
		
	}
	public boolean isClosed(){
		if(currPage != 0)
			return false;
		else 
			return true;
		
	}
	

}
