package com.neotech.review04;

public class Task {
	public static void main(String[] args) {
		
		int[][] numbers = {{3,8,11},{76,45,23,5},{6,90,34}};
		
		int max = numbers[0][0];
		
		for (int i =0; i<numbers.length;i++) {
			for (int j =0; j<numbers[i].length; j++) {
				
				if(max < numbers[i][j]) {
					max = numbers[i][j];
		
			}
		}
			System.out.println("The largest number of each array: " + max);
		}
		System.out.println("The largest number of all arrays: " +max);
	
	int biggest = numbers[0][0];
	
			
	for (int[] row:numbers) {
		for (int item:row) {
			if(biggest<item) {
				biggest = item;
	
		}
		}
	}
	System.out.println(biggest);
	
	
	}

}
