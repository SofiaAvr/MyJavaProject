package com.neotech.review04;

import java.util.Arrays;

public class PrintArray {
public static void main(String[] args) {
	
	int[] numbers = {4, 18, -12, 9, 23};
	
	System.out.println(numbers);
	
	System.out.println(numbers[1]);
	
	//FOR 1D ARRAYS
	System.out.println(Arrays.toString(numbers));
	
	//FOR 2D ARRAYS
	int[][] num = {{3, 6, 4},{9,7,2}};
	
	System.out.println(Arrays.deepToString(num));
}
}
