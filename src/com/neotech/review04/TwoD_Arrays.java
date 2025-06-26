package com.neotech.review04;

import java.util.Arrays;

public class TwoD_Arrays {
	public static void main(String[] args) {

		int[] num = { 3, 7, 8, 9 };
		
		for (int item :num) {
			System.out.print(item+ " ");
		}
System.out.println();
		
		int[][] nums = { { 4, 5, 6, 8 }, { 5, 6, 7, 8 }, { 0, 3, 6, 78 } };

		// every ELEMENT in a 2D array is a 1D array

		System.out.println(nums[0][2]);
		
		//Nested Advance Loop
		
		for(int[] row : nums) {
			for (int element : row ) {
				System.out.print(element+" ");
			}
			System.out.println();
		}
		
		System.out.println(nums[2]);
		System.out.println(Arrays.toString(nums[2]));
	
	//COMBINATION 
		for(int[] row : nums) {
			for (int i = 0; i<row.length; i++) {
				System.out.print(row[i] + " ");
			}
		}
	}
}
