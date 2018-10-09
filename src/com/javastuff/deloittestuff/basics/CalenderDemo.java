package com.javastuff.deloittestuff.basics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderDemo {
	public static void main1(String[] args) {
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.DATE));
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));
		System.out.println(c1.get(Calendar.MONTH));
		System.out.println(Calendar.DAY_OF_MONTH);
	}
	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date date = new Date(); 
	    Date date1 = new Date();
	    System.out.println(formatter.format(date1));  
		
	}
}
