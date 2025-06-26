package com.neotech.review05_StringMethods;

public class Replace {
	
	public static void main(String[] args) {
		
		String longStr = ("I am very happy today because today is not Monday");
	
		String anotherStr = longStr.replace('a', 'e');
		System.out.println(anotherStr);
		
		longStr.replace("today", "tomorrow");
		System.out.println(longStr.replace("today", "tomorrow"));

		// Replace All
		
		anotherStr = longStr.replaceAll("[a-z]", "*");
		System.out.println(anotherStr);
		
		anotherStr = longStr.replaceAll("[^a-z]", "*");
		System.out.println(anotherStr);
		
		anotherStr = longStr.replaceAll("[az]", "*");
		System.out.println(anotherStr);
		
		String ssn = "897-976";
		
		String newSsn = ssn.replaceAll("[0-9]", "*");
		System.out.println(newSsn);
		
	}

}
