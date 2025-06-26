package com.neotech.review05_StringMethods;

public class SubString {
	public static void main(String[] args) {
		
	
	String longStr = "I am very happy today because today is not Monday";
	
	longStr.substring(5,8); // 8 is not included
	
	System.out.println(longStr.substring(5,8));
	
	System.out.println(longStr.substring(5));
	
	System.out.println(longStr);
	
	longStr = longStr.substring(10);
	System.out.println(longStr);
	
	System.out.println(longStr.substring(5));
	

}
}