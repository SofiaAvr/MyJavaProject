package com.neotech.review04;

import java.util.Scanner;

public class Scanner_2DArray {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many rows do you want in the array?");
	int rows = scan.nextInt();
	
	System.out.println("How many columns do you want in the array?");
	int cols = scan.nextInt();
	
	String[][] names = new String[rows][cols];
	
	for (int row=0; row<rows; row++) {
		for (int col=0; col<cols; col++) {
			System.out.println("Enter a name");
		   names[row][col] =  scan.next();
		}
	}
	for (String[] row : names) {
		for (String name : row ) {
			System.out.print(name + " ");
		}
		System.out.println();
	}
	
	scan.close();
	}
	}


