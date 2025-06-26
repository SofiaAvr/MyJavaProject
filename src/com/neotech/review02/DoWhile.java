package com.neotech.review02;

public class DoWhile {
	public static void main(String[] args) {
		
		int age = 1;
		
		do {
			System.out.println("Happy Birthday! You are "+ age + " years old");
		
		age++;
		}while (age<=10);
		
		
		boolean hot = true;
		
		while( !hot) {
			System.out.println("While loop --> Drink");
		}
		
		do {
			System.out.println("Do While loop --> Drink");
		}while(!hot);
	}

}
