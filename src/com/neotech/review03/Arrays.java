package com.neotech.review03;

public class Arrays {
	public static void main(String[] args) {

		int s1 = 85;
		int s2 = 98;
		int s3 = 90;

		int sum = s1 + s2 + s3;

		System.out.println("The sum is: " + sum);

		// A BETTER WAY :

		int[] grades = new int[3];

		grades[2] = 90;
		grades[0] = 85;
		grades[1] = 98;

		int size = grades.length;
		System.out.println(size);

		int total = 0;
		for (int i = 0; i < size; i++) {
			total += grades[i];
		}
		System.out.println("The total is: " + total);

		// 2nd WAY :
		
		int[] numbers = {90, 85, 98};
		
		int total2 = 0;
		
		for (int num : numbers) {
			total2 += num;
		}
System.out.println("The total is: " +total2);
	}

}
