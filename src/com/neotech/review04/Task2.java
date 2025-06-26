package com.neotech.review04;

public class Task2 {
	public static void main(String[] args) {
		
		String longStr = "I am very happy today because today is not Monday";

		System.out.println("String length -> " + longStr.length());

		char[] charArray = longStr.toCharArray();
		System.out.println("char[] length -> " + charArray.length);

		for (char el : charArray) {
			System.out.print(el);
		}
		System.out.println();
		
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='a') 
				charArray[i] = 'e';
			
			System.out.print(charArray[i]);
			}
		System.out.println();
	}

}
