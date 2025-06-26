package com.neotech.review03;

public class StringArray {
	public static void main(String[] args) {
		
		String[] animals = {"dog", "cat", "fish"};
		
		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();
		
		//Advanced loop:
		
		for (String element : animals) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		
	}

}
