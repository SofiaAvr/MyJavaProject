package com.neotech.review02;

public class Task {
	public static void main(String[] args) {
		
		
		for ( int birthday =11; birthday<=20; birthday++ ) {
			if (birthday == 13) {
				continue;
			}
			System.out.println("Happy Birthday son! You are now "+ birthday);
		}
	}

}
