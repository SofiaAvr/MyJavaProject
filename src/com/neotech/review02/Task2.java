package com.neotech.review02;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int total = 0;

		while (num >= 0) {
			System.out.println("Please enter a positive number");
			
			num = scan.nextInt();
			
			total += num;
			
			if (num == -1) {
				break;
			}
        System.out.println(total);
		}

		scan.close();
	}
}
