package com.neotech.review01;

import java.util.Scanner;

public class LogicalOperator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your gender: (m/f)");
		char gender = scan.next().charAt(0);

		System.out.println("Are you rich? (true/false)");
		boolean rich = scan.nextBoolean();

		if (gender == 'm' && rich) { // rich male
			System.out.println("Buy a Ferrari");

		} else if (gender == 'm' && !rich) { // poor male
			System.out.println("Play soccer");

		} else if (gender == 'f' && rich) { // rich female
			System.out.println("Buy a LV bag");

		} else if (gender == 'f' && !rich) { // poor female
			System.out.println("Read a book");

		} else {
			System.out.println("Invalid gender");
		}
		
		scan.close();
	}

}
