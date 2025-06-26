package com.neotech.review02;

public class Loop {
	public static void main(String[] args) {
		
		
		int sumOdd = 0;
		int sumEven = 0;
		int total = 0;
		
		for(int i =1; i<=20; i++) {
			
			if(i%2 == 0) {
				
				sumEven += i;
				
			}else {
				
				sumOdd += i;
				
			}
			
			total += i;
		}
		
		System.out.println("The sum of even numbers: "+ sumEven);
		System.out.println("The sum of odd numbers: " + sumOdd);
		System.out.println("The sum of all numbers: " + total);
	}

}
