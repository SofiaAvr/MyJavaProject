package com.neotech.review03;

public class MagicDollar {
	public static void main(String[] args) {
		
		//1st way :
		
		System.out.println("$$$$$");
		System.out.println("$$$$$");
		System.out.println("$$$$$");
		System.out.println("$$$$$");
		
		//2nd way :
		
		for (int i = 1; i<=4; i++) {
			System.out.println("$$$$$");
		}
		
		//3rd way :
		
		for (int i =1; i<=4; i++) {
			
			for(int j =1; j<=5; j++) {
				System.out.print("$");
			}
			
			System.out.println();
		}
	}

}
