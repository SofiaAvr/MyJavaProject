package com.neotech.review05_StringMethods;

public class StringMethods {
	public static void main(String[] args) {
		
		String str = "Hola amigo";
		
		System.out.println(str.length());
		
		System.out.println(str.isEmpty());
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str);
		
		System.out.println(str.equals("HOLA"));
		
		System.out.println(str.equalsIgnoreCase("HOLA"));
		
		System.out.println(str.contains("h"));
		
		System.out.println(str.contains("h".toUpperCase()));
		
		System.out.println(str.startsWith("Ho"));
		
		System.out.println(str.startsWith("Hola"));
		
		System.out.println(str.endsWith("ola"));
		
		System.out.println("\nINDEX OF :");
		
        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf('t'));
        System.out.println(str.indexOf("Hola"));
        System.out.println(str.lastIndexOf('o'));
        
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('a', 4));
        int point = str.indexOf('a');
        System.out.println(str.indexOf('a', point));
        
       
	}

}
