package com.neotech.review03;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to store?");
		
		int num = scan.nextInt();
		int[] numbers = new int[num];
		
		System.out.println("Enter the numbers");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		numbers[0] = num1;
		numbers[1] = num2;
		
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		
		
		scan.close();
	}

}
