package com.neotech.review03;

public class TwoDArrays {
	public static void main(String[] args) {
		
		int[][] numbers = new int [3][4]; //rows and columns
		
		numbers[1][2] = 5;
		numbers[2][0] = 7;
		numbers[0][0] = 3;
		
		numbers[1][2] += 4;
		
		System.out.println(numbers[1][2]);
	
		int size = numbers.length;
		System.out.println(size);
		
		int row0 = numbers[0].length;
		System.out.println(row0);
	}

}
