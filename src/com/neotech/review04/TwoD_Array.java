package com.neotech.review04;

public class TwoD_Array {
	public static void main(String[] args) {
		
		int[][] nums = {{3,5,6,7,},{2,3,4,4,5},{2,1}};
		
	//	System.out.println(nums[3][2]); // run-time error
	
		int rows = nums.length;
		System.out.println("The number of rows: " + rows);
	
	    int item = nums[0].length;
	    System.out.println("The number of items of first row: " + item);
	
	
	for (int row = 0;row<nums.length; row++) {
		for (int col= 0; col<nums[row].length;col++) {
			System.out.print(nums[row][col]+ " ");
			
		}
	}
	System.out.println();
	
	//OR
	
	for (int[] row : nums) {
		for (int col : row) {
			System.out.print(col+ " ");
		}
	}
	System.out.println();
	
	//OR
	
	for (int[] row : nums) {
		for (int i=0; i<row.length; i++) {
			System.out.print(row[i] + " ");
		}
	}
	
	}

}
