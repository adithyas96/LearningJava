package com.javastuff.deloittestuff.basics;

import java.util.Scanner;

public class BookDemo {
	public static void main(String[] args) {
		Book b1 = new Book(200,"Birds Fly", "Alan Fleming", "Penguin Books",0);
		
		System.out.println("Enter your choice:");
		Scanner s1 = new Scanner(System.in);
		int s = s1.nextInt();
		System.out.println(s);
		
		
		switch(s){
		
			case 1: b1.open();
				break;
			case 2: b1.close();
				break;
			case 3: b1.getBook();
				break;
			case 4: b1.turnLeft();
				break;
			case 5: b1.turnRight();
				break;
			case 6: b1.isOpen();
				break;
			case 7: b1.isClosed();
				break;
			default:System.out.println("Incorrect input");
		}
	}
}
