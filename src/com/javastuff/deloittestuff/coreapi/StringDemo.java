package com.javastuff.deloittestuff.coreapi;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "java programming language";
		System.out.println(s1.length());
		System.out.println(s1);
		System.out.println(s1.charAt(9));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.toUpperCase());
		//System.out.println(s1.hashCode());
		
		s1 = s1 + ", create by james";
		System.out.println(s1);
		//System.out.println(s1.hashCode());
		System.out.println(s1.substring(12, 19));
		String a="java", b="Java";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.contains("va"));
		System.out.println(a.endsWith("Jva"));
		System.out.println(a.startsWith("ja"));
		String s2 = " ";
		System.out.println(s2.isEmpty());
		System.out.println(s2.trim().isEmpty());
		String s3 = new String("java");
		//s3 = s3.intern();
		String s4  = "java";
		if(s4==s3)
			System.out.println("Both equal");
		else 
			System.out.println("not equal");
	}

}
